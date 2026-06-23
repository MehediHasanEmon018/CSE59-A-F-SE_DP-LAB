

public class Main{
    public static void main(String[] args){
        Employee employee = new Employee("Hasan");
        employee.calculateBonus();
        
        Contractor contractor = new Contractor("Rahim");
        contractor.work();
    }
}
interface BonusEligible{
    void calculateBonus();
}



class TeamMember{
    protected String name;
    public TeamMember(String name){
        this.name=name;
    }
}

class Employee extends TeamMember implements BonusEligible{
    public Employee(String name){
        super(name);
    }
    @Override
    public void calculateBonus(){
        System.out.println("Calculating the standard employee bonus...");
        
    }
}

class Contractor extends TeamMember{
    public Contractor(String name){
        super(name);
    }
    public void work(){
        System.out.println(name+" is working as a contractor");
    }
}
