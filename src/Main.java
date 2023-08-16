public class Main {
    public static void main(String[] args) {
Book lordOfTheRings = new Book ("LordOfTheRings", "Tolkien", 1954);
Author lordOfTheRings1 = new Author("John", "Tolkien");
        System.out.println("Название книги - " + lordOfTheRings.getBookName());
        System.out.println("Автор книги - " + lordOfTheRings.getAuthorName());
        System.out.println("Год издания - " + lordOfTheRings.getPublishingYear());
        System.out.println("Имя автора - " + lordOfTheRings1.getAuthorFirstName());
        System.out.println("Фамилия автора - " + lordOfTheRings1.getAuthorSurname());
        lordOfTheRings.setPublishingYear(1950);
        System.out.println("Год издания - " + lordOfTheRings.getPublishingYear());
        Book theWarInGaul = new Book ("Commentarii de Bello Gallic", "Caesar", 44);
        Author Caesar = new Author("Gaius", "Caesar");
        System.out.println("Название книги - " + theWarInGaul.getBookName());
        System.out.println("Автор книги - " + theWarInGaul.getAuthorName());
        System.out.println("Год издания - " + theWarInGaul.getPublishingYear());
        System.out.println("Имя автора - " + Caesar.getAuthorFirstName());
        System.out.println("Фамилия автора - " + Caesar.getAuthorSurname());
        Book edenMartin = new Book("Eden Martin", "London", 1909);
        Author London = new Author("Jack", "London");
        System.out.println("Название книги - " + edenMartin.getBookName());
        System.out.println("Автор книги - " + edenMartin.getAuthorName());
        System.out.println("Год издания - " + edenMartin.getPublishingYear());
        System.out.println("Имя автора - " + London.getAuthorFirstName());
        System.out.println("Фамилия автора - " + London.getAuthorSurname());
        edenMartin.setPublishingYear(1908);
        System.out.println("Год издания - " + edenMartin.getPublishingYear());
    }
}