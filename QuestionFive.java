import java.util.Scanner;
import java.text.DecimalFormat;

//this program will take a radius as a input
//and calculate teh Radius,diameter, area and circumference
public class QuestionFive {

    public static void main(String[] args) {
        DecimalFormat ft=new DecimalFormat("#.##");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        double radius = scan.nextDouble();
        double diameter = radius*2;
        double area = Math.PI * (radius * radius);
        double circumference= Math.PI * 2*radius;

        System.out.println("Radius: " + ft.format(radius));
        System.out.println("diameter: " + ft.format(diameter));
        System.out.println("area: " + ft.format(area));
        System.out.println("circumference: " + ft.format(circumference));

    }

}
