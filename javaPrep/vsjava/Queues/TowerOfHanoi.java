public class TowerOfHanoi {
    public static void toh(int n, int a, int b, int c){

        if(n == 1){
            System.out.println(a + "=>" + c);
            return;
        }
        else{
            toh(n-1, a, c, b);
            System.out.println(a + "=>" + c);
            toh(n-1, b, a, c);
        }
    }
    public static void main(String[] args) {
        toh(4, 1, 2, 3);
    }
}
