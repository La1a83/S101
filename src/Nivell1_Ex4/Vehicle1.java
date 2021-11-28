package Nivell1_Ex4;


public class Vehicle1 {
    
    
    /*
    Les paraules static final fan referència a variables que son compartides per
    tots els objectes i no poden variar el seu valor, son contants. Si es prova de 
    modificar el seu valor donaria error de compilació. 
    */
    static final int RODES = 4;//El seu valor serà sempre 4;
    
    
    
    
    /*
    En aquest cas la paraula final també vol dir que el valor de la variables no es 
    pot modificar, però s'inicialitza al crear l'objecte, perquè no es static,
    es pot inicilitzar amb el constructor.
    */
    final String nom = "classe Vehicle";//No es pot modificar el valor.
    
    
    
    /*
    La paraula static fa referència a mètodes o variables de la classe que no
    depenen de la creació d'objectes. Son dades comunes a tots els objectes.
    */
    
    static int conta = 0;
    
    Vehicle1() {
      
        conta++;
    }
    
    
    public static void main(String[] args) {
        
        Vehicle1 vehicle1 = new Vehicle1();
        Vehicle1 vehicle2 = new Vehicle1();
        Vehicle1 vehicle3 = new Vehicle1();
        
        System.out.println("Variable static finasl Rodes val: "+RODES);
        System.out.println("Variable final nom: "+vehicle1.nom);
        System.out.println("Comprovant la variable static conta: "+conta);
        
        
        
       
    }
    
}
