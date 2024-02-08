import java.util.Arrays;

public class Classroom {
    private int numStudents;
    private Student[] kids;

    public Classroom() {
        this.kids = new Student[30];
    }

    public void addStudent(Student newStudent) {
        this.kids[numStudents] = newStudent; // numStudents is initially 0, so first student adds to first index. since the number of students is always 1 greater than the last index, this works
        this.numStudents++;
    }

    public float classAverage() {
        int sum = 0;
        for (Student s : this.kids) {
            if (s == null) break; // the first one that is null means there are no more students
            sum += s.getAverage();
        }
        return (float) sum / this.numStudents;
    }

    public Student[] findHonorRoll() {
        Student[] honorRoll = new Student[30];
        int numHonorRoll = 0;
        for (int i = 0; i < this.kids.length; i++) {
            if (this.kids[i] == null) break;
            if (this.kids[i].getAverage() > 90) {
                honorRoll[numHonorRoll] = this.kids[i];
                numHonorRoll++;
            }
        }
        return honorRoll;
    }

    public static void main(String []args) {
        Student s1 = new Student("Lia", 100, 100, 100); 
        Student s2 = new Student("Myer", 65, 50, 17); 
        Classroom myClass = new Classroom(); 
        myClass.addStudent(s1);
        myClass.addStudent(s2);  
        System.out.println(myClass.classAverage());
        System.out.println(Arrays.toString(myClass.findHonorRoll()));
    }
}
