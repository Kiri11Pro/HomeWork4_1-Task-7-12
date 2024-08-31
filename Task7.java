public class Task7 {
//    public class BitPresentation {
//        private static int number = 17;
//        public static void main(String[] args) {
//            int module = (int) Math.pow(2, 30);
//            while(module > number) {
//                module>>=1;
//            }
//            System.out.print("The Number " + number + " in bit presentation: ");
//            while (module > 0) {
//                System.out.print(number/module > 0 ? 1 : 0);
//                number%=module;
//                module>>=1;
//            }
//        }
//    }
    public static void main(String[] args) {
            int j,i;
            i=5;
        j=(int) Math.pow(2,30);
        while (j>i) {
            j >>= 1;
        }
        while (j>0) {
            System.out.print(i / j > 0 ? 1 : 0);
            i %= j;
            j >>= 1;
        }
//        while (i!=0 ){
//                j++;
//                if (i%2 != 0) {
//                    a=(int)(Math.pow(10,j));
//                    System.out.print(a);
//                }
//                c= "a"+b;
//                i=i/2;
//                System.out.println(c);
            }


    }

