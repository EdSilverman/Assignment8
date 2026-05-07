class Circle extends Shape {  
    private double radius;

    public Circle(double radius, String color){
        super(color, 0);
        this.radius = radius;

    }

    @Override 
    public double getArea(){
        return Math.PI * radius * radius;

    }

    @Override 
    public void setShapeColor(Turtle t, String color){
        t.penColor(color);

    }

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

    @Override
    public void draw(Turtle t, double x, double y) {
        t.up();
        t.setPosition(x, y);
        t.penColor(this.getColor());
        t.down();
        
        draw(t);
        
    }

      @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }

        if (other == this){
            return true;
        }

        if (other instanceof Circle){
            Circle rect = (Circle) other;
            
            return getColor().equals(rect.getColor()) && radius == rect.radius;
            
        }

        return false;

    }

}
