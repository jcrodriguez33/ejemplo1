package dominio;

import java.util.Date;

/**
 * Clases que representa al dominio de Caja de Ahorro
 * @author jzapana
 *
 */
public class CajaDeAhorro {
	private Integer id;
	private String numeroCuenta;
	private String titular;
	private Double saldo;
	private Date fechaCreacion;
	
	
	public  CajaDeAhorro() {
		System.out.println("Estoy creando un objeto...");
	}
	
	/**
	 * Constructor con todos los atributos del objeto
	 * @param id 
	 * @param numeroCuenta
	 * @param titular
	 * @param saldo
	 */
	public CajaDeAhorro(Integer id, String numeroCuenta, String titular, Double saldo) {
		super();
		this.id = id;
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.fechaCreacion = new Date();
	}


	/**
	 * Devuele el nombre del titular y su saldo
	 * @return
	 */
	public String getNombreYSaldo() {
		return "Titular: " + this.titular + " Saldo: " + this.getSaldo(); 
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "CajaDeAhorro [id=" + id + ", numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + ", fechaCreacion= " + fechaCreacion
				+ "]";
	}
		
}
