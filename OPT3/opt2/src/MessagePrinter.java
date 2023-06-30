abstract class MessagePrinter {
    public final void printMessages() {
        printMessage1();
        printMessage3();
    }

    protected void printMessage1() {
        System.out.println("Booting up system...");
    }

    protected abstract void printMessage3();
}