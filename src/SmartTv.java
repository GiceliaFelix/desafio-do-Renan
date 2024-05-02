 public class SmartTv {
    boolean ligada= true;
    int canal = 13;
    int volume = 6;

     public void ligar(){
         ligada= false;
     }

     public void desligar() {
         ligada = false;
     }

    public void aumentarCanal (){
        if (ligada)
        { volume++;
            System.out.println("Aumentando o canal para: " + volume);
        }
        else {
            System.out.println("TV desligada. Não foi possível aumentar o canal.");
        }
    }

     public void diminuirCanal (){
         if (ligada)
         { volume++;
             System.out.println("Aumentando o canal para: " + volume);
         }
         else {
             System.out.println("TV desligada. Não foi possível diminuir o canal.");
         }
     }

    public void aumentarVolume (){
        if (ligada)
        { volume++;
               System.out.println("Aumentando o volume para: " + volume);
        }
        else {
               System.out.println("TV desligada. Não foi possível aumentar o volume.");
        }
    }

     public void diminuirVolume (){
        if (ligada)
        { volume--;
              System.out.println("Diminuindo o volume para: " + volume);}
        else {
             System.out.println("TV desligada. Não foi possível diminuir o volume.");
         }

     }

 }