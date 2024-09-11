import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;

class Taller extends ProgramaAcademico{
// Atributo
	private Date fechaRealizacion;
	private LocalTime horaInicio;
	private LocalTime horaFin;
// Metodos
	// Constructor
	public Taller(String nombre, String clave, char modalidad, double precio, Date fechaRealizacion, LocalTime horaInicio, LocalTime horaFin){
		super(nombre, clave, modalidad, precio);
		this.fechaRealizacion = fechaRealizacion;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}
	@Override
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "TALLER: " + getClave() + " - " + getNombre() + " - S/. " + getPrecio() + " - FECHA: " + sdf.format(fechaRealizacion);
	}
}