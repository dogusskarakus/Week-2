import java.util.Arrays;
public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] list =  {5,9,6,2,4,9,6,6,4,15,16};
        int[] duplicate = new int[list.length];
        int start=0;

        for (int i=0; i<list.length; i++){
            for (int j=0; j<list.length; j++){
                if ((i !=j) && (list[i] == list[j]) && (list[i] %2 ==0)){
                    if (!isFind(duplicate, list[i])) {
                        duplicate[start++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate){
            if(value!=0){
                System.out.println(value);

            }

        }
    }
}