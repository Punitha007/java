class Employee {
    private int id;
    private int salary;
    public static int s = 40000;
public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
public int getsalary() {
        return salary;
    }
 public void setsalary(int newsalary) {
        if (newsalary >= s) {
            this.salary = newsalary;
        } else {
            System.out.println("Error: Salary must not be below " + s);
        }
    }
public int getid() {
        return id;
    }
}

public class Employee_salary {
    public static void main(String[] args) {
        Employee obj = new Employee(17, 50000);
        System.out.println("Salary: " + obj.getsalary());
        obj.setsalary(30000);
        System.out.println("Salary: " + obj.getsalary());
        obj.setsalary(35000);
        System.out.println("Salary: " + obj.getsalary());
    }
}

    
