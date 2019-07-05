package TutorialInheritance;
//Make a disk change station
public class MainDisc {
    public static void main(String[] args) {

        Disc cd = new CD("Rap God", "RnB", 70.24, 24, "Eminem");
        Disc dvd = new DVD("Die Hard", "Action", 125, "M", "Bruce Willis", "Not me", true);
        Disc blueRay=new BlueRay("LOTR","Fantasy",455,"M","Legolas","Spielberg",true,true);

        System.out.println(cd);
        System.out.println(dvd);
        System.out.println(blueRay);
        blueRay.physicalDisc();
        dvd.Digital();

    }
}

