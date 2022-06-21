public class GriffindorStudents extends HogvardsStudents {
    private int mobility;
    private int honor;
    private int bravery;

    public GriffindorStudents(String name, int witchcraft, int transgress, int mobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.mobility = mobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getMobility() {
        return mobility;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int ability() {
        return mobility + honor + bravery;
    }

    public void compareGriffindorStudents(GriffindorStudents griffindorStudents) {
        int ability1 = ability();
        int ability2 = griffindorStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d)%n", getName(), griffindorStudents.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент Гриффиндора %s лучше студента Гриффиндора %s (%d VS %d)%n", griffindorStudents.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент Гриффиндора %s такой же, как и студент Гриффиндора %s (%d VS %d)%n", griffindorStudents.getName(), getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return String.format(" %s, благородство - %d; честь - %d; храбрость -  %d", super.toString(), mobility,honor,bravery );
    }
}


