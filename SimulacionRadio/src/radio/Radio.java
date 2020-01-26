package radio;

public class Radio {
	
	
	
	//se crean sus atributos
	boolean subirBajar;
	boolean tipoFrecuencia;
	boolean tipo;
	boolean estado;
	double estacion;
	int boton;

	//crear constructor

	public Radio(boolean subirBajar, boolean tipoFrecuencia, boolean tipo, boolean estado, double estacion, int boton) {
		this.subirBajar = subirBajar;
		this.tipoFrecuencia = tipoFrecuencia;
		this.tipo = tipo;
		this.estado = estado;
		this.estacion = estacion;
		this.boton = boton;
	}

	public boolean getSubirBajar() {
		return subirBajar;
	}

	public void setSubirBajar(boolean subirBajar) {
		this.subirBajar = subirBajar;

	}


	public boolean getTipoFrecuencia() {
		return tipoFrecuencia ;
	}

	public void setTipoFrecuencia(boolean tipoFrecuencia ) {
		this.tipoFrecuencia = tipoFrecuencia ;

	}


	public boolean getTipo() {
		return tipo ;
	}

	public void setTipo(boolean tipo ) {
		this.tipo = tipo;

	}


	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;

	}


	public double getEstacion() { 
		return estacion;
	}

	public void setEstacion(double estacion) {
		this.estacion = estacion;

	}


	public int getBoton() {
		return boton ;
	}

	public void setBoton(int boton ) {
		this.boton = boton;

	}
	
	

}


