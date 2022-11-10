package Person;

public class Person {
    public String name;
    public double salary;
    public int year;
    public String insurance_num;

    public Person(String name, double salary, int year, String insurance_num) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.insurance_num = insurance_num;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name + " \nSalary: " + this.salary
                + " \nYear:" + this.year + " \nNational Insurance Number: " + this.insurance_num);
    }
}