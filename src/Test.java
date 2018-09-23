import java.util.Locale;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

            System.out.print("Odcinek 1\nPodaj wspolrzedne punktu START : \nX: ");
            double x1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Y:");
            double y1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("\nPodaj wspolrzedne punktu KONIEC: \nX:");
            double x2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Y:");
            double y2 = scanner.nextDouble();
            scanner.nextLine();

            Point pointStart= new Point(x1,y1);
            Point pointKoniec = new Point(x2, y2);
            Line line = new Line(pointStart,pointKoniec);

            System.out.print("Odcinek 2\nPodaj wspolrzedne punktu START : \nX: ");
            double x2_1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Y:");
            double y2_1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("\nPodaj wspolrzedne punktu KONIEC: \nX:");
            double x2_2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Y:");
            double y2_2 = scanner.nextDouble();
            scanner.nextLine();

            Point point2Start = new Point(x2_1,y2_1);
            Point point2Koniec= new Point(x2_2,y2_2);
            Line line2 = new Line(point2Start,point2Koniec);

            Comparison comparison = new Comparison(line,line2);

                   if(comparison.comparelenght().lengthLine()==0) {
                       System.out.println("Oba odcinki są takiej samej długości.");
                   }
                        else{
                       System.out.println("Dłuższy jest odcinek o poczatku w punkcie (" + comparison.comparelenght().start.getX() +
                               ", " + comparison.comparelenght().start.getY() + "), " +
                               "a koniec w punkcie (" + comparison.comparelenght().end.getX() + ", "
                               + comparison.comparelenght().end.getY() + ")");
                       System.out.println("Długość odcinka wynosi " + Math.round(comparison.comparelenght().lengthLine() * 100) / 100.00);
                   }



        }
    }

