abstract class Shape{
    
    private String color;
    private int numSides;

    public Shape(){

    }

    public Shape(String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }


    public abstract void setPosition();

    public abstract double getArea();

    public abstract void setShapeColor(Turtle t, String color);

    public abstract void draw(Turtle t);

    public String getColor(){
        return color;
    }

    public int getNumSides(){
        return numSides;
    }




}
