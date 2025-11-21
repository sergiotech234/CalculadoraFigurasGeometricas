//Unimos la clase abstracta con la clase circulo
public class Circulo extends Figura{
    private double radio;
    
//Creamos los getters y setter del radio del circulo
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //creamos los metodos para hacer el area y el perimetro del circulo
    @Override
    public double area() {
        return radio*radio;
    }
    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    
    //creamos el metodo para que se pueda ver los datos en consola
    @Override
    public void mostrar() {
        super.mostrar();
    }

    //creamos la interzar dibujable para que lo muestre en la terminal
    @Override
    public void dibujar() {
        System.out.println("======");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("======");
    }
}
