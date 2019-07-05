package TutorialInheritance;

//Make a class that have similar fields
// for discs and subclasses that extends discs
public class Disc implements Digital, Physical {
    private String title;
    private String genre;
    private double runningTimeInMinutes;

    //Constructor
    public Disc(String title, String genre, double runningTime) {
        this.title = title;
        this.genre = genre;
        this.runningTimeInMinutes = runningTime;
    }
    //Getters and setters
    private String getTitle() {
        return title;
    }
    private void setTitle(String title) {
        this.title = title;
    }
    private String getGenre() {
        return genre;
    }
    private void setGenre(String genre) {
        this.genre = genre;
    }
    private double getRunningTime() {
        return runningTimeInMinutes;
    }
    private void setRunningTime(double runningTime) {
        this.runningTimeInMinutes = runningTime;
    }

    //Output for the Disc
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
