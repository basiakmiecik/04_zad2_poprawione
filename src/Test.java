//import java.util.Locale;
//import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        User user = new User();
        Line line = new Line(user.inputPoints(1, "START"), user.inputPoints(1, "END"));
        Line line2 = new Line(user.inputPoints(2, "START"), user.inputPoints(2, "END"));

        Comparison comparison = new Comparison(line, line2);

        System.out.println("Dłuższy jest odcinek o poczatku w punkcie ("
                + comparison.comparelenght(line, line2).start.getX() +
                ", " + comparison.comparelenght(line, line2).start.getY() + "), " +
                "a koniec w punkcie (" + comparison.comparelenght(line, line2).end.getX() + ", "
                + comparison.comparelenght(line, line2).end.getY() + ")");
        System.out.println("Długość odcinka wynosi "
                + Math.round(comparison.comparelenght(line, line2).lengthLine() * 100) / 100.00);


    }
}

