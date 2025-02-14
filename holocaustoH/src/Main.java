import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Scanner
		int accionJuego = -1;
		Scanner in = new Scanner(System.in);
		int objeto = 0;
		
		//Posicionamos las puetas de entrada y salida
		Posicion posEntrada = new Posicion(0, 3);
		Posicion posSalida = new Posicion(5, Habitacion.ALTO - 1);
		ObjetoJuego puertaEntrada = new ObjetoJuego();
		puertaEntrada.setPos(posEntrada);
		puertaEntrada.setLetraMapa('/');
		puertaEntrada.setTipoObjeto(ObjetoJuego.PUERTA_ENTRADA);
		ObjetoJuego puertaSalida = new ObjetoJuego();
		puertaSalida.setPos(posSalida);
		puertaSalida.setLetraMapa('/');
		puertaSalida.setTipoObjeto(ObjetoJuego.PUERTA_SALIDA);
		
		//Generamos jugador y le ponemos en la puerta de entrada
		Jugador jugador = new Jugador();
		Posicion posInJ = new Posicion(posEntrada.getX(), posEntrada.getY());
		jugador.setPos(posInJ);
		jugador.setLetraMapa('J');
		jugador.setTipoObjeto(ObjetoJuego.JUGADOR);
		
		//Generamos Hadron y le damos una posicion aleatoria
		Hadron hadron = new Hadron();
		Posicion posHadron = Juego.posAleatoria();
		hadron.setPos(posHadron);
		hadron.setLetraMapa('H');
		hadron.setTipoObjeto(ObjetoJuego.HADRON);
		
		//Generamos una nueva pieza
		ObjetoJuego pieza = new ObjetoJuego();
		Posicion posPieza = Juego.posAleatoria();
		pieza.setPos(posPieza);
		pieza.setLetraMapa('P');
		pieza.setTipoObjeto(ObjetoJuego.PIEZA);
		
		//Generamos un nuevo objeto oculto
		ObjetoJuego objOculto = new ObjetoJuego();
		Posicion posObjOculto = Juego.posAleatoria();
		objOculto.setPos(posObjOculto);
		objOculto.setLetraMapa('O');
		objOculto.setTipoObjeto(ObjetoJuego.OBJETO);
		
		//Generamos habitacion y sus elementos
		Habitacion hab1 = new Habitacion();
		hab1.setObjetoJ(jugador);
		hab1.setObjetoJ(puertaEntrada);
		hab1.setObjetoJ(puertaSalida);
		hab1.setObjetoJ(hadron);
		hab1.setObjetoJ(pieza);
		hab1.setObjetoJ(objOculto);
		
		while(accionJuego != Juego.SALIR_JUEGO) {
			
			int numMov = 0;
			int numColumnas = 0;
			int numFilas = 0;
			
			//Pintamos la habitacion
			Juego.pintarHabitacion(hab1);
			
			Juego.pintarMenu();
			accionJuego = in.nextInt();
		
			switch(accionJuego) {
			
				case Juego.LANZAR_DADO:
					numMov = Juego.lanzarDado(10);
					//Comprobar que numColumnas este dentro de los movimientos que pueden hacer y que el jugador no salga del mapa
					do{
						System.out.println("[MOVIMIENTO COLUMNAS/X] ¿Cuantas columnas quieres moverte? Tienes " + numMov + " movimientos");
						numColumnas = in.nextInt();
					}while(numColumnas > numMov || (jugador.getPos().getX() + numColumnas + 1) >= Habitacion.ANCHO || jugador.getPos().getX() + numColumnas <= 0);

					jugador.movX(numColumnas);
					numMov -= Math.abs(numColumnas);
					//Comprobar que quedan movimientos
					if(numMov > 0) {
						//Comprobar que numFilas este dentro de los movimientos que pueden hacer y que el jugador no salga del mapa
						do{
							System.out.println("[MOVIMIENTO FILAS/Y] ¿Cuantas filas quieres moverte? Tienes " + numMov + " movimientos");
							numFilas = in.nextInt();
						}while(numFilas > numMov || (jugador.getPos().getY() + numFilas + 1) >= Habitacion.ALTO || jugador.getPos().getY() + numFilas <= 0);

						jugador.movY(numFilas);
					}
					//Comprobamos si hay un objeto en la posición actual
					objeto = hab1.hayObjetoSinJugador(jugador.getPos());
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
			}
			
			if(objeto > 0) {
				//Se ha chocado contra un hadron
				if(hab1.getObjetoJ(objeto).getTipoObjeto() == ObjetoJuego.HADRON) {
					int vidaPerdida = Juego.lanzarDado(2) * numMov;
					accionJuego = Juego.explotaHadron(vidaPerdida);
				}
				else if(hab1.getObjetoJ(objeto).getTipoObjeto() == ObjetoJuego.PIEZA) {
					jugador.setPiezaHabitacion();
				}
				else if(hab1.getObjetoJ(objeto).getTipoObjeto() == ObjetoJuego.PUERTA_SALIDA) {
					Juego.habitacionSuperada(hab1);
					accionJuego = Juego.SALIR_JUEGO;
				}
				hab1.eliminarObjetoJ(objeto);
				objeto = -1;
			}
		}
	}
}
