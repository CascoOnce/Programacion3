import java.text.SimpleDateFormat;
import java.util.Date;

class ExamenDiagnostico extends AtencionMedica{
// Atributos
	private SalaEspecializada sala;
	private TipoExamen tipoExamen;
// Metodos
	// Constructor
	public ExamenDiagnostico(Paciente paciente, Medico medico, Date fechaHoraAtencion, SalaEspecializada sala, TipoExamen tipoExamen){
		super(paciente, medico, fechaHoraAtencion);
		this.sala = sala;
		this.tipoExamen = tipoExamen;
	}
	// Consulta de Datos
	@Override
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String cadena = "";
		cadena += "ID: " + getIdAtencion() + " - CREACION: " + sdf.format(getFechaHoraCreacion()) + " - ATENCION: " + sdf.format(getFechaHoraAtencion()) + " - " + getEstadoAtencion() + '\n';
		cadena += getMedico().devolverInformacion() + '\n';
		cadena += getPaciente().devolverInformacion() + '\n';
		cadena += sala.devolverInformacion() + '\n';
		cadena += "TIPO EXAMEN: " + tipoExamen + '\n';
		return cadena;
	}
}