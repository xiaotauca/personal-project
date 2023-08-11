package emailapp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private int defaultPasswordLength = 6;
    private String department;
    private String altEmail;
    private String companySuffix = "auca.com";
    //constructor
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email Created: " + this.firstname + ", " + this.lastname);
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" +
                this.department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    //ask for department
    private String setDepartment() {
        System.out.print("Enter the department: ");
        Scanner input = new Scanner(System.in);
        String dep = input.next();
        return dep;
    }
    //generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; ++i) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setAlternateEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String getPassword() {
        return password;
    }
    public String showInfo() {
        return "NAME: " + firstname + "." + lastname +
                "\nCOMPANY EMAIL: " + email;
    }
}
