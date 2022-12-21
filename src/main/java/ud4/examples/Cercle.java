package ud4.examples;

/**
 * Aquesta classe representa un cercle posicionat en l'espai de coordenades X i Y.
 * 
 * @author Joan Puigcerver
 * @version 1.2 2022-12-21
 */
public class Cercle {
    /**
     * El radi del Cercle.
     */
    private double radius;
    /**
     * La posició del centre del Cercle en l'eix X.
     */
    private double x;
    /**
     * La posició del centre del Cercle en l'eix Y.
     */
    private double y;

    /**
     * Crea un Cercle a partir del radi i la posició del centre.
     * @param radius Radi del Cercle
     * @param x Posició del centre del Cercle en l'eix X
     * @param y Posició del centre del Cercle en l'eix Y
     */
    public Cercle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    /**
     * Crea un Cercle en l'origen de coordenades (0, 0) amb el radi especificat
     * @param radius Radi del Cercle
     */
    public Cercle(double radius) {
        this.radius = radius;
        this.x = 0;
        this.y = 0;
    }

    /**
     * Obté el radi del Cercle
     * @return Radi del cercle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Estableix el radi del Cercle
     * @param radius Nou radi del Cercle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calcula el àrea del Cercle
     * @return Àrea del cercle
     * @since 1.1
     */
    public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Comprova si el punt especificat (x, y) està dins del Cercle.
     * @param x Coordeneda del punt especificat en l'eix X.
     * @param y Coordeneda del punt especificat en l'eix Y.
     * @return True si el punt (x, y) està dins del Cercle, False en altre cas.
     * @since 1.2
     */
    public boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distance <= radius;
    }
}
