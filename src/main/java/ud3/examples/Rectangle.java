package ud3.examples;

/**
 * Aquesta classe representa un rectangle.
 *
 * @author Joan Puigcerver
 * @version 1.2 2022-12-07
 */
public class Rectangle {
    /**
     * Amplada del rectangle
     */
    private int width;
    /**
     * Altura del rectangle
     */
    private int height;
    /**
     * Posició del vèrtex de baix a l'esquerra en l'eix X
     */
    private int x;
    /**
     * Posició del vèrtex de baix a l'esquerra en l'eix Y
     */
    private int y;

    /**
     * Constructor de la classe Rectangle amb tots els paràmetres.
     *
     * @param width Amplada del rectangle
     * @param height Altura del rectangle
     * @param x Posició del vèrtex de baix a l'esquerra en l'eix X
     * @param y Posició del vèrtex de baix a l'esquerra en l'eix Y
     */
    public Rectangle(int width, int height, int x, int y){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    /**
     * Calcula l'àrea del rectangle
     *
     * @return àrea del rectangle
     * @since 1.1
     */
    public int area(){
        // AREA = BASE * ALTURA
        return width * height;
    }

    /**
     * Comprova si el punt especificat (x, y) està dins del rectangle.
     *
     * @param x Coordenada especificada en l'eix X
     * @param y Coordenada especificada en l'eix Y
     * @return true si el punt (x, y) està dins del rectangle; false en qualsevol altre cas.
     * @since 1.2
     */
    public boolean contains(int x, int y){
        boolean insideX = (x >= this.x) && (x <= this.x + this.width);
        boolean insideY = (y >= this.y) && (y <= this.y + this.height);
        return  insideX && insideY;
    }
}
