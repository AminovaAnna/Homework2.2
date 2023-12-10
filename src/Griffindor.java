public class Griffindor extends Hogwarts {
    private int nobility;   //благородство
    private int honor;  //честь
    private int brave;  //храбрость

    public Griffindor(String name, String surname, int spellPower, int transgressionDistance, int nobility, int honor, int brave) {
        super(name, surname, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    @Override
    public String toString() {
        return "Griffindor. " + super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", brave=" + brave;
    }
}
