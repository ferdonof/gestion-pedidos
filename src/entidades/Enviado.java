package entidades;

public class Enviado extends Estado {

	public Enviado() {
		this.nombre = "Enviado";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return new Entregado();
	}

}
