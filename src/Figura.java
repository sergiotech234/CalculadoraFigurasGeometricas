public abstract class Figura implements Dibujable {
    public abstract double area();
    public abstract double perimetro();
    public abstract void dibujar();

    public void mostrar() {
        System.out.println("Figura area: " + area());
        System.out.println("Figura perimetro: " + perimetro());

    }
}
