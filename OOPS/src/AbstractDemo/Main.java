package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son Martin = new Son(25);
        Martin.career("Engineer");
        Martin.partner("Martha",26);

        Daughter Elena = new Daughter(29);
        Elena.career("Coder");
        Elena.partner("Iron man", Elena.age);

        Parent.hello();

    }
}
