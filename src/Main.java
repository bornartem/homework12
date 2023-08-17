public class Main {
    public static void main(String[] args) {
            Author lordOfTheRings1 = new Author("John", "Tolkien");
Book lordOfTheRings = new Book ("LordOfTheRings", lordOfTheRings1, 1954);
        System.out.println("Название книги - " + lordOfTheRings.getBookName());
        System.out.println("Автор книги - " + lordOfTheRings1.getAuthorFirstName() + " " + lordOfTheRings1.getAuthorSurname());
        System.out.println("Год издания - " + lordOfTheRings.getPublishingYear());
        lordOfTheRings.setPublishingYear(1950);
        System.out.println("Год издания - " + lordOfTheRings.getPublishingYear());
            Author Caesar = new Author("Gaius", "Caesar");
        Book theWarInGaul = new Book ("Commentarii de Bello Gallic", Caesar, 44);
        System.out.println("Название книги - " + theWarInGaul.getBookName());
        System.out.println("Автор книги - " + Caesar.getAuthorFirstName()+ " " + Caesar.getAuthorSurname());
        System.out.println("Год издания - " + theWarInGaul.getPublishingYear());
            Author London = new Author("Jack", "London");
        Book edenMartin = new Book("Eden Martin", London, 1909);
        System.out.println("Название книги - " + edenMartin.getBookName());
        System.out.println("Автор книги - " + London.getAuthorFirstName() + " " + London.getAuthorSurname());
        System.out.println("Год издания - " + edenMartin.getPublishingYear());
        edenMartin.setPublishingYear(1908);
        System.out.println("Год издания - " + edenMartin.getPublishingYear());
    }
}