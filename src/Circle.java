public class Circle {
    private double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public void circleArea() {
        double area = radius*radius*Math.PI;
        System.out.print(area);
    }
}