class CustomMessagePrinter extends MessagePrinter {
    @Override
    protected void printMessage3() {
        System.out.println("initialize night program");
    }
}

class DefaultMessagePrinter extends MessagePrinter {
    @Override
    protected void printMessage3() {
        System.out.println("initialize day program");
    }
}