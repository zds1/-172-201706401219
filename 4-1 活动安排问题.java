//4-1 �᳡��������
public class ActivityArrangement {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int acount = 5; //�����
		int[][] end = { { 1, 12, 25, 27,36}, { 23, 28, 35, 80 ,50}};  //��ʼ�����ʱ��	
		
		// ��ά��������
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
		
		//���������ʱ�䰲��
		for (int j = 0; j < end[0].length; j++) {
			System.out.print(end[0][j] + " ");

		}
		System.out.print("\n");
		for (int j = 0; j < end[0].length; j++) {

			System.out.print(end[1][j] + " ");
		}
		int ff = end[1][0];
		int a = 1;
		
		
		// ̰��ѡ��
		System.out.println("\n"+"������ϵĳ��ηֱ�Ϊ��");
		System.out.print(end[0][0]+" "+end[1][0]);	
		for (int i = 0; i < end[0].length; i++) {
			if (end[1][i] > ff) {        //���ǰһ�����ں�һ��				
				if (end[0][i] > ff) {   //�����ʼʱ����ڽ���ʱ��
					ff = end[1][i];
					a += 1;	
					System.out.print("\n"+end[0][i]+" "+end[1][i]);				
				}
			} 
		}
		System.out.println("\n"+"���ٻ᳡��Ϊ��"+a);		
	}
}


