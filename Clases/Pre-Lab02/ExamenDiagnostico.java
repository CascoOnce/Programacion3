import java.util.Date;
import java.text.SimpleDateFormat;

public class ExamenDiagnostico extends AtencionMedica{
// Atributos
	private TipoExamen tipoExamen;
	private SalaEspecializada sala;
// Metodos
	// Constructor
	public ExamenDiagnostico(Paciente paciente, Medico medico, Date tiempoAtencion, SalaEspecializada sala, TipoExamen tipoExamen){
		super(paciente, medico, tiempoAtencion);
		this.sala = sala;
		this.tipoExamen = tipoExamen;
	}
	// Consultar Datos
	@Override
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String cadena = "ID:" + getId() + " - CREACION:" + sdf.format(getCreacion()) + " - ATENCION:" + sdf.format(getAtencion()) + " - " + getEstado() + '\n';
		cadena += getMedico().devolverInformacion() + '\n';
		cadena += getPaciente().devolverInformacion() + '\n';
		cadena += sala.devolverInformacion() + '\n';
		cadena += "TIPO EXAMEN: " + tipoExamen + '\n';
		return cadena;
	}
}