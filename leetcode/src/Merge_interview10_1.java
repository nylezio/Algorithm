//合并排序的数组
/**
 * Author: CHNjerry
 * Date: 2020/03/11 19:43
 */
public class Merge_interview10_1 {
    public static void merge(int[] A, int m, int[] B, int n) {
        if (n == 0){
            return;
        }
        if (m == 0) {
            System.arraycopy(B, 0, A, 0, A.length);
            return;
        }
        if (A[m - 1] < B[0]){
            for (int i = m;i < A.length; i++){
                A[i] = B[i - m];
            }
            return;
        }
        int curr = A.length - 1;
        m--;
        n--;
        while (curr != -1){
            if (m == -1){
                A[curr] = B[n];
                n--;
            } else if (n == -1){
                A[curr] = A[m];
                m--;
            } else if (A[m] > B[n]){
                    A[curr] = A[m];
                    m--;
                } else {
                    A[curr] = B[n];
                    n--;
                }
            curr--;
        }
    }

    public static void main(String[] args) {
        int [] A = new int[]{2, 0};
        int [] B = new int[]{1};
        merge(A, 1, B, 1);
        for (int a:A
             ) {
            System.out.println(a);
        }
    }
}
