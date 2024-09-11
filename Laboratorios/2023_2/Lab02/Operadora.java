class Operadora extends Empresa{
// Atributos
	private boolean soporteLogistico;
	private boolean asistenciaNavegacion;
// Metodos
	// Constructor
	public Operadora(String nombre, boolean soporteLogistico, boolean asistenciaNavegacion){
		super(nombre);
		this.soporteLogistico = soporteLogistico;
		this.asistenciaNavegacion = asistenciaNavegacion;
	}
	// Consultar Datos
	@Override
	public String consultarDatos(){
		return "Operadora: " + getNombre() + " - Soporte Logistico: " + soporteLogistico + " - Asistencia Navegacion: " + asistenciaNavegacion;
	}
}