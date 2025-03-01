package ExceptionHandling;

 public class CustomException extends Exception
 {
   public CustomException(String s1)
   {
    super(s1);
   }
 }
 class Customchild
 {
  public static void main(String[] args) {
   try
   {
    throw new CustomException("this is my custom class");
   }
   catch (CustomException ex)
   {
    System.out.println("caught");
    System.out.println(ex.getMessage());
   }
  }
 }