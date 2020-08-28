import java.util.*;
public class beibao {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int T = Integer.parseInt(sc.nextLine());//预算
	     int num = Integer.parseInt(sc.nextLine());//种类
	     int []p = new int[num];
	     int []w = new int[num];
	     for(int i = 0;i<num;i++){
	         String []str = sc.nextLine().split(" ");
	         p[i]=Integer.parseInt(str[0]);
	         w[i]=Integer.parseInt(str[1]);
	     }

	     int [][]res = new int[num+1][T+1];
	     for(int i = 0;i<num+1;i++)
	    	 for(int j = 0;j<T+1;j++)
	    		 if(i==0)
	    			 res[i][j]=0;
	    		 else
	    			 res[i][j]=-1;	    	 
	     for(int i = 1;i<num+1;i++) {
	    	 for(int j = 1;j<T+1;j++) {
	    		 res[i][j]=res[i-1][j];
	    		 if(j>p[i-1]&&res[i][j]<res[i-1][j-p[i-1]]+w[i-1])
	    			 res[i][j] = res[i-1][j-p[i-1]]+w[i-1];	    			 
	    	 }
	     }
	     System.out.println(res[num][T]);
	     
	}

}
