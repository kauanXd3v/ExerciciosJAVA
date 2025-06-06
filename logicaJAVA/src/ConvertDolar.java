import java.util.Scanner;

public class ConvertDolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dolar = 5.58;

        System.out.println("Digite o valor que deseja converter para dolar: ");
        double reais = input.nextDouble();

        double conversao = reais * dolar;

        System.out.println("O valor de reais para dolar é: "+conversao);


    }
}
