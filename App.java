public class App {

    //Main is being used to test the stuff for now. Dont worry about implimenting a main function now. 
    
     public static void main(String[] args ){

    Turtle t = new Turtle();
    
    Rectangle rectangle = new Rectangle(50, 60, "red");

    Circle circle = new Circle(25, "blue");

    rectangle.draw(t, -30, 20);
    circle.draw(t, -80, -40);
    }

}
