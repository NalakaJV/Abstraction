abstract class Human {
    Human () {
        System.out.println("Constructor Is Running!");
    }
    abstract void eat();
    abstract void walk();
    void breathing() {
        System.out.println("Breathing!");
    }
}
class Man extends Human {
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }

    @Override
    void walk() {
        System.out.println("Any Kind of Walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lab Dap!!!!!");
    }
}
class Nalaka extends Man {
    @Override
    void breathing() {
        super.breathing();
        System.out.println("breathing");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eat Foods!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!");
    }
}
class Running {
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Nalaka();
        Man m = new Nalaka();
        h.breathing();
        h.eat();
        h.walk();
        h1.breathing();
        h1.eat();
        h1.walk();
        m.breathing();
        m.eat();
        m.walk();
    }
}