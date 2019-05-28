public class Box {

    private double length;
    private double height;
    private double width;
    private boolean full=false;

    public Box(double length , double width, double height){

  this.length=length;
  this.width=width;
  this.height=height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lenght) {
        this.length = lenght;
    }

    public boolean isFull()//Check if there is 0 value of the Box if there is 0 the box is not full
    {
        int area=0;
        area=(int)(this.length*this.height*this.width);
        if(area!=0)
        {
            this.full=true;
        }
        return this.full;
    }



    public String toString(){
        return "Lenght: "+length+ " " +" Height"+ " " + height+ " Width:" +" "  +width+  " "+ "Is Full ? "+isFull();
}
}
