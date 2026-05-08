/**
 * Represents
 * 
 * @author Alyssa Sul
 */
class Pentagon extends Shape {
    
    /** The length of each side of the pentagon **/
    private double sideLength;
    
    /**
     * Creates a pentagon with a side length and color
     * 
     * @param sideLength the length of each side
     * @param color the color of the pentagon
     */
    public Pentagon(double sideLength, String color) {
        super(color, 5);
        this.sideLength = sideLength;
    }
    
    /**
     * {@inheritDoc}
     * 
     * @return the area of the pentagon
     */
    @Override
    public double getArea() {
        return (5 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 5));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setShapeColor(Turtle t, String color) {
        t.penColor(color);
    }

    /**
     * {@inheritDoc}
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
     * {@inheritDoc}
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
     * {@inheritDoc}
     * 
     * @return a string that contains the side length, color, and number of sies
     */
    @Override
    public String toString() {
        return "Side Length: " + sideLength + " Color: " + getColor() + " Sides: " + getNumSides();
    }

    /**
     * {@inheritDoc}
     * 
     * @return true if this pentagon and the other pentagon are equal, false otherwise
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
