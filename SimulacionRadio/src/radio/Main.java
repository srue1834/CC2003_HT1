package radio;


public class Main {

		public static void main(String[] args) {
			
			
			Ventana1 v1 = new Ventana1();
			Estacion est = new Estacion(false, 0, 0);
			
			double estacion = 0;
			boolean tipoFrecuencia = false;
			int boton = 0;
			
			est.guardarEstacion(estacion, tipoFrecuencia, boton);
			
			//se mostrara la ventana1
			v1.setVisible(true);	
			
		}
		
	}


