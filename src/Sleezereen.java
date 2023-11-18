public class Sleezereen extends Hagwards {
    private int cunning;
    private int resolve;
    private int ambitiousness;
    private int resourcefulness;
    private int lustOfPower;

    public Sleezereen(String name, int magicPower, int transgretiom, int cunning, int resolve, int ambitiousness, int resourcefulness, int lustOfPower) {
        super(name, magicPower, transgretiom);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    @Override
    public String toString() {
        return "У студента " + getName() + ":\n" +
                "magicPower=" + getMagicPower() +
                ", transgretiom=" + getTransgretiom() +
                "cunning=" + cunning +
                ", resolve=" + resolve +
                ", ambitiousness=" + ambitiousness +
                ", resourcefulness=" + resourcefulness +
                ", lustOfPower=" + lustOfPower +
                "\n";
    }

    public void compareStudents(Sleezereen student) {

        if (student == null) {
            System.out.println("Такого студента нет");
            return;
        }

        int power1 = cunning + resolve + ambitiousness + resourcefulness + lustOfPower;
        int power2 = student.getCunning() + student.getResolve() + student.getAmbitiousness() + student.getResourcefulness() + student.getLustOfPower();

        if (power1 > power2) {
            System.out.println(getName() + " лучший слизеринец, чем " + student.getName());
        } else {
            if (power1 == power2) {
                System.out.println(getName() + " равен " + student.getName());
            } else {
                System.out.println(student.getName() + " лучший слизеринец, чем " + getName());
            }
        }

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }
}
