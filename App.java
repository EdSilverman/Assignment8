import java.util.Scanner;

public class App {

    //Main is being used to test the stuff for now. Dont worry about implimenting a main function now. 
    
    public static void drawRectangle(Turtle t, String color, double width, double length){
        Rectangle rectangle = new Rectangle(length, width, color);

        rectangle.draw(t);

    }

    public static void drawRectangle(Turtle t, String color, double width, double length, double x, double y){
        
    }


    public static void drawCircle(Turtle t, String color, double radius){

    }

    public static void drawCircle(Turtle t, String color, double x, double y){

    }


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

                userChoice2 = scanner.nextLine();

                if (userChoice2.equals("1") ){

                    System.out.printf("Enter a radius for the circle(a double): ");

                    double radius = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.printf("Enter a color for the circle(a string): ");

                    String color = scanner.nextLine();

                    Circle circle = new Circle(radius, color);

                    circle.draw(t);
                }


            } else if (userChoice1.equals("2")){
                System.out.println("Choose a shape to draw at a specific point");

                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("4. Pentagon");

                userChoice2 = scanner.nextLine();

                if (userChoice2.equals("1") ){

                }

            } else if (userChoice1.equals("0")){
                System.out.println("Program exiting thank you for using");

            }else {
                System.out.println("Invalid option please try again");
            }





        } while (!userChoice1.equals("0"));
    
    
    }

}
