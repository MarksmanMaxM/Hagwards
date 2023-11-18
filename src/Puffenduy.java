public class Puffenduy extends Hagwards {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int magicPower, int transgretiom, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgretiom);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "У студента " + getName() + ":\n" +
                "magicPower=" + getMagicPower() +
                ", transgretiom=" + getTransgretiom() +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "\n";
    }

    public void compareStudents(Puffenduy student) {

        if (student == null) {
            System.out.println("Такого студента нет");
            return;
        }

        int power1 = diligence + loyalty + honesty;
        int power2 = student.getDiligence() + student.getLoyalty() + student.getHonesty();

        if (power1 > power2) {
            System.out.println(getName() + " лучший пуффендуец, чем " + student.getName());
        } else {
            if (power1 == power2) {
                System.out.println(getName() + " равен " + student.getName());
            } else {
                System.out.println(student.getName() + " лучший пуффендуец, чем " + getName());
            }
        }

    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
