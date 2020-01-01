public class Main {

    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();

        creditUI.calculateCredit(new AgriculturalCreditManager());

        creditUI.calculateCredit(new TeacherCreditManager());
    }
}
