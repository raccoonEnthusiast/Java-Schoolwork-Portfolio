package task2;

public class Shape {

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private String colour;

    public Shape(String colour){
        this.setColour(colour);
    }

    public String getShapeType(){
        return "I am a shape";
    }
}
