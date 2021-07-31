package question3;
/*
Author Siyuan Zhu
 */
import java.util.ArrayList;

class Quiz{
    String testname;

    public Quiz(String name) {
        testname=name;
    }

    public Quiz() {

    }


    public void add(MultipleChoiceQuestion m) {
        ArrayList<String>question= new ArrayList<>();
        ArrayList<String[]> Answer=new ArrayList<>();
        question.add(m.MQ);
        Answer.add(m.MA);
    }
    public void add(FillinQuestion F){
        ArrayList<String>question=new ArrayList<>();
        ArrayList<String>answer=new ArrayList<>();
        question.add(F.MQ);
        answer.add(F.MA);
    }
}
class MultipleChoiceQuestion extends Quiz{
    String MQ,MA[];
   public MultipleChoiceQuestion(String question, String[] Answer){
       super();

       MQ=question;
        MA=Answer;
    }
}
class FillinQuestion extends Quiz{
    String MQ,MA;
    FillinQuestion(String question,String answer){
        super();
        MQ=question;
        MA=answer;
    }
}
public class TestQuiz {

    public static void main(String[] args) {
        Quiz q = new Quiz("java");
        q.add(new MultipleChoiceQuestion("What is your favorite programming language?",
                new String[] {"C++", "java", "Kotlin", "Rust"}));
        q.add(new FillinQuestion("What is the word for creating an object from a class?", "instantiate"));
        System.out.println(q); // print the quiz and all questions

    }
}
