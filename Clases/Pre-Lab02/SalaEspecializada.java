public class SalaEspecializada extends AmbienteClinico{
// Atributos
	private String nombre;
	private boolean poseeImagenología;
// Metodos
	public SalaEspecializada(double espacio, char torre, Integer piso, String nombre, boolean poseeImagenología){
		super(espacio, torre, piso);
		this.nombre = nombre;
		this.poseeImagenología = poseeImagenología;
	}
	// devolverInformacion
	@Override
	public String devolverInformacion(){
		String cadena = "SALA ESPECIALIZADA:" + nombre + " - TORRE:" + getTorre() + " - PISO:" + getPiso() + " - EQ. IMAGENOLOGIA:";
		if(poseeImagenología) cadena += "SI";
		else cadena += "NO";
		return cadena;
	}
}