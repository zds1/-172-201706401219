//5-21 �Ӽ�������
public class tree1 {   	
	static int c=10;
	static int n=5;
	static int []cs= {7,2,6,5,4};
	static int cw=0;  //��ǰװ������
	static int bc=0;   //����װ��
	static int []x=new int[n];   //ѡ���֧
	static int []all=new int[1];   //�������
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		b(0);
		System.out.println("���װ��������"+all[0]);	
	}
	
	//����
	
public static void b(int k) {
	//�˳�����
	if(k>=n) {
		if(cw>bc){
            bc = cw;
            all[0]=bc;         
       }			
	}else {
		for(int i=0;i<=1;i++) {
			x[k]=i;            //ѡ���벻ѡ��
 			if(cw+cs[k]*x[k]<=c) {   //����
				cw+=cs[k]*x[k];
				b(k+1);          //�ݹ�
				cw-=cs[k]*x[k];
			}
			
			
		}
		
	}

}

}
