//as per slide 13 in class, creating the Point object
public class Point {
    int x;
    int y;
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
