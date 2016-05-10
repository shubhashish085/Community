
package community;


public class Student extends Community{
  
 private String name;
 private String studentID;
 private String status;
    public Student(String str,String stID,String st,String dept,String ins){
    name = str;
    studentID = stID;
    status = st;
    setDepartment(dept);
         setInstitute(ins);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     public void view(){
    super.view();
        System.out.println("name :" + name);
        System.out.println("status :" + status);
        System.out.println("student ID"+ studentID);
        
    
    }
}
