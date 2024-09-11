import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AtencionMedica{
// Atributos
	private static Integer indice = 1;
	protected Integer idAtencion;
	protected Medico medico;
	protected Paciente paciente;
	protected Date tiempoCreacion;
	protected Date tiempoAtencion;
	protected Estado estadoAtencion;
// Metodos
	// Constructor
	public AtencionMedica(Paciente paciente, Medico medico, Date tiempoAtencion){
		this.idAtencion = indice;
		this.paciente = paciente;
		this.medico = medico;
		this.tiempoCreacion = new Date();
		this.tiempoAtencion = tiempoAtencion;
		this.estadoAtencion = estadoAtencion.PROGRAMADA;
		indice++;
	}
	// Setters & Getters
	public Integer getId(){return idAtencion;}
	public Medico getMedico(){return medico;}
	public Paciente getPaciente(){return paciente;}
	public Date getCreacion(){return tiempoCreacion;}
	public Date getAtencion(){return tiempoAtencion;}
	public Estado getEstado(){return estadoAtencion;}
	// Consultar Datos
	public abstract String consultarDatos();
}