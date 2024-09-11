import java.util.ArrayList;

public class Productora{
// Atributos
	private String nombre;
	private ArrayList<Evento> eventos;
// Metodos
	// Constructor
	public Productora(String nombre){
		this.nombre = nombre;
		eventos = new ArrayList<Evento>();
	}
	// Setters & Getters
	public void agregarEvento(Evento evento){eventos.add(evento);}
	// Consultar Evento
	public String consultarDatosEvento(int indice){
		return eventos.get(indice).devolverDatos();
	}
	// Consultar Obras Teatrales
	public String consultarObrasTeatrales(){
		String cadena = "";
		for(Evento ev: eventos){
			if(ev instanceof ObraTeatral) cadena += ev.devolverDatos();
		}
		return cadena;
	}
}