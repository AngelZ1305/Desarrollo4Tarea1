interface aritmeticos {
    int suma(int x, int y);
    int resta(int x, int y);
    int division(int x, int y);
    int multiplicacion(int x, int y);


}
public class Main implements aritmeticos{
    @Override
    public int suma(int x, int y) {
        return x+y;
    }
    public int resta(int x, int y) {
        return x-y;
    }
    public int division(int x, int y) {
        return x/y;
    }
    public int multiplicacion(int x, int y) {
        return x*y;
    }


    public static void main(String[] args) {
        System.out.println("Suma: " + (new Main().suma(2,8)));
        System.out.println("Resta: " + (new Main().resta(4,6)));
        System.out.println("Divisióm: " + (new Main().division(8,4)));
        System.out.println("Multiplicación: " + (new Main().multiplicacion(8,2)));



    }
}

