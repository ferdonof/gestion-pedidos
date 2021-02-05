package entidades;

public class Entregado extends Estado {

	public Entregado() {
		this.nombre = "Entregado";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return this;
	}

}
