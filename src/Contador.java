import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        try {
            
            System.out.println("Primeira entrada");
                int primeiraEntrada = sc.nextInt();
                sc.nextLine();
            System.out.println("Segunda entrada");
                int segundaEntrada = sc.nextInt();
            
                contar(primeiraEntrada, segundaEntrada);
        } catch (ContadorException e) {
                System.out.println("O primeiro número deve ser maior que o segundo, e ambos não podem serem iguais.");
        }
    
    }

    static void contar(int primeiraEntrada, int segundaEntrada) throws ContadorException{
        if(segundaEntrada > primeiraEntrada || segundaEntrada == primeiraEntrada){
            throw new ContadorException();
        }

        int contagem = primeiraEntrada - segundaEntrada;

        for(int j = 0; j < contagem; j++){
            System.out.println(j+1);
        }

    }

}
