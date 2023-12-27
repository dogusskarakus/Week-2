public class Main {
    public static void main(String[] args) {

        // çoklu dizilerle matris oluşturduk.
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
        };

        int[][] transpoz = new int[matris[0].length][matris.length]; // Yeni bir dizi tanımladık.
        // For kullanarak transpoz oluşturduk.
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        printMatrix(matris);

        System.out.println("\nTranspoz Matris:");
        printMatrix(transpoz);
    }

    // Matrisi ekrana yazdıran yardımcı metot
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
