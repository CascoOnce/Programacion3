import java.text.SimpleDateFormat;
import java.util.Date;

class CitaMedica extends AtencionMedica{
// Atributos
	private String motivo;
// Metodos
	// Constructor
	public CitaMedica(Paciente paciente, Medico medico, Date fechaHoraAtencion, String motivo){
		super(paciente, medico, fechaHoraAtencion);
		this.motivo = motivo;
	}
	// Consulta De Datos
	@Override
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String cadena = "";
		cadena += "ID: " + getIdAtencion() + " - CREACION: " + sdf.format(getFechaHoraCreacion()) + " - ATENCION: " + sdf.format(getFechaHoraAtencion()) + " - " + getEstadoAtencion() + '\n';
		cadena += getMedico().devolverInformacion() + '\n';
		cadena += getPaciente().devolverInformacion() + '\n';
		return cadena;
	}
}