public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double area() {
        return radio*radio;
    }
    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    @Override
    public void mostrar() {
        super.mostrar();
    }

    @Override
    public void dibujar() {
        System.out.println("======");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("======");
    }
}
