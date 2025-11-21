public abstract class Figura implements Dibujable {
    public abstract double area();
    public abstract double perimetro();
    public abstract void dibujar();

     //creamos el metodo para que se pueda ver los datos en consola
    public void mostrar() {
        System.out.println("Figura area: " + area());
        System.out.println("Figura perimetro: " + perimetro());

    }
}
