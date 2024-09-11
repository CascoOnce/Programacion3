public class ObraTeatral extends Evento{
// Atributos
	private Integer numeroActos;
	private boolean escenografia;
// Metodos
	// Constructor
	public ObraTeatral(String nombre, double costoRealizacion, char tipoPublico, Integer numeroActos, boolean escenografia){
		super(nombre, costoRealizacion, tipoPublico);
		this.numeroActos = numeroActos;
		this.escenografia = escenografia;
	}
	@Override
	// Devolver Cabecera
	public String devolverCabecera(){
		String cadena = super.devolverCabecera();
		cadena += "OBRA TEATRAL - NUM. ACTOS: " + numeroActos + '\n';
		cadena += "REQ. ESCENOGRAFIA: ";
		if(escenografia) cadena += "SI\n";
		else cadena += "NO\n";
		cadena += "----------------------------------------------------\n";
		return cadena;
	}
	// InfoProvider: Devolver Datos
	public String devolverDatos(){
		return devolverCabecera();
	}
}