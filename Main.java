public class Main {
    public static void main(String[]args){
        int[] arr = randomArray();
        System.out.println("Random Array:");
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
    public static int[] randomArray(){
        int[] arr = new int[8];
        for (int i = 0; i < arr.length -1;i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }
        return arr;
    }
   public static void mergeSort(int[] arr){
        
   }
   public static void binarySearchIteratively(int target){

   }
   public static void binarySearchRecursively(int target){

   }
}
