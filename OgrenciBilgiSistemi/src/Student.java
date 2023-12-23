public class Student {
    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage1;
    double avarage2;
    double avarage3;
    boolean isPass;

    public Student(String name,String stuNo,String classes, Course mat, Course fizik, Course kimya){

        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.fizik=fizik;
        this.kimya=kimya;
        this.avarage1=0.0;
        this.avarage2=0.0;
        this.avarage3=0.0;
        this.isPass=false;

    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }


    public void addBulkExamSoz(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.soz = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.soz = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.soz = kimya;
        }

    }

    void isPass(){
        this.avarage1=(this.mat.note*0.80)+(this.mat.soz*0.20);
        this.avarage2=(this.fizik.note*0.80)+(this.fizik.soz*0.20);
        this.avarage3=(this.kimya.note*0.80)+(this.kimya.soz*0.20);

    }




    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note +"  / Matematik sözlüsü : "+ this.mat.soz + "/    Matematik Ortalaması : "+ this.avarage1);
        System.out.println("Fizik Notu : " + this.fizik.note +"    / Fizik sözlüsü : "+ this.fizik.soz +  " /    Fizik Ortalaması : " + this.avarage2);
        System.out.println("Kimya Notu : " + this.kimya.note +"    / Kimya sözlüsü : "+ this.kimya.soz+ "   /    Kimya Ortalaması : "+ this.avarage3);
    }











    }


