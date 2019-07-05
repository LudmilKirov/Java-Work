package TutorialInheritance;

//This is CD class that we store songs in it
public class CD extends Disc{
    private int numberOfTracks;
    private String artist;
    //Constructor
    public CD(String title, String genre, double runningTimeInMinutes, int numberOfTracks, String artist) {
        super(title, genre, runningTimeInMinutes);
        this.numberOfTracks = numberOfTracks;
        this.artist = artist;
    }
    //Getters and setters
    public int getNumberOfTracks() {
        return numberOfTracks;
    }
    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    //Output for the CD
    @Override
    public String toString() {
        return super.toString()+" numberOfTracks=" + numberOfTracks +
                ", artist='" + artist;
    }
}
