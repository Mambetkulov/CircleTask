import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат
        Scanner scan = new Scanner(System.in);
        System.out.println("Write some radius");
        Circle c = new Circle(3.14, scan.nextDouble());

        System.out.printf("The area of the circle - %.2f(м)2 \n" , Circle.area(c.pi,c.radius) );
        System.out.printf("The circumference of the circle - %.1f" , Circle.circumference(c.pi,c.radius) );
        





    }
}