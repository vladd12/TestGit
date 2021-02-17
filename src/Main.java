public class Main {

    /**
     * Главная функция программы
     * @param argc аргументы командной строки
     * @author vladd12
     * @version 1.0
     */
    public static void main(String[] argc) {
        B obj = new B();
        obj.setI(2);
        obj.method();
        System.out.println(obj.getI());
    }
}