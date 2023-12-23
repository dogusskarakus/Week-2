
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca ", "905", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "906", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "907", "KMY");


        Course mat = new Course("MATEMATİK", "MAT101","MAT");
        mat.addTeacher(t1);
        Course fiz = new Course("FİZİK", "FİZ101","FZK");
        fiz.addTeacher(t2);
        Course kim = new Course("KİMYA", "KİM101","KMY");
        kim.addTeacher(t3);


        Student s1 = new Student("İnek Şaban", "4", "140144015", mat, fiz, kim);
        s1.addBulkExamNote(50,100,45);
        s1.addBulkExamSoz(15,50,85);
        s1.isPass();
        s1.printNote();


        Student s2 = new Student("Güdük Necmi", "5", "2211133", mat, fiz, kim);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkExamSoz(78,50,95);
        s2.isPass();
        s2.printNote();

        Student s3 = new Student("Hayta İsmail", "6", "221121312", mat, fiz, kim);
        s3.addBulkExamNote(50,90,70);
        s3.addBulkExamNote(60,40,80);
        s3.isPass();
        s3.printNote();







    }
}