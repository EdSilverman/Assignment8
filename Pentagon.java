/**
 * 
 * @author Alyssa Sul
 */
class Pentagon extends Shape {
    
    /** The length of each side of the pentagon **/
    private double sideLength;
    
    /**
     * 
     * @param sideLength
     * @param color
     */
    public Pentagon(double sideLength, String color) {
        super(color, 5);
        this.sideLength = sideLength;
    }
    
    /**
     * 
     */
    @Override
    public double getArea() {
        return (5 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 5));
    }

    /**
     * 
     * @param t
     * @param color
     */
    @Override
    public void setShapeColor(Turtle t, String color) {
        t.penColor(color);
    }

    /**
     * 
     * @param t
     */
    @Override
    public void draw(Turtle t) {
        t.penColor(this.getColor());
        
        for (int i = 0; i < 5; i++) {
            t.forward(sideLength);
            t.right(72);
        }
    }

    /**
     * 
     * @param t
     * @param x
     * @param y
     */
    @Override
    public void draw(Turtle t, double x, double y) {
        t.up();
        t.setPosition(x, y);
        t.penColor(this.getColor());
        t.down();

        for (int i = 0; i < 5; i++) {
            t.forward(sideLength);
            t.right(72);
        }
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return "Side Length: " + sideLength + " Color: " + getColor() + " Sides: " + getNumSides();
    }

    /**
     * 
     * @param other
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (other instanceof Pentagon) {
            Pentagon pentagon = (Pentagon) other;

            return getColor().equals(pentagon.getColor()) && sideLength == pentagon.sideLength;
        }

        return false;
    }

}
