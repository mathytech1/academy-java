package com.bptn.course._04_arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		int[][] num = {{85, 90}, {88, 92}, {70, 65}};
        int max ;
        for(int i=0; i<num.length; i++){
            max = num[i][0];
            for(int j=1; j<num[i].length;j++){
                if(max<num[i][j]){
                    max = num[i][j];
                }
            }
            System.out.print(max+" ");
	}
  }
}
