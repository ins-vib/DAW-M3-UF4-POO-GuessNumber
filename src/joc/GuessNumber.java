
package joc;

import java.util.Random;

/*
 *  @author Ramon Cervera
 *  @version 1
 *  Classe GuessNumber
 *    Classe que encapçula el joc d'endevinar un número
 *    En aquesta versió bàsica, l'ordinador genera un número aleatori que
 *    l'usuari ha d'endevinar. Per cada número que l'usuari vol comprovar, l'ordinador l'informa
 *    si l'ha endevinat (el joc acaba) o si el número que s'ha d'endevinar és més gran o més petit
 *    que el que s'ha entrat.
 *
 */
public class GuessNumber {
    // Atributs protected: Les classes que heretin de GuessNumber podran acceder-hi directament
    protected int numeroAleatori;    // Numero aleatori generat que s'ha d'endevinar
    protected String missatge;       // Missatge que es mostrarà a l'usuari
    protected boolean acabat;        // Joc acabat? en aquesta versió, s'acaba quan s'endevina el joc
    
    private final int maxValor;     // El número aleatori estarà comprès entre aquests 2 valors
    private final int minValor;
     
    /** Contructor sense paràmetres: per defecte el valor aleatori estarà entre 1 i 100
    */
    
    public GuessNumber() {
        this.maxValor = 100;
        this.minValor = 1;
        this.inicialitzar();
        
    }
    
    /** Constructor amb 2 paràmetres: El número aleatori estarà comprès entre minim i maxim
    * @param minim  El número aleatori serà més gran que mínim
    * @param maxim  El número aleatori serà més petit que màxim
    */
    public GuessNumber(int minim, int maxim) {
        
        this.maxValor = maxim;
        this.minValor = minim;       
        this.inicialitzar();
    }
    
    
    /** Genera un aleatori que s'ha d'endevinar i posa el missatge inicial del joc
    */
    private void inicialitzar() {
        this.numeroAleatori = generarAleatori();
        missatge ="He pensat un número entre "+ this.minValor
                +" i "+ this.maxValor+".";
        acabat = false; 
    }
    
    
    /** Genera aleatori entre el mínim i el màxim especificat en els atributs
     * @return numero aleatori generat
    */
    
    private int generarAleatori() {
        Random generador = new Random();
        int numero = generador.nextInt(this.maxValor-this.minValor)+this.minValor;
        return numero;        
    }
    
    /** Getter públic per obtenir el missatge que es mostra a l'usuari
     * @return El missatge que es mostra a l'usuari
    */
    public String getMissatge() {
        return missatge;
    }

    /** Comprova:mètode públic que serveix per a que donat un número es
     *           comprova, si s'ha endevinat o el número és més petit o més gran que el cercat.
     * @param numero Número que es vol comprovar
     * @return cert en cas que s'endevini o fals en cas contrari
    */
    public boolean comprova(int numero) {
        
        if(numero==numeroAleatori) {
            missatge ="Has guanyat. Has encertat el numero "+numeroAleatori;
            acabat = true;
            return true;
        }        
        
        if(numero>numeroAleatori) {
            missatge="el número que he pensat és més petit.";
                   
        }
        else {
            missatge="el número que he pensat és més gran. ";
                   
        }
        return false;
    }

    /** isAcabat: Getter per saber si el joc s'ha acabat
     * @return cert o fals segons el valor de la variable acabat.
    */
    public boolean isAcabat() {
        return acabat;
    }

        
}
