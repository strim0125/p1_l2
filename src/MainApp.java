public class MainApp {
    public static void main(String[] args) {

        twoDugits(3,50);
        digit(-60);
        integer(10, -7);
        stringsMy("Hellow World", 2);

    }

    private static void stringsMy(String hellow_world, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(hellow_world);
        }
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
            System.out.println("positive");
        else
            System.out.println("negative");
    }

    public static void integer(int b, int i) {
            if (i > 0) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
    }

}