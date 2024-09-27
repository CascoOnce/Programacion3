package mysql.db;

// Casco_Once

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.config.DBManagerMySQL;

public abstract class DAOImpl {
// Atributos
    protected String nombre_tabla;
    protected Connection con;
    protected PreparedStatement pst;
    protected ResultSet rs;
// Metodos
    public DAOImpl(String nombre_tabla) {
        this.nombre_tabla = nombre_tabla;
    }
    protected void cerrarConexion() throws SQLException{
        if(con != null) {con.close();}
    }
    protected void iniciarConexion() throws SQLException{
        con = DBManagerMySQL.getInstance().getConnection();
        con.setAutoCommit(false);
    }
    protected void comitarTransaccion() throws SQLException{ con.commit();}
    protected void rollbackTransaccion() throws SQLException{
        if(con != null) {con.rollback();}
    }
    protected Integer ejecutarModificacionesEnBD(String sql) throws SQLException{
        pst = con.prepareStatement(sql);
        obtenerListaValoresParaInsert(pst);
        return pst.executeUpdate();
    }
    protected Integer insertar(){
        Integer resultado = 0;
        try {
            iniciarConexion();
            String sql = generarSQLParaInsercion();
            resultado = ejecutarModificacionesEnBD(sql);
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
    protected String generarSQLParaInsercion(){
        String sql = "INSERT INTO " + nombre_tabla + " (" + obtenerListaAtributosParaInsert()
                + ") VALUES (" + obtenerIncognitos() + ")";
        return sql;
    }
    protected abstract String obtenerListaAtributosParaInsert();
    protected abstract String obtenerIncognitos();
    protected abstract void obtenerListaValoresParaInsert(PreparedStatement pst);
}
