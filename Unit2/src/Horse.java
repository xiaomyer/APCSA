public class Horse {
    private String name;
    private int age;

    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.printf("%s is running", this.name);
    }
}
