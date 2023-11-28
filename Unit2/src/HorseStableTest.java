public class HorseStableTest {
    public static void main(String[] args) {
        Horse horse1 = new Horse("Galileo", 9);
        Horse horse2 = new Horse("Bella", 13);

        Stable sunshineFarms = new Stable(horse1, horse2);
        sunshineFarms.oldestRun(); // this would print “Bella is running”
        sunshineFarms.renameYoungest();// renames “Galileo” to “Galileo Junior”
        System.out.println(horse1.getName());
    }
}
