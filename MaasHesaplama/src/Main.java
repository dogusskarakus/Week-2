

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String name;
        double salary, workHours;
        int hireYear;

        Scanner scan = new Scanner(System.in);

        System.out.print("İsim :");
        name= scan.nextLine();

        System.out.print("Maaş :");
        salary = scan.nextDouble();

        System.out.print("Haftalık Çalışma Saati :");
        workHours=scan.nextDouble();

        System.out.print("İşe başlangıç yılı :");
        hireYear=scan.nextInt();




        Employee employee= new Employee(name,salary,workHours,hireYear);

        employee.raiseSalary();
        employee.bonus();
        employee.tax();
        System.out.println(employee.toString());
    }
}