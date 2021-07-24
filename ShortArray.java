//array={3,34,234,324,2};
//array1={2,3,34,1,100,32};
//array12={1,2,3,32,34,100,234,324};
import java.io.*;
class ShortArray{
public static void main(String args[])throws IOException
{
System.out.println("Enter the first array size");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String no=br.readLine();
 int size1=              Integer.parseInt(no);
System.out.println("Enter the second array size");
String no1=br.readLine();
int size2=Integer.parseInt(no1);
int arr[]=new int[size1];
int arr1[]=new int[size2];
int count=0;
System.out.println("Enter the first array elements");
for(int i=0;i<size1;i++)
{
 arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter the second array elements");
for(int i=0;i<size2;i++)
{
 arr1[i]=Integer.parseInt(br.readLine());
}
for(int i=0;i<size1;i++)
{
 for(int j=i+1;j<size2;j++)
{
 if(arr[i]==arr1[j])
{ count++;
     arr[i]=0;
}}
}
int yellow=0;
int arr2[]=new int[size1+size2-count];
for(int i=0;i<arr2.length;i++)
{
	if(i<size2)
 arr2[i]=arr1[i];
 else
 {
    for(int j=size2;j<arr2.length;j++)	 
	//  arr2[i]=arr[j];
 } }
for(int k=0;k<arr2.length;k++){ 
System.out.print(arr2[k]); 
}

for(int i=0;i<arr2.length;i++)
{
	for(int j=1;j<(arr2.length-i);j++)
	{
		if(arr2[j]<arr2[j-1])
		{
	     arr2[j]=arr2[j]+arr2[j-1];
         arr2[j-1]=arr2[j]-arr2[j-1];
         arr2[j]=arr2[j]-arr2[j-1];
		}   		 
}
}
System.out.println("the value is");
for(int i=0;i<arr2.length;i++)
	System.out.print(arr2[i]+ "         ");
}}
