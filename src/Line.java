public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double lengthLine(){

        double length= Math.sqrt(Math.pow((end.x-start.x),2)+Math.pow((end.y-start.y),2));
    return length;}
}
