public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    public Human(int yearOfBirth, String name, String town) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Будем знакомы!",
                name, town, yearOfBirth);
    }
}
