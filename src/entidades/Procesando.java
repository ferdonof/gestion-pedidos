package entidades;

public class Procesando extends Estado {

	public Procesando() {
		this.nombre = "Procesando";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return new Enviado();
	}

}
