public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    private String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        this.name = checkIsNotEmptyAndFill(name);
        this.town = checkIsNotEmptyAndFill(town);
        this.job = checkIsNotEmptyAndFill(job);
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!",
                name, town, yearOfBirth, job);
    }

    private String checkIsNotEmptyAndFill(String str) {
        if (str == null || str.isBlank()) {
            return "Информация не указана";
        } else {
            return str;
        }
    }
}
