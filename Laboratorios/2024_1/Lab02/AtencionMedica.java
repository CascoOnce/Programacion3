import java.text.SimpleDateFormat;
import java.util.Date;

abstract class AtencionMedica{
// Atributos
	private static int indice = 1;
	private int idAtencion;
	private Date fechaHoraCreacion;
	private Date fechaHoraAtencion;
	private Estado estadoAtencion;
	private Paciente paciente;
	private Medico medico;
// Metodos
	// Constructor
	public AtencionMedica(Paciente paciente, Medico medico, Date fechaHoraAtencion){
		this.idAtencion = indice;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraAtencion = fechaHoraAtencion;
		this.estadoAtencion = estadoAtencion.PROGRAMADA;
		this.paciente = paciente;
		this.medico = medico;
		indice++;
	}
	// Setter & Getters
	public int getIdAtencion(){return this.idAtencion;}
	public Date getFechaHoraCreacion(){return this.fechaHoraCreacion;}
	public Date getFechaHoraAtencion(){return this.fechaHoraAtencion;}
	public Estado getEstadoAtencion(){return this.estadoAtencion;}
	public Paciente getPaciente(){return this.paciente;}
	public Medico getMedico(){return this.medico;}
	// Consulta de Datos
	abstract String consultarDatos();
}