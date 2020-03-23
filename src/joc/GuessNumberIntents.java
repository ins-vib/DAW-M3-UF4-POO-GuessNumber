/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/*
 *  @author Ramon Cervera
 *  @version 1
 *  Classe GuessNumberIntents
 *    En aquesta classe que serà filla de la classe GuessNumber
 *    anirem a aprofitar el joc bàsic però fent-lo més difícil, doncs
 *    limitarem el número d'intents en que l'usuari pot arribar a endevinar el número.
 *
 */
public class GuessNumberIntents extends GuessNumber {
    protected int maxIntents; // Variable que guarda el número màxim d'intents que l'usuari té
                              // per endevinar el número
    private int intents;
    
    public int getMaxIntents() {
        return maxIntents;
    }

    public void setMaxIntents(int maxIntents) {
        this.maxIntents = maxIntents;
    }

    /** Contructor 1 sense paràmetres: per defecte tindrem 10 oportunitats per endevinar el número
    */
    public GuessNumberIntents() {
        this.maxIntents = 10;
        this.intents = 0; // poso a 0 el número de cops que ho he intentat
        this.missatge = this.missatge +"Tens "+this.maxIntents+" oportunitats.";
    }
    
    /** Contructor 2 amb paràmetres: podem especificar el número d'intents
     * @param maxIntents: podrem indicar quants intents té l'usuari
    */
    public GuessNumberIntents(int maxIntents) {
        this.maxIntents = maxIntents;
        this.intents = 0; // poso a 0 el número de cops que ho he intentat
        this.missatge = this.missatge +"Tens "+this.maxIntents+" oportunitats.";
    }

    /** Contructor 3 amb paràmetres: podem especificar el número d'intents, i l'interval 
     *  en què volem que el número aleatori estigui.
     * 
     * @param maxIntents: podrem indicar quants intents té l'usuari
     * @param minim:
     * @param maxim:
    */
    public GuessNumberIntents(int maxIntents, int minim, int maxim) {
        super(minim, maxim); // Cridem al constructor de la classe pare, definit en GuessNumber!
                             // Ens els constructors 1 i 2, es cridarà automàticament super(), no cal posar-ho,
                             // i per tant, el número aleatori estarà entre 1 i 100!!
                             // Aquest constructor és per poder decidir que l'interval sigui diferent.
        this.maxIntents = maxIntents;
        this.intents = 0; // poso a 0 el número de cops que ho he intentat
        this.missatge = this.missatge +"Tens "+this.maxIntents+" oportunitats.";
    }

    /** Comprova: Anem a sobreescriure el mètode comprova de la classe GuessNumber
     * El comportament ha de ser com el mètode del pare però s'ha d'afegir que es perd la partida quan s'esgoten els 
     * intents.
     * @param numero Número que es vol comprovar
     * @return cert en cas que s'endevini o fals en cas contrari
    */
    @Override
    public boolean comprova(int numero) {
        boolean encertat;
        encertat =  super.comprova(numero);  // Cridem al mètode comprova de la classe Pare!
                    // Sabem que retorna true si el número s'ha endevinat!
                    // i fals en cas contrari.
        if(encertat==false) { // No s'ha endevinat
            this.intents ++ ; // incrementem el número d'intents!
            if(this.intents == this.maxIntents) { // si s'han esgotats els intents
                this.acabat = true;  // Acabem el joc!
                this.missatge ="Has perdut! El numero cercat era "+this.numeroAleatori;
            }
            else this.missatge = this.missatge+"Et queden "+(this.maxIntents - this.intents)+".";
        }        
        return encertat;
    }
    
    
    
    
}
