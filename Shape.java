public class Shape{
    
    private String color;
    private int numSides;

    public Shape(){

    }

    public Shape(String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }


    public abstract double getArea();

    public abstract setShapeColor(Turtle t, String color);

    public abstract void draw(turtle t, String color);

    public String getColor(){
        return color;
    }

    public int getNumSides(){
        return numSides;
    }




}
