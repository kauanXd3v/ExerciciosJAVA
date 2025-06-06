import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        Double nota = input.nextDouble();

        System.out.println("Digite uma nota: ");
        Double nota2 = input.nextDouble();

        double media = (nota + nota2) / 2;

        System.out.println("A média das notas é: "+media);

    }
}
