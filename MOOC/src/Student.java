class Student implements Comparable<Student> {
    private  String name;
    private int StudentNumber;

    Student(String name, int StudentNumber) {
        this.name = name;
        this.StudentNumber = StudentNumber;
    }

    @Override
    public int compareTo(Student aStudent) {
//        if (this.StudentNumber < aStudent.StudentNumber)
//            return -1;
//        else if (this.StudentNumber == aStudent.StudentNumber)
//            return 0;
//        return 1;
//        we can also say
        return this.StudentNumber-aStudent.StudentNumber;
    }

    @Override
    public boolean equals(Object student) {
        Student aStudent = (Student) student;
        if (this == aStudent)
            return true;
        if (student == null)
            return false;
        if (this.getClass() != student.getClass())
            return false;
        return this.StudentNumber == aStudent.StudentNumber;


    }


    @Override
    public String toString(){
        return String.format("Student (name: %s,number: % d )",name,StudentNumber);
    }

    public static void main(String[] args) {
        array<Student> arr1= new array<>();
        arr1.addStart(new Student("peter",123));
        arr1.addStart(new Student("peter",124));
        arr1.addStart(new Student("peter",125));
        System.out.println(arr1);
    }
}
/**
 * 函数签名???
 * signature;
 */