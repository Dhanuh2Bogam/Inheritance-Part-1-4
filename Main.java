class Main {
    public static void main(String[] args) {
        superPrinting();
        // constructorPrinting();
        // polyPrinting();
    }

    public static void superPrinting() {
        Employee e1 = new Employee();
        Lawyer e2 = new Lawyer();
        Secretary e3 = new Secretary();
        LegalSecretary e4 = new LegalSecretary();

        System.out.println("Employee:\n" + e1);
        System.out.println("Lawyer:\n" + e2); 
        System.out.println("Secretary:\n" + e3);
        System.out.println("Legal Secretary:\n" + e4);
    }

    /*
    public static void constructorPrinting() {
        Employee e1 = new Employee("Arav");
        Lawyer e2 = new Lawyer("Abigale");
        Secretary e3 = new Secretary("Arnav");
        LegalSecretary e4 = new LegalSecretary("Ayush");

        System.out.println(e1);
        System.out.println(e2); 
        System.out.println(e3);
        System.out.println(e4);
    }
    */
    
    /*
    public static void polyPrinting() {
        Employee[] employees = {
            new Employee("Sush"), 
            new Lawyer("Samanvita"),
            new Secretary("Sam"), 
            new LegalSecretary("Saanika") 
        };
        for (Employee e : employees) {
            System.out.println(e);
            e.shout();
        }
    } */



}

