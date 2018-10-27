import java.util.Scanner;
public class Objective3Lab5{
  public static void main(String[] args){
    Scanner skippy = new Scanner(System.in);

    double num1, num2;

    System.out.println("Please enter a number: ");

    num1 = skippy.nextDouble();

    System.out.println("Please enter another number: ");

    num2 = skippy.nextDouble();

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + (num1+num2));
  }
}
