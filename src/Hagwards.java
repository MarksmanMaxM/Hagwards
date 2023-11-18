public class Hagwards {
    private String name;
    private int magicPower;
    private int transgretiom;

    public Hagwards(String name, int magicPower, int transgretiom) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgretiom = transgretiom;
    }

    public void compareStudents(Hagwards student) {
        if (student == null) {
            System.out.println("Такого студента нет");
            return;
        }

        int power1 = magicPower + transgretiom;
        int power2 = student.getMagicPower() + student.getTransgretiom();
        if (power1 > power2) {
            System.out.println(name + " обладает большей силой магии, чем " + student.getName());
        } else {
            if (power1 == power2) {
                System.out.println(name + " равен по силе магии " + student.getName());
            } else {
                System.out.println(student.getName() + " обладает большей силой магии, чем " + name);
            }
        }
    }

    @Override
    public String toString() {
        return "У студента " + name + ":\n" +
                "magicPower=" + magicPower +
                ", transgretiom=" + transgretiom +
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgretiom() {
        return transgretiom;
    }

    public void setTransgretiom(int transgretiom) {
        this.transgretiom = transgretiom;
    }

}

