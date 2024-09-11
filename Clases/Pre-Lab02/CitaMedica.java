import java.util.Date;

public abstract class CitaMedica extends AtencionMedica{
// Atributos
	protected String motivo;
// Metodos
	// Constructor
	public CitaMedica(Paciente paciente, Medico medico, Date tiempoAtencion, String motivo){
		super(paciente, medico, tiempoAtencion);
		this.motivo = motivo;
	}
	
}