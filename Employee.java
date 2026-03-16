// A class to represent employees in general (20-page manual).
public class Employee {
    public int getHours() {
        return 40;           // works 40 hours / week
    }
    
    public double getSalary() {
        return 40000.0;      // $40,000.00 / year
    }
    
    public int getVacationDays() {
        return 10;           // 2 weeks' paid vacation
    }

    public String toString() {
        return String.format("%d hour work weeks\n" +
                             "$%.2f per year\n" + 
                             "%d days of paid vacation",
                             getHours(), getSalary(), getVacationDays());
    }
}


