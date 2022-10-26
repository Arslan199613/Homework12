public class Main {
    public static void main(String[] args) {
        Author author1 = new Author(" Грум ", "Уинстон");
        Book book1 = new Book(" Форрест Гамп ", author1, 1986);
        Author author2 = new Author(" Лев ","Толстой");
        Book book2 = new Book(" Анна Каренина ", author2, 1878);

        System.out.print(author1.getFirstName()+author1.getLastName());
        System.out.print(book1.getName()+book1.getYearOPublishing());
        System.out.println();
        book1.setYearOfPublishing(777);
        System.out.println(book1.getYearOPublishing());
        System.out.print(author2.getFirstName()+author2.getLastName());
        System.out.print(book2.getName()+book2.getYearOPublishing());
    }
}