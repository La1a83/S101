
package Nivell1_Ex1;


public class Vehicle {

    
    
    public static void Vehicle() {
        System.out.println("Crida al constructor");
    }
    
    public void iniciar() {
        System.out.println("Crida al mètode iniciar");
    }
    
    public static void main(String[] args) {
        
       //Crida al constructor:
       Vehicle();
        
       //S'instancia objecte de la classe Vehicle i es crida al mètode iniciar:
       Vehicle vehicle1 = new Vehicle();
       vehicle1.iniciar();
       
    }
    
}
