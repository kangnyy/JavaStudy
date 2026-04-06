public class SavingAccount extends BankAccount implements Withdrawable{ // 객체지향 강의
    // 자식클래스 extends 부모 클래스 하면,
    // 자식 클래스는 부모 클래스의 모든 것을 갖고 시작하게 됨.
    // implements Withdrawable

    boolean isOverdraft;

    void transfer() {};

    public void withdraw() {
        System.out.println("Withdraw");
    };





}

