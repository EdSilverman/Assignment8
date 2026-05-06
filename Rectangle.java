class Rectangle extends Shape {

    private double length;

    private double width;


    public Rectangle(double length, double width, String color){
        super(color, 4);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override public void setShapeColor(Turtle t){
        t.penColor(this.getColor());


    }
    

    @Override
    public void draw(Turtle t){

        t.penColor(this.getColor());

        for(int i = 0; i < 2; i++){
        t.forward(width);
        t.right(90);
        t.forward(length);
        t.right(90);
        }

    }

    @Override
    public void draw(Turtle t, double x, double y){

        t.up();
        t.setPosition(x, y);
        t.penColor(this.getColor());
        t.down();

        
        for(int i = 0; i < 2; i++){
        t.forward(width);
        t.right(90);
        t.forward(length);
        t.right(90);
        }
    }

    @Override
    public String toString(){
        return "Length: " + length + "Width: " + width + "Color: " + getColor();
    }
   

    @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }

        if (other == this){
            return true;
        }

        if (other instanceof Rectangle){
            Rectangle rect = (Rectangle) other;
            
            return getColor().equals(rect.getColor()) && width == rect.width && length == rect.length;
            
        }

        return false;



    }
}

