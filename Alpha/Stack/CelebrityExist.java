import java.util.Stack;

public class CelebrityExist {
    public static int checkCelebrityExist(int[][] mat){
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(mat[v1][v2] == 0){
                st.push(v1);
            }else if(mat[v2][v1] == 0){
                st.push(v2);
            }
        }
        if(st.size() == 0) return -1;
        int poten = st.pop();
        for(int i=0; i<n; i++){
            if(mat[poten][i] == 1) return -1;
        }
        for(int i=0; i<n; i++){
            if(i == poten) continue;
            if(mat[i][poten] == 0) return -1;
        }
        return poten;
    }
    public static void main(String[] args){
        int mat[][] = {
            {0,1,0},
            {0,0,0},
            {0,1,0}
        };

        int check = checkCelebrityExist(mat);
        if(check != -1)
            System.out.println(check + " is a celebrity.");
        else
            System.out.println("Celebrity not found!");    
    }
}
