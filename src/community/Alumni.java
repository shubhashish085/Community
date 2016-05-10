package community;

public class Alumni extends Community {

    String name;
    int passYear;

    public Alumni(String str, int x, String dept, String ins) {
        name = str;
        passYear = x;
        setDepartment(dept);
        setInstitute(ins);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassYear() {
        return passYear;
    }

    public void setPassYear(int passYear) {
        this.passYear = passYear;
    }

    public void view() {
        super.view();
        System.out.println("name :" + name);
        System.out.println("pass year:" + passYear);

    }
}
