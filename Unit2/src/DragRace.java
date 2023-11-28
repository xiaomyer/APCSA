public class DragRace {
    private Car car1;
    private Car car2;

    public DragRace(Car car1, Car car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    public void go() {
        this.car1.accelerate((int) (Math.random() * (10 - 1 + 1)));
        this.car2.accelerate((int) (Math.random() * (10 - 1 + 1)));

        for (int i = 0; i < 5; i++) {
            this.car1.move();
            this.car2.move();
        }
    }

    public Car getWinner() {
        return this.car1.getPosition() == this.car2.getPosition() ? null
                : (this.car1.getPosition() > this.car2.getPosition() ? this.car1 : this.car2); // this nested lambda
                                                                                               // expression is really
                                                                                               // stupid but it's funny
    }
}
