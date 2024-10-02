public class Adder {

    // instance variable
    private String name;
    private int counter;
    private int increment;

    // ---- constructors ----
    public Adder(String name) {
        this.name = name;
        counter = 0; // default value
        increment = 0; // default value
    }

    public Adder(String name, int counter) {
        this.name = name;
        this.counter = counter;
        increment = 0; // default value
    }

    public Adder1(String name, int counter, int increment) {
        this.name = name;
        this.counter = counter;
        this.increment = increment;
    }

    public Adder2(String name, int increment, int counter) {
        this.name = name;
        this.counter = counter;
        this.increment = increment;
    }

    public Adder(int counter, int increment, String name) {
        this.name = name;
        this.counter = counter;
        this.increment = increment;
    }
    

    // ---- methods ----
    public void incrementCounter() {
        counter++;
    }

    public void incrementCounter(int amt) {
        counter += amt;
    }

    public void incrementCounter(double amt) {
        counter += (int) amt;
    }

    public int add1(int num1, int num2) {
        return num1 + num2;
    }

    public int add2(int num2, int num1) {
        return num1 + num2;
    }

    public int add(double num1, int num2) {
        int casted = (int) (num1 + num2);
        return casted;
    }

    public int add(int num1, double num2) {
        int casted = (int) (num1 + num2);
        return casted;
    }

    public int add3(double num1, double num2) {
        int casted = (int) (num1 + num2);
        return casted;
    }

    public double add4(double num1, double num2) {
        return num1 + num2;
    }


    public double add5(int num1, int num2, double num3) {
        return num1 + num2 + num3;
    }

    public double add6(int x, int y, double z) {
        return x + y + z;
    }

    public double addMore(int num1, int num2, double num3) {
        return num1 + num2 + num3;
    }
}
