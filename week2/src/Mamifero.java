public class Mamifero extends Animal     {

    private boolean canFly;
    private int numExtremidades;

    public Mamifero(String name, int age, String gender, boolean canFly, int numExtremidades) {
        //new Animal(name, age, gender)
        super(name, age, gender);
        this.canFly = canFly;
        this.numExtremidades = numExtremidades;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }
}
