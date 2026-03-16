// Implement the LegalSecretary class.
// A LegalSecretary gets all the behavior that a Secretary does.
// But, a LegalSecretary gets 25% more salary.
public class LegalSecretary  extends Secretary{

    public LegalSecretary(String name){
        super(name);
    }
    @Override public void shout() {
        super.shout();
        System.out.println("I keep telling myself...");
        super.shout();
    }

    @Override public double getSalary() {
        return super.getSalary()*1.25;      // secratays salary*1.25 / year
    }
    
}

