package inheritance;

public class Point {
    private double xCordinate;
    private double yCordinate;
    //First constructor
    public Point() {
    }
    //Second constructor
    public Point(double xCordinate, double yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }

    //Getters and setters
    private double getxCordinate() {
        return xCordinate;
    }
    private void setxCordinate(double xCordinate) {
        this.xCordinate = xCordinate;
    }
    private double getyCordinate() {
        return yCordinate;
    }
    private void setyCordinate(double yCordinate) {
        this.yCordinate = yCordinate;
    }

    //Check if the x and y cordinates of the 2 object are the same
    public boolean isEqualTo(Point point){
        if(this.xCordinate==point.xCordinate&&this.yCordinate==point.yCordinate)
        {
            return true;
        }
        else{
            return false;
        }
    }
    //Output for the point
    @Override
    public String toString() {
        return   "Point: "+
                "xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate;
    }
}
