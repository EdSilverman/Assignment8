/**
 * models an abstract shape that can be given a number of sides and color
 */
abstract class Shape{
    
    /**
     * the color of the shape
     */
    private String color;

    /**
     * the number of sides the shape has
     */
    private int numSides;

    /**
     * creates a shape object throws exception if color is null or empty
     * @param color the color of the shape
     * @param numSides the number of sides of the shape
     */
    public Shape(String color, int numSides){
        
        if(color == null || color.isEmpty()){
            throw new IllegalArgumentException("The color cannot be empty or null");
        }
         
        this.color = color;
        this.numSides = numSides;
    }

    /**
     * gets the area of the shape
     * @return the area of the shape
     */
    public abstract double getArea();

    /**
     * sets the color of the shape
     * @param t the turtle object
     * @param color the color of the shape
     */
    public abstract void setShapeColor(Turtle t, String color);

    /**
     * draws the shape
     * @param t the turtle object
     */
    public abstract void draw(Turtle t);

    /**
     * draws the shape at specific coordinates
     * @param t the turtle object
     * @param x the x-coordinate of the shape
     * @param y the y-coordinate of the shape
     */
    public abstract void draw(Turtle t, double x, double y);

    /**
     * gets the color of the shape
     * @return the color of the shape
     */
    public String getColor(){
        return color;
    }

    /**
     * gets the number of sides of the shape
     * @return the number of sides
     */
    public int getNumSides(){
        return numSides;
    }


    




}
