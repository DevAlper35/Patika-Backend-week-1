import java.util.Scanner;

// Kullanıcının girdiği sayılar arasında en küçük ve en büyük sayıyı tespit eden kodlama
// Readme.md dökümanına "https://github.com/DevAlper35/week-1/tree/main" adresinden erişebilirsiniz.
public class Main {
    public static void main(String[] args) {
        int count=1, number, min=0, max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int again = input.nextInt();

        while(count<=again){
            System.out.print(count + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (count == 1){
                max = number;
                min = number;
            }
            else{
                if(number < min){
                    min = number;
                }
                else if(number > max){
                    max = number;
                }
            }
            count++;
        }
        System.out.println("Girilen en küçük sayı: " + min);
        System.out.println("Girilen en büyük sayı: " + max);
    }
}