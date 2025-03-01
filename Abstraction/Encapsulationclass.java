package Abstraction;

public class Encapsulationclass {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("name cannot be null or empty!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18 || age > 55) {
            throw new IllegalArgumentException("Age must be from 18 to 55");
        }
            this.age=age;
        }
    }


    class cfg extends Encapsulationclass {

        public static void main(String[] args) {
            Encapsulationclass e1 = new Encapsulationclass();
            e1.setAge(18);
            e1.setName("sachin");
            System.out.println("age=" + e1.getAge());
            System.out.println("Name=" + e1.getName());
        }
    }
