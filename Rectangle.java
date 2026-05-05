public class Rectangle extends Shape {

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
    public void draw(Turtle t){

        t.penColor(this.getColor());

        for(int i = 0; i < 2; i++){
        t.forward(width);
        t.right(90);
        t.forward(length);
        t.right(90);
        }

    }

    @Override
    public void draw(Turtle t, double x, double y){

        t.up();
        t.setPosition(x, y);
        t.penColor(this.getColor());
        t.down();

        
        for(int i = 0; i < 2; i++){
        t.forward(width);
        t.right(90);
        t.forward(length);
        t.right(90);
        }
    }
   
}

