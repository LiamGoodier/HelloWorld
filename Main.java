import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter your name mate: ");
        String name = input.nextLine();

        System.out.println("Hello " + name + "!");

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age < 12){
            System.out.println("You are a kid.");
        }else if(age <18){
            System.out.println("You are a teenager");
            
        }else{
            System.out.println("Youre an adult or a very old man/woman");
        }

        input.close();

  
    }
    
}