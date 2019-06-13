//4-1 会场安排问题
public class ActivityArrangement {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int acount = 5; //活动个数
		int[][] end = { { 1, 12, 25, 27,36}, { 23, 28, 35, 80 ,50}};  //开始与结束时间	
		
		// 二维数组排序
		for (int i = 0; i < end[0].length; i++) {
			for (int j = 0; j < end[0].length - i - 1; j++) {
				if (end[1][j] > end[1][j + 1]) {
					int f = end[1][j];
					int s = end[0][j];
					end[1][j] = end[1][j + 1];
					end[1][j + 1] = f;
					end[0][j] = end[0][j + 1];
					end[0][j + 1] = s;
				}
			}
		}
		
		//输出排序后的时间安排
		for (int j = 0; j < end[0].length; j++) {
			System.out.print(end[0][j] + " ");

		}
		System.out.print("\n");
		for (int j = 0; j < end[0].length; j++) {

			System.out.print(end[1][j] + " ");
		}
		int ff = end[1][0];
		int a = 1;
		
		
		// 贪心选择
		System.out.println("\n"+"最少组合的场次分别为：");
		System.out.print(end[0][0]+" "+end[1][0]);	
		for (int i = 0; i < end[0].length; i++) {
			if (end[1][i] > ff) {        //如果前一个大于后一个				
				if (end[0][i] > ff) {   //如果开始时间大于结束时间
					ff = end[1][i];
					a += 1;	
					System.out.print("\n"+end[0][i]+" "+end[1][i]);				
				}
			} 
		}
		System.out.println("\n"+"最少会场数为："+a);		
	}
}


