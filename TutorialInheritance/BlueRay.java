package TutorialInheritance;

//This is BlueRay class that store also movies
// ,so it extends DVD and add a is4K field
public class BlueRay extends DVD{
    private boolean is4K;
    //Constructor
    public BlueRay(String title, String genre, int runningTime, String ageCertificate, String leadActor, String director, boolean moreThan1Disc, boolean is4K) {
        super(title, genre, runningTime, ageCertificate, leadActor, director, moreThan1Disc);
        this.is4K = is4K;
    }
    //Getters and setters
    public boolean isIs4K() {
        return is4K;
    }
    public void setIs4K(boolean is4K) {
        this.is4K = is4K;
    }
    //Output for the BlueRay
    @Override
    public String toString() {
        return super.toString()+"Is it 4K - " + is4K;
    }
}
