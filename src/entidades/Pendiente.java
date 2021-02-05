package entidades;

public class Pendiente extends Estado {

	
	public Pendiente() {
		this.nombre = "Pendiente";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return new Pagado();
	}

}
