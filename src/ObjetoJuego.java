
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
	
	public ObjetoJuego() {
		
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}

	public char getLetraMapa() {
		return letraMapa;
	}

	public void setLetraMapa(char letraMapa) {
		this.letraMapa = letraMapa;
	}

	public int getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(int tipoObetjo) {
		this.tipoObjeto = tipoObetjo;
	}

}
