//5-8 �����任����
public class zhegnshu {
   static int a=15; //��Ҫ�任����
   static int b=4;  //��Ҫ�任�ɵ�����
   static  int []c=new int[100]; //��¼�³��ֹ�������
   static int []cc=new int[100];
   static int p=0;
   static int pp=100;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
         d(a);
         for(int i=pp;i>=1;i--){
             if(cc[i]==2)System.out.print("f");
             if(cc[i]==1)System.out.print("g");
         }
		
	}
public static void d(int k) {
	//���������
	if(k==b) {
		if(p<pp) {
			pp=p;
			for(int i=1;i<=pp;i++) {
				cc[i]=c[i];
			}
		}
		
	}
	//g�Ĳ���
	int t=k/2;
	p++;
	if(p<pp&&k>0) {
		c[p]=1;
		d(t);
	}
	p--;   //����
	
	//f�Ĳ���
	 t=k*3;
	p++;
	if(p<pp) {
		c[p]=2;
		d(t);
	}
	p--;   //����	
	}
	
	
}


	
	

