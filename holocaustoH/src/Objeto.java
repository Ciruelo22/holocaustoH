
/*
 * Objeto que se puede almacenar dentro de una habitacion
 * 
 * @author Joel Nassar
 * 
 * @version 1.0
 * @see holocaustoH.ObjetoJuego
 */
public class Objeto extends ObjetoJuego{
	//Propiedades
	private int peso = 0;
	/*
	 * Objeto es el constructor de la clase
	 * 
	 */
	public Objeto() {
		
	}
	/*
	 * getPeso Getter peso
	 * 
	 * @return int peso
	 */
	public int getPeso() {
		return peso;
	}
	/*
	 * setPeso Setter peso
	 * 
	 * @param int peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
