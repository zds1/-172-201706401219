//4-4 磁盘文件最优存储问题
import java.util.Arrays;
public class fileSave {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	int[]	p = new int[] {33,55,22,11,9};
    int[] x = new int[p.length];
//数组元素从小到大排序
    Arrays.sort(p);
    int len=p.length;
    int n=p.length/2;
//中间最大值
    x[n]=p[len-1];
//右边次大
    for(int i=n+1; i<len; i++)
        x[i] = p[len-2*(i-n)];
//左边次次大    
    for(int i=n-1; i>=0; i--)
        x[i] = p[len-2*(n-i)-1];
    //计算
    double m=0,t=0;
    for(int i=0; i<len; i++){
        m += p[i];
        //求和
        for(int j=i+1; j<len; j++)
            t += x[i]*x[j]*(j-i);
    }
     double a=t/m/m;
    System.out.println(a );
    
	}

}
