import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double preco = input.nextDouble();

        System.out.println("Digite a quantidade de produto: ");
        int quantidade = input.nextInt();

        int valorTotal = (int) preco * quantidade;

        System.out.println("O valor total do produto é: "+valorTotal);
    }
}
