public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author gogol = new Author("Николай", "Гоголь");
        Book evgenyOnegin = new Book("Евгений Онегин", pushkin, 1833);
        Book mortvyyeDushi = new Book("Мёртвые души", gogol, 1842);

        System.out.println(pushkin.getFirstName() + " " + pushkin.getSecondName());
        System.out.println(gogol.getFirstName() + " " + pushkin.getSecondName());

        System.out.println(evgenyOnegin.getBookName() + " " + evgenyOnegin.getAuthor().getFirstName() + " " + evgenyOnegin.getAuthor().getSecondName() + " " + evgenyOnegin.getPublishingYear());
        System.out.println(mortvyyeDushi.getBookName() + " " + mortvyyeDushi.getAuthor().getFirstName() + " " + mortvyyeDushi.getAuthor().getSecondName() + " " + mortvyyeDushi.getPublishingYear());

        mortvyyeDushi.setPublishingYear(1843);
        System.out.println(mortvyyeDushi.getPublishingYear());
    }
}