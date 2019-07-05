package TutorialInheritance;

public class Book extends Item{

    private String genre;
    private String typeOfCover;
    private String authorName;
    //Constructor
    public Book(String title,String nameOfThePrintingHouse, int yearOfPublishing,  int pages,String genre,String typeOfCover,String authorName) {
        super(title,nameOfThePrintingHouse,yearOfPublishing,authorName,pages);
        this.genre = genre;
        this.typeOfCover = typeOfCover;
        this.authorName=authorName;
    }
    //Getters and setters
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getTypeOfCover() {
        return typeOfCover;
    }
    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }
    //Output for the book
    @Override
    public String toString() {
        return super.toString() + "\nGenre - "+genre+"\nType of cover - "+typeOfCover+"\nAuthor - "+authorName+"\n";
    }
}
