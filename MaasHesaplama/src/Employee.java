

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax() {

        if (this.salary > 1000) {
            salary *= 0.97;
        }
    }

    void bonus() {

        if (workHours > 40) {
            salary += (workHours - 40) * 30;
        }

    }

    double raiseSalary() {

        if (2021 - hireYear < 10) {
            salary *= 1.05;
        } else if (2021 - hireYear < 20) {
            salary *= 1.1;
        } else {
            salary *= 1.15;
        }
        return salary;
    }


    public String toString() {


        return "Çalışanın;"
                + "\nİsmi :" + name
                + "\nİşe başlangıç yılı :" + hireYear
                + "\nHaftalık çalışma saati :" + workHours
                + "\nEline geçecek tutar :" + salary;
    }


}