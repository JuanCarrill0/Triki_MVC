/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

/**
 *
 * @author Juan
 */
public class Triki {
    
        private char tablero[][];
	private int tamaño = 3;
	private char turno;

	/** Inicializa el triki 3x3*/
        
	public Triki() {
		this.tamaño = tamaño;
		tablero = new char[tamaño][tamaño];
		turno = 'X';
	}
        
	/** Dada una fila y columna seleccionada en la matriz
         *  Rellena el botón con el turno que toca */
        
	public boolean hacerMovimiento(int Fila, int Columna) {
		if (tablero[Fila][Columna] == '\0') {
			tablero[Fila][Columna] = turno;
			turno = (turno == 'X' ? 'O' : 'X');
			return true;
		}
		return false;
	}

	/** Encuentra un posible ganador verificando
         *  Filas, Columnas y Diagonales en la matriz del tablero
         * @return 
         */
	public char encontrarGanador() {

		// Verifica Horizontales
		char Ganador;
		for (int Fila = 0; Fila < tamaño; Fila++) {
			Ganador = tablero[Fila][0];
			for (int Columna = 0; Columna < tamaño; Columna++) {
				if (tablero[Fila][Columna] != Ganador) {
					Ganador = '\0';
					break;
				}
			}
			if (Ganador != '\0')
				return Ganador;
		}

		// Verifica Verticales
		for (int Columna = 0; Columna < tamaño; Columna++) {
			Ganador = tablero[0][Columna];
			for (int Fila = 0; Fila < tamaño; Fila++) {
				if (tablero[Fila][Columna] != Ganador) {
					Ganador = '\0';
					break;
				}
			}
			if (Ganador != '\0')
				return Ganador;
		}

		// Verifica de izquierda a derecha diagonales
		Ganador = tablero[0][0];
		for (int Columna = 0; Columna < tamaño; Columna++) {
			if (tablero[Columna][Columna] != Ganador) {
				Ganador = '\0';
				break;
			}
		}
		if (Ganador != '\0')
			return Ganador;

		// Verifica de derecha a izquierda diagonales
                
		Ganador = tablero[0][tamaño - 1];
		for (int Fila = 0; Fila < tamaño; Fila++) {
			if (tablero[Fila][(tamaño - 1) - Fila] != Ganador) {
				Ganador = '\0';
				break;
			}
		}
		if (Ganador != '\0')
			return Ganador;

		return '\0';
	}

	/** Determina si el tablero se encuentra completamente lleno */
        
	public boolean esEmpate() {
		for (int Fila = 0; Fila < tamaño; Fila++) {
			for (int Columna = 0; Columna < tamaño; Columna++) {
				if (tablero[Fila][Columna] == '\0')
					return false;
			}
		}

		return true;
	}
        
        /** Devuelve el turno */
        
	public char getTurno() {
		return this.turno;
	}

    
    
}
