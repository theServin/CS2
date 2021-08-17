public class RecursiveBinarySearch{
    public static void main(String [] args){
        int[] a = {1,3,5,7,8,11,13,14,22,44,56,70};
        System.out.println("target: 7: "+search(a, 7));
        System.out.println("target: 70: "+search(a, 70));
        System.out.println("target: 777: "+search(a, 777));

    }
    public static boolean search(int[] a, int t){
        //            a,t,l,r
        return search(a,t,0, a.length-1);
    }
    private static boolean search(int[] a,// array of elements
                                  int t,  // element we are looking for
                                  int l,  // left side of the array
                                  int r){// right side of the array
                                    
        if(r >= l && l < a.length){
                int middle = l + (r - l)/2;

                if(a[middle] == t)
                {
                    return true;
                }
                else if(a[middle] > t){
                    return search(a,t,l, middle - 1);
                }
                else{
                    return search(a,t,middle + 1, r);
                }
        }
        return false;
    }
}