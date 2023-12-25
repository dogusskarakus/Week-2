public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        // Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
        if (salary>= 1000)
        {
            return salary*0.03;
        }
        // Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        else
        {
            return 0;
        }
    }


     public double bonus(){ // Çalışma saati haftada 40 saatten fazla ise saat başına 30 TL mesai ücreti alacaktır.

        if (workHours > 40){
            int overtime = workHours-40;
            return overtime*30;
        }else
        {
        return 0;
        }
    }

      public double raiseSalary(){ // Çalışma yılına göre zam oranı belirledik.

        int currentYear=2021;
        double result ;
        int workingYear = (currentYear-hireYear);
        if (workingYear < 10)
        {   result = salary*0.03;

            return result;


        } else if (workingYear <20) {
             result = salary*0.05;
            return result;


        }else {
             result = salary*0.15;
            return result;

        }


    }

    public String toString(){
        double totalSalary = salary -tax() +bonus()+raiseSalary();



       return "adı : "+ name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours +
               "\nBaşlangıç Yılı : " + hireYear + "\nVergi :" + tax() + "\nBonus : "+ bonus() +
               "\nMaaş Artışı :"+ raiseSalary() + "\nVergi  ve Bonuslar ile birlikte maaş :"
               + (salary-tax()+bonus())+ "\nToplam Maaş :" + totalSalary;

    }

}

