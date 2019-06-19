package TutorialInheritance;

//Make a class that have similar fields
// for discs and subclasses that extends discs
public class Disc implements Digital, Physical {
    private String title;
    private String genre;
    private double runningTimeInMinutes;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRunningTime() {
        return runningTimeInMinutes;
    }

    public void setRunningTime(double runningTime) {
        this.runningTimeInMinutes = runningTime;
    }

    public Disc(String title, String genre, double runningTime) {
        this.title = title;
        this.genre = genre;
        this.runningTimeInMinutes = runningTime;
    }

    @Override
    public String toString() {
        return
                "Title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", runningTimeInMinutes=" + runningTimeInMinutes
               ;
    }


    @Override
    public void Digital() {
        System.out.println("I am digital disc");
    }

    @Override
    public void physicalDisc() {
        System.out.println("Good old times");
    }
}
