package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email eml1 = new Email("Ting", "Xiao");
        eml1.changePassword("ABCDEF");
        System.out.println(eml1.getPassword());

        System.out.println(eml1.showInfo());
    }
}
