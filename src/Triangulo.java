public class Triangulo extends FormaGeometrica {
    private Double base;
    private Double altura;

    @Override
    public Double calcularArea() {
        return (this.base * this.altura) / 2;
    }
}
