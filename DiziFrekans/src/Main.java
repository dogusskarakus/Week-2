public class Main {
    public static void main(String[] args) {


        int[] list = {5, 5, 3, 10, 2, 8, 7, 7, 7, 3, 5};
        int[] arr = new int[list.length];


        for (int i = 0; i < list.length; i++) {
            int element = list[i];
            int frekans = 1;


            if (arr[i] == -1) {
                continue;
            }

            for (int j = i + 1; j < list.length; j++) {
                if (element == list[j]) {
                    frekans++;
                    arr[j] = -1;
                }
            }

            System.out.println(element + " Sayısı " +  + frekans + " Kere Tekrar edildi. ");
        }
    }
}

