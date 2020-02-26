
public class Main
{

    public static void main(String[] args)
    {
        new Main();
    }

    public Main()
    {
        SimplePolygon polygon1 = new SimplePolygon();
        SimplePolygon triangle1 = new SimplePolygon();
        SimplePolygon triangle2 = new SimplePolygon();

        polygon1.addVertex(new Point(3,4));
        polygon1.addVertex(new Point(5,11));
        polygon1.addVertex(new Point(12,8));
        polygon1.addVertex(new Point(9,5));
        polygon1.addVertex(new Point(5,6));

        triangle1.addVertex(new Point(2,4));
        triangle1.addVertex(new Point(3,-8));
        triangle1.addVertex(new Point(1,2));

        triangle2.addVertex(new Point(2,1));
        triangle2.addVertex(new Point(4,5));
        triangle2.addVertex(new Point(7,8));

        System.out.printf("Polygon 1 greatest {x: %f, y: %f}, smallest {x: %f, y: %f}%n", 
            polygon1.greatestX(), polygon1.greatestY(), polygon1.smallestX(), polygon1.smallestY());
        System.out.printf("Polygon 1 width: %f, height %f%n", polygon1.width(), polygon1.height());
        System.out.printf("Polygon 1 perimeter: %f%n", polygon1.perimeter());
        System.out.printf("Polygon 1 bounding rectangle: %s%n", polygon1.boundingRectangle());
        System.out.printf("Polygon 1 area: %f, expected: 30.0%n%n", polygon1.area());

        System.out.printf("Triangle 1 greatest {x: %f, y: %f}, smallest {x: %f, y: %f}%n", 
            triangle1.greatestX(), triangle1.greatestY(), triangle1.smallestX(), triangle1.smallestY());
        System.out.printf("Triangle 1 width: %f, height %f%n", triangle1.width(), triangle1.height());
        System.out.printf("Triangle 1 perimeter: %f%n", triangle1.perimeter());
        System.out.printf("Triangle 1 bounding rectangle: %s%n", triangle1.boundingRectangle());
        System.out.printf("Triangle 1 area: %f, expected: 7.0%n%n", triangle1.area());

        System.out.printf("Triangle 2 greatest {x: %f, y: %f}, smallest {x: %f, y: %f}%n", 
            triangle2.greatestX(), triangle2.greatestY(), triangle2.smallestX(), triangle2.smallestY());
        System.out.printf("Triangle 2 width: %f, height %f%n", triangle2.width(), triangle2.height());
        System.out.printf("Triangle 2 perimeter: %f%n", triangle2.perimeter());
        System.out.printf("Triangle 2 bounding rectangle: %s%n", triangle2.boundingRectangle());
        System.out.printf("Triangle 2 area: %f, expected: 3.0%n%n", triangle2.area());
    }
}
