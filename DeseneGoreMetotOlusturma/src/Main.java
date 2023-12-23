import java.util.Scanner;

public class Main {


    static void recursiveMetot(int number, int a, int b){

        System.out.print(a + " , ");

        if (a == number && b == 1){// a değeri kullanıcının girdiği sayıya veya 1 değerine eşitse metottan çıkılır.

            return;
        }
        if (a <= 0){// a değeri 0'ın altına düşerse b=1 olur.
            b = 1;
        }

        recursiveMetot(number, a + (5 * b), b);// a değerine 5*b eklenir.
    }
    public static void main(String[] args) {


        //Kullanıcıdan sayı istedik.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz : ");
        int number = scanner.nextInt();

        if (number < 0 ) {
            System.out.print("Hatalı Sayı Girdiniz!");
        }
        else {
            recursiveMetot(number, number, -1);
        }
    }


}