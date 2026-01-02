import java.util.Scanner;

//961. N-Repeated Element in Size 2N Array
public class NReapeatedElement{
	public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.contains(num)) set.add(num);
            else{
                return num;
            }
        }
        return 0;
    }
}