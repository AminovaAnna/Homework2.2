public class Puffendui extends Hogwarts{
    private int hardWork; //трудолюбие
    private int loyalty;    //верность
    private int honesty;    //честность

    public Puffendui(String name, String surname, int spellPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, surname, spellPower,transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }


    public int sumP (){
        return getHardWork() + getLoyalty() + getHonesty();
    }
    public void compare(Puffendui other){
        int thisPower = sumP();
        int otherPower = other.sumP();
        if (thisPower> otherPower){
            System.out.println(getName() + " "+ getSurname() + " - лучший ученик Пуффендуй - " + sumP() + " баллов магии");
        } else if (thisPower == otherPower){
            System.out.println("баллы магии равны " + sumP() + ". " + getName() + " "+ getSurname() + " и " +
                    other.getName() + " "+ other.getSurname() + " лучшие ученики Пуффендуй");
        } else {
            System.out.println(other.getName() + " "+ other.getSurname() + "- лучший ученик Пуффендуй - " + other.sumP() + " баллов магии");
        }
    }

    @Override
    public String toString() {
        return "Puffendui. " + super.toString() +
                ", hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}
