import java.util.Scanner;
class ArrayCount{
    public int  arrayct(int[] array){
        int size=array.length;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<size;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for(int j=0;j<size;j++)
        {
            if(array[j]==max)
            {
                count++;
            }
        }


        return size-count;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        ArrayCount ac=new ArrayCount();
        System.out.println(ac.arrayct(arr));




    }
}