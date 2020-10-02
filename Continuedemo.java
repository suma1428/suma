class Continuedemo{
public static void main(String args[]){

System.out.println("printing even numbers between 0-10");
int i;
for(i=0;i<10;i++){
if(i%2 !=0){
continue;
}
System.out.println(i);
}
System.out.println("main ended \n");
}
}



