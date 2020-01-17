public class Square{
    public static void main(String[] args){

        private double base;
        private double height;

        public Square(Point w, Point x, Point y, Point z){
            this.w = w;
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
        base = distance(w, x);
        height = distance(x, y);
        
        public double area(){
            return base * height;
        }
        public double perimeter(){
            return 2*base + 2*height;
        }
    }
}