
public class Main
{

    public static void main(String[] args)
    {
        new Main();
    }

    public Main()
    {
        SimplePolygon polygon1 = new SimplePolygon();
        System.out.println(polygon1);

        SimplePolygon polygon2 = new SimplePolygon();

        polygon2.addVertex(new Point(0, 15));
        polygon2.addVertex(new Point(16, 25));
        polygon2.addVertex(new Point(26, 30));
        polygon2.addVertex(new Point(31, 35));
        polygon2.addVertex(new Point(40, 15));
        polygon2.addVertex(new Point(25, 20));

        System.out.println(polygon2);
    }
}
