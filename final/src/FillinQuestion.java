//rules of java beans
//it  implement Serializable and have a public no-arg constructor.
//All properties in java bean must be private with public getters and setter methods.
public class FillinQuestion {
    private String question,answer;
    public FillinQuestion()
    {
    }
    public void setQuestion(String question)
    {
        this.question = question;
    }
    public String getQuestion()
    {
        return question;
    }
    public void setAnswer(String answer)
    {
        this.answer=answer;
    }
    public String getAnswer()
    {
        return answer;
    }
}
}
