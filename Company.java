import Person.Person;

class Employee extends Person {
    public Employee(String name, double salary, int year, String insurance_num) {
        super(name, salary, year, insurance_num);
    }

    public boolean equals(Employee e2) {
        if (this.name != e2.name) {
            return false;
        } else if (this.salary != e2.salary) {
            return false;
        } else if (this.year != e2.year) {
            return false;
        } else if (this.insurance_num != e2.insurance_num) {
            return false;
        }
        return true;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jay", 8000000, 4, "B22448");
        Employee e2 = new Employee("Jay", 8000000, 4, "B22448");
        e1.printDetails();
        if (e1.equals(e2)) {
            System.out.println("They are the same Employees");
        } else {
            System.out.println("They are different Employees");
        }
    }
}