abstract class Shape{
    
    private String color;
    private int numSides;

    public Shape(){

    }

    public Shape(String color, int numSides){
        
        if(color == null || color.isEmpty()){
            throw new IllegalArgumentException("The color cannot be empty or null");
        }
         
        this.color = color;
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract void setShapeColor(Turtle t);

    public abstract void draw(Turtle t);

    public abstract void draw(Turtle t, double x, double y);

    public String getColor(){
        return color;
    }

    public int getNumSides(){
        return numSides;
    }


    




}
