package com.practiceMobilePhoneMax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int num;
        com.practiceMobilePhoneMax.SimCard[] simCards = new com.practiceMobilePhoneMax.SimCard[2];
        simCards[0] = new com.practiceMobilePhoneMax.SimCard("O!", 50, 1);
        simCards[1] = new com.practiceMobilePhoneMax.SimCard("Megacom", 10, 2);
        com.practiceMobilePhoneMax.MobilePhone mobilePhone = new com.practiceMobilePhoneMax.MobilePhone("Redmi Note 4X", "Black", simCards);
        //System.out.println(mobilePhone);
        do {
            System.out.println("Нажмите на одну из цифр, чтобы выполнить действия:\n" +
                    "0 - выключить телефон. \n" +
                    "1 - позвонить. \n" +
                    "2 - отправить сообщение. \n" +
                    //Добавить ввести номер
                    "3 - использовать интернет. \n" +
                    "4 - получить информацию о телефоне. \n" +
                    "5 - получить информацию о балансе. \n" +
                    "6 - пополнить баланс.");
            num = scan.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Отключение телефона!");
                    break;
                case 1:
                    System.out.println("Введите номер телефона: (пример: 0558501930):");
                    String number = scan1.nextLine();
                    simCards[0].setPrices(number);
                    simCards[1].setPrices(number);
                    if (simCards[0].getCorrectNumber() && simCards[0].getCallPrice() <
                            simCards[1].getCallPrice())
                        simCards[0].callTo();
                    else if (simCards[1].getCorrectNumber()) simCards[1].callTo();
                    else System.out.println("Вы ввели номер неправильно или " +
                                "вы ввели неправильный код оператора!");
                    break;
                case 2:
                    System.out.println("Введите номер телефона: (пример: 0558501930):");
                    String number1 = scan1.nextLine();
                    simCards[0].setPrices(number1);
                    simCards[1].setPrices(number1);
                    if (simCards[0].getCorrectNumber() && simCards[0].getSmsPrice() <
                            simCards[1].getSmsPrice())
                        simCards[0].messageTo();
                    else if (simCards[1].getCorrectNumber()) simCards[1].messageTo();
                    else System.out.println("Вы ввели номер неправильно или " +
                                "вы ввели неправильный код оператора!");
                    break;
                case 3:
                    System.out.println("Какую сим-карту использовать для интернета (1 или 2)?");
                    int j = -1 + scan1.nextInt();
                    simCards[j].internetUse();
                    break;
                case 4:
                    System.out.println(mobilePhone);
                    break;
                case 5:
                    System.out.println("Выберите сим-карту (1 или 2):\n");
                    switch (scan1.nextInt()) {
                        case 1:
                            System.out.println("Баланс 1-ой сим-карты: " +
                                    simCards[0].getBalance());
                            break;
                        case 2:
                            System.out.println("Баланс 2-ой сим-карты: " +
                                    simCards[1].getBalance());
                            break;
                    }
                    break;
                case 6:
                    System.out.print("Введите сумму, на которую вы хотите пополнить баланс: ");
                    int sumBalance = scan1.nextInt();
                    System.out.print("Баланс какой сим-карты нужно пополнить (1 или 2): ");
                    int simAdd = scan1.nextInt() - 1;
                    if (simAdd >= 0 && simAdd <= 1) simCards[simAdd].addBalance(sumBalance);
                    System.out.println("Баланс после пополнения на " + (simAdd + 1) +
                            " сим-карте: " + simCards[simAdd].getBalance());
                    break;
                default:
                    System.out.println("Вы ввели неправильную команду");
                    break;
            }
        } while (num != 0);
    }
}
