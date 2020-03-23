/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

import java.util.Scanner;

/**
 *
 * @author Namo
 */
public class Joc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creem un joc d'endevinar bàsic.
        GuessNumber jocEndevina = new GuessNumber(1,200);
        
        // Creem un joc d'endevinar amb un màxim d'intents. Si vols fer servir aquesta versió comenta l'anterior o
        // descomenta-la
        // GuessNumberIntents jocEndevina = new GuessNumberIntents(10,1,200);
        
        // El codi que tenim sota és comú a les dues implementacions!
        Scanner teclat = new Scanner(System.in);
        int numero;
        
               
        // Mentre no acabi el joc: No s'endevini el número
        System.out.println(jocEndevina.getMissatge());
        while(!jocEndevina.isAcabat()) {
            // Es demana per teclat un número
            System.out.println("Entra un número:");
            numero = teclat.nextInt();
            // Es comprova si s'ha endevinat o no i es mostra el missatge 
            // segons l'estat del joc.
            jocEndevina.comprova(numero);    
            System.out.println(jocEndevina.getMissatge());
        }
    }
    
}
