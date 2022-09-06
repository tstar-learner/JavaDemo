public class Main {
    public static void main(String[] args) {
        int[][] arr={{2,2},{5,4},{6,2}};
        System.out.println(maxValue(arr));
    }

    public static int maxValue(int[][] arr){
        int res=Integer.MIN_VALUE;
//        if (arr.length==2&&arr[0].length==2){
//            return arr[0][0]+arr[0][1]+arr[1][0]+arr[1][1];
//        }
        for (int i = 2; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length-i; j++) {
                for (int k = 0; k <= arr[0].length-i; k++) {
                    res=Math.max(res,arr[j][k]+arr[j][k+i-1]+arr[j+i-1][k]+arr[j+i-1][k+i-1]);
                }
            }
        }
        return res;
    }
}
