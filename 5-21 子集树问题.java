//5-21 子集树问题
public class tree1 {   	
	static int c=10;
	static int n=5;
	static int []cs= {7,2,6,5,4};
	static int cw=0;  //当前装的重量
	static int bc=0;   //最优装载
	static int []x=new int[n];   //选择分支
	static int []all=new int[1];   //结果保留
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		b(0);
		System.out.println("最大装载重量："+all[0]);	
	}
	
	//回溯
	
public static void b(int k) {
	//退出条件
	if(k>=n) {
		if(cw>bc){
            bc = cw;
            all[0]=bc;         
       }			
	}else {
		for(int i=0;i<=1;i++) {
			x[k]=i;            //选择与不选择
 			if(cw+cs[k]*x[k]<=c) {   //限制
				cw+=cs[k]*x[k];
				b(k+1);          //递归
				cw-=cs[k]*x[k];
			}
			
			
		}
		
	}

}

}
