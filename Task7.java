public class Task7 {
    public static void main(String[] args) {
            int a,b,j,i, max,noti;
            i=4;
//            String g = Integer.toBinaryString(i,4);
//            i= ~i;
//            String h = Integer.toBinaryString(i);
//            max = Integer.MAX_VALUE;
//            i=(i^max);
//            max = i^max;
//            i=i^max;
        j=0;
            while (i!=0){
                j++;
                if (i%2 == 0){
                    b=0;
                    System.out.print(b);
                }
                else {
                    a=1;
                    System.out.print(a);
                }
//                c= "a"+b;
                i=i/2;
//                System.out.println(c);
            }

    }
}
