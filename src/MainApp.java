public class MainApp {
    public static void main(String[] args) {

        twoDugits(3,50);
        digit(5);

    }

    public static void twoDugits(int a, int b){
        int c = a + b;
        if( c >= 10 && c <= 20)
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static void digit(int a) {
        if (a >= 0)
            System.out.println("poiitive");
        else
            System.out.println("negative");
    }
}