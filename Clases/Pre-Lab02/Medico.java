public class Medico extends Persona{
// Atributos
	private Especialidad especialidad;
	private String colegiatura;
	private String registroEspecialidad;
// Metodos
	// Constructor
	public Medico(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, Especialidad especialidad, String colegiatura, String registroEspecialidad){
		super(dni, nombre, apellidoPaterno, apellidoMaterno);
		this.especialidad = especialidad;
		this.colegiatura = colegiatura;
		this.registroEspecialidad = registroEspecialidad;
	}
	// devolverInformacion
	@Override
	public String devolverInformacion(){
		return "Medico:" + getNombre() + " " + getPaterno() + " " + getMaterno() + " - CMP:" + colegiatura + " - ESPECIALIDAD:" + especialidad.getNombre();
	}
	
}