public class Main {
    public static void main(String[] args) {
Book lordOfTheRings = new Book();
lordOfTheRings.bookName = "lordOfTheRings";
        System.out.println("Название книги - " + lordOfTheRings.bookName);
        lordOfTheRings.authorName = "Tolkien";
        System.out.println("Автор книги - " + lordOfTheRings.authorName);
lordOfTheRings.publishingYear = 1954;
        System.out.println("Год издания - " + lordOfTheRings.publishingYear);

Author lordOfTheRings1 = new Author();
        lordOfTheRings1.authorFirstName = "John";
        System.out.println("Имя автора - " + lordOfTheRings1.authorFirstName);
        lordOfTheRings1.authorSurname = "Tolkien";
        System.out.println("Фамилия автора - " + lordOfTheRings1.authorSurname);
    }
}