
public class pattern4{
    public static void main(String args[]){
        for(int i = 1 ; i <=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            // System.out.println(" ");
            for(int l = 4; l>=i; l--){
                System.out.print(" *");
            }
            System.out.println();
        }
      
    }
}