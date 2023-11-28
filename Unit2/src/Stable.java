public class Stable {
    private Horse horse1;
    private Horse horse2;

    public Stable(Horse horse1, Horse horse2) {
        this.horse1 = horse1;
        this.horse2 = horse2;
    }

    public void oldestRun() {
        if (this.horse1.getAge() == this.horse2.getAge()) return;
        if (this.horse1.getAge() > this.horse2.getAge()) {
            this.horse1.run();
        } else {
            this.horse2.run();
        }
    }

    public void renameYoungest() {
        if (this.horse1.getAge() == this.horse2.getAge()) return;
        if (this.horse1.getAge() < this.horse2.getAge()) {
            this.horse1.setName(horse1.getName() + " Junior");
        } else {
            this.horse2.setName(horse2.getName() + " Junior");
        }
    }
}
