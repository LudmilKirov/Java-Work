package inheritance;

public class main {
    public static void main(String[] args) {

       Point p1=new Point(2,2);
        Point p2=new Point(2,2);
        Point p3=new Point(2,1);

        if(p1.isEqualTo(p3))
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }
        System.out.println(p1);

        Circle c1=new Circle(2,2,5);
        System.out.printf("Circumference: %.2f\n",c1.calculateCircumference());
        System.out.printf("Area: %.2f\n",c1.calculateArea());
        System.out.println(c1);


        Cylinder cyl=new Cylinder(2,4,1,2);
        System.out.printf("Area: %.2f\n",cyl.calculateArea());
        System.out.printf("Volume: %.2f\n",cyl.calculateVolume());
        System.out.println(cyl);
    }
}
