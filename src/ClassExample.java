public class ClassExample { // 객체지향 강의

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
//        bankAccount.password = 123456;      // 마음대로 패스워드 바꿀 수도 있음. 그래서 부모 클래스에서 private 이용
//        System.out.println(bankAccount.password);
        bankAccount.changePassword(123456);
        System.out.println(bankAccount.getPassword());

    }
}
