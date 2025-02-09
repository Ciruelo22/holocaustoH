
/*
 * Objeto que se puede almacenar en una habitacion
 * 
 * @author Joel Nassar
 * 
 * @version 1.0
 * @see holocaustoH.ObjetoJuego
 */
public class Objeto {
	//Propiedades
	private int peso = 0;
	/*
	 * Objeto es el constructor de la clase
	 * 
	 */
	public Objeto() {
		
	}
	/*
	 * getPeso devuelve el peso del objeto
	 * 
	 * @return int peso del objeto
	 */
	public int getPeso() {
		return peso;
	}
	/*
	 * setPeso sobrescribe el peso del objeto
	 * 
	 * @param int peso del objeto
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
