
class Rectangle extends Shape {

    private double length;

    private double width;



    public Rectangle(double length, double width, String color){
        super(color, 4);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override public void setShapeColor(Turtle t, String color){

        
        t.fillColor(color);
    }


    @Override
    public void draw(Turtle t, String color){
        setShapeColor(t, color);

        for(int i = 0; i < 2; i++){
        t.forward(width);
        t.right(90);
        t.forward(length);
        t.right(90);
        }

    }
}

public static void main( String[] args ){

    Shape shape = new Shape();

    Rectangle rectangle = Shape.new Rectangle(20,50, "red");

    Turtle t = new Turtle();
    rectangle.draw(t, "red");
}
