package Basicprogram;

public class Methodprivate {
    private void m1() {
        System.out.println("this is parent private  method");
    }


    public static void main(String[] args) {
        //Childmethod c1=new Childmethod();
        Methodprivate s1 = new Methodprivate();
        s1.m1();
    }
}

