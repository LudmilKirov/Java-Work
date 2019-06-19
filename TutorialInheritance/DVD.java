package TutorialInheritance;

//This is DVD class that store movies
public class DVD extends Disc{
    private String ageCertificate;
    private String leadActor;
    private String Director;
    private boolean moreThan1Disc;

    public DVD(String title, String genre, int runningTime, String ageCertificate, String leadActor, String director, boolean moreThan1Disc) {
        super(title, genre, runningTime);
        this.ageCertificate = ageCertificate;
        this.leadActor = leadActor;
        Director = director;
        this.moreThan1Disc = moreThan1Disc;
    }

    public String getAgeCertificate() {
        return ageCertificate;
    }

    public void setAgeCertificate(String ageCertificate) {
        this.ageCertificate = ageCertificate;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public boolean isMoreThan1Disc() {
        return moreThan1Disc;
    }

    public void setMoreThan1Disc(boolean moreThan1Disc) {
        this.moreThan1Disc = moreThan1Disc;
    }


    @Override
    public String toString() {
        return super.toString() +" ageCertificate='" + ageCertificate + '\'' +
                ", leadActor='" + leadActor + '\'' +
                ", Director='" + Director + '\'' +
                ", moreThan1Disc=" + moreThan1Disc;
    }
}
