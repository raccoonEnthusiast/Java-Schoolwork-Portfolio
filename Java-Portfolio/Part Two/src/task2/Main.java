package task2;

/* 
 * Name: Andrew Phillips
 * I pledge by honour that this program is solely my own work
 */

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Shape("white"));
        shapes.add(new Rectangle("red", 10, 6));
        shapes.add(new Rectangle("black", 20, 9));
        shapes.add(new Shape("orange"));
        showShapeNames(shapes);//produces output part 1
        Rectangle[] rectangleArray1 = {
                new Rectangle("white", 4, 3),
                new Rectangle("red", 9, 5),
                new Rectangle("purple", 3, 6),
                new Rectangle("orange", 15, 10),
                new Rectangle("black", 4, 14),
        };
        Rectangle[] rectangleArray2 = {
                new Rectangle("pink", 3, 4),
                new Rectangle("red", 10, 2),
                new Rectangle("white", 8, 5),
                new Rectangle("blue", 14, 4),
                new Rectangle("bindle", 10, 15),
        };
     
        countOverlapRectangles(rectangleArray1, rectangleArray2);
        
    }
    
    //Get and display the shape type for each shape instance
    public static void showShapeNames(List<Shape> shapes){
    
        for(Shape e : shapes){
            System.out.println(e.getShapeType());
        }
    }
    
    //Loops through both groups and counts number of overlapping colours and perimeters
    public static void countOverlapRectangles(Rectangle[] group1, Rectangle[] group2){
        
    	int colourOverlap = 0;

        for (Shape e : group1){
            for (Shape f : group2){
                if (e.getColour().equals(f.getColour())){
                    colourOverlap ++;
                }
            }
        }

        int perimeterOverlap = 0;

        for (Rectangle e : group1){
            for (Rectangle f : group2){
                if (e.getPerimeter() == f.getPerimeter()){
                    perimeterOverlap ++;
                }
            }
        }
        System.out.printf("\nThere are %d Rectangle objects with overlapping colour between the two arrays\n", colourOverlap);
        System.out.printf("There are %d Rectangle objects with overlapping colour between the two arrays\n", perimeterOverlap);
    }

}
