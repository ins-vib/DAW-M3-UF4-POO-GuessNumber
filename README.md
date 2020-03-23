En aquest projecte tenim implementada les classes:

- Classe GuessNumber: classe per jugar al joc d'endevinar un número
  En aquesta versió bàsica, l'ordinador genera un número aleatori que
  l'usuari ha d'endevinar. Per cada número que l'usuari vol comprovar, l'ordinador l'informa
  si l'ha endevinat (el joc acaba) o si el número que s'ha d'endevinar és més gran o més petit
  que el que s'ha entrat. 
- Classe GuessNumberIntents: Hereta (extends) de l'anterior GuessNumber.
  Té el mateix comportament que l'anterior però incorporem  
  un número d'intents que té l'usuari poder endevinar el número amagat.
 
- En la classe Joc, tenim el programa principal main. Podem fer servir les dues versions del joc.
Només cal comentat/descomentar la línia de creació del joc.
       
        // GuessNumber jocEndevina = new GuessNumber(1,200);        
       
        // GuessNumberIntents jocEndevina = new GuessNumberIntents(7,1,200);

 Per exemple, si utilitzem  new GuessNumber(1,200) crearem un joc per endevinar un número entre 1 i 200.
 Si enlloc de l'anterior, femn new GuessNumberIntents(10,1,200) crearem un koc per endevinar un número entre 1 i 200 amb un màxim de 7 intents.
 Podem fer servir altres numeros o també new GuessNumber() o new GuessNumberIntents() per crear jocs amb valors per defecte.

Activitat a realitzar:
- Repassa el comportament de la classe GuessNumber i juga al joc fent servir la línia new GuessNumber(1,200).
- Repassa com s'ha construit la classe GuessNumberIntents a partir de la classe GuessNumber. Juga al joc fent servir 
 new GuessNumberIntents(10,1,200)
- Implementa una nova classe anomenada GuessNumnerIntentsNoRepetits
Aquesta nova classe que serà filla de la classe GuessNumberIntents, aprofitarà la funcionalitat
de la classe GuessNumberIntents (les classes proporcionades NO es poden modificar!!!)
per a que un joc no admeti que l'usuari pugui repetir números.
S'informarà a l'usuari si el número està repetit, a través del mètode getMissatge()
Els números repetits no descomptaran intents.
En el mètode main has de crear un objecte del tipus GuessNumberIntentsNoRepetits i jugar. El codi que va a continuació del
new no ha de ser necessari modificar-lo.

GuessNumberIntentsNoRepetits jocEndevina = new GuessNumberIntentsNoRepetit();
// tota la resta continua igual
...