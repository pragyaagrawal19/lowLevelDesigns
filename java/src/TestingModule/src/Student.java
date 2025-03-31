import java.util.Objects;

public class Student {
    private double gpa;
    private int roleNo;
    public String name;

    public Student(String name, int roleNo, double gpa){
        this.gpa=gpa;
        this.roleNo=roleNo;
        this.name=name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getRoleNo() {
        return roleNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + this.getRoleNo() + this.getGpa();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Student st =(Student) obj;
        return Objects.equals(name, st.getName()) && Objects.equals(gpa, st.getGpa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }
}
