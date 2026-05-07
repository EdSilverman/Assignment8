class Rectangle extends Shape {

    /**
     *the length of the rectangle 
     */
    private double length;

    /**
     * the width of the rectangle 
     */
    private double width;

    /**
     * creates a rectangle object with set width, length and color
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @param color the color of the rectangle
     */
    public Rectangle(double length, double width, String color){
        super(color, 4);
        this.length = length;
        this.width = width;
    }


    
    @Override
    public double getArea(){
        return length * width;
    }

    @Override public void setShapeColor(Turtle t, String color){
        t.penColor(color);


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

