import java.util.Scanner;

/**
 * contains the utility methods that will be used to draw different shapes using implimentation of the turtle class
 * @author Thomas Guzzetta
*/
public class App {

    
    /**
     * Allows the simplification of creating a new rectangle object for the loops
     * @param scanner a new scanner object
     * @return the new rectangle object
     */
    public static Rectangle rectangle(Scanner scanner){
        System.out.printf("Enter a length for the rectangle (a double): ");
        double length = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Enter a width for the rectangle (a double): ");
        double width = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Enter a color for the rectangle (a string): ");
        String color = scanner.nextLine();

        return new Rectangle(length, width, color);

    }


    /**
     * Allows the simplification of creating a new circle object for the loops
     * @param scanner a new scanner object
     * @return the new circle object
     */
    public static Circle circle(Scanner scanner ){
        System.out.printf("Enter a radius for the circle (a double): ");

        double radius = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Enter a color for the circle (a string): ");
        String color = scanner.nextLine();

        return new Circle(radius, color);

    }

    /**
     * Allows the simplification of creating a new triangle object for the loops
     * @param scanner a new scanner object
     * @return the new triangle object
     */
    public static Triangle triangle(Scanner scanner){

    }

    /**
     * Allows the simplification of creating a new pentagon object for the loops
     * @param scanner a new scanner object
     * @return the new pentagon object
     */
    public static Pentagon pentagon(Scanner scanner){

    }



     public static void main(String[] args ){
        
        Scanner scanner = new Scanner(System.in);

        Turtle t = new Turtle();
        String userChoice; 
        String shapeChoice;

        do {
            System.out.println("Choose one of the options below (the number choice)");
            System.out.println("1. Draw a Shape");
            System.out.println("2. Draw a shape at a specific point");
            System.out.println("0. Exit");

            userChoice = scanner.nextLine();
            
            
            if (userChoice.equals("1")){

                do{
                    System.out.println("Choose a shape to draw (the number choice");

                    System.out.println("1. Circle");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Triangle");
                    System.out.println("4. Pentagon");
                    System.out.println("0. Back");

                    shapeChoice = scanner.nextLine();

                    if (shapeChoice.equals("1") ){

                        Circle circle = circle(scanner);
                        circle.draw(t);

                    } else if(shapeChoice.equals("2")){

                        Rectangle rectangle = rectangle(scanner);
                        rectangle.draw(t);
                    }else if(shapeChoice.equals("3")){

                    }else if(shapeChoice.equals("4")){

                    }else if(shapeChoice.equals("0")){

                        System.out.println("Going back to start");
                        continue;

                    } else{

                        System.out.println("Invalid option please try again");
                        
                    }
                }while(!shapeChoice.equals("0"));

            } else if (userChoice.equals("2")){

                do{
                    System.out.println("Choose a shape to draw at a specific point (the number choice");

                    System.out.println("1. Circle");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Triangle");
                    System.out.println("4. Pentagon");
                    System.out.println("0. Back");

                    shapeChoice = scanner.nextLine();
                    
                    if (shapeChoice.equals("1") ){
                        
                        System.out.printf("Enter the x-coordinate (a double)");
                        double x = scanner.nextDouble();

                        System.out.printf("Enter the y-coordinate (a double)");
                        double y = scanner.nextDouble();

                        Circle circle = circle(scanner);

                        circle.draw(t, x, y);

                    } else if(shapeChoice.equals("2")){
                        System.out.printf("Enter the x-coordinate (a double)");
                        double x = scanner.nextDouble();

                        System.out.printf("Enter the y-coordinate (a double)");
                        double y = scanner.nextDouble();

                        Rectangle rectangle = rectangle(scanner);

                        rectangle.draw(t, x, y);

                    } else if(shapeChoice.equals("3")){

                    }else if(shapeChoice.equals("4")){

                    }else if(shapeChoice.equals("0")){

                        System.out.println("Going back to start");
                        continue;

                    } else{

                        System.out.println("Invalid option please try again");

                    }
                } while (!shapeChoice.equals("0"));

            } else if (userChoice.equals("0")){
                System.out.println("Program exiting thank you for using");

            }else {
                System.out.println("Invalid option please try again");
            }





        } while (!userChoice.equals("0"));
    
    
    }

}
