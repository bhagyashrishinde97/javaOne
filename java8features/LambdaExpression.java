package java8features;

interface LambdaExpression {
     void show();
}

    class Lambda
    {

        public static void main(String[] args) {
            LambdaExpression l1=()-> {
                System.out.println("show method");
            };
               l1.show();




        }


    }
