package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapbasic {
    int age;
    public  void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
         return age;
    }
    @Override
    public int hashCode()
    {
        return age;


    }

    public static void main(String[] args) {
        HashMap<HashMapbasic,String> ss=new HashMap<>();
        HashMapbasic h1= new HashMapbasic();
        h1.setAge(100);
        ss.put(h1,"one");
        for(Map.Entry<HashMapbasic,String> aa : ss.entrySet())
        {
            System.out.println(aa.getKey());
            System.out.println(aa.getValue());
        }
           h1.setAge(1001);


        System.out.println(ss.get(h1));
    }
}
