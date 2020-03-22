package loose.oose.fis.lab.student.manager.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        //assignments
    }

    @Override
    public String toString() {
        //toString generated implementation
    }

    @Override
    public boolean equals(Object o) {
        //equals generated implementation
    }

    @Override
    public int hashCode() {
        //hashCode generated implementation
    }

    //generated getters and setters for all fields
}
