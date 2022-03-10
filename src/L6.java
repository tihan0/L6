public class L6 {


    public static void main(String[] args) {
//        System.out.println(testMethod());
//    }
//
//    public static int testMethod() {
//        int a = 5;
//        return a;
//    }
//}
//        int asdf=15;
//        int sum =calculateSum(asdf,6);
//        System.out.println(sum);
//        testMethod1();
//    int[] array123= new int[3];
//    int a=15;
//    for (int i=0; i<3;i++){
//        System.out.println(array123[i]);
//    }
//    System.out.println(a);
//    updateArray(array123, a);
//    System.out.println(a);
//        for (int i=0; i<3;i++){
//            System.out.println(array123[i]);
//    }}
        human pablo = new human(2,2, true);
        human newPablo= new human(123,545, false);
        pablo.say();
        System.out.println("количество рук и ног у пабло "+ pablo.sumCountOfHandsAndFeet());
        newPablo.say();
        System.out.println("количество рук и ног у нового пабло "+newPablo.sumCountOfHandsAndFeet());

    }
    //CTRL+P
    public static void updateArray(int[] array, int b){
        array[0]=5;
        b=5;
    }
public static int calculateSum(int a,int b){
        return a+b;
}}
 /*public static void testMethod1() {
     System.out.println("hello world");
 }
   */



