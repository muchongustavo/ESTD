package estd;

public class BigDiff {
	
	public int bigDiff(int[] nums) {
		int maior = nums[0];
        int menor = nums[0];
		
		for(int num: nums){
			
			if(num > maior){
				maior = num;
			}
			
			if(num < menor){
				menor = num;
			}
		}
		int result = maior - menor;
		return result;
		
	}
}


