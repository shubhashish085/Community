package community;

public class Administrator extends Employee {

    String position;

    double duration;

    public Administrator(String str, String emp, double s, double incr, String dept, String ins, String st, double x) {
     super(str,emp,s,incr,dept,ins);
     position = st;
     duration = x;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
     public void view(){
     super.view();
         System.out.println("position :" + position);
         System.out.println("duration :" + duration);
     }
}
