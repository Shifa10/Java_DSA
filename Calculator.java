import java.util.Scanner;

public class Calculator {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        //i/p from user
        int ans=0;
        while(true){
            System.out.println("enter the op");
            char op=sc.next().trim().charAt(0);
           // System.out.println();
            if(op=='+' || op=='-' || op=='/' || op=='%'){

                System.out.println("enter two no");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                //System.out.println();

                if(op== '+'){
                    ans = n1+n2;
                }

                if(op=='-'){
                    ans=n1-n2;
                }

                if(op== '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }
                if(op=='%'){
                    ans=n1%n2;
                }

            }else if(op=='x' || op=='X'){
                break;
            }else{
                System.out.println("Invalid op");
            }
            System.out.println(ans);

        }
    }
}
