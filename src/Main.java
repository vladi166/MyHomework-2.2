public class Main {
    public static void main(String[] args) {

        int balance = 3500;
        int replenishment = 1500;
        int bonus = 0;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        }
        else {
            bonus = 0;
        }
        int finalscore = balance + replenishment + bonus;
        System.out.println("Итоговый счет:" + finalscore);
        System.out.println("Бонусные рубли:" + bonus);
    }
}