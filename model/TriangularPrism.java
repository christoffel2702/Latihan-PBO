package model;

public class TriangularPrism implements Shape {
    private double base;
    private double height;
    private double length;
    private double prismHeight;

    public TriangularPrism(double base, double height, double length, double prismHeight) {
        this.base = base;
        this.height = height;
        this.length = length;
        this.prismHeight = prismHeight;
    }

    @Override
    public double calculateVolume() {
        return 0.5 * base * height * length * prismHeight;
    }
}
