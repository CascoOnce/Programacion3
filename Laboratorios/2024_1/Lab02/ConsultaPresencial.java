import java.text.SimpleDateFormat;
import java.util.Date;

class ConsultaPresencial extends CitaMedica{
// Atributos
	private Consultorio consultorio;
	private boolean asistenciaEspecial;
// Metodos
	// Constructor
	public ConsultaPresencial(Paciente paciente, Medico medico, Date fechaHoraAtencion, String motivo, Consultorio consultorio, boolean asistenciaEspecial){
		super(paciente, medico, fechaHoraAtencion, motivo);
		this.consultorio = consultorio;
		this.asistenciaEspecial = asistenciaEspecial;
	}
	// Consulta De Datos
	@Override
	public String consultarDatos(){
		String cadena = super.consultarDatos();
		cadena += consultorio.devolverInformacion() + '\n' + "REQ. ASISTENCIA: ";
		if(asistenciaEspecial) cadena += "YES" + '\n';
		else cadena += "NO" + '\n';
		return cadena;
	}
}