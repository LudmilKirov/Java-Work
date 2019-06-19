package TutorialInheritance;

public class Newspapper extends Item implements Publishing {
    public Newspapper(String title,String nameOfThePrintingHouse, int yearOfPublishing, String authorName, int pages) {
        super(title, nameOfThePrintingHouse,yearOfPublishing, authorName, pages);
    }
    //Set the period of publishing by days
    @Override
    public int periodBetweenPublishingInDays() {
        return 7;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPeriod of publishing - "+periodBetweenPublishingInDays()+"\n";
    }
}
