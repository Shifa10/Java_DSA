import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int empID=sc.nextInt();
        String department=sc.next();

        switch(empID){
            case 1:
            System.out.println("kunal");
            break;

            case 2:
                System.out.println("shifa");
                break;

            case 3:
                System.out.println("emp number 3");
                switch(department){

                    case "IT":
                        System.out.println("IT department");
                        break;

                    case "management":
                        System.out.println("management department");
                        break;

                    default:
                        System.out.println("Invalid");
                }
                break;
            default:
                System.out.println("correct empID");
        }
    }
}
