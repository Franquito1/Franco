public abstract class Funciones {
    private int volumen, canal;
    public void encendido(){
        System.out.println("El televisor se ha encendido");
    }
    public int subir(int a){
        volumen=volumen+a;
        return volumen;
    }
    public int bajar(int a){
        volumen=volumen-a;
        return volumen;
    }
    public int canal(){
        canal=canal++;
        return canal;
    }
    public void SetVolumen(int i) {
        volumen=i;
    }
    public int getVolumen(){
        return volumen;
    }
    public void SetCanal(int i) {
        canal=i;
    }
    public int getCanal(){
        return canal;
    }
}