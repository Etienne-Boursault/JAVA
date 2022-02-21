package condition;

public class ConditionalHello {

    public static void main(String[] args) {
        if (args.length > 0) {
            sayHelloTo(args[0]);
        } else {
            sayHelloTo("World");
        }
    }

    public static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient + "!");
    }
}
