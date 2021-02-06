package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class FormaPago {
	private int cantidadPagos = 1;
	private List<Date> fechasDePago = new ArrayList<>();
	private List<Date> pagosRealizados = new ArrayList<>();
	
	
	
	public int getCantidadPagos() {
		return cantidadPagos;
	}
	
	public void setCantidadPagos(int cantidadPagos) {
		this.cantidadPagos = cantidadPagos;
	}
	
	public List<Date> getFechasDePago() {
		return fechasDePago;
	}
	
	public void setFechasDePago(List<Date> fechasDePago) {
		this.fechasDePago = fechasDePago;
	}
	
	public List<Date> getPagosRealizados() {
		return pagosRealizados;
	}
	
	public void setPagosRealizados(List<Date> pagosRealizados) {
		this.pagosRealizados = pagosRealizados;
	}

	public void pagar(Date fecha, Double monto) {
		pagosRealizados.add(fecha);
	}

	
}
