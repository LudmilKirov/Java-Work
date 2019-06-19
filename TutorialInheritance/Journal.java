package TutorialInheritance;

public class Journal extends Item implements Publishing {
    public Journal(String title,String nameOfThePrintingHouse, int yearOfPublishing, String authorName, int pages) {
        super(title, nameOfThePrintingHouse, yearOfPublishing, authorName, pages);
    }

    @Override
    public int periodBetweenPublishingInDays() {
        return 31;
    }
    @Override
    public String toString() {
        return super.toString()+"\nPeriod of publishing - "+periodBetweenPublishingInDays()+"\n";
    }
}
