// This Secretary class represents secretaries.
// The initial implementation is very redundant.
// Rewrite the class so that it inherits from Employee.
public class Secretary extends Employee {
    public Secretary(String name){
        super(name, "Secretary");
    }
    // Secretaries have an added behavior
    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}

