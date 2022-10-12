package pl.edu.pb.wi;

public class Question {
    public int getQuestionId() {
        return questionId;
    }

    private int questionId;

    public boolean isTrueAnswer() {
        return trueAnswer;
    }

    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer) {
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }
}
