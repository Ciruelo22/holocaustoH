/*
 * Clase ObjetoJuego que modela los distintos objetos dentro del juego
 * <ul>
* <li>jugador como JUGADOR
* <li>hadron como HADRON
* <li>pieza como PIEZA
* <li>objeto como OBJETO
* <li>puerta de entrada como PUERTA_ENTRADA
* <li>puerta de salida como PUERTA_SALIDA
* </ul>
* 
 * 
 * @author Joel Nassar
 * 
 * @version 1.0
 */
public class ObjetoJuego {
	//Tipos de ObjetoJuego
	final static int JUGADOR = 0;
	final static int HADRON = 1;
	final static int PIEZA = 2;
	final static int OBJETO = 3;
	final static int PUERTA_ENTRADA = 4;
	final static int PUERTA_SALIDA = 5;
	
	//Propiedades
	private String nombre;
	private Posicion pos;
	private int tipoObjeto = -1;
	
	//Letra en mapa
	private char letraMapa = ' ';
	
	/**
	 * Constructor clase Objeto
	 */
	public ObjetoJuego() {
		
	}
	
	/*
	 * getNombre Getter nombre
	 * 
	 * @return int nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/*
	 * setNombre Setter nombre
	 * 
	 * @param String nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * getPos Getter pos
	 * 
	 * @return Posicion pos 
	 */
	public Posicion getPos() {
		return pos;
	}

	/*
	 * setPos Setter pos
	 * 
	 * @param  Posicion pos
	 */
	public void setPos(Posicion pos) {
		this.pos = pos;
	}

	/*
	 * getLetraMapa Getter letraMapa
	 * 
	 * @return char letraMapa 
	 */
	public char getLetraMapa() {
		return letraMapa;
	}

	/*
	 * setLetraMapa Setter letraMapa
	 * 
	 * @param  char letraMapa
	 */
	public void setLetraMapa(char letraMapa) {
		this.letraMapa = letraMapa;
	}

	/*
	 * getTipoObjeto Getter tipoObetjo
	 * 
	 * @return int tipoObetjo 
	 */
	public int getTipoObjeto() {
		return tipoObjeto;
	}

	/*
	 * setTipoObjeto Setter tipoObetjo
	 * 
	 * @param  int tipoObetjo
	 */
	public void setTipoObjeto(int tipoObetjo) {
		this.tipoObjeto = tipoObetjo;
	}

}
