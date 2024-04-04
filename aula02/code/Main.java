

class Main {
    public static void main(String[] args) {
        int var1 = 5, var2 = 35;

        int soma = Calculadora.soma(var1, var2);
        int produto = Calculadora.multiplica(var1, var2);
        System.out.printf("Soma: %d\nProduto: %d\n", soma, produto);
    }

}
