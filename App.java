public class App {
    public static void main(String[] args) {
        Student chollada = new Student.StudentBuilder("lowma", "KMITL")
            .Age(21)
            .build();
        Student chollada2 = new Student.StudentBuilder("lowma2", "KMITL")
            .build();
        System.out.println(chollada);
        System.out.println(chollada2);
    }
    
}
