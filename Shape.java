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

    public abstract void draw(turtle t);

    public abstract setShapeColor(String color){
        
    }

    public String getColor(){
        return color;
    }

    public int getNumSides(){
        return numSides
    }




}
