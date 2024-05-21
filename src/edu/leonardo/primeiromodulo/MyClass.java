package edu.leonardo.primeiromodulo;

public class MyClass {

    public static void main(String[] args) {
        String firstName = "Leonardo";
        String lastName = "Matheus";

        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return "Resultado do método: " + firstName.concat(" ").concat(lastName);
    }
}
