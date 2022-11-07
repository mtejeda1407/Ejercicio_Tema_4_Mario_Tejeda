public class App {
    public static void main(String[] args) throws Exception {
        int numeroIf  = -100;
        int numeroWhile  = -10;

        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }else if(numeroIf == 0){
            System.out.println("El numero es 0");
        }else if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }

        while(numeroWhile < 3){
            System.out.println("Valor de variable numeroWhile en ciclo While: " + numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println("Valor de variable numeroWhile en ciclo DoWhile: " + numeroWhile);
        }while(numeroWhile < 3);

        for(int numeroFor = 0; numeroFor<= 3; numeroFor++){
            System.out.println("Valor de variable numeroFor en ciclo For: " + numeroFor);
        }

        String estacion = "OTOÑO"; // VERANO  INVIERNO  OTOÑO  PRIMAVERA

        switch(estacion){
            case "VERANO":
                System.out.println("Hace calor en la estacion verano");
                break;
            case "INVIERNO":
                System.out.println("Hace frio en la estacion invierno");
                break;
            case "OTOÑO":
                System.out.println("Los paisajes en otoño son los mejores");
                break;
            case "PRIMAVERA":
                System.out.println("Las flores son mas bellas en primavera");
                break;
            default:
                System.out.println("No escribio ningun estado del año");
        }               
    }

   
}
