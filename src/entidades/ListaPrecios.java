package entidades;

import java.util.ArrayList;
import java.util.List;

public class ListaPrecios {
	private Long id;
	private List<Producto> listaProductos;
	private String proveedor;
	
	public ListaPrecios(Long id, String proveedor) {
		this.id = id;
		this.proveedor = proveedor;
		this.listaProductos = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


}
