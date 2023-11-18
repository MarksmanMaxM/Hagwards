public class Kogtevran extends Hagwards {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int magicPower, int transgretiom, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgretiom);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "У студента " + getName() + ":\n" +
                "magicPower=" + getMagicPower() +
                ", transgretiom=" + getTransgretiom() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "\n";
    }

    public void compareStudents(Kogtevran student) {

        if (student == null) {
            System.out.println("Такого студента нет");
            return;
        }

        int power1 = mind + wisdom + wit + creativity;
        int power2 = student.getMind() + student.getWisdom() + student.getWit() + student.getCreativity();

        if (power1 > power2) {
            System.out.println(getName() + " лучший когтевранец, чем " + student.getName());
        } else {
            if (power1 == power2) {
                System.out.println(getName() + " равен " + student.getName());
            } else {
                System.out.println(student.getName() + " лучший когтевранец, чем " + getName());
            }
        }

    }

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
}
