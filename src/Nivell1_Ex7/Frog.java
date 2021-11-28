package Nivell1_Ex7;




public class Frog extends Amphibian {
    
        public void saltar() {
            System.out.println("La granota salta");
        }
    
    public static void main (String [] args) {
        
        Amphibian granota = new Frog();
        System.out.println(granota.menjar());
        System.out.println(granota.moure());
        System.out.println(granota.respirar());
        //granota.salta();//Error de compilació, no tots els amfibis salten.
              
        
    }
    
    
   
    
}
