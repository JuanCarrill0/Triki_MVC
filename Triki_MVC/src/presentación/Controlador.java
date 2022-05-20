/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentación;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Juan
 */
public class Controlador implements ActionListener {
    
    private final Vista ventana;
    
    public Controlador(Vista v){
        ventana = v;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ventana.getMiModelo().jugar(e);
        
    }
      
}
