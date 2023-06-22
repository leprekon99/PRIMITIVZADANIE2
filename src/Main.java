public class Main {
    public static void main(String[] args) {
        int AccountBalance = 100; // сумма счета
        int BalanceReplenishment = 1100; // пополнение баланса
        int BonusRubles = 100; // бонусные рубли за 1 рубль пополнения FinalScore итоговый счет numberOfBonusRubles

        int FinalScore;
        if (BalanceReplenishment > 1000) {
            FinalScore = (BalanceReplenishment / BonusRubles) + AccountBalance + BalanceReplenishment;
        } else {
            FinalScore = (AccountBalance + BalanceReplenishment);
        }

        int numberOfBonusRubles;
        if (BalanceReplenishment > 1000) {
            numberOfBonusRubles = (BalanceReplenishment / BonusRubles);
        } else {
            numberOfBonusRubles = (0);
        }

        System.out.println(" Итоговый счет составляет " + FinalScore);
        System.out.println(" Итого бонусов к зачислению " + numberOfBonusRubles);

    }
}