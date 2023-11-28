public class Kennel {
    private Dog d1, d2, d3;

    public Kennel(Dog a, Dog b, Dog c) {
        this.d1 = a;
        this.d2 = b;
        this.d3 = c;
    }

    public void allSpeak() {
        this.d1.bark();
        this.d2.bark();
        this.d3.bark();
    }

    public Dog getOldest() {
        if(d1.humanAge() > d2.humanAge() && d1.humanAge() > d3.humanAge()) return d1;
        if(d2.humanAge() > d1.humanAge() && d2.humanAge() > d3.humanAge()) return d1;
        return d3;
    }

    public static void main(String[] args) {
        Kennel kennel1 = new Kennel(new Dog("a"), new Dog("b"), new Dog("c"));
    }
}