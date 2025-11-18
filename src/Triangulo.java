public class Triangulo extends Figura{
    private double altura;
    private double base;
    private double l1, l2, l3;
    public Triangulo(double altura, double l1, double l2, double l3) {
        this.altura = altura;
        this.base = base;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public double perimetro() {
        return l1+l2+l3;
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
    @Override
    public void dibujar() {
        System.out.println("   *");
        System.out.println("  * *");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println("*******");
    }
}
