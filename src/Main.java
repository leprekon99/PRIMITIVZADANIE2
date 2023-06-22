public class Main {
    public static void main(String[] args) {
        int accountBalance = 100; // сумма счета
        int balanceReplenishment = 1100; // пополнение баланса
        int bonusRubles = 100; // бонусные рубли за 1 рубль пополнения FinalScore итоговый счет numberOfBonusRubles

        int finalScore;
        if (balanceReplenishment > 1000) {
            finalScore = (balanceReplenishment / bonusRubles) + accountBalance + balanceReplenishment;
        } else {
            finalScore = (accountBalance + balanceReplenishment);
        }

        int numberOfBonusRubles;
        if (balanceReplenishment > 1000) {
            numberOfBonusRubles = (balanceReplenishment / bonusRubles);
        } else {
            numberOfBonusRubles = (0);
        }

        System.out.println(" Итоговый счет составляет " + finalScore);
        System.out.println(" Итого бонусов к зачислению " + numberOfBonusRubles);

    }
}