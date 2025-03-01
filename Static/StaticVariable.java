package Static;

public class StaticVariable {
  String name = "AA";
  static String address = "pune";


  public static void main(String[] args) {
    StaticVariable obj1 = new StaticVariable();
    obj1.name = "bb";
    obj1.address = "Mumbai";
    StaticVariable obj2 = new StaticVariable();
    obj2.name = "xy";
    obj2.address = "Hydrabad";
    StaticVariable obj3 = new StaticVariable();
    obj3.name = "zz";
    obj3.address = "bengluru";


    System.out.println("instance obj1 name" + obj1.name + "& Static address=" + obj1.address);
    System.out.println("instance obj2 name" + obj2.name + "& Static address=" + obj2.address);
    System.out.println("instance obj3 name" + obj3.name + "& Static address=" + obj3.address);
  }
}
