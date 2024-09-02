public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual canal a TV estava? : " +smartTv.canal);
        smartTv.mudarCanal(25);
        System.out.println("Qual canal a TV Está? : " +smartTv.canal);


        System.out.println("Qual a intensidade do volume? : " +smartTv.volume);
        smartTv.ligar();
        System.out.println("A TV Está Ligada? : " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("A TV Está Ligada? : " + smartTv.ligada);

      
        
    }
}
