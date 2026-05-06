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
    public void setShapeColor(Turtle t){
        t.penColor(this.getColor());

    }

    @Override 
    public void draw(Turtle t){
        double circumference = 2 * Math.PI * radius;
        double sideLength = circumference / 365.0;

        t.up();
        t.forward(radius);
        t.left(90);
        t.down();

     for (int i = 0; i < 360; i++) {
            t.forward(sideLength);
            t.left(1);
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
}
