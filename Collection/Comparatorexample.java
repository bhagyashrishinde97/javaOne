package Collection;

public class Comparatorexample {
    String FirstName;
    String LastName;

    int Salary;

    public Comparatorexample() {
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

}
