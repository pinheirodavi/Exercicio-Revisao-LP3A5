public class Circulo extends FormaGeometrica {

    private Double raio;

    @Override
    public Double calcularArea() {
        return 3.14 * this.raio * this.raio;
    }
}
