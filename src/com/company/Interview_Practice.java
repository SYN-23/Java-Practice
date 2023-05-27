package com.company;

public class Interview_Practice {
    public static void main(String[] args) {
    primeNumber(2);
    armstrongNumber(134);
    System.out.println("GCD "+gcdNumber(20,30));
    floydTriangle(9);
    perfectNumber(28);
    fizzBuzz(10);
    fibonacci(10);
    }

    //Prime Number
    public static void primeNumber(int n){
        int m=n/2;int flag =0;
        if(n==0||n==1){
            System.out.println(n+" is not a prime number");
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }

            }
            if (flag==0){
                System.out.println(n+" is a prime number");
            }
        }
    }

    // Armstrong Number
    public static void armstrongNumber(int n){
        int count=0;
       int lastdigit;
       int sum =0;
       int temp=n;
       while(temp>0){

           temp=temp/10;
           count++;
       }
       temp=n;
       while (temp>0){
            lastdigit=temp%10;
           sum=sum+(int)Math.pow(lastdigit,count);
           temp=temp/10;
       }
       if (sum==n){
           System.out.println(n+" is a armstrong Number");
       }else{
           System.out.println(n+" not a armstrong Number");
       }

    }

    //Gcd number
    public static int gcdNumber(int n1,int n2){

      int gcd=1;
      for(int i=1;i<=n1;i++){
          if (n1%i==0 && n2%i==0){
              gcd=i;
          }
      }

        return gcd;
    }

    //Floyd Triangle

    public static void floydTriangle(int n){
        int k=1;
        for (int i=1;i<=n;i++ ){
            for(int j=1;j<=i;j++){
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }
    }

    //Perfect Number
    public static void perfectNumber(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
        if (sum==n){
            System.out.println(n+" is a perfect Number");
        }else{
            System.out.println(n+" is not a perfect Number");
        }
    }

    //fizz buzz number
     public static void fizzBuzz(int n){
        if (n%5==0&&n%7==0){
            System.out.println(n+" is a fizzbuzz number");
        }else if(n%5==0){
            System.out.println(n+" is a fizz number");
        }else if(n%7==0){
            System.out.println(n+" is a buzz number");
        }
     }

     //fibonacci series
    public static void fibonacci(int n){
        int n1=0;
        int n2=1;

        for (int i=1;i<n;i++){
            if(n1+n2==i){
                System.out.println(n1+"+"+n2+"="+i);
                n1++;
                n2++;
            }
        }
    }


}
