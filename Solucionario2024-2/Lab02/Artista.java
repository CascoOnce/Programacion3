import java.util.ArrayList;
class Artista implements InfoProvider{
	private String nombre;
	private String nacionalidad;
	private ArrayList<Artista> artistas;
	public Artista(String nombre, String nacionalidad){
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.artistas = new ArrayList<>();
	}
	public String devolverDatos(){
		return "ARTISTA: " + nombre + "\n";
	}
	public void agregarArtista(Artista artista){
		artistas.add(artista);
	}
}