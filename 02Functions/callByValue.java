public class callByValue{
     public static int sum (int a , int b){
        int temp = a ;
         a = b ;
         b = temp;
         return  a + b;
     }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(sum(a, b));
        System.out.println(a);
    }
}