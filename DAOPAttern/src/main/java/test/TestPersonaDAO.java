package test;

import domain.persona;

public class TestPersonaDAO {
    public static void main(String[] args) {
        persona p = new persona(1, "Miguel", "Gomez", "miguel@gmail.com", "4776098946");
        System.out.println(p.toString());
    }
}