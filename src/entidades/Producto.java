package entidades;

public class Producto {
	private String codigo = "";
	private String nombre = "";
	private Double precio = 0.0;
	private Double stock = 0.0;
	private Double impuesto = 0.21;
	private String estadoProducto = "Nuevo";
	private Double porcentajeGanancia = 1.3;
	
	public Producto(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}

	public Double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public String getEstadoProducto() {
		return estadoProducto;
	}

	public void setEstadoProducto(String estadoProducto) {
		this.estadoProducto = estadoProducto;
	}

	public Double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(Double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}
	
	
	public Double getPrecioVenta() {
		return  (this.precio * this.porcentajeGanancia) + 
				(this.precio * this.impuesto);
	}
	
	public Double getPrecioCompra() {
		return  this.getPrecio();
	}
}
