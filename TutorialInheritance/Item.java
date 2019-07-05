package TutorialInheritance;

//Make a program that has a master class and subclasses that
// extend it's logic have a interface for the period of publishing
// use the appropriate toString method for the
// master class and override it for the subclasses
public  class Item {
    private String title;
    private String nameOfThePrintingHouse;
    private int yearOfPublishing;
    private int pages;

    //Constructor
    public Item( String title,String nameOfThePrintingHouse, int yearOfPublishing, String authorName, int pages) {
        this.title=title;
        this.nameOfThePrintingHouse=nameOfThePrintingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
    }

    //Getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getNameOfThePrintingHouse() {
        return nameOfThePrintingHouse;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    //Output for the Item
    @Override
    public String toString() {
        return   "Title: "+title+
                "\nPrinting House: "+nameOfThePrintingHouse+
                "\nYear Of Publishing - " + yearOfPublishing +
                "\nPages - " + pages ;
    }
}
