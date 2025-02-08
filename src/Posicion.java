
public class Posicion {
	
	private int posX;
	private int posY;

	public Posicion() {
		
		this.posX = 0;
		this.posY = 0;
	}
	
	public Posicion(int x, int y) {
		
		this.posX = x;
		this.posY = y;
	}

	public int getX() {
		return posX;
	}

	public void setX(int posX) {
		this.posX = posX;
	}

	public int getY() {
		return posY;
	}

	public void setY(int posY) {
		this.posY = posY;
	}
	
	public boolean esIgual(Posicion pos) {
		
		if(pos.posX == this.posX && pos.posY == this.posY) return true;
		else return false;
	}

}
