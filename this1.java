class MyClass {
    private int number;

    public MyClass() {
        this(0); // Invoking another constructor of the same class using 'this()'
    }

    public MyClass(int number) {
        this.number = number;
    }

    public void printNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.printNumber(); // Invoking printNumber() on obj1

        MyClass obj2 = new MyClass(5);
        obj2.printNumber(); // Invoking printNumber() on obj2
    }
}
