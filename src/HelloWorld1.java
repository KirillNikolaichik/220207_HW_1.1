

public class HelloWorld1 {
    public static void main(String[] args) {

        boolean b = true;
        int a1,a2,a3,a4;
        int x = 5432;

        a4 = x % 10;
        x = x/10;
        a3 = x % 10;
        x = x/10;
        a2 = x % 10;
        a1 = x/10;

        if(a1+a2>a3+a4){
            System.out.println(b);
        }
        else{
            System.out.println("False");
        }
    }
}
