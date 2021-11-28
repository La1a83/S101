package Nivell1_Ex8;

public class Frog extends Amphibian {
    
        
        @Override
        public String moure() {
            return "La granota es mou.";
        }

        @Override
        public String respirar() {
            return "La granota respira.";
        }

        @Override
        public String menjar() {
            return "La granota menja.";
        }


        
        
        
    
    public static void main (String [] args) {
        
        Amphibian granota = new Frog();
       
        System.out.println(granota.menjar());
        System.out.println(granota.moure());
        System.out.println(granota.respirar());
       
        //Sense la generalització funciona igual:
        
        Frog granota2 = new Frog();
        System.out.println(granota2.menjar());
        System.out.println(granota2.moure());
        System.out.println(granota2.respirar());
        
              
        
    }
    
    
   
    
}
