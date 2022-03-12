package com.itRegistration;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongDataError {
        Db db = new Db();
//        List<Account> allAccounts = db.getRegistrationAccounts();
//        System.out.println(allAccounts);
        // Account account = new Account("gobpo_2002", "qwer1234", "gobpo2002@gmail.com", "+996703110202");
        System.out.println("|-------------------------------|" +
                "\n|Регистрация нового пользователя|" +
                "\n|-------------------------------|");
//        register(db, allAccounts);
        //System.out.println(db.getRegistrationAccounts());
    }

    static void register(Db db, List<Account> allAccounts) throws WrongDataError {
        Scanner scan = new Scanner(System.in);
        Account account = new Account();
        // ЛОГИН
        System.out.print("Логин должен содержать только " +
                "латинские буквы, цифры и символ нижнего подчеркивания.\n" +
                "Введите имя пользователя: ");
        String username = scan.nextLine();
        // System.out.println(usernameChars[i]);
        if (numbersAndLettersCheck(username, allAccounts)) {
            account.setLogin(username);
        } else {
            throw new WrongDataError();
        }

        // ПАРОЛЬ
        System.out.print("Пароль должен содержать только " +
                "латинские буквы, цифры и символ нижнего подчеркивания.\n" +
                "Введите пароль: ");
        String password = scan.nextLine();
        if (numbersAndLettersCheck(password)) {
            account.setPassword(password);
        } else {
            throw new WrongDataError();
        }

        // Электронная почта
        System.out.print("Электронная почта в формате '@gmail.com'," +
                " должна содержать только латинские буквы," +
                " цифры, символ нижнего подчеркивания. " +
                "Длина вместе с '@gmail.com' не менее 15 символов." +
                "\nВведите электронную почту: ");
        String email = scan.nextLine();


        if (emailCheck(email, allAccounts)) {
            account.setEmail(email);
        } else {
            throw new WrongDataError();
        }

        // НОМЕР ТЕЛЕФОНА
        System.out.print("Можно оставить поле пустым.\n" +
                "Номер телефона может содержать от 8 до 13 цифр и знак + первым символом.\n" +
                "Введите номер телефона: ");
        String phoneNumber = scan.nextLine();
        if (phoneNumber == "") phoneNumber = null;

        if (phoneNumber == null) {
            throw new WrongDataError();
        }
    }

    private static boolean numbersAndLettersCheck(String password) {
        return true;
    }

    private static boolean emailCheck(String email, List<Account> allAccounts) {
        return true;
    }

    private static boolean numbersAndLettersCheck(String username, List<Account> allAccounts) {
        return true;
    }

}