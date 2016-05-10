package community;

public class Teacher extends Faculty {

    int noCourses;
    double weeklyHour;

    public Teacher(String str, String emp, double s, double incr, String dept, String ins, int x, String st, int y,int w,int z) {
        super(str,emp,s,incr,dept,ins, x,st,y);
        noCourses = w;
        weeklyHour = z;

    }

    public int getNoCourses() {
        return noCourses;
    }

    public void setNoCourses(int noCourses) {
        this.noCourses = noCourses;
    }

    public double getWeeklyHour() {
        return weeklyHour;
    }

    public void setWeeklyHour(double weeklyHour) {
        this.weeklyHour = weeklyHour;
    }

    public void view() {
        super.view();
        System.out.println("noCourses :" + noCourses);
        System.out.println("weeklyHours :" + weeklyHour);

    }
}
