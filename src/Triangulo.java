public class Triangulo extends Figura{
    private double altura;
    private double base;
    private double l1, l2, l3;
     //creamos el constructor con las variables que hemos creado anteriormente
    public Triangulo(double base,double altura, double l1, double l2, double l3) {
        this.altura = altura;
        this.base = base;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

     //creamos los metodos de getter y setter para poder utilizarlo en el calculo del area y del perimetro
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

//creamos los metodos para hacer el area y el perimetro del circulo
    @Override
    public double area() {
        return (base*altura)/2;
    }
    @Override
    public double perimetro() {
        return l1+l2+l3;
    }
    
 //creamos el metodo para que se pueda ver los datos en consola
    @Override
    public void mostrar() {
        super.mostrar();
    }
    
 //creamos la interzar dibujable para que lo muestre en la terminal
    @Override
    public void dibujar() {
        System.out.println("   *");
        System.out.println("  * *");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println("*******");
    }
}
