import java.util.Scanner;

public class AgeAvverage {
    public static void main(String[] args) {
        String name, hobby;
        int age;
        double weight, income;

         Scanner keyboard = new Scanner(System.in);

         System.out.print("hey, what is your name?");
         name = keyboard.next();

         System.out.print("hey," + name + " How old are you?");
         age = keyboard.nextInt();

          System.out.println("wow so your" + age + " that so old");
           System.out.print("so how much your weight ?");
           weight = keyboard.nextDouble();

            System.out.println(weight + " really?" + name + " better to keep that secret");
             System.out.print("finaly whats your income" + name + "?");
             income = keyboard.nextDouble();

                 System.out.print("hopefully thats" + income + " per hour");
                  System.out.println("not per year!");

                  System.out.print("last what is your hobby " + name + "?");
                  hobby = keyboard.next();
                   System.out.println("oh wow , so your hobby is" + hobby);

                    System.out.print("well thank for my absurd question");
                      System.out.println(name + " *-*");








    }
}