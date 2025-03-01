package Constructor;

public class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     public class Encap
    {
        public static void main(String[] args) {
            Employee e=new Employee();
            e.setName("Shradha");
            e.setAge(20);
            System.out.println("name="+e.getName());
            System.out.println("name="+e.getAge());
        }
    }
}
