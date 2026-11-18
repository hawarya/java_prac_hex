public class assignment3 {
    public static void main(String[] args) {
        int [] arr={23,20,25,19,18,25,24,21,20,10};
        int [] attendance=new int [arr.length];
        attendance[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            attendance[i]=attendance[i-1]+arr[i];
        }

        int highest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                highest=arr[i];
            }
        }
        System.out.println(highest);
        int start=3;
        int end=7;
        int total=0;
        if (start < 1 || end > arr.length || start > end) {
            System.out.println("Invalid range");
        }else{
        if (start == 1) {
            total = attendance[end - 1];
        }
        else {
            total = attendance[end - 1] - attendance[start - 2];
        }

            System.out.println("Range total: " + total);}

    }
}
