package Inheritance;

 class GrandParent{

    void GrandParent() {
        System.out.println("Grand Father class Method");
    }
}
     class Father extends GrandParent {
        void Father() {
            System.out.println("Father class method");
        }
    }

     class Child extends Father {
        void Child() {
            System.out.println("This is child class method");
        }
    }

     class GrandChild extends Child {

         void GrandChild() {
             System.out.println("This is Grandchild class method");
         }
    }
class MultiLevelInheritance123 extends GrandChild {
    public static void main(String[] args) {
        MultiLevelInheritance123 M1=new MultiLevelInheritance123();
        M1.GrandParent();
        M1.Father();
        M1.Child();
        M1.GrandChild();
    }
}





