public class Employee{
    private String Fname;
    private String Lname;
    private int Salary;

    public Employee(String Fname,String Lname,int Salary){
        this.Fname = Fname;
        this.Lname = Lname;
        if(Salary<0)this.Salary = 0;
        else this.Salary = Salary;
    }
    public static void main(String[] args){
        Employee emp1 = new Employee("Yunus", "Yussuf", 2000000);
        Employee emp2 = new Employee("Twahir", "Hashim", 1500000);
        int emp1Salary = emp1.Salary * 12;
        int emp2Salary = emp2.Salary * 12;
        System.out.println("Employee 1 "+emp1.Fname+" Salary is: "+emp1Salary);
        System.out.println("Employee 2 "+emp2.Fname+" Salary is: "+emp2Salary+"\n");
        System.out.println("After Adding 10% ");
        emp1Salary += (0.1*(emp1.Salary * 12));
        emp2Salary += (0.1*(emp2.Salary * 12));
        System.out.println("Employee 1 "+emp1.Fname+" Salary is: "+emp1Salary);
        System.out.println("Employee 2 "+emp2.Fname+" Salary is: "+emp2Salary);
        
    }
}