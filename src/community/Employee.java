package community;

public class Employee extends Community{

    private String name;
    private String employeeID;
    private double salary;
    private double increment;
    public Employee(String str,String emp,double s,double incr,String dept,String ins){
         name = str;
         employeeID = emp;
         salary = s;
         increment = incr;
         setDepartment(dept);
         setInstitute(ins);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }
    public void view(){
    super.view();
        System.out.println("name :" + name);
        System.out.println("salary :" + salary);
        System.out.println("Employee ID" + employeeID);
        System.out.println("increment :" + increment);
    
    }
}
