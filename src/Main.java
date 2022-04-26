public class Main {

    public static void main(String[] args) {
        int ticket = 20_000; // цена билета
        int miles = 1; // стоимость в рублях одной бонусной мили
        int bonus = ticket / miles;

        System.out.println("Рассчет бонусных миль исходя из стоимости купленного билета:");
        System.out.println(bonus + "миль");
    }
}
