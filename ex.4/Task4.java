//Make a program that generates random radius and
// height for 1 to 10 include.From this values
// to calculate the volume and surface
public class Task4 {
    public static void main(String[] args) {

        final double PI=3.14;
        //Because random gives a double
        // betwen 0-1 multiply it by 9 and add 1
        double radius = Math.random()*9+1;
        double height=Math.random()*9+1;
        //Get the double values round
        // for the radius and height
        double roundRadius=Math.round(radius);
        double roundHeight=Math.round(height);
        //Calculate the volume and the surface
        double capacity =PI*roundRadius*roundRadius*roundHeight;
        double surface=2*PI*roundRadius*roundHeight;

        System.out.printf("Capacity = %.2f\nSurface = %.2f",capacity,surface);
    }
}
