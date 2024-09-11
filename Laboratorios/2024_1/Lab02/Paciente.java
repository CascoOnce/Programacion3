import java.util.ArrayList;

class Paciente extends Persona{
// Atributos
	private ArrayList<AtencionMedica> atencionesMedicas;
	private int numeroHistoriaClinica;
// Metodos
	// Constructor
	public Paciente(String DNI, String nombre, String apellidoPaterno, String apellidoMaterno, int numeroHistoriaClinica){
		super(DNI, nombre, apellidoPaterno, apellidoMaterno);
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
	// Setters & Getters
	public void setAtencionesMedicas(ArrayList<AtencionMedica> atencionesMedicas){this.atencionesMedicas = atencionesMedicas;}
	public ArrayList<AtencionMedica> getAtencionesMedicas(){return this.atencionesMedicas;}
	// Imprimir Citas
	public void listarCitasMedicasProgramadas(){
		for(AtencionMedica am: atencionesMedicas){
			if(am instanceof CitaMedica){System.out.printf(am.consultarDatos() + '\n');}
		}
	}
	// Devolver Informacion
	@Override
	public String devolverInformacion(){
		return "PACIENTE: " + getDNI() + " - " + getNombre() + " " + getApellidoPaterno() + " " + getApellidoMaterno();
	}
}