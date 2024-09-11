import java.util.ArrayList;

public class Paciente extends Persona{
// Atributos
	private Integer numeroHistoriaClinica;
	private ArrayList<AtencionMedica> atenciones;
// Metodos
	// Constructor
	public Paciente(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, Integer numeroHistoriaClinica){
		super(dni, nombre, apellidoPaterno, apellidoMaterno);
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
	// Setters & Getters
	public void setAtencionesMedicas(ArrayList<AtencionMedica> atenciones){this.atenciones = atenciones;}
	public ArrayList<AtencionMedica> getAtencionesMedicas(){return this.atenciones;}
	// listarCitasMedicasProgramadas
	public void listarCitasMedicasProgramadas(){
		for(AtencionMedica am: atenciones){
			if(am instanceof CitaMedica) System.out.println(am.consultarDatos());
		}
	}
	// devolverInformacion
	@Override
	public String devolverInformacion(){
		return "PACIENTE:" + getDni() + " - " + getNombre() + " " + getPaterno() + " " + getMaterno();
	}
}