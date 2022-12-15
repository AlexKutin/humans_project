public class Main {

    public static void main(String[] args) {
        Human maxim = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        Human ann = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        Human andrey = new Human(-8, "Андрей", "", null);

        System.out.println(maxim);
        System.out.println(ann);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(andrey);
    }
}