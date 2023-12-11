import java.util.Scanner;
//Aritmetik İşlemler Ve İşlem Önceliği Bu kodlamada kullanıcıdan girilen 3 farklı sayı ile ilgili aritmetik işlemler pratiği yapılıyor
// Readme.md dökümanına "https://github.com/DevAlper35/week-1/tree/main" adresinden erişebilirsiniz.
public class Main {
    public static void main(String[] args) {
        int numberA, numberB, numberC, result;

        Scanner input = new Scanner(System.in);

        System.out.print("A sayısını girin: "); numberA = input.nextInt();
        System.out.print("B sayısını girin: "); numberB = input.nextInt();
        System.out.print("C sayısını girin: "); numberC = input.nextInt();

        //İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.

        result  = numberA + numberB * numberC - numberB;

        System.out.println(numberA + "+" +  numberB + "*" +  numberC + "-" + numberB + "= " + result);

    }
}
