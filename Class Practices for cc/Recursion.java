public class recursion{
    static void printnum(int n ){
        if(n==8){
            System.out.println(n);
            return;

        }
        System.out.println(n);
        printnum(n+1);

    }
    
    public static void main(String[] args) {
        printnum(1);
    }
}