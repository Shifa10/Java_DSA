public class CastingConversion {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);

        byte b=23;
        char c='A';
        int i=50000;
        short s=1024;
        float f=22.33f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}
//  result will be in larger datatype
