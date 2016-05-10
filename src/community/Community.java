package community;

public abstract class Community {

    private String department;
    private String institute;

    public void view() {
        System.out.println("Department :" + department);
        System.out.println("Institute  :" + institute);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
   
}
