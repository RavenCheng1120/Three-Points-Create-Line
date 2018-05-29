
public class PCL4105056005 extends PCL{
	
	public static void main(String[] args) {
		
    }
	
	public boolean checkPCL(int[][] Arr) {
		for(int i = 0 ; i < Arr.length ; i++) {
			for(int j = i+1 ; j < Arr.length ; j++) {
				int x1 = Arr[i][1];
				int y1 = Arr[i][0];
				int x2 = Arr[j][1];
				int y2 = Arr[j][0];
				for(int k = j +1 ; k < Arr.length ; k++) {
					int x3 = Arr[k][1];
					int y3 = Arr[k][0];
					int num = ((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))/2;
					int re = ((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3))%2;
					if(num == 0 && re == 0){
						return true;
					}
				}
			}
		}
		return false;			
	}
}
