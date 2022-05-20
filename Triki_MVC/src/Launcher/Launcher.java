/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Launcher;
import presentación.Modelo;
/**
 *
 * @author Juan
 */
public class Launcher {
    
    private final Modelo miTriki;
    
    public Launcher(){
        miTriki = new Modelo();
        miTriki.iniciar();
    }
    public static void main(String[] args){
        new Launcher();
    }
    
}
