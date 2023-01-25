SPRIAL MATRIX
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
	        
	
	    
	    //top  >> we are printing rowstarting to column ending
	    for(int i=rows;i<=cole;i++){
		System.out.print(matrix[rows][i]+" ");
	    }
	    
	    
	    //right  >> we are printing rowStarting+1 to columnEnd 
	    for(int i=rows+1;i<=cole;i++){
		System.out.print(matrix[i][cole]+" ");
	    }
	    
	    
	    //bottom  >> we are printing columnEnding-1 to rowStarting
	    for(int i=cole-1;i>=rows;i--){
	        if(rows==rowe){  //these are used when there is odd Number it prints the same number again to aviod these we are using these
	            break;
	        }
		System.out.print(matrix[cole][i]+" ");
	    }
	    
	    
	    
	    
	    //left   >>we are printing columnEnding-1 to rowStarting+1
	    for(int i=cole-1;i>=rows+1;i--){
	        if(cols==cole){ //these are used when there is odd Number it prints the same number again to aviod these we are using these
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


JAVA PRATICE BY ABR


