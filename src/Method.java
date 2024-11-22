/*find the area of rectangle
public class Method {
    static int cal (int length,int breath){
        int area=length*breath;
        return area;
    }
    public static void main(String[] args) {
        int length = 8;
        int breath = 6;
        int area = cal(length, breath);
        System.out.println(area);
    }



/*
the sum of array elemnt
public class Method {

    static int SumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 4, 5};
        int result = SumArray(myarray);
        System.out.println("the sum of array of the element" + result);
    }
}*/

/* using overloading to print int,string,double
 class Printer{

     void print(String text){
         System.out.println(text);

     }
     void print(int number){
         System.out.println(number);
     }
     void print(double number){
         System.out.println(number);
     }
}
public class Method {
    public static void main(String[] args) {
        Printer printer=new Printer();
        printer.print("Keerthi Topper");
        printer.print(77);
        printer.print(77.77);
    }
}*/
/*fibonacci number using recursive method
public class Method {
   public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }

    public static void main(String[] args) {
        int n=10;
        System.out.println("the"+n+"th fibonacci number is:"+fibonacci(n));
    }
}*/
/*factorial number
public class Method{
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n* factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n=3;
       // int result=factorial(n);
        System.out.println("the"+n+"th factorail number is"+factorial(n));
    }
}*/
class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public double mul(double a,double b){
        return a*b;
    }

    public static void main(String[] args) {
        calculator clac =new calculator();
        System.out.println("Add of int "+clac.add(4,5));
        System.out.println("Add of double"+ clac.add(4.2,5.6));
        System.out.println("Sub of int "+clac.sub(4,5));
        System.out.println("Sub of double"+clac.sub(4.2,5.6));
        System.out.println("Mul of int "+clac.mul(4,5));
        System.out.println("mul of int"+clac.mul(4.2,5.6));
    }
}







