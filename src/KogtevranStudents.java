public class KogtevranStudents extends HogvardsStudents {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
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

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public KogtevranStudents(String name, int witchcraft, int transgress, int mind, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    private int ability() {
        return mind + wisdom + wit + creativity;
    }

    public void compareKogtevranStudents(KogtevranStudents kogtevranStudents) {
        int ability1 = ability();
        int ability2 = kogtevranStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Когтеврана %s лучше студента Когтеврана %s (%d VS %d)%n", getName(), kogtevranStudents.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент Когтеврана %s лучше студента Когтеврана %s (%d VS %d)%n", kogtevranStudents.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Когтеврана %s такой же, как и студент Когтеврана %s (%d VS %d)%n", kogtevranStudents.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format(" %s, ум - %d; мудрость - %d; остроумие - %d; творчуство - %d", super.toString(), mind,wisdom,wit,creativity );
    }
}

