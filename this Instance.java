class MyClass2 {
    private String message;

    public MyClass2(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
    public void processMessage() {
        // Invoking displayMessage() implicitly using 'this'
        this.displayMessage();
    }

    public static void main(String[] args) {
        MyClass2 obj = new MyClass2("HUMAN");
        obj.processMessage(); // Invoking processMessage() which implicitly invokes displayMessage()
    }
}
