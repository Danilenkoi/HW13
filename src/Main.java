public class Main {
    public static void main(String[] args) {
        Author king = new Author("S. King");
        Author hawking = new Author("S. Hawking");
        Book sKing = new Book(2019, "The Institute", king);
        Book sHawking = new Book(2017, "A brief history of time", hawking);
        sKing.setYear(2020);
        System.out.println(hawking);
        System.out.println(sHawking);
    }
}