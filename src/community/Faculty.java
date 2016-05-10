package community;

public class Faculty extends Employee {

    int facultyCode;
    String designation;
    int joinYear;

    public Faculty(String str, String emp, double s, double incr, String dept, String ins, int x, String st, int y) {
        super(str,emp,s,incr,dept,ins);
 facultyCode = x;
        designation = st;
        joinYear = y;

    }

    public int getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(int facultyCode) {
        this.facultyCode = facultyCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public void view() {
        super.view();
        System.out.println("join Year :" + joinYear);
        System.out.println("designation :" + designation);
        System.out.println("Faculty code :" + facultyCode);

    }

}
