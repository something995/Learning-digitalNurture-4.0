
interface Payment {

    void pay(int amount);
}

class OldPayment {

    void sendMoney(int amt) {
        System.out.println("Paid: " + amt);
    }
}

class Adapter implements Payment {

    OldPayment op = new OldPayment();

    public void pay(int amount) {
        op.sendMoney(amount);
    }
}
