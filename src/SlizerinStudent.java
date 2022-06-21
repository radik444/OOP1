public class SlizerinStudent extends GriffindorStudents {

    private int trick;
    private int determination;
    private int abiciosity;
    private int resourcefulness;
    private int lustForPower;

    public SlizerinStudent(String name, int witchcraft, int transgress, int mobility, int honor, int bravery, int trick, int determination, int abiciosity, int resourcefulness, int lustForPower) {
        super(name, witchcraft, transgress, mobility, honor, bravery);
        this.trick = trick;
        this.determination = determination;
        this.abiciosity = abiciosity;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
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

    public int getAbiciosity() {
        return abiciosity;
    }

    public void setAbiciosity(int abiciosity) {
        this.abiciosity = abiciosity;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int ability() {
        return trick + determination + abiciosity + resourcefulness + lustForPower;
    }

    public void compareSlizerinStudents(SlizerinStudent slizerinStudent) {
        int ability1 = ability();
        int ability2 = slizerinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Слизерина %s лучше студента Слизерина %s (%d VS %d)%n", getName(), slizerinStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент Слизерина %s лучше студента Слизерина %s (%d VS %d)%n", slizerinStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Слизерина %s такой же, как и студент Слизерина %s (%d VS %d)%n", slizerinStudent.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format(" %s, хитрость - %d; решительность - %d; амбициозность -  %d; находчивость - %d; жажда власти - %d", super.toString(), trick,determination,abiciosity,resourcefulness,lustForPower );
    }
}
