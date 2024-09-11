import java.text.SimpleDateFormat;
import java.util.Date;

class Teleconsulta extends CitaMedica{
// Atributos
	private Plataforma plataforma;
	private String enlace;
// Metodos
	// Constructor
	public Teleconsulta(Paciente paciente, Medico medico, Date fechaHoraAtencion, String motivo, Plataforma plataforma, String enlace){
		super(paciente, medico, fechaHoraAtencion, motivo);
		this.plataforma = plataforma;
		this.enlace = enlace;
	}
	// Consulta De Datos
	@Override
	public String consultarDatos(){
		String cadena = super.consultarDatos();
		cadena += "PLATAFORMA: " + plataforma + " - ENLACE: " + enlace + '\n';
		return cadena;
	}
}