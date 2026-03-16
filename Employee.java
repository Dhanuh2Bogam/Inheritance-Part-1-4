// A class to represent employees in general (20-page manual).
public class Employee {
    private String name;
    private String job;

    public Employee(String name, String job){
        this.name = name;
        this.job = job;
    }

    public Employee(String name){
        this(name, "Employee");
    }
     public int getHours() {
        return 35; // works 35 hours / week
    }
    
    public double getSalary() {
        return 47250.0;      // $40,000.00 / year
    }
    
    public int getVacationDays() {
        return 15;           // 2 weeks' paid vacation
    }
    public void shout(){
        System.out.println("I love my job!");
    }

    public String toString() {
        return String.format("%d hour work weeks\n" +
                             "$%.2f per year\n" + 
                             "%d days of paid vacation",
                             getHours(), getSalary(), getVacationDays());
    }
}


