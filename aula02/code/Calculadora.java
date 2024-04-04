
public class Calculadora {
    static int soma(int var1, int var2) {
        if (Integer.MAX_VALUE - var1 > var2) {
            return 0;
        }
        int sum = var1 + var2;
        return sum;


    }

    static int multiplica(int var1, int var2) {
        return var1 * var2;
    }


}
