public class Point{

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    })

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public double distance(Point p, Point q){

        return Math.sqrt((q.getX() - p.getX())*(q.getX() - p.getX()) + (q.getY() - p.getY())*(q.getY() - p.getY()));
    }
}