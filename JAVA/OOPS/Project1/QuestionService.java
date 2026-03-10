package JAVA.OOPS.Project1;

import java.util.Scanner;

public class QuestionService{

    Question[] ques = new Question[3];
    String selection[] = new String[3];

    public void addQuestion(){
        ques[0] = new Question(1,"Size of int",5,4,"4");
        ques[1] = new Question(2,"Size of Char",5,1,"1");
        ques[2] = new Question(3,"Size of byte",12,1,"12");

    }

    public void display(){
        int i =0;
        for(Question q: ques){
            System.out.println("Question number: " + q.getId() + " " + q.getQuestion());
            System.out.println(q.getOpt1() + " " + q.getOpt2() + " ");
            System.out.print("Answer: ");
            Scanner sc = new Scanner(System.in);
            selection[i]= sc.nextLine();
            i++;

        }
    }

    public void score(){
        int score = 0;

        for(int i=0;i<ques.length;i++){
            Question que = ques[i];
            String ans = que.getAnswer();
            String currentAns = selection[i];
            if(currentAns.equals(ans)){
                score++;
            }
        }
        System.out.println("The score is " + score);
    }

}