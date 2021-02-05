package entidades;

public class Pedido {
	private String comprador;
	private Estado estado;
	public Pedido(String comprador) {
		this.comprador = comprador;
		this.estado = new Pendiente();
	}
	
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
	public String getComprador() {
		return comprador;
	}
	
	
	
}
