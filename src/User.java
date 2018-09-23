import java.util.Locale;
import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);

    public Point inputPoints(int num, String name) {
        System.out.println("Odcinek "+num+"\nPodaj wspolrzedne punktu "+name);
        Point point=new Point();
        System.out.print("X:");
        point.setX(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Y:");
        point.setY(scanner.nextInt());
        scanner.nextLine();
   return point; }
}
