
/*
* Clase para crear una Habitacion que contiene los siguientes elementos
* 
* <ul>
* <li>puertaEntrada como Posicion
* <li>puertaSalida como Posicion
* <li>objetoJ como array de ObjetoJuego
* <li>OBJETO=3
* <li>PUERTA_ENTRADA=4
* <li>PUERTA_SALIDA=5
* </ul>
* 
* 
* @author Joel Nassar
* @see holocaustoH.ObjetoJuego
* @version 1.0
*/
public class Habitacion {
	//Tamaño habitacion
	public static final int ANCHO = 10;
	public static final int ALTO = 10;
	//Puertas
	private Posicion puertaEntrada;
	private Posicion puertaSalida;
	 
	//Hacemos una copia del jugador
	private Personaje j;
	
	//Conjunto de objetos de juego
	private ObjetoJuego[] objetosJ = new ObjetoJuego[20];
	private int numObjetos = 0;
	
	/**
	 * Habitacion Constructor
	 *
	 */
	public Habitacion() {
		
		System.out.println("Creación Habitación");
	}
	/*
	 * Habitacion Constructor
	 * 
	 * @param Posicion puerta_entrada
	 * @param Posicion puerta_salida
	 * @param Personaje j
	 */

	public Habitacion(Posicion puertaEntrada, Posicion puertaSalida, Personaje j) {
		this.puertaEntrada = puertaEntrada;
		this.puertaSalida = puertaSalida;
		this.j = j;
		this.j.setPos(this.puertaEntrada);
		
		System.out.println("Creación Habitación con parámetros");
	}
	
	/**
	 * setObjetoJ Setter 
	 * @param ObjetoJuego obj
	 */
	public void setObjetoJ(ObjetoJuego obj) {
		objetosJ[numObjetos] = obj;
		numObjetos++;
	}
	
	public ObjetoJuego getObjetoJ(int objPosicion) {
		return objetosJ[objPosicion];
	}
	
	/**
	 * eliminarObjetoJ elimina el objeto situado en la posicion pasada por parametro sobrescribiendolo
	 * 
	 * @param int objPos
	 */
	public void eliminarObjetoJ(int objPos) {
		int posObjetos = 0;
		for(int i = 0; i < numObjetos; i++) {
			if(objPos != i) {
				objetosJ[posObjetos] = objetosJ[i];
				posObjetos++;
			}
		}
		numObjetos--;
	}
	
	/**
	 * hayObjeto si hay objeto en la posicion pasada devuelve su posicion en el array objetosJ
	 * si no hay devuelve -1
	 * 
	 * @param Posicion pos
	 * @return int posicion en objetosJ
	 */
	public int hayObjeto(Posicion pos) {
		for(int i = 0; i < numObjetos; i++) {
			
			ObjetoJuego obj = objetosJ[i];
			Posicion objPosicion = obj.getPos();
			
			if(pos.esIgual(objPosicion)) return i;
		}	
		return -1;
	}
	
	/**
	 * hayObjetoSinJugador si hay objeto en la posicion pasada devuelve su posicion en el array objetosJ
	 * si no hay devuelve -1
	 * No tiene en cuenta el jugador ya que siempte esta en la primera posicion
	 * 
	 * @param Posicion pos
	 * @return int posicion en objetosJ
	 */
	public int hayObjetoSinJugador(Posicion pos) {
		for(int i = 1; i < numObjetos; i++) {
			
			ObjetoJuego obj = objetosJ[i];
			Posicion objPosicion = obj.getPos();
			if(pos.esIgual(objPosicion)) return i;
		}
		return -1;
	}

	//Versiones iniciales
	/**
	 * setPersonaje Setter jugador
	 * 
	 * @param Jugador j
	 * @deprecated Versiones iniciales
	 */	
	public void setJugador(Jugador j) {
		this.j = j;
	}
	
	/**
	 * getPuertaEntrada Getter puertaEntrada
	 * 
	 * @return Posicion puertaEntrada
	 * @deprecated Versiones iniciales
	 */
	public Posicion getPuertaEntrada() {
		return puertaEntrada;
	}
	
	/**
	 * setPuertaEntrada Setter puertaEntrada
	 * 
	 * @param Posicion puertaEntrada
	 * @deprecated Versiones iniciales
	 */
	public void setPuertaEntrada(Posicion puertaEntrada) {
		this.puertaEntrada = puertaEntrada;
	}

	public Posicion getPuertaSalida() {
		return puertaSalida;
	}

	public void setPuertaSalida(Posicion puertaSalida) {
		this.puertaSalida = puertaSalida;
	}
	
	public boolean esunaPuerta(Posicion p) {
		if(p.esIgual(puertaEntrada) || p.esIgual(puertaSalida)) return true;
		return false;
	}
	
	public boolean esunJugador(Posicion p) {
		if(p.esIgual(j.getPos())) return true;
		return false;
	}
}
