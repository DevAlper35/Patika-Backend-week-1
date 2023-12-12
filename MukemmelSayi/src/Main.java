import java.util.Scanner;

// Bu kodlamada Kullanıcıdan alınan sayı ile mükemmel sayı olup olmadığı hesaplanıyor

public class Main {
    public static void main(String[] args) {
        int n,i,counter=0;
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan sayı / veri alınıyor
        System.out.print("Sayı Girin: ");
        n = input.nextInt();

        for(i=1; i<n; i++){
            if(n%i == 0){
                counter+=i;
            }

        }
        // Şartların
        if(counter == n){
            System.out.print("Girdiğiniz " + n + " sayısı mükemmel sayıdır.");
        }
        else{
            System.out.print("Girdiğiniz  " + n +" sayısı mükemmel sayı değildir. ");
        }

    }
}