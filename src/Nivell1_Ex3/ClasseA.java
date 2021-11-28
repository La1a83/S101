
package Nivell1_Ex3;


public class ClasseA {
    //Bloc d'inicialització
    {
        System.out.println("un mètode d'inicialització que requereix instanciació");
    }
    // bloc static d'inicialització.
    static {
        System.out.println("Això és un mètode d'inicialització estàtic");
    }
    
    public static void main (String [] args) {
        
        ClasseA objecte1 = new ClasseA();
         
        
    }
    /*Al cridar al bloc d'inicilització estàtic es carrega la classe sencera i s'imprimeix
    per pantalla el missatge del bloc estàtic. Mès tard s'instància un objecte i
    llavors, amb la informació prèviament carregada és quan s'imprimeix el mètode 
    no estàtic.
    */
    
    
}
