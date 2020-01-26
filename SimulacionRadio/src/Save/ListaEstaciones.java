package Save;

public class ListaEstaciones {
	private EstacionSave save;
	int largo;
	
	ListaEstaciones() {
		save = null;
		largo = 0;
		
	}
	
	void agregarPrimero(Object estacion) {
		if (save == null) {
			save = new EstacionSave(estacion);
		}
		
		else {
			EstacionSave inicio = save;
			EstacionSave fin = new EstacionSave(estacion);
			fin.add(inicio);
			save = fin;
			
		}
		largo++;	
	}

}
