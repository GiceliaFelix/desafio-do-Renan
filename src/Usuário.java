
public class Usuário {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar ();
        {
            System.out.println("Status: TV Ligada ? " + smartTv.ligada);
        }
        smartTv.desligar ();
        {
            System.out.println("Novo Status: TV Ligada ? " + smartTv.ligada);
        }

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();




    }
}