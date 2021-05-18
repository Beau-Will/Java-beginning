public class Chapter4OperatorTest03 {
    public static void main(String[] args) {
        System.out.println();
        int i;
        int j;
        int k;
        for(i = 1; i<=7; i++){
            for(j = 7-i; j>=0; j--){
                System.out.print(" ");
            }
            for(k = 2*i-1; k>=1; k--){
                System.out.print("#");
            }
            for(j = 7-i; j>=0; j--){
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(i = 1; i<=6; i++){
            for(j = 1; j<=i+1; j++){
                System.out.print(" ");
            }
            for (k = (7-i)*2-1; k>=1; k--){
                System.out.print("#");
            }
            for (j = 1; j<=i+1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}