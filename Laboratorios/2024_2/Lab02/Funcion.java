import java.util.Date;
import java.time.LocalTime;
import java.text.SimpleDateFormat;

public class Funcion implements InfoProvider{
// Atributos
	private Date eventoFecha;
	private LocalTime eventoHora;
// Metodos
	// Constructor
	public Funcion(Date eventoFecha, LocalTime eventoHora){
		this.eventoFecha = eventoFecha;
		this.eventoHora = eventoHora;
	}
	// InfoProvider: Devolver Datos
	public String devolverDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "FECHA:" + sdf.format(eventoFecha) + " " + eventoHora + '\n';
	}
}