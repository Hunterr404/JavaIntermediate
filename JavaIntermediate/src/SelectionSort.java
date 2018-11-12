public class SelectionSort{
public static void main(String[] args){
int[]a={18,7,4,11,9,15,21};
	

for(int i=0;i<a.length-1;i++){

for(int j=i+1;j<a.length;j++){
	
if(a[j]<a[i]) {
	System.out.println("At start "+a[i]);
//Swap the found minimum element with the first element
int c=a[i]+a[j];

a[j]=c-a[j];
a[i]=c-a[i];
System.out.println("At end of if "+a[i]);
}
System.out.println("At end of second for loop"+a[i]);
}
System.out.println(a[i]+" ***Final Value***");


}


}

}