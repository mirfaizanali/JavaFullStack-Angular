package JAVA.OOPS.Project1;

public class Question{
    private int id;
    private  String question;
    private int opt1;
    private int opt2;
    private String answer;

    public Question(int id, String question, int opt1, int opt2, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getOpt1() {
        return opt1;
    }

    public void setOpt1(int opt1) {
        this.opt1 = opt1;
    }

    public int getOpt2() {
        return opt2;
    }

    public void setOpt2(int opt2) {
        this.opt2 = opt2;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", opt1=" + opt1 +
                ", opt2=" + opt2 +
                ", answer='" + answer + '\'' +
                '}';
    }
}