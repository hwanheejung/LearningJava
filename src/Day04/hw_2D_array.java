package Day04;

public class hw_2D_array {
	public static void main(String[] args) {
		int[][] nums = {
				{1, 2, 3, 4, 5, 6, 7},
				{8, 9, 10, 11, 12, 13, 14},
				{15, 16, 17, 18, 19, 20, 21},
				{22, 23, 24, 25, 26, 27, 28},
				{29, 30, 31, 32, 33, 34, 35},
				{36, 37, 38, 39, 40, 41, 42},
				{43, 44, 45, 46, 47, 48, 49},
				
		};
		
		for(int sum = 0; sum <= 12; sum++) {
			if(sum < 7) {
				if(sum % 2 == 0) {
					for(int j = 0; j <= sum; j++) {
						int i = sum - j;
						System.out.print(nums[i][j] + " ");
					}
					
				} else if (sum % 2 == 1){
					for(int i = 0; i <= sum; i++) {
						int j = sum - i;
						System.out.print(nums[i][j] + " ");
					}
				}
				System.out.println();
			}else {
				if(sum % 2 == 1) {
				for(int j = 6; j >= sum - 6; j--) {
					int i = sum - j;
					System.out.print(nums[i][j] + " ");
					
				}
				
			} else if(sum % 2 == 0) {
				for(int i = 6; i >= sum - 6; i--) {
					int j = sum - i;
					System.out.print(nums[i][j] + " ");
				}
			}			
			System.out.println();
				
				
			}

		}
		
		
		
		
	}

}



