import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry", "Potter", 90,50,80,80,80);
        Griffindor hermiona = new Griffindor("Hermiona","Granger", 50,50,70,70,75);
        Griffindor ron = new Griffindor("Ron", "Weasley", 45,60,65,70,50);

        Slizerin drako = new Slizerin("Drako", "Malfoy", 80, 55, 50, 64, 80,60,70);
        Slizerin grehem = new Slizerin("Grehem", "Montegru", 85,60,60,55,40,45,50);
        Slizerin greghory = new Slizerin("Greghory", "Goyl", 40,45,60,50,20,30, 45);

        Puffendui zahariya = new Puffendui("Zahariya", "Smith", 60,50,50,70,70);
        Puffendui sedryck = new Puffendui("Sedryck", "Diggory", 70,60,70,75,40);
        Puffendui justin = new Puffendui("Justin", "Finch-Fletchly", 40,50,50,50,50);

        Kogtevran chzhoy = new Kogtevran("Chzhoy", "Chang", 60,50,70,50, 60,75);
        Kogtevran padma = new Kogtevran("Padma", "Patil", 70,65,55,80,50,60);
        Kogtevran marcus = new Kogtevran("Marcus", "Belby", 50,45,60,60,75,60);


        System.out.println( );
        System.out.println(harry.toString());
        System.out.println( );
        System.out.println(drako.toString());
        System.out.println( );
        System.out.println(sedryck.toString());
        System.out.println( );
        System.out.println(padma.toString());
        System.out.println( );


        System.out.println(harry.sumG());
        System.out.println( );
        hermiona.compare(ron);
        System.out.println( );
        grehem.compare(greghory);
        System.out.println( );
        justin.compare(zahariya);
        System.out.println( );
        marcus.compare(chzhoy);
        System.out.println( );
        harry.compareAll(sedryck);
        sedryck.compareAll(drako);

    }
}