public class Griffindor extends Hagwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transgretiom, int nobility, int honor, int bravery) {
        super(name, magicPower, transgretiom);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "У студента " + getName() + ":\n" +
                "magicPower=" + getMagicPower() +
                ", transgretiom=" + getTransgretiom() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "\n";
    }


    public void compareStudents(Griffindor student) {

        if (student == null) {
            System.out.println("Такого студента нет");
            return;
        }

        int power1 = nobility + honor + bravery;
        int power2 = student.getBravery() + student.getHonor() + student.getNobility();

        if (power1 > power2) {
            System.out.println(getName() + " лучший гриффиндорец, чем " + student.getName());
        } else {
            if (power1 == power2) {
                System.out.println(getName() + " равен " + student.getName());
            } else {
                System.out.println(student.getName() + " лучший гриффиндорец, чем " + getName());
            }
        }

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
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
}
