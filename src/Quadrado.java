public class Quadrado extends FormaGeometrica {

    private Double base;

    @Override
    public Double calcularArea() {
        return this.base * this.base;
    }
}
