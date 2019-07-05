package TutorialInheritance;

public class Journal extends Item implements Publishing {
    //Constructor
    public Journal(String title,String nameOfThePrintingHouse, int yearOfPublishing, String authorName, int pages) {
        super(title, nameOfThePrintingHouse, yearOfPublishing, authorName, pages);
    }

    //Override a period between publishing
    @Override
    public int periodBetweenPublishingInDays() {
        return 31;
    }
    //Output for the Journal
    @Override
    public String toString() {
        return super.toString()+"\nPeriod of publishing - "+periodBetweenPublishingInDays()+"\n";
    }
}
