import java.util.Scanner;

// Kullanıcıdan alınan tam ve ondalıklı sayıların  tip dönüşümü kodu
public class Main {
    public static void main(String[] args) {
        int numberInt;
        double numberDouble;
        Scanner input = new Scanner(System.in);

        System.out.print("Tam sayı girin: "); numberInt = input.nextInt();
        System.out.print("Ondalıklı sayı girin. (Virgül kullanın) :"); numberDouble = input.nextDouble();

        double intToDouble = numberInt;
        int doubleToInt = (int) numberDouble;

        System.out.println(numberInt + " -> " + intToDouble);
        System.out.println(numberDouble + " -> " + doubleToInt);
    }
}