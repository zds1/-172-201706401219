//4-4 �����ļ����Ŵ洢����
import java.util.Arrays;
public class fileSave {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	int[]	p = new int[] {33,55,22,11,9};
    int[] x = new int[p.length];
//����Ԫ�ش�С��������
    Arrays.sort(p);
    int len=p.length;
    int n=p.length/2;
//�м����ֵ
    x[n]=p[len-1];
//�ұߴδ�
    for(int i=n+1; i<len; i++)
        x[i] = p[len-2*(i-n)];
//��ߴδδ�    
    for(int i=n-1; i>=0; i--)
        x[i] = p[len-2*(n-i)-1];
    //����
    double m=0,t=0;
    for(int i=0; i<len; i++){
        m += p[i];
        //���
        for(int j=i+1; j<len; j++)
            t += x[i]*x[j]*(j-i);
    }
     double a=t/m/m;
    System.out.println(a );
    
	}

}
