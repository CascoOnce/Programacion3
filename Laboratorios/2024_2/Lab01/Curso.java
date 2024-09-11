import java.util.Date;
import java.time.LocalTime;

class Curso extends ProgramaAcademico{
// Atributos
	private int cantidadHorasPorSemana;
	private float cantidadCreditos;
	private Date fechaInicioDeClases;
	private Date fechaFinDeClases;
	private DiaSemana diaDeDictado;
	private LocalTime horaInicioDeClases;
	private LocalTime horaFinDeClases;
// Metodos
	public Curso(String nombre, String clave, char modalidad, double precio, int cantidadHorasPorSemana, float cantidadCreditos, Date fechaInicioDeClases, Date fechaFinDeClases, DiaSemana diaDeDictado, LocalTime horaInicioDeClases, LocalTime horaFinDeClases){
		super(nombre, clave, modalidad, precio);
		this.cantidadHorasPorSemana = cantidadHorasPorSemana;
		this.cantidadCreditos = cantidadCreditos;
		this.fechaInicioDeClases = fechaInicioDeClases;
		this.fechaFinDeClases = fechaFinDeClases;
		this.diaDeDictado = diaDeDictado;
		this.horaInicioDeClases = horaInicioDeClases;
		this.horaFinDeClases = horaFinDeClases;
	}
	@Override
	public String consultarDatos(){
		return "CURSO: " + getClave() + " - " + getNombre() + " - S/. " + getPrecio() + " - CRED: " + cantidadCreditos;
	}
}