import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scan.nextInt();

        System.out.println("Resultado: " + valor);



        scan.close();

        
    }
}
