
public abstract class Animalitos {
	    public abstract void desplazarse();
	    public abstract void hacerSonidos();
	}

	class Perro extends Animalitos {
	    @Override
	    public void desplazarse() {
	        System.out.println("Camino como perro");
	    }

	    @Override
	    public void hacerSonidos() {
	        System.out.println("Wau Wau");
	    }
	}

	class Gato extends Animalitos {
	    @Override
	    public void desplazarse() {
	        System.out.println("Camino como gato");
	    }

	    @Override
	    public void hacerSonidos() {
	        System.out.println("Miau Miau");
	    }
	    
	}
	    class Borrego extends Animalitos {
		    @Override
		    public void desplazarse() {
		        System.out.println("Camino como borrego");
		    }

		    @Override
		    public void hacerSonidos() {
		        System.out.println("Meeh meeeh");
		    }
	    
	    
	    }
	
	    class Vaca extends Animalitos {
		    @Override
		    public void desplazarse() {
		        System.out.println("Camino como vaca");
		    }

		    @Override
		    public void hacerSonidos() {
		        System.out.println("Muuuu");
		    }
	    
	    
	    }
	    
	    class Pollito extends Animalitos {
		    @Override
		    public void desplazarse() {
		        System.out.println("Camino como pollito");
		    }

		    @Override
		    public void hacerSonidos() {
		        System.out.println("pio pio");
		    }
	    
	    
	    }
	

	

