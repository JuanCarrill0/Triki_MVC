/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentación;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Juan
 */
public class Vista extends javax.swing.JFrame {
    
    private JButton board[][];
    private final int size = 3;
    
    private Modelo miModelo;
    private Controlador control;

    /**
     * Creates new form Vista
     */
    public Vista(Modelo m) {
        miModelo = m;
        crearTablero();
        capturarEventos();
        
    }
    
    public Modelo getMiModelo(){
        return miModelo;
    }
    
    public Controlador getControl(){
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }
    
    public void crearTablero(){
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(size, size));
		
		board = new JButton[size][size];
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				board[row][col] = new JButton("---");
				board[row][col].putClientProperty("row", row);
				board[row][col].putClientProperty("col", col);
				buttonPanel.add(board[row][col]);
			}
		}
                buttonPanel.setPreferredSize(new Dimension(100, 100));
                this.add(buttonPanel);
                this.pack();
     
	}
    
    public void setButtonText(char c, int row, int col) {
		board[row][col].setText(Character.toString(c));
	}
    
    public void mostrarMensaje(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
    
    public void capturarEventos() {
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++)
				board[row][col].addActionListener(getControl());
		}
	}
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
