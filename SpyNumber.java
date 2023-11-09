import java.util.Scanner;
class SpyNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scan.nextInt();
        int sum=0;
        int prod=1;
        while(num!=0){
            int last=num%10;
            sum=sum+last;
            prod=prod*last;
            num=num/10;
        }
        if(prod==sum){
            System.out.println("It is a spy number");
        }
        else{
            System.out.println("It is not a spy number");
        }
    }
}
