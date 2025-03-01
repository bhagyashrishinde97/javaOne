package Abstraction;

public class Encapsulate {
    private int rollno;
    private String name;
    private int age;

    public int getRollno() {
        return rollno;
    }

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

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
    class Jklm extends Encapsulate
    {
        public static void main(String[] args) {
            Encapsulate e1=new Encapsulate();
            e1.setRollno(1);
            e1.setName("sachin");
            e1.setAge(24);
            System.out.println("get person rollno="+e1.getRollno());
            System.out.println("get person name="+e1.getName());
            System.out.println("get person age="+e1.getAge());
        }
    }



