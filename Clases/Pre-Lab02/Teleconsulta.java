import java.util.Date;
import java.text.SimpleDateFormat;

public class Teleconsulta extends CitaMedica{
// Atributos
	private Plataforma plataforma;
	private String enlace;
// Metodos
	// Constructor
	public Teleconsulta(Paciente paciente, Medico medico, Date tiempoAtencion, String motivo, Plataforma plataforma, String enlace){
		super(paciente, medico, tiempoAtencion, motivo);
		this.plataforma = plataforma;
		this.enlace = enlace;
	}
	// Consultar Datos
	@Override
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String cadena = "ID:" + getId() + " - CREACION:" + sdf.format(getCreacion()) + " - ATENCION:" + sdf.format(getAtencion()) + " - " + getEstado() + '\n';
		cadena += getMedico().devolverInformacion() + '\n';
		cadena += getPaciente().devolverInformacion() + '\n';
		cadena +=  "PLATAFORMA:" + plataforma + " - ENLACE:" + enlace + '\n';
		return cadena;
	}
}