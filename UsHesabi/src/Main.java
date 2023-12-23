import  java.util.Scanner;
public class Main {


    //recursive Metodu kullarak üs alma işlemi yaptık. Her defasında üssü bir azaltarak
    // metotlar tekrar çağırılır üs 0 olunca return 1 değeri döndürülerek program biter.
    static int f(int a, int b){
        if(b == 0){
            return 1;
        }
        else {
            return a *f(a,b-1);
        }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Kullanıcıdan taban ve üs sayılarını istedik.

        System.out.print("Taban Sayısını Giriniz :");
        int a = input.nextInt();
        System.out.print("Üs Sayısını Giriniz :");
        int b = input.nextInt();

        //sonucu result olarak yazdırdık.

        int result = f(a,b);

        System.out.println("Sonuç : " + result );


    }
}