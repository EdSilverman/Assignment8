abstract class Shape{
    
    private String color;
    private int numSides;
    

    Turtle t = new Turtle();

    public Shape(){

    }

    public Shape(String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }


    public abstract double getArea();

    public abstract void setShapeColor(String color);

    public abstract void draw(String color);

    public String getColor(){
        return color;
    }

    public int getNumSides(){
        return numSides;
    }




}
