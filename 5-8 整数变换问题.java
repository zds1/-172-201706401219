//5-8 整数变换问题
public class zhegnshu {
   static int a=15; //需要变换成数
   static int b=4;  //需要变换成的数字
   static  int []c=new int[100]; //记录下出现过的数字
   static int []cc=new int[100];
   static int p=0;
   static int pp=100;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
         d(a);
         for(int i=pp;i>=1;i--){
             if(cc[i]==2)System.out.print("f");
             if(cc[i]==1)System.out.print("g");
         }
		
	}
public static void d(int k) {
	//输出的条件
	if(k==b) {
		if(p<pp) {
			pp=p;
			for(int i=1;i<=pp;i++) {
				cc[i]=c[i];
			}
		}
		
	}
	//g的步骤
	int t=k/2;
	p++;
	if(p<pp&&k>0) {
		c[p]=1;
		d(t);
	}
	p--;   //回溯
	
	//f的步骤
	 t=k*3;
	p++;
	if(p<pp) {
		c[p]=2;
		d(t);
	}
	p--;   //回溯	
	}
	
	
}


	
	

