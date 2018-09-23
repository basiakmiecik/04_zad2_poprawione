import java.util.Locale;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            User user=new User();
            Line line = new Line( user.inputPoints(1, "START"), user.inputPoints(1, "END"));
            Line line2 = new Line( user.inputPoints(2, "START"), user.inputPoints(2,"END"));

            Comparison comparison = new Comparison(line,line2);

                   if(comparison.comparelenght().lengthLine()==0) {
                       System.out.println("Oba odcinki są takiej samej długości.");
                   }
                        else{
                       System.out.println("Dłuższy jest odcinek o poczatku w punkcie ("
                               + comparison.comparelenght().start.getX() +
                               ", " + comparison.comparelenght().start.getY() + "), " +
                               "a koniec w punkcie (" + comparison.comparelenght().end.getX() + ", "
                               + comparison.comparelenght().end.getY() + ")");
                       System.out.println("Długość odcinka wynosi "
                               + Math.round(comparison.comparelenght().lengthLine() * 100) / 100.00);
                   }



        }
    }

