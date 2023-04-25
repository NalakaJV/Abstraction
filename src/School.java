abstract class School {
void teaching() {
    System.out.println("Teaching!");
}
abstract void learning();
}
class Gread11 extends School {
    @Override
    void learning() {
        System.out.println("Gread 11 Students Learning Well!");
    }

    @Override
    void teaching() {
        super.teaching();
        System.out.println("Teachers Learning Well!");
    }
}
class RunSchool {
    public static void main(String[] args) {
        School s = new Gread11();
        s.learning();
        s.teaching();
    }
}
