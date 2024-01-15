public class Student{
    private String name;
    private String university;
    private int age;
    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.university = builder.university;
        this.age = builder.age;
    }
    static class StudentBuilder{
        private final String name;
        private final String university;
        private int age;
        public StudentBuilder(String name, String university){
            this.name = name;
            this.university = university;
        }
        public StudentBuilder Age(int age){
            this.age = age;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("name :"+ name + "\n").append("university :"+university+ "\n");
        if(this.age != 0){
            sb.append("age :"+age+ "\n");
        }
        return sb.toString();
    }
}