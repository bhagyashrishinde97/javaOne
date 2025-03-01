package Basicprogram;

public class Privatedatamember {
    private int a;

    Privatedatamember(int i) {
        this.a = i;
    }
    public int getA()
   {
        return a;
    }

}
    class B
    {
        public static void main(String[] args) {
            Privatedatamember p1=new Privatedatamember(10);

            System.out.println(p1.getA());
        }
    }

