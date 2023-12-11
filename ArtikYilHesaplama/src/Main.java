import java.util.Scanner;

//Bu kodlama girilen yılın artık yıl olup olmadığını hesaplıyor
//Readme.md dökümanına "https://github.com/DevAlper35/week-1/tree/main" adresinden erişebilirsiniz.
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " Yılı artık bir yıldır.");
            } else {
                System.out.println(year + " Yılı artık bir yıl değildir.");
            }


        } else if (year % 4 == 0) {
            System.out.println(year + " Yılı artık bir yıldır.");

        } else {
            System.out.println(year + " Yılı artık bir yıl değildir.");
        }
    }
}