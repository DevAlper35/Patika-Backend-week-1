import java.util.Scanner;
// Bu kodlama kullanıcının girdiği Armut, Elma, Domates, Muz ve Patlıcan ağırlıklarına göre toplam fiyatlandırma yapıyor
// Readme.md dökümanına "https://github.com/DevAlper35/week-1/tree/main" adresinden erişebilirsiniz.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma =3.67, domates = 1.11, muz = 0.95, patlican = 5;

        System.out.print("Armut Kaç Kilo : ");
        armut *= input.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        elma *= input.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        domates *= input.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        muz *= input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo : ");
        patlican *= input.nextDouble();

        double tutar = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Tutar : " + tutar);



    }
}
