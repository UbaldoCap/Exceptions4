public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        arrayDiv(array, 1);
    }
    public static void arrayDiv (int[] array, int indice) {
        try {
            int result = array[indice]/0;
        } catch (ArithmeticException e) {
            System.out.println("errore");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("errore indice");
        } finally {
            System.out.println("errori gestiti");
        }

    }
}
