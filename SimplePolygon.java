
import java.util.ArrayList;

public class SimplePolygon
{

    ArrayList<Point> vertexList; //list of vertices in clockwise order

    /**
     * Instantiates an empty SimplePolygon object.
     */
    public SimplePolygon()
    {
        vertexList = new ArrayList<>();
    }

    /**
     * Adds a vertex as the last one in the sequence of vertices.
     *
     * @param v the new vertex
     */
    public void addVertex(Point v)
    {
        vertexList.add(v);
    }

    /**
     * Adds (i.e. inserts) a vertex at the specified location.
     *
     * @param v the new vertex
     * @param location position in the sequence of vertices to add the new
     * vertex in; locations are 0-indexed
     * @throws IndexOutOfBoundsException if <code>location</code> is out of
     * range
     */
    public void addVertex(Point v, int location) throws IndexOutOfBoundsException
    {
        if (location < 0 || location >= vertexList.size())
            throw new IndexOutOfBoundsException();
        else
            vertexList.add(location, v);
    }

    /**
     * Computes the area of this polygon.
     *
     * @return area of this polygon
     */
    public double area()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Returns vertex at the specified location.
     *
     * @param location position of vertex in the sequence of vertices; locations
     * are 0-indexed
     * @return vertex at <code>location</code>
     * @throws IndexOutOfBoundsException if <code>location</code> is out of
     * range
     */
    public Point getVertex(int location) throws IndexOutOfBoundsException
    {
        if (location < 0 || location >= vertexList.size())
            throw new IndexOutOfBoundsException();
        else
            return vertexList.get(location);
    }

    /**
     * Determines the (minimum) bounding rectangle of this polygon.
     *
     * @return bounding rectangle
     */
    public Rectangle boundingRectangle()
    {
        return new Rectangle(new Point(), new Point(1, 1));  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Determines the greatest x.
     *
     * @return the greatest x
     */
    public double greatestX()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Determines the greatest y.
     *
     * @return the greatest y
     */
    public double greatestY()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Computes the height of this object
     *
     * @return height of this object.
     */
    public double height()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Determines if given point is on the boundary or the interior of this
     * simple polygon.
     *
     * @param p given point
     * @return true if given point is on the boundary or the interior of this
     * polygon, false otherwise
     */
    public boolean isPointOnPolygon(Point p)
    {
        return false;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Computes the perimeter of this polygon.
     *
     * @return perimeter of this polygon
     */
    public double perimeter()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Replaces vertex at the specified location.
     *
     * @param v new vertex
     * @param location position in the sequence of vertices of the vertex to be
     * replaced
     * @throws IndexOutOfBoundsException if <code>location</code> is out of
     * range
     */
    public void replaceVertex(Point v, int location) throws IndexOutOfBoundsException
    {
        if (location < 0 || location >= vertexList.size())
            throw new IndexOutOfBoundsException();
        else
            vertexList.set(location, v);
    }

    /**
     * Determines the smallest x.
     *
     * @return the smallest x
     */
    public double smallestX()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Determines the smallest y.
     *
     * @return the smallest y
     */
    public double smallestY()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Returns an array with the vertices of the simple polygon, listed in
     * clockwise order.
     *
     * @return array containing the vertices of this simple polygon
     */
    Point[] toArray()
    {
        Point[] list = new Point[vertexList.size()];

        for (int i = 0; i < vertexList.size(); i++)
        {
            list[i] = new Point(vertexList.get(i).getX(), vertexList.get(i).getY());
        }

        return list;
    }

    /**
     * Constructs a String description of this simple polygon.
     *
     * @return String containing vertices of this polygon.
     */
    public String toString()
    {
        String str = "";

        int length = vertexList.size();

        for (int i = 0; i < length - 1; i++)
        {
            str += vertexList.get(i) + ", ";
        }

        if (length != 0)
            return "[" + str + vertexList.get(length - 1) + "]";
        else
            return "[]";
    }

    /**
     * Computes the width of this object
     *
     * @return width of this object.
     */
    public double width()
    {
        return Double.NaN;  //DUMMY CODE; TO IMPLEMENT
    }
}
