public class Main {

    public static void main(String[] args) {
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Gavin", 2500.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Gavin", 10000.00, "gavin@email.com");
        System.out.println(person3.getName());
    }
}
