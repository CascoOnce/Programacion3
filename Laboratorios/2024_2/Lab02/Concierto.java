public class Concierto extends Evento{
// Atributos
	private TipoConcierto tipo;
	private boolean grabacion;
// Metodos
	// Constructor
	public Concierto(String nombre, double costoRealizacion, char tipoPublico, TipoConcierto tipo, boolean grabacion){
		super(nombre, costoRealizacion, tipoPublico);
		this.tipo = tipo;
		this.grabacion = grabacion;
	}
	@Override
	// Devolver Cabecera
	public String devolverCabecera(){
		String cadena = super.devolverCabecera();
		cadena += "CONCIERTO - TIPO:" + tipo + '\n';
		cadena += "PERMISO GRABACION: ";
		if(grabacion) cadena += "SI\n";
		else cadena += "NO\n";
		cadena += "----------------------------------------------------\n";
		return cadena;
	}
	// InfoProvider: Devolver Datos
	public String devolverDatos(){
		return devolverCabecera();
	}
}