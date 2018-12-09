package coding;

public class AmazonCellCompete {
public static void main(String args[]) {
	int[] cell = {1,1,1,0,1,1,1,1};
	int days = 2;
	System.out.println(cellCompete(cell,days));
}

public static int[] cellCompete(int[] cell, int days) {
	int[] resultArray = new int[cell.length];
	int tempResult;
	for(int i = 0; i < cell.length; i++) {
		if(i == 0) {
			if(cell[i+1] == 0)
				resultArray[i] = 0;
			else
				resultArray[i] = 1;
		}
		else if(i == cell.length - 1) {
			if(cell[i - 1] == 0)
				resultArray[i] = 0;
			else
				resultArray[i] = 1;
		}
		else {
			if(cell[i - 1] == cell[i + 1])
				resultArray[i] = 0;
			else
				resultArray[i] = 1;
		}
	}
	if(days > 1) {
		
	}
	return null;
}
}
