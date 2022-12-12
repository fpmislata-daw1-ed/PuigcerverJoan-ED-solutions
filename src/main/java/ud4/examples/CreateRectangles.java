package ud4.examples;

public class CreateRectangles {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 3, 1, 2);
        Rectangle r2 = new Rectangle(5, 6);

        System.out.printf("L'area del R1 és %d\n", r1.area());
        System.out.printf("L'area del R2 és %d\n", r2.area());

        System.out.printf("Està el punt (5, 5) dins de R1? %s\n",
                r1.contains(5,5) ? "Sí" : "No"
        );
        System.out.printf("Està el punt (5, 5) dins de R2? %s\n",
                r2.contains(5,5) ? "Sí" : "No"
        );
    }
}
