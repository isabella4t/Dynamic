import java.util.HashMap;

//dynamic programing is saving time by storing solved answers

public class Main {

    public static void main(String[] args) {

        System.out.println("Fibonacci Problem");
        for(int i=0; i<50;i++){
            System.out.println(fib(i));
           // System.out.println(ne(fib(i)));
        }

        System.out.println("Factory Problem");
        //pattern: even is false odd is true
        for(int i=0; i<30;i++){
            System.out.println(factory(i));
        }
        System.out.println("Bigger number (71): "+factory(71));

    }

    //tail recursion can be shoved into nonrecursive code (a loop)
    static  HashMap<Integer,Integer> fibs = new HashMap<Integer, Integer>();

    static int fib(int n){
        if(n<2) return 1;
        if(fibs.containsKey(n)) return fibs.get(n);
        int nm1 = fib(n-1);
        int nm2 = fib(n-2);
        fibs.put(n,nm1+nm2);
        //return nm1 + nm2;
        return nm1 + nm2;
    }

    static  HashMap<Integer,Boolean> fac = new HashMap<Integer, Boolean>();

   static boolean factory(int n){
       if(n==0) return false;
       if(fac.containsKey(n-1)) return !fac.get(n-1);
       boolean before = factory(n-1);
       //opposite of result from before to make alternating spots
       fac.put(n,!before);
       return !before;
   }


    //ne is the warm up
    static public double ne(int k){
        double m = Math.pow((-1 + Math.sqrt(5))/2,k);
        double n = Math.pow((-1 - Math.sqrt(5))/2,k);
        return m - n;
        /*
        binomial theorum says even numbers just cancel out

        what is induction?
        - if P(0) and (if P(n) then P(n+1) it proves the next one)
        then
        p for any integer is true
prove stuff
         */
    }


}
