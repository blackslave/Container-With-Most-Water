/**
 * 給N個正整數a1,a2,...,an,其中每個代表一個點座標(i,an).
 * 形成N個垂直線段如(i,ai)和(i,0)
 * 找到兩個線段與X軸形成容器,使其裝入最多的水量
 * @author black
 *
 */
public class maxArea {
	public static void main(String[] args)
	{
		Solution Solution = new Solution();
		int []  height = {10, 1, 2, 3, 4, 5, 6, 7, 11};
		System.out.println(Solution.maxArea(height));
	}
}
