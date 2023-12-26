import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı :");

        int sayi = input.nextInt();
        int [] list = {5,10,15,25,45,55};

        // Girdiğim sayıyı değişkenlere eşitledik.

        int yuksek=sayi;
        int dusuk=sayi;


        for (int i : list) {

            if (sayi >=i)
            {
                dusuk=i;
            } else if (sayi<i) {
                yuksek=i;
                break;
            }
        }

        System.out.println(sayi + " sayıdan küçük en yakın sayı : "+dusuk);
        System.out.println(sayi + " sayıdan büyük en yakın sayı : "+yuksek);
    }
}