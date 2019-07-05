package TutorialInheritance;
//Make a bookstore
public class Main {
    public static void main(String[] args) {

        Item vinetu=new Book("Vinety","Pechatnica",1970,566,"horror","hard","Mai");
        Item journal=new Journal("Za jenata","Pechatnica 2",2013,"Blagoi",22);
        Item newspapper=new Newspapper("trud","Pechatnica 3",2011,"Pesho",44);

        System.out.println(vinetu);
        System.out.println(journal);
        System.out.println(newspapper);
    }
}
