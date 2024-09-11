public class Consultorio extends AmbienteClinico{
// Atributos
	private String numeroConsultorio;
// Metodos
	// Constructor
	public Consultorio(double espacio, char torre, Integer piso, String numeroConsultorio){
		super(espacio, torre, piso);
		this.numeroConsultorio = numeroConsultorio;
	}
	// devolverInformacion
	@Override
	public String devolverInformacion(){
		return "CONSULTORIO:" + numeroConsultorio + " - TORRE:" + getTorre() + " - PISO:" + getPiso();
	}
}