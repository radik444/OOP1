

public abstract class HogvardsStudents {
   private String name;
    private int witchcraft;
    private int transgress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public HogvardsStudents(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return String.format("Студент Хогвартса %s: cила магии - %d, сила транмгрессии: %d", name, witchcraft,transgress );
    }

    private int abilityHogvardsStudents(){
        return witchcraft + transgress;
    }
    public void compareHogvardsStudents(HogvardsStudents hogvardsStudents){
        int ability1 = abilityHogvardsStudents();
        int ability2 = hogvardsStudents.abilityHogvardsStudents();
        if ( ability1>ability2) {
            System.out.printf("Студент Хогвартса %s лучше студента Хогвартса %s (%d VS %d)%n", name, hogvardsStudents.name, ability1, ability2);
        } else if (ability2>ability1) {
            System.out.printf("Студент Хогвартса %s лучше студента Хогвартса %s (%d VS %d)%n", hogvardsStudents.name, name, ability2, ability1);
        } else {
            System.out.printf("Студент Хогвартса %s такой же, как и студент Хогвартса %s (%d VS %d)%n", hogvardsStudents.name,name,ability2,ability1);

        }

    }

    public void print(){
        System.out.println(this);
    }
    }

