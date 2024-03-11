public class OuterClass {
    private static String outerMessage = "Hello from OuterClass";

    static class NestedStaticClass {
        private static String nestedMessage = "Hello from NestedStaticClass";

        public void printMessages() {
            System.out.println(outerMessage);
            System.out.println(nestedMessage);
        }
    }

    public static void main(String[] args) {
        OuterClass.NestedStaticClass nestedInstance = new OuterClass.NestedStaticClass();
        nestedInstance.printMessages();
    }
}
