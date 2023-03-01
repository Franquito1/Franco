public class Televisor extends Funciones {
    Televisor(){
        super.SetVolumen(1);
        super.SetCanal(1);
    }
    Televisor(int a, int b){
        super.SetVolumen(a);
        super.SetCanal(b);
    }
}