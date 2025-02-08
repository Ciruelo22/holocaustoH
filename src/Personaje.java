
public class Personaje extends ObjetoJuego {
	
	public Personaje() {
		
		System.out.println("Creación Personaje");
	}
	
	public void movX(int x) {
		Posicion pos = super.getPos();
		pos.setX(pos.getX() + x);
	}
	
	public void movY(int y) {
		Posicion pos = super.getPos();
		pos.setY(pos.getY() + y);
	}


	
	

}
