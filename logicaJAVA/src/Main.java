import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o temperatura em Celsius: ");
        double temp =  input.nextDouble();
        int convertTemperature = (int) (temp * 1.8) + 32;

        System.out.println("The conversion of temperature to Fahrenheit is: "+convertTemperature);


    }
}