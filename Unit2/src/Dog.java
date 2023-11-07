public class Dog {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        if (age < 3)
            System.out.printf("%s says woof!", this.name);
        else 
            System.out.printf("%s says WOOF!", this.name);
    }

    public int humanAge() {
        return this.age / 7;
    }
}
