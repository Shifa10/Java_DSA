import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String fruit= sc.next();

        switch (fruit){
            case "apple":
                System.out.println("keeps doctor away");
                break;

            case "mango":
                System.out.println("king of fruits");
                break;

            case "grapes":
                System.out.println("sweet fruit");
                break;

            default:
                System.out.println("Invalid");
        }

    }
}
