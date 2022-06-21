import java.util.Random;

public class Main {


    public static void main(String[] args){
        GriffindorStudents harry = new GriffindorStudents("Гарри Поттер",99,96,99,48,84);
        GriffindorStudents germiona = new GriffindorStudents("Гермиона Грейнджер", 97,87,48,95,65);
        GriffindorStudents ron = new GriffindorStudents("Рон Уизли",95,75,84,25,47);

        KogtevranStudents chjou = new KogtevranStudents("Чжоу Чанг",95,45,78,65,41,25);
        KogtevranStudents padma = new KogtevranStudents("Падма Патил",85,47,96,97,78,85);
        KogtevranStudents markus = new KogtevranStudents("Маркус Белби",95,47,98,75,25,75);

        PuffenduiStudents smit = new PuffenduiStudents("Захария Смит", 95,98,75,75,74);
        PuffenduiStudents sendrik = new PuffenduiStudents("Сендрик Диггори",99,75,95,85,55);
        PuffenduiStudents finch = new PuffenduiStudents("Джастин Финч",95,75,95,87,21);

        SlizerinStudent drako = new SlizerinStudent("Драко Малфой",95,75,98,58,45,78,69,78,78,58);
        SlizerinStudent montegy = new SlizerinStudent("Грэхэм Монтегю",85,78,58,58,78,58,52,65,98,78);
        SlizerinStudent grigoriy = new SlizerinStudent( "Грегори Гойл",78,58,98,78,91,93,95,97,35,58);


        harry.print();

        harry.compareGriffindorStudents(ron);
        harry.compareHogvardsStudents(drako);

        smit.compareHogvardsStudents(ron);




    }

    }

