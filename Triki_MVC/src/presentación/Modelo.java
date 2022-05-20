/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentación;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import logica.Triki;
/**
 *
 * @author Juan
 */
public class Modelo {
    
    private Triki triki;
    private Vista ventana;
    

    public Modelo() {
        
    }
    
    public void iniciar(){
        getVentana().setTitle("TRIKI");
        getVentana().setSize(500,500);
        getVentana().setResizable(false);
        getVentana().setVisible(true);
    }
    
    public void jugar(ActionEvent e){
                        JButton btn = (JButton) e.getSource();
			int Fila = (int) btn.getClientProperty("row");
			int Columna = (int) btn.getClientProperty("col");
			char Turno = getMiSistema().getTurno();

			if (getMiSistema().hacerMovimiento(Fila, Columna)) { // true --> successful move
				getVentana().setButtonText(Turno, Fila, Columna);

				char Ganador = getMiSistema().encontrarGanador();
				if (Ganador != '\0') {
					getVentana().mostrarMensaje("Jugador " + Ganador + " Ganó!");
					System.exit(0);
				}

				if (getMiSistema().esEmpate()) {
					getVentana().mostrarMensaje("Empate!");
					System.exit(0);
				}

			} else // false --> bad move
				getVentana().mostrarMensaje("Ese espacio ya fue tomado!");
    }
    
    
    public Triki getMiSistema(){
        if(triki==null){
            triki = new Triki();
        }
        return triki;
    }
    
    public Vista getVentana(){
        if(ventana==null){
            ventana = new Vista(this);
        }
        return ventana;
    }
    
   
}
