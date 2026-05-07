import java.util.Scanner;

public class App {

    //Main is being used to test the stuff for now. Dont worry about implimenting a main function now. 
    
     public static void main(String[] args ){
        
        Scanner scanner = new Scanner(System.in);

        Turtle t = new Turtle();
        String userChoice1; 
        String userChoice2;


        do {
            System.out.println("Choose one of the options below");
            System.out.println("1. Draw a Shape");
            System.out.println("2. Draw a shape at a specific point");
            System.out.println("0. Exit");

            userChoice1 = scanner.nextLine();
            
            if (userChoice1.equals("1")){
                System.out.println("Choose a shape to draw");

                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("4. Pentagon");


            } else if (userChoice1.equals("2")){
                System.out.println("Choose a shape to draw at a specific point");

                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("4. Pentagon");

                
            }




        } while (!userChoice1.equals("0"));
    
    
    }

}
