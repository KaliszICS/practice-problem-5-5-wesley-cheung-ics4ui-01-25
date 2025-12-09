class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String studentNumber;

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "N:" + this.name + " A:" + this.age + " SN:" + this.studentNumber;
    }

    @Override
    public int compareTo(Student student) {
        if (this.studentNumber == student.getStudentNumber()) {
            return 0;
        } else if (Integer.parseInt(this.studentNumber) < Integer.parseInt(student.getStudentNumber())) {
            return -1;
        } else {
            return 1;
        }
    }
}