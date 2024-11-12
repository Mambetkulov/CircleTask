public class Circle {
    double pi ;
    double radius;

    public Circle(double pi ,double radius ){
        this.pi = pi;
        this.radius = radius;
    }


    public static double area(double pi , double radius){
        return pi * (radius * radius);
    }

    public static double circumference(double pi , double radius){
        return pi * 2 * radius;
    }
}
