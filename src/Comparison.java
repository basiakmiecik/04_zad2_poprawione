public class Comparison {
    Line line1;
    Line line2;

    public Comparison(Line line1, Line line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    double comparelenght(){
        double greatherlegth;
       if (line1.lengthLine()>line2.lengthLine()){
           greatherlegth=line1.lengthLine();
       }
       else if (line1.lengthLine()<line2.lengthLine()){
           greatherlegth=line2.lengthLine();
       }
       else{
           greatherlegth=0;
       }
    return greatherlegth;}

}
