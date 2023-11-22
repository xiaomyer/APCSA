public class Elephant {
    String name;
    int peanutsEaten;

    public Elephant(String name) {
        this.name = name;
    }

    public void eatPeanuts(int peanuts) {
        this.peanutsEaten += peanuts;
    }

    public boolean isHappy() {
        return this.peanutsEaten >= 100;
    }
}