package ExemplosMetodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV tv1 = new SmartTV();

        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.aumentarVolume();
        System.out.println("Status da TV: " + tv1.ligada);
        System.out.println("Canal: " + tv1.canal);
        System.out.println("Volume: " + tv1.volume);

        tv1.aumentarCanal();
        System.out.println("Aumentando um canal: " + tv1.canal);

        tv1.diminuirCanal();
        System.out.println("Diminuindo um canal: " + tv1.canal);

        tv1.mudarCanal(22);
        System.out.println("Canal alterado para " + tv1.canal);

        tv1.desligar();
        System.out.println("TV ligada: " + tv1.ligada);
    }
}
