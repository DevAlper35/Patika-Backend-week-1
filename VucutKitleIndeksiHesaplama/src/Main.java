import java.util.Scanner;
//Vucut Kitle Indeksi Hesaplama Bu kodlamada kullanıcının girdiği Boy ve Kilo bilgileriyle Vucut Kitle Indeksi Hesaplaması yapılıyor
// Readme.md dökümanına "https://github.com/DevAlper35/week-1/tree/main" adresinden erişebilirsiniz.
public class Main {
    public static void main ( String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double vki = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
