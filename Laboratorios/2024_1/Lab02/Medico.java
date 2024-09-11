class Medico extends Persona{
// Atributos
	private Especialidad especialidad;
	private String numeroDeColegiatura;
	private String numeroDeRegistro;
// Metodos
	// Constructor
	public Medico(String DNI, String nombre, String apellidoPaterno, String apellidoMaterno, Especialidad especialidad, String numeroDeColegiatura, String numeroDeRegistro){
		super(DNI, nombre, apellidoPaterno, apellidoMaterno);
		this.especialidad = especialidad;
		this.numeroDeColegiatura = numeroDeColegiatura;
		this.numeroDeRegistro = numeroDeRegistro;
	}
	// Devolver Informacion
	@Override
	public String devolverInformacion(){
		return "MEDICO: " + getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno() + " - CMP: " + numeroDeColegiatura + " - ESPECIALIDAD: " + especialidad.getNombre();
	}
}