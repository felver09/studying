
package studying;
public class Problem {
    
    private String question;
    private String answer;
    private boolean reviewAgain;
    
    public Problem(String question, String answer){
        this.question = question;
        this.answer = answer;
        this.reviewAgain = false;
    }
    public String getQuestion(){
        return this.question;
    }
    public void setQuestion(String quest){
        this.answer = this.answer + quest;
    }
    public String getAnswer(){
        return this.answer;
    }
    public void setAnswer(String ans){
        this.answer = this.answer + ans;
    }
    public boolean getReviewAgain(){
        return this.reviewAgain;
    } 
    public void setReviewAgain(boolean again){
        this.reviewAgain = again;
    }
    
    public String displayQuestion(){
        return "The question is: "+ this.getQuestion();
    }
    public String displayAnswer(){
        return "The answer is: " + this.getAnswer();
    }
}
