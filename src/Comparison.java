public class Comparison {
    Line line1;
    Line line2;

    public Comparison(Line line1, Line line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    public Line comparelenght(){
        Line line;
       if (line1.lengthLine()>line2.lengthLine()){
           line=line1;
       }
       else if (line2.lengthLine()>line1.lengthLine()){
           line=line2;
       }
       else{
           Point point=new Point();
           Point point2= new Point();
           Line line3= new Line(point,point2);
           line=line3;
       }
    return line;
    }

}
