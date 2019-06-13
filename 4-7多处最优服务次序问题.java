//4-7多处最优服务次序问题
import java.util.Arrays;
public class servier {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int serviceCount = 2;
		int[] ip = { 56, 12, 1, 99, 1000, 234, 33, 55, 99, 812 };
		int len = ip.length;
		// 根据柜台分任务
		int[][] servicelist = new int[len / serviceCount][serviceCount];
		int cc = 0, ccc = 0, cs = 0;
		Arrays.sort(ip);
		int k = 0;
		// System.out.println(ip[0]);

		// 窗口格式化输出
		// for (int i = 0; i <len/serviceCount; i++) {
		// for(int j=0;j<serviceCount;j++) {
		// servicelist[i][j]=ip[k];
		// System.out.print(servicelist[i][j]+" ");
		// k++;
		// }
		// System.out.println();
		// }
		// System.out.println(servicelist[1][0]);

		// 服务结束时间



		//总花费的时间
		for (int i = 0; i < len / serviceCount; i++) {
			for (int j = 0; j < serviceCount; j++) {		
				if (j == 0) {
					servicelist[i][j] = ip[k] + cc;
					System.out.print(servicelist[i][j] + " ");
					k++;
					ccc = j;
				} else {
					servicelist[i][j] = ip[k] + cs;
					System.out.print(servicelist[i][j] + " ");
					k++;	
					cs = j;

				}
			}
			cs = servicelist[i][cs];
			cc = servicelist[i][ccc];
			
			System.out.println();
		}
		
		//求总时间
		int sum=0;
		for (int i = 0; i < len / serviceCount; i++) {
			for (int j = 0; j < serviceCount; j++) {		
			sum+=servicelist[i][j];			
			}			
			}
		System.out.println("最小平均等待时间："+sum/len);
	}

}
