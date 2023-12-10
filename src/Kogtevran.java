public class Kogtevran extends Hogwarts {
    private int brain; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creation; //творчество

    public Kogtevran(String name, String surname, int spellPower, int transgressionDistance, int brain, int wisdom, int wit, int creation) {
        super(name, surname, spellPower, transgressionDistance);
        this.brain = brain;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int sumK() {
        return getBrain() + getWisdom() + getWit() + getCreation();
    }

    public void compare (Kogtevran other){
        int thisPower = sumK();
        int otherPower = other.sumK();
        if (thisPower > otherPower) {
            System.out.println(getName() + " "+ getSurname() + " - лучший ученик Когтевран - " + sumK() + " баллов магии");
        }
        else if (thisPower == otherPower){
            System.out.println("баллы магии равны " + sumK() + ". " + getName() + " "+ getSurname() +  " и " +
                    other.getName() + " "+ getSurname() +  " лучшие ученики Когтевран");
        }
        else {
            System.out.println(other.getName() + " "+ other.getSurname() +  "- лучший ученик Когтевран - " + other.sumK() + " баллов магии");
        }
    }


    @Override

    public String toString() {
        return "Kogtevran. " + super.toString() +
                ", brain=" + brain +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation;
    }
}
