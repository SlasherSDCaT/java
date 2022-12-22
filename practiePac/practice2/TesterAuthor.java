package practiePac.practice2;

public class TesterAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan", "ivPopov@somewhere.com", 'm');
        System.out.println(a1);
        a1.setEmail("IvanivIvan@yandex.com");
        System.out.println(a1);
        System.out.println(a1.getEmail()+" - "+a1.getName()+"("+a1.getGender()+")");
    }
}
