package SULE_HOCA_Exceptions;

public class CLASS_CAST_EXCEPTION {

    // BIRBIRINE DONUSTURELEMEYECEK DATA TIPLERINI DONUSTURMEKTE ISRAR
    // EDERSEK JAVA CLASSCASTEXCEPTION   ATAR
    // CLASS LAR BIRBIRLERINDEN BUYUK VEYA KUCUK DEGILDIRLER

    public static void main(String[] args) {
        Object obj = 70;
        String str = "A";
        try {
            str = (String) obj;
            System.out.println(str);

        } catch (ClassCastException e) {

            e.printStackTrace();
        }

    }
}
