public class PuffenduiStudents extends HogvardsStudents {

    private int industriousness;
    private int loyalty;
    private int garlic;

    public PuffenduiStudents(String name, int witchcraft, int transgress, int industriousness, int loyalty, int garlic) {
        super(name, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.garlic = garlic;
    }



    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getGarlic() {
        return garlic;
    }

    public void setGarlic(int garlic) {
        this.garlic = garlic;
    }

    private int ability() {
        return industriousness + loyalty + garlic;
    }

    public void comparePuffenduiStudents(PuffenduiStudents puffenduiStudents) {
        int ability1 = ability();
        int ability2 = puffenduiStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Пуффендуя %s лучше студента Пуффендуя %s (%d VS %d)%n", getName(), puffenduiStudents.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент Пуффендуя %s лучше студента Пуффендуя %s (%d VS %d)%n", puffenduiStudents.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Пуффендуя %s такой же, как и студент Пуффендуя %s (%d VS %d)%n", puffenduiStudents.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format(" %s, трудолюбие - %d; верность - %d; чесность -  %d", super.toString(), industriousness,loyalty,garlic );
    }
}

