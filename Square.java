public class Square {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    private double side;

    public Square(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        side = Point.distance(p1, p2) / Math.sqrt(2);

        p3 = new Point(p1.getX(),p2.getY());
        p4 = new Point(p2.getX(),p1.getY());
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    private Point getPoint1() {
        return p1;
    }

    private Point getPoint2() {
        return p2;
    }

    boolean cornerIntersects(Point p, Square sq){
        // x range of sq
        
    }

    public static boolean collision(Square a, Square b) {
        int p1X = a.getPoint1().getX();
        int p1Y = a.getPoint1().getY();
        int p2X = b.getPoint1().getX();
        int p2Y = b.getPoint1().getY(); 

        if (cornerIntersects){
            return true;
        }
        else {
            return false;
        }
}
}