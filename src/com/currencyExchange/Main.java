package com.currencyExchange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, что вы хотели обменять и на что? ");
        String scanFirstCurrency = scanner.nextLine();
        System.out.println(" на ");
        // Предположительный ответ: Доллар
        //если первый стринг от пользователя равен "Доллар", а второй рублю. переводим доллары в рубли.
        String scanSecondCurrency = scanner.nextLine();
        System.out.println("какую сумму вы хотите обменять?");
        float clientAmount = scanner.nextFloat();
        System.out.println("Хорошо, передайте вашу валюту в окошко!");
        ExchangeRuble exchangeRuble = new ExchangeRuble(scanFirstCurrency, scanSecondCurrency, clientAmount);

        System.out.println("Итого, вы получите " + exchangeRuble.amountToRecieve() + " " + exchangeRuble.secondCurrency);

        System.out.println("Вот ваши " + exchangeRuble.amountToRecieve() + exchangeRuble.secondCurrency + " " + "\nВсего доброго, приходите ещё!");
    }
}
