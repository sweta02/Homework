package hw1;

public class Voting {
    // HW 1 :this is to check if the candidate aged 19 is eligible to vote

    public static void main(String[] args) {
        int age = 19;

        if(age>= 18){
            System.out.println("This person is eligible to vote");

        }else {
            System.out.println("This person is not eligible to vote");
        }


    }
}
