package ex13;

import inheritance.Manager;

public class Rectangles {

    private int left;
    private int bottomY;
    private int width;
    private int height;




    public Rectangles(int left, int bottomY, int width, int height) {
        this.left = left;
        this.bottomY = bottomY;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getBottomY() {
        return bottomY;
    }

    public void setBottomY(int bottomY) {
        this.bottomY = bottomY;
    }


    public boolean isMatching(Rectangles boy,Rectangles girl){

        //Set the right and the top value for the first rectangle
        int boyRight=boy.left+boy.width;
        int boyTop=boy.bottomY+boy.height;
        //Set the right and the top value for the second rectangle
        int girlRight=girl.left+girl.width;
        int girlTop=girl.bottomY+girl.height;
        //Check if the two rectangles are not matching
        return boyRight<girl.left||girlRight<boy.left||boyTop<girl.bottomY||girlTop<boy.bottomY;
    }

    //TODO add calculate area

    public void calculatArea(Rectangles boy,Rectangles girl){
        int area=0;
        //Set the right and the top value for the first rectangle
        int boyRight=boy.left+boy.width;
        int boyTop=boy.bottomY+boy.height;
        //Set the right and the top value for the second rectangle
        int girlRight=girl.left+girl.width;
        int girlTop=girl.bottomY+girl.height;

        int maxLeft,maxBottom,minRight,minTop;

        //if there is not matching there is no need to calculate area
        //,just prints the result
        if(isMatching(boy,girl)){
            System.out.printf("Not matching.\nArea: %d",area);
        }
        else{

            //Get the max left,min right, max bottom and
            //min top value to get clarity where on the coordinate os
            //are the matching points of the two rectangles
            maxLeft=Math.max(boy.left,girl.left);
            minRight= Math.min(boyRight,girlRight);
            maxBottom=Math.max(boy.bottomY,girl.bottomY);
            minTop=Math.min(boyTop,girlTop);

            area = (minTop - maxBottom) * (minRight - maxLeft);

            System.out.printf("Matching points: \n leftX %d\nrightX %d\nbottomY %d\ntopY %d\nArea: %d",maxLeft,minRight,maxBottom,minTop,area);
        }
    }

}

