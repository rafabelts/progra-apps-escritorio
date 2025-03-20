package homework.code;

public class Main {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        ClassWithTwoMethods classWithTwoMethods = new ClassWithTwoMethods();

        // test con excepcion
        classOne.makeDivisionWithValidation(4, 2);

        // test con excepcion nula
        classOne.makeDivisionWithValidationTwo(1, 1);

        // test clase con dos metodos
        classWithTwoMethods.substractionResult(2, 1);
    }

}