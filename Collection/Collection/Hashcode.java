package Collection;

public class
Hashcode {
    @Override
     public int hashCode()
    {
        return 100;
    }

    public static void main(String[] args) {
        Hashcode obj1=new Hashcode();
        System.out.println("obj1 object is"+obj1.hashCode());
        Hashcode obj2= new Hashcode();
        System.out.println("obj2 object is"+obj2.hashCode());
        Boolean tt=obj1.equals(obj2);
        Hashcode  obj3= null;
        obj3= new Hashcode();
        System.out.println("obj3 object is "+obj3.hashCode());
        System.out.println("value of tt ="+tt);
    }

}

