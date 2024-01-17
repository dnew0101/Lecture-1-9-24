//as per slide 13 in class, creating the Point object
public class Point {
    int x;
    int y;
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
        }

    // public double distanceFromOrigin() {
        // return Math.sqrt(x * x + y * y);
        // }


        // alternative distanceFromOrigin that uses distance
    // public double distanceFromOrigin() {
    //     Point origin = new Point();
    //     return distance(origin);
    //     }


//  public void translate(int dx, int dy) {
    //     x += dx;
    //     y += dy;
    // }

    //Alternatively, translate() could also be written this way
    // public void translate(int dx, int dy) {
    //     setLocation(x + dx, y + dy);
    // }
    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }
}
