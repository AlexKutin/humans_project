public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    private String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!",
                name, town, yearOfBirth, job);
    }
}
