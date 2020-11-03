package cl.miaccidente.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pagos {

	@Id
	@GeneratedValue
	@Column(name = "idPago")
	public int idPago;

	@Column(name = "clienteNombre")
	public String clienteNombre;

	@Column(name = "valorPago")
	public float valorPago;

	@Column(name = "fechaPago")
	public String fechaPago;

	public Pagos(int idPago, String clienteNombre, float valorPago, String fechaPago) {
		super();
		this.idPago = idPago;
		this.clienteNombre = clienteNombre;
		this.valorPago = valorPago;
		this.fechaPago = fechaPago;
	}

	public Pagos() {
		super();
	}

	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public String getClienteNombre() {
		return clienteNombre;
	}

	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

}