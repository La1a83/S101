package Nivell1_Ex2;


public class Vehicle1 {

    
    
    public static void Vehicle1() {
        System.out.println("Crida al constructor");
    }
    
    public void iniciar() {
        System.out.println("Crida al mètode iniciar");
    }
    
    public static void parar() {
        
        System.out.println("El vehicle s'ha aturat");
    }
    
    public void accelerar() {
        
        System.out.println("El vehicle accelera");
    }
    
    public static void main(String[] args) {
        
       //Per cridar el mètode static no cal crear objecte:
       parar();
       
       //Per invocar un mètode no-static hem d'instanciar objecte:
       Vehicle1 vehicle = new Vehicle1();
       vehicle.accelerar();
    }
    
}

