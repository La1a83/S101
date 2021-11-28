
package Nivell1_Ex5;


public class Gat extends Animal {
     
    public void correr (String a, String b, String c) {
        System.out.println(a+b+c);
    }
    
    public static void main (String [] args) {
        
        Gat elMeuGat = new Gat();
        
        elMeuGat.correr();//
        elMeuGat.correr("Comnprobant el Mètode 2...");
        elMeuGat.correr("Comprobant"," El mètode 3...");
        elMeuGat.correr("Comprobant"," el mètode 4", ", que està creat a la "
                        + "subclasse...");
        
        
    }
    
    
    
}