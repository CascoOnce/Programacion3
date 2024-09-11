import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

class Vuelo{
// Atributos
	private static int indice = 1;
	private int idVuelo;
	private String codigo;
	private Date fecha;
	private LocalTime horaSalida;
	private LocalTime horaLlegada;
	private Remolque remolque;
	private Avion avion;
	private Aeropuerto AeropuertoSalida;
	private Aeropuerto AeropuertoLlegada;
// Metodos
	// Constructor
	public Vuelo(String codigo, Date fecha, LocalTime horaSalida, LocalTime horaLlegada){
		this.idVuelo = indice;
		this.codigo = codigo;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		indice++;
	}
	// Setters
	public void setRemolque(Remolque remolque){this.remolque = remolque;}
	public void setAvion(Avion avion){this.avion = avion;}
	public void setAeropuertoSalida(Aeropuerto AeropuertoSalida){this.AeropuertoSalida = AeropuertoSalida;}
	public void setAeropuertoLlegada(Aeropuerto AeropuertoLlegada){this.AeropuertoLlegada = AeropuertoLlegada;}
	// Impresion Datos
	public String devolverInformacion(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String cadena = "Datos del vuelo " + codigo + " con ID: " + idVuelo + '\n';
		cadena += "-----------------------------------------------\n";
		cadena += "Fecha: " + sdf.format(fecha) + " - Hora Salida: " + horaSalida + " - Hora Llegada: " + horaLlegada + '\n';
		cadena += avion.consultarDatos() + '\n';
		cadena += remolque.consultarDatos() + '\n';
		cadena += "-----------------------------------------------\n";
		cadena += "DESDE:\n";
		cadena += AeropuertoSalida.consultarDatos() + '\n';
		cadena += "-----------------------------------------------\n";
		cadena += "HACIA:\n";
		cadena += AeropuertoLlegada.consultarDatos() + '\n';
		return cadena;
	}
}