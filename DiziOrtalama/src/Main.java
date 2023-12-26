public class Main {
    public static void main(String[] args) {

        // Liste tanımladık.

        double [] list = {1,2,3,4,5};
        double harmonik= 0;
        // i değerini dizimim buyutu kadar döndürüyorum.
        for (int i=0; i<list.length;i++){
            harmonik +=1/list[i]; // Toplam değerini harmonik değişkenine atadık.
        }
        System.out.println(harmonik/list.length);// Ortalamayı ekrana yazdırıyoruz.
    }
}