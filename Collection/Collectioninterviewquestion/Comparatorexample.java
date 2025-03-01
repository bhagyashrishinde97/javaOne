package Collectioninterviewquestion;


public class Comparatorexample {
   private String FirstName;
   private String LastName;

   private int Salary;

    public Comparatorexample() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
       this.Salary = salary;
    }

    public Comparatorexample(int Salary, String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;

    }

    @Override
    public String toString() {
        return "Comparatorexample{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
