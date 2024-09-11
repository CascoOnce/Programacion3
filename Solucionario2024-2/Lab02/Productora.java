import java.util.ArrayList;
class Productora{
	private String nombre;
	private ArrayList<Evento> eventos;
	public Productora(String nombre){
		this.nombre = nombre;
		this.eventos = new ArrayList<>();
	}
	public ArrayList<Evento> getEventos(){
		return new ArrayList<>(eventos);
	}
	public void agregarEvento(Evento evento){
		eventos.add(evento);
	}
	public String consultarDatosEvento(int indice){
		return eventos.get(indice).devolverDatos();
	}
	public String consultarObrasTeatrales(){
		String cadena = "";
		for(Evento e : eventos){
			if(e instanceof ObraTeatral){
				cadena = cadena + e.devolverDatos();
			}
		}
		return cadena;
	}
}