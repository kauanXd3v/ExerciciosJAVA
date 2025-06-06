import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota = 6.3;
        double nota2 = 10;

        int media2 = (int)(nota + nota2) / 2;
        System.out.println("A média inteira é: "+media2);

        double media = (nota + nota2) / 2;
        System.out.println("A média é: "+media);
    }
}
