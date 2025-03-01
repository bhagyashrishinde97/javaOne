package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collectioncomparater {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Collectioncomparater(int id,String name,String address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Collectioncomparater{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

     class Collectionsorts implements Comparator<Collectioncomparater>
    {


        @Override
        public int compare(Collectioncomparater o1, Collectioncomparater o2) {
             return o1.getAddress().compareTo(o2.getAddress());
        }
    }
    class Employees
    {
        public static void main(String[] args) {
            List<Collectioncomparater> list=new ArrayList<>();
            list.add(new Collectioncomparater(1,"aditi","hinjewadi pune"));
            list.add(new Collectioncomparater(2,"Bhagyashri" ," karvenager pune"));
            list.add(new Collectioncomparater(3,"dakshta","warjemalwadi pune"));
            list.add(new Collectioncomparater(4,"Sujata","Nanded"));
            list.add(new Collectioncomparater(5,"Akansha","Kathraj pune"));
            System.out.println(list);
            //Collections.sort();
            //SalaryComparator NameComparator = new SalaryComparator();
           // Collections
                   // .sort(list, NameComparator);

            System.out.println("After  using Last Name sorting "+list); //
        }

        }

