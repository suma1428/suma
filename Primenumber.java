class Primenumber{
public static void main(String[] args){
int num=13;
int count=0;
for (int i=2;i <= num/2;i++){
if(num%i==0){
count++;
break;
}
}
if(count ==0){
System.out.println("the given number is prime number");
}
else{
System.out.println("the given number is not prime number");
}
}
}