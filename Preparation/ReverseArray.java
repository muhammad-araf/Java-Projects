public class ReverseArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,4,6,0,3};
        int list[] = new int[8];
        int j = 8-1;
        for(int i = 0;i<arr.length;i++){
            list[i]=arr[j];
            j--;
        }
        for(int i :list){
            System.out.print(i+" ");
        }

    }
}