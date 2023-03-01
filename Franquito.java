public class Franquito {

    public static void main(String[] args) {
        Televisor kalley = new Televisor();
               
        kalley.encendido();
        kalley.SetCanal(10);
        kalley.SetVolumen(22);
       
        System.out.println("Canal: " + kalley.getCanal());
        System.out.println("Volumen: " + kalley.getVolumen());
       
       
        Televisor challenger = new Televisor(12,3);
        challenger.encendido();
        System.out.println("Canal: " + challenger.getCanal());
        System.out.println("Volumen: " + challenger.getVolumen());
    }
   
}