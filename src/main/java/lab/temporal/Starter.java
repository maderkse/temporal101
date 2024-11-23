package lab.temporal;

public class Starter {
   public static void main(String[] args) {
      System.out.println((new GreetingImpl()).greetSomeone(args[0]));
   }
}
