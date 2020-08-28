package machine;

public class Test {
    public static void main(String[] args) {
        method(10.2f);
    }
    public static void method(float f) {
        System.out.println("float");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(double d) {
        System.out.println("double");
    }
}
