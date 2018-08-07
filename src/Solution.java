/**
 * 制定左右兩個指標,比對兩指標的線段長度並向中央掃描,且將兩線段中短的一方與距離相乘求出容積,並在掃描過程中比對出最大容積
 * @author black
 *
 */
public class Solution {
	public int maxArea(int[] height) {
		int maxArea=0;
		int left=0;
		int right = height.length-1;
		while(left < right && left >= 0 && right <= height.length-1)
		{
			maxArea = Math.max(maxArea, Math.min(height[left], height[right])*(right-left));
			if(height[left] < height[right])
			{
				left++;
			}
			else
			{
				right--;
			}
		}
        return maxArea;
    }
}
