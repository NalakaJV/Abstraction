abstract class CentralBank {
    abstract int interestRate();
}
class BOC extends CentralBank {
    @Override
    int interestRate() {
        return 5;
    }
}
class NDB extends CentralBank {
    @Override
    int interestRate() {
        return 10;
    }
}
class Run {
    public static void main(String[] args) {
        CentralBank cd;
        cd = new BOC();
        System.out.println("Rate interest is :-" + cd.interestRate() + "%");
        cd = new NDB();
        System.out.println("Rate interest is :-" + cd.interestRate() + "%");
    }
}