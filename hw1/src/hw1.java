import java.util.Scanner;

public class hw1 {public static void main(String[] args) {
		
		Boolean k=true;//�w�qk�P�_�O�_���s�p��
		int money = 5000 ;//5���饻��
		do{System.out.println("�z�n�A�w��!");    		//�}�Y���y�z do��loop�}�Y
		System.out.println("�п�J�۹���������覡�G"); //�}�Y���y�z 
		System.out.println("1 �l�����");				//�}�Y���y�z		
		System.out.println("2 �W�ӻ��");				//�}�Y���y�z				
		System.out.println("3 EE Pay");					//�}�Y���y�z			
		System.out.println("4 ���j�Ȧ�H�Υd");			//�}�Y���y�z			
		System.out.println("5 �q����I");				//�}�Y���y�z
		System.out.println("6 �ϥλ���");				//�}�Y���y�z
		Scanner scanner = new Scanner(System.in);		//�إߵ��ϥΪ̿�J�Ʀr���a��
		int num1;										//�w�qnum1
		num1 = scanner.nextInt();						//num1 ����J��(�λ���覡)
		try {											//try - finally �ϵ{�����|�]���Ĥ@�Ӱ��D��J���ӥd��(�Ҧp��J9�|������finally)
		if (num1 == 1) {								//�p�Gnum1��1�O�l�����
			System.out.println("�z��ܶl�����");		//��r�^��
			System.out.println("�l�����̲ת��B��"+ money+"��");}  //�^���̲ת��B
		
		else if (num1 == 2) {							//�p�Gnum1��2�O�W�ӻ��
			System.out.println("�z��ܶW�ӻ��");		//��r�^��
			int finalmoney7_11 = money + 200;			//�w�qfinalmoney7_11��5000+�[�e��200
			System.out.println("�W�ӻ���u�f�[�X200��");//��r�^��
			System.out.println("�z�̲ת��B��"+finalmoney7_11+"��");}    //�^���̲ת��B
		
		else if (num1 == 3) {							//�p�Gnum1��3�OEE Pay
			System.out.println("�z���EE Pay");  	 	//��r�^��
			System.out.println("�O�_���s�Τ�H");   	//���ݬO�_�s�Τ�
			System.out.println("�O�Ы�1 �_�Ы�0"); 		//�����ﶵ
			Scanner scanner1 = new Scanner(System.in); 	//�إߵ��ϥΪ̿�J�Ʀr���a��
			int num2;    //�w�qnum2
			num2 = scanner1.nextInt();    //num2����J��(�Oor�_)
			if (num2 == 1) {    //num2=1 �Y�O�s�Τ�
				System.out.println("�z�O�s�Τ�C");//��r�^��
				System.out.println("�п�J�z���ĴX��Τ�j�w�C");//���ݬ��ĴX��Τ�
				Scanner scanner2 = new Scanner(System.in); //�إߵ��ϥΪ̿�J�Ʀr���a��
				int num3;   //�w�qnum3
				num3 = scanner2.nextInt();   //num3 ����J��(�ĴX��)
				if(num3 <= 30000 ) {System.out.println("�z���s�Τ��u�f�[�X300���B���e 30000 �H�j�w�u�f�[�X100���ó̲ת��B�A�h 10%�I"); //num3<=30000 ����r�^��
					int finalmoney1_1 = (int) ((money + 100 + 300 )*1.1) ; System.out.println("�z�̲ת��B��"+finalmoney1_1+"��");}   //�^���̲ת��B
				else if(num3 >30000 ) {System.out.println("�z�D�e30000�H�j�w�A�����s�Τ��u�f�[�X300���ó̲ת��B�A�h 10%�I");//num3>30000 ����r�^��
					int finalmoney1_0 = (int) ((money + 300 )*1.1) ; System.out.println("�z�̲ת��B��"+finalmoney1_0+"��");}}   //�^���̲ת��B
				else if(num2==0) {     //num2=1 �Y�D�s�Τ�
				System.out.println("�z���O�s�Τ�");//��r�^��
				System.out.println("�п�J�z���ĴX��Τ�j�w�C");//���ݬO�_�s�Τ�
				Scanner scanner2 = new Scanner(System.in); //�إߵ��ϥΪ̿�J�Ʀr���a��
				int num3;//�w�qnum3
				num3 = scanner2.nextInt();//num3 ����J��(�ĴX��)
				if(num3 <= 30000) {System.out.println("�z���e 30000 �H�j�w�u�f�[�X100���ó̲ת��B�A�h 10%�I");//num3<=30000 ����r�^��
					int finalmoney0_1 = (int) ((money + 100 )*1.1) ; System.out.println("�z�̲ת��B��"+finalmoney0_1+"��");}//�^���̲ת��B
				else if(num3 > 30000) {System.out.println("�z�D�e30000�H�j�w�A��EE Pay �u�f�[�X�̲ת��B�A�h 10%�I");//num3>30000 ����r�^��
					int finalmoney0_0 = (int) ((money  )*1.1) ; System.out.println("�z�̲ת��B��"+finalmoney0_0+"��");}}}//�^���̲ת��B
						
			else if (num1 == 4) {//�p�Gnum1��4�O���j�Ȧ�H�Υd
				System.out.println("�z��ܦ��j�Ȧ�H�Υd");//��r�^��
				System.out.println("�п�J�z���ĴX��Τ�j�w�C");//���ݬ��ĴX��Τ�
				Scanner scanner3 = new Scanner(System.in); //�إߵ��ϥΪ̿�J�Ʀr���a��
				int num4;//�w�qnum4
				num4 = scanner3.nextInt();//num4 ����J��(�ĴX��)
				if(num4 <= 1000 ) {//�e 1000 �H
				System.out.println("�z���e 1000 �H�j�w�C");//num4<=1000 ����r�^��
				System.out.println("�O�_�㦨�j�ǥͨ����H"); //���ݬO�_�㦨�j�ǥͨ����H
				System.out.println("�O�Ы�1 �_�Ы�0");//�����ﶵ
				Scanner scanner4 = new Scanner(System.in); //�إߵ��ϥΪ̿�J�Ʀr���a��
				int num5;//�w�qnum5
				num5 = scanner4.nextInt();//num5����J��(�Oor�_)
				if(num5 == 1) {System.out.println("�z���e 1000 �H�j�w�u�f�[�X5000���B�㦨�j�ǥͨ����u�f�[�X�̲ת��B�h 10%�I");//�e 1000 �H+�㦨�j�ǥͨ�������r�^��
					int cfinalmoney1_1 = (int) ((money + 5000 )*1.1) ; System.out.println("�z�̲ת��B��"+cfinalmoney1_1+"��");}//�^���̲ת��B
				else if(num5 == 0) {System.out.println("�z���e 1000 �H�j�w�u�f�[�X5000���I");//�e 1000 �H����r�^��
					int cfinalmoney1_0 = (int) ((money + 5000 )) ; System.out.println("�z�̲ת��B��"+cfinalmoney1_0+"��");}}//�^���̲ת��B
			else if(num4 > 1000 ) {//�D�e 1000 �H
				System.out.println("�z�D�e 1000 �H�j�w�C");//num4>1000 ����r�^��
				System.out.println("�O�_�㦨�j�ǥͨ����H");//���ݬO�_�㦨�j�ǥͨ����H
				System.out.println("�O�Ы�1 �_�Ы�0");//�����ﶵ
				Scanner scanner4 = new Scanner(System.in); //�إߵ��ϥΪ̿�J�Ʀr���a��
				int num5;//�w�qnum5
				num5 = scanner4.nextInt();//num5����J��(�Oor�_)
				if(num5 == 1) {System.out.println("�z�㦨�j�ǥͨ����u�f�[�X�̲ת��B�h 10%�I");//�㦨�j�ǥͨ�������r�^��
					int cfinalmoney0_1 = (int) ((money  )*1.1) ; System.out.println("�z�̲ת��B��"+cfinalmoney0_1+"��");}//�^���̲ת��B
				else if(num5 == 0) {System.out.println("���߱z���������5000���I");//�����O����r�^��
					int cfinalmoney1_0 = (int) (money ) ; System.out.println("�z�̲ת��B��"+cfinalmoney1_0+"��");}}}//�^���̲ת��B
		
			else if (num1 == 5) {//�p�Gnum1��5�O�q����I
				System.out.println("�z��ܹq����I");//��r�^��
				System.out.println("�O�_���s�Τ�H");//���ݬO�_���s�Τ�
				System.out.println("�O�Ы�1 �_�Ы�0");//�����ﶵ
				Scanner scanner5 = new Scanner(System.in);//�إߵ��ϥΪ̿�J�Ʀr���a��
				int num6;//�w�qnum6
				num6 = scanner5.nextInt();//num6 ����J��(�ĴX��)
				if(num6 == 1) {//���s�Τ��
				System.out.println("�z���s�Τ�C");//��r�^��
				System.out.println("�O�_�㦨�j�ǥͨ����H");//���ݬO�_�㦨�j�ǥͨ���
				System.out.println("�O�Ы�1 �_�Ы�0");//�����ﶵ
				Scanner scanner6 = new Scanner(System.in);//�إߵ��ϥΪ̿�J�Ʀr���a��
				int num7; //�w�qnum7
				num7 = scanner6.nextInt();//num7����J��(�Oor�_)
				if(num7 == 1) {System.out.println("�z���s�Τ��u�f�[�X+8700���B�㦨�j�ǥͨ����u�f�[�X�̲ת��B�h 2%�I");//�s�Τ�+�㦨�j�ǥͨ�������r�^��
					int dfinalmoney1_1 = (int) ((money+8700  )*1.02) ; System.out.println("�z�̲ת��B��"+dfinalmoney1_1+"��");}//�^���̲ת��B
				else if(num7 == 0){System.out.println("�z���s�Τ��u�f�[�X+8700���I");//�s�Τ᪺��r�^��
					int dfinalmoney1_0 = (int) ((money+8700  )) ; System.out.println("�z�̲ת��B��"+dfinalmoney1_0+"��");}}//�^���̲ת��B
		
				else if(num6 == 0) {//�D�s�Τ��
				System.out.println("�z�D�s�Τ�C");//��r�^��
				System.out.println("�O�_�㦨�j�ǥͨ����H");//���ݬO�_�㦨�j�ǥͨ���
				System.out.println("�O�Ы�1 �_�Ы�0");//�����ﶵ
				Scanner scanner6 = new Scanner(System.in);//�إߵ��ϥΪ̿�J�Ʀr���a��
				int num7; //�w�qnum7
				num7 = scanner6.nextInt();//num7����J��(�Oor�_)
				if(num7 == 1) {System.out.println("�z�㦨�j�ǥͨ����u�f�[�X�̲ת��B�h 2%�I");//�㦨�j�ǥͨ�������r�^��
					int dfinalmoney0_1 = (int) ((money)*1.02) ; System.out.println("�z�̲ת��B��"+dfinalmoney0_1+"��");}//�^���̲ת��B
				else if(num7 == 0) {System.out.println("���߱z���������5000���I");//�����O����r�^��
					int dfinalmoney0_0 = (int) (money) ; System.out.println("�z�̲ת��B��"+dfinalmoney0_0+"��");}}}//�^���̲ת��B
			else if (num1 == 6) {//�p�Gnum1��6�O�ϥλ���
				System.out.println("�ϥλ����G�z�N�|�ݨ줻�ӿﶵ�A���O�s��1~6 �̾ڱz�ҿ�ܪ�����覡��J�������s���A�����b��L�W��J���ݲ��ʷƹ��I��");//�ϥλ���
				System.out.println("�p�G��J���O1~2�Y�i�����`�g�B�A�p�G�O3~5�h�̾��D�ت����D�^���O/�_(�O���N����1 �_���N����0)");//�ϥλ���
				System.out.println("�Y�ݨ�  �п�J�z���ĴX��Τ�C �зӹ��J�z���ĭӴX�Τ�j�w�A�^������Y�i�����`�g�B�C");}//�ϥλ���
				
			}finally {//try��̫�@�B��finally
					System.out.println("�z�O�_�ݭ��s�}�l�@���s���p��H");//���ݬO�_�ݭ��s�}�l�@���s���p��
					System.out.println("�O�Ы�1 �_�Ы�0");}//�����ﶵ
					Scanner scanner7 = new Scanner(System.in);//�إߵ��ϥΪ̿�J�Ʀr���a��
					int num8;//�w�qnum8
					num8 = scanner7.nextInt();//num8����J��(�Oor�_)
					if(num8 == 1) {k=true;}//�^���O�Ok=true
					else if(num8 == 0) {k=false;System.out.println("�P�±z���ϥΡI");}//�^���_�Ok=false �òפ�{�� �^���P�±z���ϥ�
					;}while(k == true);}}//k=true�ɭ��Ӧ^��do
					
			
		
		
    	 				
			  	
	 



