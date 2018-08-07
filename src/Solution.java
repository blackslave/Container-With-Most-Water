/**
 * ���荶�E�_�w�W,�䛔�_�w�W�I���i���x���������|�`,�����_���i���Z�I����o�����������o�e��,���ݑ|�`�ߒ����䛔�o�ő�e��
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
