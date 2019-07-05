//Class that give the values for
// the box and check if all the values are there
public class Box {

    private double length;
    private double height;
    private double width;
    private boolean full=false;

    //Constructor for the box
    public Box(double length , double width, double height){

  this.length=length;
  this.width=width;
  this.height=height;

    }
    //Getters and setters
    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getLength() {
        return length;
    }

    private void setLength(double lenght) {
        this.length = lenght;
    }

    //Check if there is 0 value of the Box if there is 0 the box is not full
    public boolean isFull()
    {
        int area=0;
        area=(int)(this.length*this.height*this.width);
        if(area!=0)
        {
            this.full=true;
        }
        return this.full;
    }


    //ToString method that give the right output for the box
    public String toString(){
        return "Lenght: "+length+ " "
                +" Height"+ " "
                + height+ " Width:"
                +" "  +width+  " "
                + "Is Full ? "+isFull();
}
}
