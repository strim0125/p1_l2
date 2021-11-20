public class MainApp {
    public static void main(String[] args) {

        twoDugits(3,50);
    }

    public static void twoDugits(int a, int b){
        int c = a + b;
        if( c >= 10 && c <= 20)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
