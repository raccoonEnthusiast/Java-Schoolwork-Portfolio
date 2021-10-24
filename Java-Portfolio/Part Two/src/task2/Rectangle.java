package task2;

public class Rectangle extends Shape{
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double width;

    public Rectangle(String colour, double height, double width){
        super(colour);
        this.setHeight(height);
        this.setWidth(width);
        this.setColour(colour);

    }
    @Override
    public String getShapeType(){
        return "I am a rectangle";
    }

    public double getPerimeter(){
        double perimeter = getHeight() * getWidth();
        return perimeter;
    }


}
