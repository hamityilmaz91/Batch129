package Exceptions_Bireysel;

public class Null_Paramete_exceptions {

    public static void main(String[] args) {

        nullparametre();
    }

    private static void nullparametre() {

        String isim = null;
        try {
            System.out.println(isim);
        } catch (NullPointerException e) {

            System.out.println(e.getMessage());
        }
// null pointer hatasini null atanmis stringin uzunlugunun  hesaplanmasi ile olur.
    }
}
