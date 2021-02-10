package entidades;

public class Pagado extends Estado {

	
	public Pagado() {
		this.nombre = "Pagado";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return new Procesando();
	}

}
