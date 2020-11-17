package exercise8;

public class Point {
    
    double x;
    double y;


    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
      System.out.print("Enter x: ");
      x = Utils.INPUT.nextDouble();
      System.out.print("Enter y: ");
      y = Utils.INPUT.nextDouble();

    }

    public void translate(double xDelta, double yDelta) {
       this.x = x + xDelta;
       this.y = y + yDelta; 
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        return  new Point(x+xDelta,y+yDelta);
    }

    public boolean equals(Point otherPoint) {
       if(this.x == otherPoint.x && this.y == otherPoint.y){
         return true;
       }
        return false;
    }

    public String toString() {
        // Represent attributes as string
        return "(" + x + ", " + y + ")" ;
    }
}
