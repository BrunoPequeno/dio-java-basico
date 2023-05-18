package ExemplosMetodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV();

        tv1.ligar();
        tv1.desligar();
        System.out.println("Status da TV: " + tv1.ligada);
        System.out.println("Canal: " + tv1.canal);
        System.out.println("Volume: " + tv1.volume);
    }
}
