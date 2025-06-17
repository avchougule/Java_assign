
class Table{
    public static void main(String[] args) {

        int i,j;
        System.out.println("Multiplication Tables (1 to 10):\n");

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.print("\t"+i * j);
            }
            System.out.println(); 
        }
    }
}