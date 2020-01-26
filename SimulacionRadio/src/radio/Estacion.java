package radio;

public class Estacion {
	
	double estacion = 0;
	boolean tipoFrecuencia = false;
	int boton = 0;
	
	private static Estacion est[];
	private static int contador;
	
	//crear constructor
	public Estacion(boolean tipoFrecuencia, double estacion, int boton) {
			
		this.tipoFrecuencia = tipoFrecuencia;
		this.estacion = estacion;
		this.boton = boton;
	}
	
	public boolean getTipoFrecuencia() {
		return tipoFrecuencia ;
	}

	public void setTipoFrecuencia(boolean tipoFrecuencia ) {
		this.tipoFrecuencia = tipoFrecuencia ;

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
	
	//se crea el metodo para guardar estaciones 
		public void guardarEstacion(double estacion, boolean tipoFrecuencia, int boton) {

				for (int i = 0; i < 12; i++) {
					est[i] = new Estacion(false, i, i);
					}

					contador = 0;
					
					est[contador].setEstacion(estacion);
					est[contador].setTipoFrecuencia(tipoFrecuencia);
					est[contador].setBoton(boton);

					contador++;
				}

}
