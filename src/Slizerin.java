public class Slizerin extends Hogwarts {
    private int trick;  //хитрость
    private int determination;  //решительность
    private int ambition;   //амбициозность
    private int resource; //находчивость
    private int thirstForControl;   //жажда власти

    public Slizerin(String name, String surname, int spellPower, int transgressionDistance, int trick, int determination, int ambition, int resource, int thirstForControl) {
        super(name, surname, spellPower,transgressionDistance);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.thirstForControl = thirstForControl;
    }



    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getThirstForControl() {
        return thirstForControl;
    }

    public void setThirstForControl(int thirstForControl) {
        this.thirstForControl = thirstForControl;
    }


    public int sumS(){
        return getTrick() + getDetermination() + getAmbition() + getResource() + getThirstForControl();
    }

    public void compare(Slizerin other){
        int thisPower = sumS();
        int otherPower = other.sumS();
        if (thisPower > otherPower){
            System.out.println(getName() + " "+ getSurname() + " - лучший ученик Слизерин - " + sumS() + " баллов магии");
        } else if (thisPower == otherPower){
            System.out.println("баллы магии равны " + sumS() + ". " + getName() + " "+ getSurname() + " и " +
                    other.getName() + " "+ other.getSurname() + " лучшие ученики Слизерин");
        } else {
            System.out.println(other.getName() + " "+ other.getSurname() + "- лучший ученик Пуффендуй - " + other.sumS() + " баллов магии");
        }
    }
    @Override
    public String toString() {
        return "Slizerin. " + super.toString() +
                ", trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resource=" + resource +
                ", thirstForControl=" + thirstForControl;
    }
}
