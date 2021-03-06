/**
 * §è¶E_ÂwW,ä_wWIüi·xÀü|`,_üiZIêûäo£©oeÏ,ÀÝ|`ßöäoÅåeÏ
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
