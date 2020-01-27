package EncapsulacionReutilizacion;

public class Telefono {

	private String marca;
	private final Bateria bateria;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(final String marca) {
		this.marca = marca;
	}
	
	public int getCapacidad() {
		return bateria.getCapacidad();
	}
	public void setCapacidad(final int capacidad) {
		bateria.setCapacidad(capacidad);
	}
	public Telefono(final String marca, final int capacidad) {
		super();
		this.marca = marca;
		this.bateria= new Bateria(capacidad);
	}
	public int duracionBateria() {
		return bateria.duracionBateria();
	}	
}