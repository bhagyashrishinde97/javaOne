package Constructor;
    public class Parameterized {
        int bid,  price;
        String title;
        public Parameterized()
        {
            bid=1;
            title="java";
            price=500;
        }

        public void display()
        {
            System.out.println("bid="+bid);
            System.out.println("title="+title);
            System.out.println("price="+price);
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            Parameterized b1=new Parameterized();
            b1.display();
           Parameterized b2 = new Parameterized ();
           b2.display();

        }

        public static class Nonparameterized {
            int id;
            String name;
            public Nonparameterized(int id,String name) {
                this.id = id;
                this.name = name;
            }
            public  void display()

            {
                System.out.println("id="+id);
                System.out.println("name=" +name);
            }


            public static void main(String[] args) {
                Nonparameterized n1=new Nonparameterized(1,"aditi");
                      n1.display();
            }
        }
    }

