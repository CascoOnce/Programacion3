package mysql.db;

// Casco_Once

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.config.DBManagerMySQL;

public abstract class DAOImpl <T>{
// Atributos
    protected String nombre_tabla;
    protected Connection con;
    protected PreparedStatement pst;
    protected ResultSet rs;
    protected Boolean retornarLlavePrimaria;
// Metodos
    public DAOImpl(String nombre_tabla) {
        this.nombre_tabla = nombre_tabla;
        retornarLlavePrimaria = false;
    }
    protected void iniciarTransaccion() throws SQLException{ // 1
        con = DBManagerMySQL.getInstance().getConnection();
        con.setAutoCommit(false);
    }
    protected void comitarTransaccion() throws SQLException{ con.commit();} // 2
    protected void rollbackTransaccion() throws SQLException{ // 3
        if(con != null) {con.rollback();}
    }
    protected void abrirConexion() throws SQLException{ // 4
        con = DBManagerMySQL.getInstance().getConnection();
    }
    protected void cerrarConexion() throws SQLException{ // 5
        if(con != null) {con.close();}
    }
    protected Integer ejecutarModificacionesEnBD(String sql, int tipo) throws SQLException{ //6
        pst = con.prepareStatement(sql);
        switch (tipo) {
            case 1 -> obtenerListaValoresParaInsert(pst);
            case 2 -> obtenerPredicadoParaLlavePrimaria(pst);
        }
        return pst.executeUpdate();
    }
    protected void ejecutarConsultaEnBD(String sql) throws SQLException{ // 7
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
    }
    protected Integer insertar(){ // 8
        Integer resultado = 0;
        try {
            iniciarTransaccion();
            String sql = generarSQLParaInsercion();
            resultado = ejecutarModificacionesEnBD(sql, 1);
            comitarTransaccion();
        } catch (SQLException ex) {
            try {
                rollbackTransaccion();
            } catch (SQLException ex1) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
    protected String generarSQLParaInsercion(){ // 9
        String sql = "INSERT INTO " + nombre_tabla + " (" + obtenerListaAtributosParaInsert()
                + ") VALUES (" + obtenerIncognitos() + ")";
        return sql;
    }
    protected abstract String obtenerListaAtributosParaInsert(); // 10
    protected abstract void obtenerListaValoresParaInsert(PreparedStatement pst); // 11
    protected Integer modificar(){
        Integer resultado = 0;
        try {
            iniciarTransaccion();
            String sql = generarSQLParaModificacion();
            resultado = ejecutarModificacionesEnBD(sql, 2);
            comitarTransaccion();
        } catch (SQLException ex) {
            try {
                rollbackTransaccion();
            } catch (SQLException ex1) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
    protected String generarSQLParaModificacion(){
        String sql = "UPDATE " + nombre_tabla + " SET " + obtenerListaValoresYAtributosParaUpdate();
        return sql;
    }
    protected abstract String obtenerListaValoresYAtributosParaUpdate();
    protected abstract void obtenerPredicadoParaLlavePrimaria(PreparedStatement pst);
    protected ArrayList<T> listarTodos(){
        ArrayList<T> lista = new ArrayList<T>();
        T object;
        try {
            iniciarTransaccion();
            String sql = generarSQLParaListarTodos();
            ejecutarConsultaEnBD(sql);
            while (rs.next()) {
                object = agregarObjetoALaLista();
                lista.add(object);
            }
        } catch (SQLException ex) {
            try {
                rollbackTransaccion();
            } catch (SQLException ex1) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
    protected String generarSQLParaListarTodos(){
        String sql = "SELECT " + obtenerProyeccionParaSelect() + " FROM " + nombre_tabla;
        return sql;
    }
    protected abstract String obtenerProyeccionParaSelect();
    protected abstract T agregarObjetoALaLista();
    
    
    protected abstract String obtenerIncognitos();
}
