public class Rectangulo extends Figura{
    private double base;
    private double altura;
 //creamos el constructor con las variables que hemos creado anteriormente
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 //creamos los metodos de getter y setter para poder utilizarlo en el calculo del area y del perimetro
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
    
//creamos los metodos para hacer el area y el perimetro del circulo
    @Override
    public double area() {
        return base*altura;
    }
    @Override
    public double perimetro() {
        return (base*altura)*2;
    }

     //creamos el metodo para que se pueda ver los datos en consola
    @Override
    public void mostrar() {
        super.mostrar();
    }

    //creamos la interfaz dibujable para que se muestre la figura
    @Override
    public void dibujar() {
        System.out.println("=========");
        System.out.println("|       |");
        System.out.println("=========");
    }
}
