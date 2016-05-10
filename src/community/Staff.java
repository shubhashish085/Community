package community;

public class Staff extends Employee {

    int joinYear;
    int duration;

    public Staff(String str, String emp, double s, double incr, String dept, String ins,int x,int y) {
        super(str,emp,s,incr,dept,ins);
        joinYear = x;
        duration = y;
    }

    public int getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(int joinYear) {
        this.joinYear = joinYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void view() {
        super.view();
        System.out.println("join year :" + joinYear);
        System.out.println("duration :" + duration);

    }
}
