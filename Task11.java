public class Task11 {
    public static void main(String[] args) {
        for (int i=1; i<=1000;i++){
            if (i%3==0 && i%5!=0){
                System.out.println("fizz");
            }
            if (i%5==0 && i%3!=0){
                System.out.println("buzz");
            }
            if (i%3==0 && i%5==0){
                System.out.println("hiss");
            }
        }
    }
}
