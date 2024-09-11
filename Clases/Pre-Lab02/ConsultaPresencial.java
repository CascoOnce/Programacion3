import java.util.Date;
import java.text.SimpleDateFormat;

public class ConsultaPresencial extends CitaMedica{
// Atributos
	private boolean requiereAsistencia;
	private Consultorio consultorio;
// Metodos
	// Constructor
	public ConsultaPresencial(Paciente paciente, Medico medico, Date tiempoAtencion, String motivo, Consultorio consultorio, boolean requiereAsistencia){
		super(paciente, medico, tiempoAtencion, motivo);
		this.consultorio = consultorio;
	}
	// Consultar Datos
	@Override
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String cadena = "ID:" + getId() + " - CREACION:" + sdf.format(getCreacion()) + " - ATENCION:" + sdf.format(getAtencion()) + " - " + getEstado() + '\n';
		cadena += getMedico().devolverInformacion() + '\n';
		cadena += getPaciente().devolverInformacion() + '\n';
		cadena += consultorio.devolverInformacion() + '\n';
		cadena += "REQ. ASISTENCIA:";
		if(requiereAsistencia) cadena += "SI" + '\n';
		else cadena += "NO" + '\n';
		return cadena;
	}
}