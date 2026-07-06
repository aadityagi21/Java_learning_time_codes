class Main {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        int m = mat.length;
        int n = mat[0].length;
        
        int arr[][] = new int[m][n];
        
        for(int i=0;i<m;i++){
            int start = 0;
            int end = n-1;
            while(start==0){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
            }
        }

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
