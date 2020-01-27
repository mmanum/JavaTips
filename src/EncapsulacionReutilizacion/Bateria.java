package EncapsulacionReutilizacion;

public class Bateria {

	private int capacidad;

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(final int capacidad) {
		this.capacidad = capacidad;
	}

	public Bateria(final int capacidad) {
		super();
		this.capacidad = capacidad;
	}

	public int duracionBateria() {

		if (capacidad < 3000) {
			return 16;
		} else {

			return 24;
		}
	}
}