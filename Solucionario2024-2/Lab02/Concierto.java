class Concierto extends Evento{
	private boolean existePermisoGrabacion;
	private TipoConcierto tipoConcierto;
	public Concierto(String nombre, double costoRealizacion, char tipoPublico, TipoConcierto tipoConcierto, boolean existePermisoGrabacion){
		super(nombre, costoRealizacion, tipoPublico);
		this.tipoConcierto = tipoConcierto;
		this.existePermisoGrabacion = existePermisoGrabacion;
	}
	@Override
	public String devolverDatos(){
		String cadena = "";
		cadena += devolverCabecera();
		cadena += "CONCIERTO - TIPO:" + tipoConcierto + "\n";
		cadena += "PERMISO GRABACION: " + (existePermisoGrabacion?"SI":"NO") + "\n";
		cadena += "-----------------------------------------------------------" + "\n";
		return cadena;
	}
}