
public class pattern7{
    public static void main(String args[]){
        for(int i = 1 ; i <=4; i++){
            for(int j = 2; j<=i; j++){
                System.out.print(" ");
            }
            // System.out.println(" ");
            for(int l = 4; l>=i; l--){
                System.out.print("*");
            }
            for(int l = 3; l>=i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
      
    }
}