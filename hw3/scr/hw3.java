import java.util.ArrayList;//�ϥ�ARRAYLIST

class fish1 {//�ճ�����class
	private static String name = "�ճ���";//����name
	private static double weight = 7.0;//������l���q
	private static double weight_limit = 15;//�����̤j�魫
	private static int temperature = 15;//����A�����̧C�ū�
	private static String isAlive = "�s��";//�s�����A
	static String getName(){//���o�W�r
		return name; 
	 }
	static double getWeight(){//���o��l���q
		  return weight; 
		 }
	static double getWeightLimit(){//���o�魫�W��
		 return weight_limit; 
	}
	static int getTemperature(){//���o�A���ū�
		return temperature; 
	}
	static String getAlive(){//���o���A
		return isAlive; 
	}
	public static void showData(){//��ܦU���ƾ�
		System.out.printf("%-17.15s %-9.1f %7.1f  %10s   %6s\r\n",name,weight,weight_limit,temperature,isAlive);//�^���ϥΪ�
	}
}
class fish2 {//��������class
	private static String name = "������";//����name
	private static double weight = 5.0;//������l���q
	private static double weight_limit = 10;//�����̤j�魫
	private static int temperature = 10;//����A�����̧C�ū�
	private static String isAlive = "�s��";//�s�����A
	static String getName(){//���o�W�r
		return name; 
	 }
	static double getWeight(){//���o��l���q
		  return weight; 
		 }
	static double getWeightLimit(){//���o�魫�W��
		 return weight_limit; 
	}
	static int getTemperature(){//���o�A���ū�
		return temperature; 
	}
	static String getAlive(){//���o���A
		return isAlive; 
	}
	public static void showData(){//��ܦU���ƾ�
		System.out.printf("%-17.15s %-9.1f %7.1f  %10s   %6s\r\n",name,weight,weight_limit,temperature,isAlive);
	}
}
class shrimp1 {//���I�̽���class
	private static String name = "���I�̽�";//����name
	private static double weight = 1.0;//������l���q
	private static double weight_limit = 10;//�����̤j�魫
	private static String isAlive = "�s��";//�s�����A
	static String getName(){//���o�W�r
		return name; 
	 }
	static double getWeight(){//���o��l���q
		  return weight; 
		 }
	static double getWeightLimit(){//���o�魫�W��
		 return weight_limit; 
	}
	static String getAlive(){//���o���A
		return isAlive; 
	}
	public static void showData(){//��ܦU���ƾ�
		System.out.printf("%-17.15s %-8.1f %7.1f    %6s\r\n",name,weight,weight_limit,isAlive);
	}
}
class shrimp2 {//���K����class
	private static String name = "���K��";//����name
	private static double weight = 1.5;//������l���q
	private static double weight_limit = 12;//�����̤j�魫
	private static String isAlive = "�s��";//�s�����A
	static String getName(){//���o�W�r
		return name; 
	 }
	static double getWeight(){//���o��l���q
		  return weight; 
		 }
	static double getWeightLimit(){//���o�魫�W��
		 return weight_limit; 
	}
	static String getAlive(){//���o���A
		return isAlive; 
	}
	public static void showData(){//��ܦU���ƾ�
		System.out.printf("%-19.15s %-8.1f %6.1f    %6s\r\n",name,weight,weight_limit,isAlive);
	}
}
class CommandList {//���O��
	private static String addString = "add";//���O�Τ@�x�s��K���ק�
	private static String coldString = "cold";//���O�Τ@�x�s��K���ק�
	private static String feedString = "feed";//���O�Τ@�x�s��K���ק�
	private static String showString = "show";//���O�Τ@�x�s��K���ק�
	private static String nextString = "next";//���O�Τ@�x�s��K���ק�
	private static String exitString = "exit";//���O�Τ@�x�s��K���ק�
	private static String helpString = "--help";//���O�Τ@�x�s��K���ק�
	static String getadd () {//�^��add���O
		return addString;
	}
	static String getcold () {//�^��cold���O
		return coldString;
	}
	static String getfeed () {//�^��feed���O
		return feedString;
	}
	static String getshow () {//�^��show���O
		return showString;
	}
	static String getnext () {//�^��next���O
		return nextString;
	}
	static String getexit () {//�^��exit���O
		return exitString;
	}
	static String gethelp () {//�^��help���O
		return helpString;
	}
}

public class hw3 {//hw3
	public static String Sep  = " ";//���}���O�Ϊ�
	public static ArrayList<String> allfishname = new ArrayList<String>();//�����W�r��ARRAYLIST
	public static ArrayList<String> allfishalivelist = new ArrayList<String>();//�����s�����A��ARRAYLIST
	public static ArrayList<Double> allfishweight = new ArrayList<Double>();//�����魫��ARRAYLIST
	public static ArrayList<Integer> allfishgrow = new ArrayList<Integer>();//������ߪ�ARRAYLIST
	public static ArrayList<Integer> allfishgrown = new ArrayList<Integer>();//�����O�_�����b��ߪ�ARRAYLIST
	public static ArrayList<Integer> isFeed = new ArrayList<Integer>();//�����O�_�w������ARRAYLIST
	public static int noralTemperature = 25 ; //�Ƿ�
	public static int Day = 1;//�Ѽ�
	public static String cmd;//���O��J���N��
	public static String food;//�x�s���a��J��foodtype
	public static String cold;//�x�s���a�O�_��Jcold
 	public static void main(String[] args) {//�D�{��
		System.out.println("�w��C���A�п�J���O");//�w��
		System.out.println("���ѬO��" + Day + "��");//��ܤѼ�
		showmsg();//��ܫ��O��
		boolean k = true;//do while loop ���P�_����
		do {//loop start
			System.out.print("�п�J���O�G");
			cmd = ConsoleIn.readLine();//��J�Ȭ�cmd
			if (cmd.contains(CommandList.getadd())) {//���O��add fish
				addnewfish(cmd);//����addnewfish
			}else if (cmd.contains(CommandList.getfeed())) {//���O�� feed
				System.out.println("�w�����}��");//�^���ϥΪ�
				food = cmd;//����cmd(�D��U����)
				isFeed (food);//��isFeed�P�_
			}else if (cmd.compareTo(CommandList.getcold()) == 0) {//���O�� cold
				System.out.println("�H�y�Y�N��ŧ");//�^���ϥΪ�
				cold = cmd;//����cmd(�D��U����)
				isCold(cold);//��isCold�P�_
			}else if (cmd.compareTo(CommandList.getshow()) == 0) {//���O�� show
				showAll();//����showall
			}else if (cmd.compareTo(CommandList.getnext()) == 0) {//���O�� next
				nextDay ();//����nextDay
			}else if (cmd.compareTo(CommandList.getexit()) == 0) {//���O�� exit
				System.out.println("�P�¹C���I");//�^���ϥΪ�
				k = false ;//loop stop
				System.exit(0);//exit
			}else if (cmd.contains(CommandList.gethelp())) {//���O�� help
				showmsg();//��ܫ��O��
			}else {
				System.out.println("���O���~�I");//�^���ϥΪ�
				showmsg();//��ܫ��O��
			}
		} while (k == true);//loop
	}
	public static void showmsg() {//��ܫ��O��
		System.out.println("�i�޷s����/���G add  �i��/���s���j �i�ƥءj  Ex.add S2 3 �h�i�T�����K���C");//���O����
		System.out.println("��}��       �G feed �i�}�������j            Ex.feed 2   �������Ź}�ơC");//���O����
		System.out.println("�H�y         �G cold                         Ex.cold     ��Ѭ��H�y�A���ŭ��� 12 �סC");//���O����
		System.out.println("��ܷ�e���A �G show                         Ex.show     ��ܷ�e���ڽc���Ҧ��ͪ������A�C");//���O����
		System.out.println("�������     �G next                         Ex.next     ������ѡA�i�J�U�@�ѡC");//���O����
		System.out.println("�����{��     �G exit                         Ex.exit     �����{���C");//���O����
		System.out.println("���O����     �G --help                       Ex.--help   ������O���ܡC");//���O����
		System.out.println("��/���s��    �G F1 �ճ��� �B F2 �������BS1���I�̽��BS2���K��");//���O����
		System.out.println("�}������     �G 1 �W�Ź}�ơB2 ���Ź}�ơB3 �@��}��");//���O����
	}
	public static void addnewfish (String sIn) {//addnewfish�����O
		String[] AfterSplit;//AfterSplit���n���������O
		AfterSplit = sIn.split(Sep,3);//��3�� �� Sep �@�����α���
		String temp;//temp ��num�����~��
		int num;//���n�i�X��
		temp = AfterSplit[2];//temp ��num�����~��
		num = Integer.parseInt(temp);//�w�qnum����
		if (AfterSplit.length == 3) {//���O�����ץ��T
			if (AfterSplit[1].compareTo("F1") == 0) {//��fish1
				System.out.printf("%-15.15s %-5s   %-5s    %-5s   %-5s\r\n","�����W��","��l�魫","�魫�W��","�A�X�ū�","�s�`");//title
				for (int i = 0; i < num; i++) {//�i�X���N����X��
					allfishname.add(fish1.getName());//�[�Jname��ARRAYLIST��
					allfishalivelist.add(fish1.getAlive());//�[�J���A��ARRAYLIST��
					allfishweight.add(fish1.getWeight());//�[�J�魫��ARRAYLIST��
					allfishgrow.add(0);//�����|��ߡA������I�����P�@��������ƩҥH���M�[�J
					allfishgrown.add(0);//�����|��ߡA������I�����P�@��������ƩҥH���M�[�J
					isFeed.add(0);//���j�Ѽ� ��l��0
					fish1.showData();//����showdata
				}
			}else if (AfterSplit[1].compareTo("F2") == 0) {//��fish2
				System.out.printf("%-15.15s %-5s   %-5s    %-5s   %-5s\r\n","�����W��","��l�魫","�魫�W��","�A�X�ū�","�s�`");//title
				for (int i = 0; i < num; i++) {//�i�X���N����X��
					allfishname.add(fish2.getName());//�[�Jname��ARRAYLIST��
					allfishalivelist.add("�s��");//�[�J���A��ARRAYLIST��
					allfishweight.add(fish2.getWeight());//�[�J�魫��ARRAYLIST��
					allfishgrow.add(0);//�����|��ߡA������I�����P�@��������ƩҥH���M�[�J
					allfishgrown.add(0);//�����|��ߡA������I�����P�@��������ƩҥH���M�[�J
					isFeed.add(0);//���j�Ѽ� ��l��0
					fish2.showData();//����showdata
				}
			}else if (AfterSplit[1].compareTo("S1") == 0) {
				System.out.printf("%-15.15s %-5s   %-5s     %-5s\r\n","�����W��","��l�魫","�魫�W��","�s�`");//title
				for (int i = 0; i < num; i++) {//�i�X���N����X��
					allfishname.add(shrimp1.getName());//�[�Jname��ARRAYLIST��
					allfishalivelist.add(shrimp1.getAlive());//�[�J���A��ARRAYLIST��
					allfishweight.add(shrimp1.getWeight());//�[�J�魫��ARRAYLIST��
					allfishgrow.add(0);//��ߪ������p��
					allfishgrown.add(0);//��ߪ������p��
					isFeed.add(0);//���j�Ѽ� ��l��0
					shrimp1.showData();//����showdata
				}
			}else if (AfterSplit[1].compareTo("S2") == 0) {
				System.out.printf("%-15.15s %-5s   %-5s     %-5s\r\n","�����W��","��l�魫","�魫�W��","�s�`");//title
				for (int i = 0; i < num; i++) {//�i�X���N����X��
					allfishname.add(shrimp2.getName());//�[�Jname��ARRAYLIST��
					allfishalivelist.add(shrimp2.getAlive());//�[�J���A��ARRAYLIST��
					allfishweight.add(shrimp2.getWeight());//�[�J�魫��ARRAYLIST��
					allfishgrow.add(0);//��ߪ������p��
					allfishgrown.add(0);//��ߪ������p��
					isFeed.add(0);//���j�Ѽ� ��l��0
					shrimp2.showData();//����showdata
				}
			}else {
				System.out.println("���O���~");//���O���~���^��
				showmsg();//���O��
			}
		}else {
			System.out.println("���O���~");//���O���~���^��
			showmsg();//���O��
		}
	}
	public static void showAll() {//���Oshowall
		System.out.printf("%-15.15s %s     %s\r\n","�����W��","�s�`","�魫");//title
		for (int i = 0; i < allfishname.size(); i++) {//�j�M��������
			System.out.printf("%-15.15s %-6.6s %-6.2f \r\n",allfishname.get(i) , allfishalivelist.get(i) , allfishweight.get(i));//�qARRAYLIST�o����
		}
	}
	public static void cold() {//���Ocold
		noralTemperature = 12;//�]�w�ǷŬ�12��
		System.out.println("�H�y��ŧ�I�ū׭���" + noralTemperature +"��!");//�^���ϥΪ�
		for (int i = 0; i < allfishname.size(); i++) {//�j�M��������
			if (fish1.getTemperature() < noralTemperature &&//�L�k�Ԩ����ū׮�
				allfishname.get(i).compareTo(fish1.getName()) == 0 &&//�P�_�W��
				true == isCold(cold)) {//���e��J�Lcold
				allfishalivelist.set(i, "�w���`");//���A�אּ���`
				System.out.println("�ճ����w���`");//�^���ϥΪ�
			}else if (fish2.getTemperature() < noralTemperature &&//�L�k�Ԩ����ū׮�
					allfishname.get(i).compareTo(fish2.getName()) == 0 &&//�P�_�W��
					true == isCold(cold)) {//���e��J�Lcold
				allfishalivelist.set(i, "�w���`");//���A�אּ���`
				System.out.println("�������w���`");//�^���ϥΪ�
			}
		}
		cold = null;//�R�����e������
		noralTemperature = 25;//�^��Ƿ�
	}
	public static void feed(String sIn) {//����feed ���O
		String[] AfterSplit;//AfterSplit���n���������O
		AfterSplit = sIn.split(Sep,2);//��2�� �� Sep �@�����α���
		String temp;//temp ��foodtype�����~��
		int foodtype;//�w�qfoodtype
		temp = AfterSplit[1];//temp ��foodtype�����~��
		foodtype = Integer.parseInt(temp);//assign foodtype����
		if (true == isFeed(sIn)) {//���e��J�Lfeed
			if (AfterSplit.length == 2) {//���O���ץ��T
				for (int i = 0; i < allfishname.size(); i++) {//�j�M��������
					isFeed.set(i, 0);//0��ܤ��O���j
				}
				for (int i = 0; i < allfishname.size(); i++) {//�j�M��������
					if (foodtype == 1 &&//����1���}��
							allfishalivelist.get(i).compareTo("�s��") == 0) {//�s������
						if (allfishname.get(i).compareTo(fish1.getName()) == 0) {//�̾ڦW�ٱo�줣�P�������Y��
							allfishweight.set(i,allfishweight.get(i) + (2*0.4));//�魫�W�[
						}else if (allfishname.get(i).compareTo(fish2.getName()) == 0) {//�̾ڦW�ٱo�줣�P�������Y��
							allfishweight.set(i,allfishweight.get(i) + (2*0.3));//�魫�W�[
						}else if (allfishname.get(i).compareTo(shrimp1.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
								allfishgrow.get(i) == 0) {//�D��ߤ�
							allfishweight.set(i,allfishweight.get(i) + (2*0.1));//�魫�W�[
						}else if (allfishname.get(i).compareTo(shrimp2.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
								allfishgrow.get(i) == 0) {//�D��ߤ�
							allfishweight.set(i,allfishweight.get(i) + (2*0.2));//�魫�W�[
						}
					}else if (foodtype == 2 && //����2���}��
							allfishalivelist.get(i).compareTo("�s��") == 0) {//�s������
						if (allfishname.get(i).compareTo(fish1.getName()) == 0) {//�̾ڦW�ٱo�줣�P�������Y��
							allfishweight.set(i,allfishweight.get(i) + (1.5*0.4));//�魫�W�[
						}else if (allfishname.get(i).compareTo(fish2.getName()) == 0) {//�̾ڦW�ٱo�줣�P�������Y��
						allfishweight.set(i,allfishweight.get(i) + (1.5*0.3));//�魫�W�[
						}else if (allfishname.get(i).compareTo(shrimp1.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
								allfishgrow.get(i) == 0) {
							allfishweight.set(i,allfishweight.get(i) + (1.5*0.1));//�魫�W�[
						}else if (allfishname.get(i).compareTo(shrimp2.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
								allfishgrow.get(i) == 0) {
							allfishweight.set(i,allfishweight.get(i) + (1.5*0.2));//�魫�W�[
						}
					}else if (foodtype == 3 && //����3���}��
							allfishalivelist.get(i).compareTo("�s��") == 0) {//�s������
						if (allfishname.get(i).compareTo(fish1.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
							allfishweight.get(i) < fish1.getWeightLimit()) {//�魫�p��W��
							allfishweight.set(i,allfishweight.get(i) + (1*0.4));//�魫�W�[
						}else if (allfishname.get(i).compareTo(fish2.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
							allfishweight.get(i) < fish2.getWeightLimit()) {//�魫�p��W��
							allfishweight.set(i,allfishweight.get(i) + (1*0.3));//�魫�W�[
						}else if (allfishname.get(i).compareTo(shrimp1.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
								allfishweight.get(i) < shrimp1.getWeightLimit() &&//�魫�p��W��
								allfishgrow.get(i) == 0) {//�D��ߤ�
								allfishweight.set(i,allfishweight.get(i) + (1*0.1));//�魫�W�[
						}else if (allfishname.get(i).compareTo(shrimp2.getName()) == 0 &&//�̾ڦW�ٱo�줣�P�������Y��
								allfishweight.get(i) < shrimp2.getWeightLimit() &&//�魫�p��W��
								allfishgrow.get(i) == 0) {//�D��ߤ�
								allfishweight.set(i,allfishweight.get(i) + (1*0.2));//�魫�W�[
						}
					}
					for (int j = 0; j < allfishname.size(); j++) {//�j�M��������
						if(allfishweight.get(j) >= 3 &&//�魫�j��3�����l
							allfishname.get(j).compareTo(shrimp1.getName()) == 0 &&//�P�_�䬰���l1��
							allfishgrow.get(j) == 0 && //�D��ߪ��A
							allfishgrown.get(j) == 0) {//�٨S��L��
							allfishweight.set(j, 3.0);//�T�w�魫
							allfishgrow.set(j,1);//��߲Ĥ@��
						}
						else if(allfishweight.get(j) >= 3 &&//�魫�j��3�����l
							allfishname.get(j).compareTo(shrimp2.getName()) == 0 &&//�P�_�䬰���l2��
							allfishgrow.get(j) == 0 &&//�D��ߪ��A
							allfishgrown.get(j) == 0) {//�٨S��L��
							allfishweight.set(j, 3.0);//�T�w�魫
							allfishgrow.set(j,1);//��߲Ĥ@��
						}
					}
					for (int j = 0; j < allfishname.size(); j++) {//�j�M��������
						if(allfishweight.get(j) >= 6 &&//�魫�j��6�����l
							allfishname.get(j).compareTo(shrimp1.getName()) == 0 &&//�P�_�䬰���l1��
							allfishgrow.get(j) == 0 &&//�D��ߪ��A
							allfishgrown.get(j) == 1) {//��L�@����
							allfishweight.set(j, 6.0);//�T�w�魫
							allfishgrow.set(j,1);//��߲Ĥ@��
						}
						else if(allfishweight.get(j) >= 6 &&//�魫�j��6�����l
							allfishname.get(j).compareTo(shrimp2.getName()) == 0 &&//�P�_�䬰���l2��
							allfishgrow.get(j) == 0 &&//�D��ߪ��A
							allfishgrown.get(j) == 1) {//��L�@����
							allfishweight.set(j, 6.0);//�T�w�魫
							allfishgrow.set(j,1);//��߲Ĥ@��
						}
					}
					for (int j = 0; j < allfishname.size(); j++) {//�j�M��������
						if(allfishweight.get(j) >= 9 &&//�魫�j��9�����l
							allfishname.get(j).compareTo(shrimp1.getName()) == 0 &&//�P�_�䬰���l1��
							allfishgrow.get(j) == 0 &&//�D��ߪ��A
							allfishgrown.get(j) == 2) {//��L�G����
							allfishweight.set(j, 9.0);//�T�w�魫
							allfishgrow.set(j,1);//��߲Ĥ@��
						}
						else if(allfishweight.get(j) >= 9 &&//�魫�j��9�����l
							allfishname.get(j).compareTo(shrimp2.getName()) == 0 &&//�P�_�䬰���l2��
							allfishgrow.get(j) == 0 &&//�D��ߪ��A
							allfishgrown.get(j) == 2) {//��L�G����
							allfishweight.set(j, 9.0);//�T�w�魫
							allfishgrow.set(j,1);//��߲Ĥ@��
						}
					}
				
					
				}
				for (int j = 0; j < allfishname.size(); j++) {//�j�M��������
					if (allfishweight.get(j) > fish1.getWeightLimit() &&//�魫�j��W����
							allfishname.get(j).compareTo(fish1.getName()) == 0) {//�P�_�W�r
						allfishweight.set(j, fish1.getWeightLimit());//�魫�w���W����
					}else if (allfishweight.get(j) > fish2.getWeightLimit() &&//�魫�j��W����
							allfishname.get(j).compareTo(fish2.getName()) == 0) {//�P�_�W�r
						allfishweight.set(j, fish2.getWeightLimit());//�魫�w���W����
					}else if (allfishweight.get(j) > shrimp1.getWeightLimit() &&//�魫�j��W����
							allfishname.get(j).compareTo(shrimp1.getName()) == 0) {//�P�_�W�r
						allfishweight.set(j, shrimp1.getWeightLimit());//�魫�w���W����
					}else if (allfishweight.get(j) > shrimp2.getWeightLimit()  &&//�魫�j��W����
							allfishname.get(j).compareTo(shrimp2.getName()) == 0) {//�P�_�W�r
						allfishweight.set(j, shrimp2.getWeightLimit());//�魫�w���W����
					}
				}
			}else {
				System.out.println("���O���~");//���O���~���^��
				showmsg();//���O��
			}
		}
		food = null;//�٭�food
	}
	public static boolean isFeed (String sIn) {//����isFeed���O
		String[] AfterSplit;//AfterSplit���n���������O
		if (food == null) {//�p�G�S����J�Ȯ�
			return false;//�^��false
		}
		AfterSplit = sIn.split(Sep,2);//��2�� �� Sep �@�����α���
		if (AfterSplit.length == 2) {//���O���ץ��T
			if (sIn.contains("feed")) {//�t��feed�����O��
				return true;//�^��true
			}
		}else {
			System.out.println("���O���~");//���O���~���^��
			showmsg();//���O��
			return false;//�^��false
		}
		return true;//�w�]��
	}
	public static boolean isCold (String sIn) {//����isCold���O
		if (cold == null) {//�p�G�S����J�Ȯ�
			return false;//�^��false
		}
		if (sIn.compareTo("cold") == 0) {//�t��cold�����O��

			return true;//�^��true
		}else {
			return false;//�^��false
		}
	}
	public static void nextDay () {//����next �����O
		Day ++;//�Ѽ�+1
		System.out.println("���ѬO��" + Day + "��");//�^���ϥΪ�
		if (isCold(cold)) {//����J�Lcold��
			cold();//����cold
		}
		if (true == isFeed(food)) {//����J�Lfeed��
			if (allfishname.size() > 0) {//������
				System.out.println("�������F�I");//�^���ϥΪ�
			}
			else if (allfishname.size() == 0) {//�S����
				System.out.println("�}�Ʈ��O�F�I");//�^���ϥΪ�
			}
			feed(food);//����feed
		}else {
			for (int i = 0; i < allfishname.size(); i++) {//��S����J�Lfeed��
				isFeed.set(i, isFeed.get(i) + 1);//���j�Ѽ�+1
				if (isFeed.get(i) >= 3) {//�W�L�T�Ѯ�
					allfishalivelist.set(i, "�w���`");//�]�w���A�����`
					System.out.println(allfishname.get(i) + "�w�j��");//�^���ϥΪ�
				}
			}
		}
		for (int j = 0; j < allfishname.size(); j++) {//�j�M��������
			if (allfishgrow.get(j) == 1 ) {//��߲�1�Ѯ�
				allfishgrow.set(j, allfishgrow.get(j)+1);//�Ѽ�+1
			}else if (allfishgrow.get(j) == 2 ) {//��߲�2�Ѯ�
				allfishgrow.set(j, allfishgrow.get(j)+1);//�Ѽ�+1
			}else if (allfishgrow.get(j) == 3) {//��߲�3�Ѯ�
				allfishgrow.set(j, allfishgrow.get(j)+1);//�Ѽ�+1
			}else if (allfishgrow.get(j) == 4 && //�S���ĥ|�ѩҥH�i�H�~�򦨪�
					allfishgrown.get(j) == 0) {//�S��L��
				allfishgrow.set(j, 0);//��ߤѼƦ^�k�_�l��
				allfishgrown.set(j, 1);//�]�w����L1����
			}else if (allfishgrow.get(j) == 4 && //�S���ĥ|�ѩҥH�i�H�~�򦨪�
					allfishgrown.get(j) == 1) {//��L1����
				allfishgrow.set(j, 0);//��ߤѼƦ^�k�_�l��
				allfishgrown.set(j, 2);//�]�w����L2����
			}else if (allfishgrow.get(j) == 4 && //�S���ĥ|�ѩҥH�i�H�~�򦨪�
					allfishgrown.get(j) == 2) {//��L2����
				allfishgrow.set(j, 0);//��ߤѼƦ^�k�_�l��
				allfishgrown.set(j, 3);//�]�w����L3����
			}
		}
	}
}
