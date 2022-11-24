public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Пупа";
        post.patronymic = "Боликовна";
        post.surname = "Лупова";
        post.passport = "6666 № 66666666";
        post.phone = "+7(666)-666-66-66";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 10;
        post.birthday.year = 1966;
    }
}