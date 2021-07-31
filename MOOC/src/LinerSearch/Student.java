package LinerSearch;

class Student {
    private String name;
    private int StudentNumber;

    Student(String name, int StudentNumber) {
        this.name = name;
        this.StudentNumber = StudentNumber;
    }

    @Override
    public boolean equals(Object student) {
        Student aStudent = (Student) student;
        if (this == aStudent)
            return true;
        if (student==null)
            return false;
        if (this.getClass()!=student.getClass())
            return false;
     return this.StudentNumber==aStudent.StudentNumber;


    }


}
/**
 * 函数签名???
 * signature;
 */