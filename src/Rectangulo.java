public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return (base*altura)*2;
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
    @Override
    public void dibujar() {
        System.out.println("=========");
        System.out.println("|       |");
        System.out.println("=========");
    }
}
