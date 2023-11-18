public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindorStudents = {
                new Griffindor("Гарри Поттер", 7, 8, 9, 6, 7),
                new Griffindor("Гермиона Грейнджер", 6, 10, 5, 8, 6),
                new Griffindor("Рон Уизли", 8, 7, 3, 10, 9),
        };

        Kogtevran[] kogtevransStudents = {
                new Kogtevran("Чжоу Чанг", 8, 9, 5, 4, 9, 8),
                new Kogtevran("Падма Патил", 7, 5, 4, 8, 5, 10),
                new Kogtevran("Маркус Белби", 8, 4, 10, 5, 3, 7),
        };

        Puffenduy[] puffenduysStudents = {
                new Puffenduy("Захария Смит", 8, 9, 3, 4, 8),
                new Puffenduy("Седрик Диггори", 9, 5, 8, 7, 4),
                new Puffenduy("Джастин Финч-Флетчли", 8, 7, 8, 5, 7),
        };

        Sleezereen[] sleezereensStudents = {
                new Sleezereen("Драко Малфой", 8, 9, 9, 5, 4, 3, 4),
                new Sleezereen("Грэхэм Монтегю", 7, 5, 8, 10, 7, 5, 2),
                new Sleezereen("Грегори Гойл", 7, 10, 8, 2, 5, 4, 10),
        };

        System.out.println(griffindorStudents[1].toString());
        System.out.println(sleezereensStudents[2].toString());
        System.out.println(puffenduysStudents[0].toString());
        System.out.println(kogtevransStudents[1].toString());

        griffindorStudents[1].compareStudents(puffenduysStudents[1]);
        griffindorStudents[0].compareStudents(griffindorStudents[1]);
        kogtevransStudents[2].compareStudents(kogtevransStudents[0]);
        kogtevransStudents[1].compareStudents(griffindorStudents[0]);
        puffenduysStudents[0].compareStudents(sleezereensStudents[0]);
        puffenduysStudents[2].compareStudents(puffenduysStudents[0]);
        sleezereensStudents[0].compareStudents(kogtevransStudents[1]);
        sleezereensStudents[0].compareStudents(griffindorStudents[0]);
        sleezereensStudents[2].compareStudents(sleezereensStudents[0]);
    }
}