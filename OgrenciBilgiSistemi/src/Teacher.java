public class Teacher {
    String name;
    String mpno;
    String branch;

   public Teacher(String name, String mpno, String branch){

       this.name=name;
       this.mpno=mpno;
       this.branch=branch;
    }

    void print(){
        System.out.println("Adı : "+ this.name);
        System.out.println("Bölümü : "+ this.mpno);
        System.out.println("Telefonu : "+ this.branch);

    }
}
