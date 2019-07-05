package ex13;
//Make a program the calculate the
// matching area of two rectangles
public class main {
    public static void main(String[] args) {
        //Set the two rectangles
        Rectangles boy=new Rectangles(20,10,20,20);
        Rectangles girl=new Rectangles(2,2,2,3);

        boy.calculatArea(boy,girl);
    }
}
