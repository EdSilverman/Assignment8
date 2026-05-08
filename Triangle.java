/**
 * Models a triangle shape using the turtle class. Allows the triangle to have a side length and color inherits from Shape class
 * @author Your Name
 */
public class Triangle extends Shape {

    /**
     * the side length of the triangle
     */
    private double side;

    /**
     * Creates a triangle object with set side length and color
     * @param side the side length of the triangle
     * @param color the color of the triangle
     */
    public Triangle(double side, String color){

        super(color, 3);

        if(side <= 0){
            throw new IllegalArgumentException("Side length must be positive");
        }

        this.side = side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getArea(){

        return (Math.sqrt(3) / 4) * side * side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setShapeColor(Turtle t, String color){

        t.penColor(color);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void draw(Turtle t){

        t.penColor(this.getColor());

        for(int i = 0; i < 3; i++){

            t.forward(side);
            t.left(120);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void draw(Turtle t, double x, double y){

        t.up();
        t.setPosition(x, y);
        t.penColor(this.getColor());
        t.down();

        for(int i = 0; i < 3; i++){

            t.forward(side);
            t.left(120);
        }
    }

    /**
     * {@inheritDoc}
     * @return a string containing all attributes
     */
    @Override
    public String toString(){

        return "Side: " + side + " Color: " + getColor() + " Sides: " + getNumSides();
    }

    /**
     * {@inheritDoc}
     * @return returns true if this is equal to the other object or if its an instance of triangle. False if null or not equal
     */
    @Override
    public boolean equals(Object other){

        if(other == null){
            return false;
        }

        if(other == this){
            return true;
        }

        if(other instanceof Triangle){

            Triangle tri = (Triangle) other;

            return getColor().equals(tri.getColor()) && side == tri.side;
        }

        return false;
    }
}