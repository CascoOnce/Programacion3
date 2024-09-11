import java.util.ArrayList;
abstract class Evento implements InfoProvider, IDataProvider{
	private static int correlativo = 1;
	private int idEvento;
	private String nombre;
	private double costoRealizacion;
	private char tipoPublico;
	private ArrayList<Artista> artistas;
	private Local local;
	private ArrayList<Funcion> funciones;
	public Evento(String nombre, double costoRealizacion, char tipoPublico){
		this.idEvento = correlativo;
		this.nombre = nombre;
		this.costoRealizacion = costoRealizacion;
		this.tipoPublico = tipoPublico;
		this.artistas = new ArrayList<>();
		this.funciones = new ArrayList<>();
		correlativo++;
	}
	public void setLocal(Local local){
		this.local = local;
	}
	public ArrayList<Artista> getArtistas(){
		return new ArrayList<>(artistas);
	}
	public void agregarArtista(Artista artista){
		artistas.add(artista);
	}
	public ArrayList<Funcion> getFunciones(){
		return new ArrayList<>(funciones);
	}
	public void agregarFuncion(Funcion funcion){
		funciones.add(funcion);
	}
	public String devolverCabecera(){
		String cadena = "EVENTO Nro. " + idEvento + "\n";
		cadena += "-----------------------------------------------------------" + "\n";
		cadena += "NOMBRE: " + nombre + " - TIPO PUBLICO: " + tipoPublico + "\n";
		for(int i=0; i<artistas.size(); i++){
			cadena += "ARTISTA " + (int)(i+1) + ": " + artistas.get(i).devolverDatos();
		}
		cadena += local.devolverDatos();
		for(int i=0; i<funciones.size(); i++){
			cadena += "FUNCION " + (int)(i+1) + ": " + funciones.get(i).devolverDatos();
		}
		return cadena;
	}
}