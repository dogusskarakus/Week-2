import java.util.Scanner;
public class Main {

    static boolean isAsal(int a, int b) {
        if(b<=1){
            return true; // 1 ve kendisine tam bölünüyorsa sayı asaldır.

        }
        if(a % b == 0){ // a' nın b ile bölümünden kalan 0 ise asal değildir bu sayı.
            return false;
        }
        return isAsal(a, b-1); //bir azaltıp tekrar döngüye girsin

    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı alıp ekrana asal olup olmadığını yazdırdık.

        System.out.println("Lütfen Bir Sayı Giriniz :");
        int a = input.nextInt();

        if ( a<=1){
            System.out.println("sayısı ASAL değildir !");
        }
        else {
            if(isAsal(a, a-1))
            System.out.println(a + " sayısı ASALDIR!");
            else {
                System.out.println(a+ " sayısı ASAL değildir !");
            }
        }

    }
}