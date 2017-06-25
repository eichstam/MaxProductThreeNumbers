import java.util.Arrays;


public class Solution {
  public int maximumProduct(int[] nums) {
    int max = 0;
    int l = nums.length;
    int numPos = 0;

    Arrays.sort(nums);    
    for(int i = 0; i < 3; i++) {
      if(nums[l-1-i] > 0) {
        numPos++;
      }
    }
    if(l > 2) {
      if(numPos == 0) {
        max = nums[l-1] * nums[l-2] * nums[l-3];
      } else if(numPos == 3) {
        max = Math.max(nums[l-1] * nums[l-2] * nums[l-3],
            nums[0] * nums[1] * nums[l-1]);
      } else {
        max = nums[0] * nums[1] * nums[l-1];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] input1 = {1,2,3,4};
    int[] input2 = {722,634,-504,-379,163,-613,-842,-578,750,951,-158,30,-238,-392,-487,-797,-157,-374,999,-5,-521,-879,-858,382,626,803,-347,903,-205,57,-342,186,-736,17,83,726,-960,343,-984,937,-758,-122,577,-595,-544,-559,903,-183,192,825,368,-674,57,-959,884,29,-681,-339,582,969,-95,-455,-275,205,-548,79,258,35,233,203,20,-936,878,-868,-458,-882,867,-664,-892,-687,322,844,-745,447,-909,-586,69,-88,88,445,-553,-666,130,-640,-918,-7,-420,-368,250,-786};
    // Expected:943695360
    Solution s = new Solution();
    int max = 0;

    max = s.maximumProduct(input2);
    System.out.println("max: " + max);
  }
}
