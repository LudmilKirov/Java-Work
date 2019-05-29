public class Task4 {
    public static void main(String[] args) {

        final double PI=3.14;

        double radius = Math.random()*9+1;//Because random gives a double betwen 0-1 multiply it by 9 and add 1
        double height=Math.random()*9+1;

        double roundRadius=Math.round(radius);
        double roundHeight=Math.round(height);

        double capacity =PI*roundRadius*roundRadius*roundHeight;
        double surface=2*PI*roundRadius*roundHeight;

        System.out.printf("Capacity = %.2f\nSurface = %.2f",capacity,surface);
    }
}
