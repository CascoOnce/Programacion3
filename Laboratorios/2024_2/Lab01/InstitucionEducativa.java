import java.util.ArrayList;

class InstitucionEducativa{
// Atributos
	private int idInstitucionEducativa;
	private String RUC;
	private String nombre;
	private ArrayList<Sede> sedes;
// Metodos
	// Constructor
	public InstitucionEducativa(int idInstitucionEducativa, String RUC, String nombre){
		this.idInstitucionEducativa = idInstitucionEducativa;
		this.RUC = RUC;
		this.nombre = nombre;
	}
	// Setters & Getters
	public void setSedes(ArrayList<Sede> sedes){
		this.sedes = sedes;
	}
	public ArrayList<Sede> getSedes(){
		return sedes;
	}
	// Consulta
	public String consultarProgramasDeSede(int indiceSede){
		String cadena = "Programas disponibles para " + sedes.get(indiceSede).getNombre() + '\n';
		cadena += sedes.get(indiceSede).consultarProgramas();
		return cadena;
	}
}