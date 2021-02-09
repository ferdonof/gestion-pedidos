package entidades;

import java.util.Date;

public class Tarjeta extends FormaPago {
	public static final String VISA = "Visa";
	public static final String MASTERCARD = "Mastercard";
	
	
	private String nombre;
	private Date fechaCaducidad;
	private Long numero;
	private String titular;
	
	
}
