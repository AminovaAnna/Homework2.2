public class Hogwarts {
    private String name;
    private String surname;
    private int spellPower; // мощность колдовства
    private int transgressionDistance;  //расстояние трансгрессии

    public Hogwarts(String name, String surname, int spellPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", spellPower=" + spellPower +
                ", transgressionDistance=" + transgressionDistance;
    }


}


