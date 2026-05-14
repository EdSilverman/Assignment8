/**
 * Represents a circle using the Turtle class. 
 * The circle stores its radius and color, calculates its area, and can draw itself at a given location. 
 * 
 * @author Edward Silverman
 */class Circle extends Shape {  
    private double radius;

    /**
     * Constructs a Circle object with the specified radius and color. 
     *
     * @param radius the radius of the circle 
     * @param color the color of the circle 
     */
    public Circle(double radius, String color){
        super(color, 0);
        this.radius = radius;

    }

    /**
     * Calculates and returns the area of the circle. 
     *
     * @return the area of the circle 
     */
    @Override 
    public double getArea(){
        return Math.PI * radius * radius;

    }

    /**
     * Sets the Turtle pen color to the specified color. 
     *
     * @param t the Turtle object used for drawing 
     * @param color the color to set for the Turtle pen 
     */
    @Override 
    public void setShapeColor(Turtle t, String color){
        t.penColor(color);

    }

    /**
     * Draws the circle using the Turtle object. 
     * The circle is approximated using 45 line segments. 
     *
     * @param t the Turtle object used for drawing 
     */
    @Override 
public void draw(Turtle t){
    double circumference = 2 * Math.PI * radius;
    double sideLength = circumference / 45.0; // 90 steps instead of 360

    t.penColor(this.getColor());
    t.up();
    t.forward(radius);
    t.left(90);
    t.down();

    for (int i = 0; i < 45; i++) {
        t.forward(sideLength);
        t.left(8); // Turn 4 degrees per step (360 / 90 = 4)
    }

    t.up();
    t.left(90);
    t.forward(-radius);
    t.down();
}

    /**
     * Draws the circle at a specified position. 
     *
     * @param t the Turtle object used for drawing 
     * @param x the x-coordinate of the starting position 
     * @param y the y-coordinate of the starting position 
     */
    @Override
    public void draw(Turtle t, double x, double y) {
        t.up();
        t.setPosition(x, y);
        t.penColor(this.getColor());
        t.down();
        
        draw(t);
        
    }

    /**
     * Returns a string representation of the Circle object. 
     *
     * @return a string containing the circle radius and color 
     */
    @Override
    public String toString() {
        return "Radius: " + radius + " Color: " + getColor();
    }


    /**
     * Compares this Circle object with another object for equality. 
     * Two circles are considered equal if they have the same radius 
     * and the same color. 
     *
     * @param other the object to compare with 
     * @return true if the objects are equal, false otherwise 
     */
      @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }

        if (other == this){
            return true;
        }

        if (other instanceof Circle){
            Circle circ = (Circle) other;
            
            return getColor().equals(circ.getColor()) && radius == circ.radius;
            
        }

        return false;

    }

}
