package classes;

public class Confirmacao {
    private static boolean validation=false;
    

    public static void setValidation(boolean validation) {
        Confirmacao.validation = validation;
    }

    public static boolean isValidation() {
        return validation;
    }    

}
