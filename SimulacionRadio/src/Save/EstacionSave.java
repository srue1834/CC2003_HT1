package Save;

public class EstacionSave {
	private EstacionSave siguiente;
	private Object estacion;
	
	EstacionSave(Object estacion) {
		this.estacion = estacion;
		this.siguiente = null;

	}
	
	EstacionSave savedSiguiente() {
		return this.siguiente;
	}
	
	public void add(EstacionSave ES) {
		this.siguiente = ES;
	}
	
	Object savedEstacion() {
		return this.estacion;
	}

}
