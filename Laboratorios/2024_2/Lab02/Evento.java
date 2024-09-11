import java.util.ArrayList;

public abstract class Evento implements IDataProvider, InfoProvider{
// Atributos
	protected static Integer indice = 1;
	protected Integer idEvento;
	protected String nombre;
	protected double costoRealizacion;
	protected char tipoPublico;
	protected ArrayList<Funcion> funciones;
	protected ArrayList<Artista> artistas;
	protected Local local;
// Metodos
	// Constructor
	public Evento(String nombre, double costoRealizacion, char tipoPublico){
		this.idEvento = indice;
		indice++;
		this.nombre = nombre;
		this.costoRealizacion = costoRealizacion;
		this.tipoPublico = tipoPublico;
		funciones = new ArrayList<Funcion>();
		artistas = new ArrayList<Artista>();
	}
	// Setters & Getters
	public void setLocal(Local local){this.local = local;}
	public void agregarArtista(Artista artista){artistas.add(artista);}
	public void agregarFuncion(Funcion funcion){funciones.add(funcion);}
	// IDataProvider: Devolver Cabecera
	public String devolverCabecera(){
		String cadena = "";
		cadena += "EVENTO Nro. " + idEvento + '\n';
		cadena += "----------------------------------------------------\n";
		cadena += "NOMBRE: " + nombre + " - TIPO PUBLICO: " + tipoPublico + '\n'; 
		int i = 1;
		for(Artista art: artistas){cadena += "ARTISTA " + i++ + ": " + art.devolverDatos();}
		cadena += local.devolverDatos();
		i = 1;
		for(Funcion fun: funciones){cadena += "FUNCION " + i++ + ": " + fun.devolverDatos();}
		return cadena;
	}
}