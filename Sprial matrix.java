import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int matrix[][]={{1,2,3},
	                    {4,5,6},
	                    {7,8,9}};
	    
	    int rows=0;
	    int cols=0;
	    int rowe=matrix.length-1;
	    int cole=matrix[0].length-1;
	    
	    
	    while(rows<=rowe && cols<=cole){
	        
	
	    
	    //top
	    for(int i=rows;i<=cole;i++){
		System.out.print(matrix[rows][i]+" ");
	    }
	    //right
	    for(int i=rows+1;i<=cole;i++){
		System.out.print(matrix[i][cole]+" ");
	    }
	    //bottom
	    for(int i=cole-1;i>=rows;i--){
	        if(rows==rowe){
	            break;
	        }
		System.out.print(matrix[cole][i]+" ");
	    }
	    
	    //left
	    for(int i=cole-1;i>=rows+1;i--){
	        if(cols==cole){
	            break;
	        }
		System.out.print(matrix[i][cols]+" ");
	    }
	    rows++;
	    cols++;
	    rowe--;
	    cole--;
	    
	}

}
}
