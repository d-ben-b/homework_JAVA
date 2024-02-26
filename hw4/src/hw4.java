import java.util.ArrayList;//�ϥ�ARRAYLIST

class Group {//�إ߾ǰ|��parent class
	private String name;//�ǰ|���Ѽ�
	private double energy;//�ǰ|���Ѽ�
	private int intelligence;//�ǰ|���Ѽ�
	private int magic;//�ǰ|���Ѽ�
	
	public Group (String inName, int inEnergy, int inIntelligence, int inMagic) {//�إ߾ǰ|��method
		this.name = inName;//�^�ǰѼ�
		this.energy = inEnergy;//�^�ǰѼ�
		this.intelligence = inIntelligence;//�^�ǰѼ�
		this.magic = inMagic;//�^�ǰѼ�
	}
	public String getName() {//���name����k
		return name;//���name
	}
	public double getEnergy() {//���energy����k
		return energy;//���energy
	}
	public int getIntelligence() {//���Intelligence����k
		return intelligence;//���Intelligence
	}
	public int getMagic() {//����]�O����k
		return magic;//����]�O
	}
	public void useEnergy(double inEnergy) {//���ӯ�q����k
		energy -= inEnergy; //���ӯ�q
	}
	public void showData() {//��ܼƾ�
		System.out.println("�z���ݩʬ�");//�^���ϥΪ�
		System.out.printf("�ǰ|�G%-15s  ��O�G%-8.1f  ���O�G%-8d  �]�O�G%d%% \r\n",this.name,this.energy,this.intelligence,this.magic);//��ܼƾ�
	}
	 public static boolean InCollege(String Name) {//�P�_��J�O�_���T
		  if ( Name.compareTo("Griffendor") == 0){//�P�_��J�O�_���T
		   return true ;//�^��true
		  }else 
		  if ( Name.compareTo("Hufflepuff") == 0){//�P�_��J�O�_���T   
		   return true ;//�^��true
		  }else 
		  if ( Name.compareTo("Ravenclaw") == 0){//�P�_��J�O�_���T   
		   return true ;//�^��true
		  }else 
		  if ( Name.compareTo("Slytherin") == 0){//�P�_��J�O�_���T   
		   return true ; //�^��true
		  }
		 /*else if ( Name.compareTo("debug") == 0){//�P�_��J�O�_���T   
			  return true ; //�^��true
		  }*/
		  //debug�Τ��C�J�ϥνd��
		  return false ;//�^��false
		  }
}
class Griffendor extends Group {//Griffendor�~��Group
	public Griffendor() {
		super("Griffendor", 150, 12, 30);//�إ߾ǰ|��method
	}
}
class Hufflepuff extends Group {//Hufflepuff�~��Group
	public Hufflepuff() {
		super("Hufflepuff", 120, 12, 35);//�إ߾ǰ|��method
	}
}
class Ravenclaw extends Group {//Ravenclaw�~��Group
	public Ravenclaw() {
		super("Ravenclaw", 100, 15, 30);//�إ߾ǰ|��method
	}
}
class Slytherin extends Group {//Slytherin�~��Group
	public Slytherin() {
		super("Slytherin", 100, 10, 40);//�إ߾ǰ|��method
	}
}
class debug extends Group {//debug��
	public debug() {
		super("debug", 99999, 99999, 99999);
	}
}
class Player {//�w�qPlayer��class
	private String name;//Player���Ѽ�
	private Group group;//Player���Ѽ�
	private Serpensortia Serpensortia = new Serpensortia();//Player���Ѽ�
	private Stupefy Stupefy = new Stupefy();//Player���Ѽ�
	private Impedimenta Impedimenta = new Impedimenta();//Player���Ѽ�
	private Protego Protego = new Protego();//Player���Ѽ�
	private int potion = 5;//Player���Ѽ�
	private int Intelligence ;//Player���Ѽ�
	private double Energy;//Player���Ѽ�
	private int SerpensortiaPractice = Serpensortia.getPractice();//Player���Ѽ�
	private int StupefyPractice = Stupefy.getPractice();//Player���Ѽ�
	private int ImpedimentaPractice = Impedimenta.getPractice();//Player���Ѽ�
	private int ProtegoPractice = Protego.getPractice();//Player���Ѽ�
	private boolean IsLearnSerpensortia = false;//Player���Ѽ�
	private boolean IsLearnStupefy = false;//Player���Ѽ�
	private boolean IsLearnImpedimenta = false;//Player���Ѽ�
	private boolean IsLearnProtego = false;//Player���Ѽ�
	private boolean IsDead = false;//Player���Ѽ�
	
	public void setPotion(int iIn) {//�ϥ��Ĥ�����k
		potion -= iIn;//�����Ĥ��ƶq
	}
	void setName(String inName){//�]�wname
		name = inName;
	}
	void setGroup(Group inGroup){//�w�qplayer���ǰ|
		this.group = inGroup;//��J��group ��������group
		Energy = group.getEnergy();//�������group������O
		Intelligence = group.getIntelligence();//�������group������O
	}
	public void setSerpensortiaPractice(int iIn) {//����Serpensortia�����m��
		SerpensortiaPractice += iIn;
	}
	public void setStupefyPractice(int iIn) {//����Stupefy�����m��
		StupefyPractice += iIn;
	}
	public void setImpedimentaPractice(int iIn) {//����Impedimenta�����m��
		ImpedimentaPractice += iIn;
	}
	public void setProtegoPractice(int iIn) {//����Protego�����m��
		ProtegoPractice += iIn;
	}
	public void setSerpensortiaPractice1(int iIn) {//�]�wSerpensortia�����m��
		SerpensortiaPractice = iIn;
	}
	public void setStupefyPractice1(int iIn) {//�]�wStupefy�����m��
		StupefyPractice = iIn;
	}
	public void setImpedimentaPractice1(int iIn) {//�]�wImpedimenta�����m��
		ImpedimentaPractice = iIn;
	}
	public void setProtegoPractice1(int iIn) {//�]�wProtego�����m��
		ProtegoPractice = iIn;
	}
	public void setStupefyIsLearn() {//�NStupefy�]���H�ǲ�
		IsLearnStupefy = true ;
	}
	public void setImpedimentaIsLearn() {//�NImpedimenta�]���H�ǲ�
		IsLearnImpedimenta = true ;
	}
	public void setProtegoIsLearn() {//�NProtego�]���H�ǲ�
		IsLearnProtego = true ;
	}
	public void setSerpensortiaIsLearn() {//�NSerpensortia�]���H�ǲ�
		IsLearnSerpensortia = true ;
	}
	public void setIsDead() {//�N���a�]�����`
		IsDead = true;
	}
	public void useEnergy(double inEnergy) {//���a�ϥ�ENERGY
		Energy -= inEnergy;
	}
	public void addEnergy(double inEnergy) {//���a����ENERGY
		Energy += inEnergy;
	}
	public void setEnergy(double inEnergy) {
		Energy = inEnergy;
	}
	public void setIntelligence(double inIntelligence) {//���a�W�[���O
		Intelligence += inIntelligence;
	}
	public String getName() {//���name
		return name;
	}
	public double getEnergy() {//���energy
		return Energy;
	}
	public int getMagic() {//����]�O
		return group.getMagic();
	}
	public int getIntelligence() {//���Intelligence
		return Intelligence;
	}
	public int getSerpensortiaPractice () {//���Serpensortia�����m��
		return SerpensortiaPractice;
	}
	public int getStupefyPractice () {//���Stupefy�����m��
		return StupefyPractice;
	}
	public int getImpedimentaPractice () {//���mpedimenta�����m��
		return ImpedimentaPractice;
	}
	public int getProtegoPractice () {//���Protego�����m��
		return ProtegoPractice;
	}
	public boolean getSerpensortiaIsLearn() {//���Serpensortia�ϧ_�w�g�ǲ�
		return IsLearnSerpensortia;
	}
	public boolean getStupefyIsLearn() {//���Stupefy�ϧ_�w�g�ǲ�
		return IsLearnStupefy;
	}
	public boolean getImpedimentaIsLearn() {//���Impedimenta�ϧ_�w�g�ǲ�
		return IsLearnImpedimenta;
	}
	public boolean getProtegoIsLearn() {//���Protego�ϧ_�w�g�ǲ�
		return IsLearnProtego;
	}
	public int getPotion() {//����Ĥ��ƶq
		return potion;
	}
	public Boolean getIsDead() {//�P�_���a�O�_���`
		return IsDead;
	}
	public double getGroupEnergy() {
		return group.getEnergy();
	}
}
class attackSpell {//�w�qattackSpell��class
	private String spellname;//�w�q�W�r
	private int IntRequirement;//�w�q�̧C���O�ݨD
	private int practice;//�w�q���m��
	private boolean isLearn;//�O�_�ǲ�
	
	public attackSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {//attackSpell ��constructor
		this.spellname = inName;//�s�J�U���Ѽ�
		this.IntRequirement = inIntRequirement;//�s�J�U���Ѽ�
		this.practice = inPractice;//�s�J�U���Ѽ�
		this.isLearn = inIsLearn;//�s�J�U���Ѽ�
	}
	public int getPractice() {//������m��
		return practice;
	}
	public boolean getIsLearn() {//����O�_�ǲ�
		return isLearn;
	}
	public String getSpellName() {//����W�r
		return spellname;
	}
	public int getIntRequirement() {//����̧C�ݨD
		return IntRequirement;
	}
}
class Serpensortia extends attackSpell {//Serpensortia�~��attackSpell
	public Serpensortia() {
		super("Serpensortia", 10, 70, false);//�s�J�U���Ѽ�
	}
}
class Stupefy  extends attackSpell {//Stupefy�~��attackSpell
	public Stupefy() {
		super("Stupefy", 20, 40, false);//�s�J�U���Ѽ�
	}
}

class defendSpell {//�w�q defendSpell ��class
	private String spellname;//�w�q�W�r
	private int IntRequirement;//�w�q�̧C���O�ݨD
	private int practice;//�w�q���m��
	private boolean isLearn;//�O�_�ǲ�
	
	public defendSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {//defendSpell ��constructor
		this.spellname = inName;//�s�J�U���Ѽ�
		this.IntRequirement = inIntRequirement;//�s�J�U���Ѽ�
		this.practice = inPractice;//�s�J�U���Ѽ�
		this.isLearn = inIsLearn;//�s�J�U���Ѽ�
	}
	public int getPractice () {//������m��
		return practice;
	}
	public boolean getIsLearn() {//����O�_�ǲ�
		return isLearn;
	}
	public String getSpellName() {//����W�r
		return spellname;
	}
	public int getIntRequirement() {//����̧C�ݨD
		return IntRequirement;
	}
}
class Impedimenta extends defendSpell {//Impedimenta�~��defendSpell
	public Impedimenta () {
		super("Impedimenta", 15, 60, false);//�s�J�U���Ѽ�
	}
}
class Protego extends defendSpell {//Protego�~��defendSpell
	public Protego  () {
		super("Protego ", 25, 30, false);//�s�J�U���Ѽ�
	}
}

public class hw4 {
	public static int n = 1;//�w�q�^�X
	public static int n1 = 0;//������^�X�H���ƥ�o�ͻP�_
	public static String playername;//���a�W��
	public static String g_cmd;//��J�����O
	public static String Sep  = " ";//cmd���}������
	public static boolean k = true;//loop������
	public static boolean a = true;//�P�_�O�_�����a���^�X
	public static boolean b = false;//�P�_�O�_�����a���^�X
	public static boolean tempImpedimenta_0 = false;//�P�_�ޯ�ǲ�
	public static boolean tempProtego_0 = false;//�P�_�ޯ�ǲ�
	public static boolean tempImpedimenta_1 = false;//�P�_�ޯ�ǲ�
	public static boolean tempProtego_1 = false;//�P�_�ޯ�ǲ�
	public static boolean addImpedimenta_0 = false;//�P�_�ޯ�ǲ�
	public static boolean addProtego_0 = false;//�P�_�ޯ�ǲ�
	public static Player allPlayers[] = new Player[2];//���󪱮a��array
	public static Griffendor Griffendor = new Griffendor();//�s�W�U��class
	public static Hufflepuff Hufflepuff = new Hufflepuff();//�s�W�U��class
	public static Ravenclaw Ravenclaw = new Ravenclaw();//�s�W�U��class
	public static Slytherin Slytherin = new Slytherin();//�s�W�U��class
	public static debug debug = new debug();//debug��
	public static Serpensortia Serpensortia = new Serpensortia();//�s�W�U��class
	public static Stupefy Stupefy = new Stupefy();//�s�W�U��class
	public static Impedimenta Impedimenta = new Impedimenta();//�s�W�U��class
	public static Protego Protego = new Protego();//�s�W�U��class
	public static void main(String[] args) {
		System.out.println("�w��C���N��د��Ův���k�j�ɡI");//�w��T��
		setPlayer();//�I�ssetplayer
		while (k == true) {//�P�w�H���ƥ�
			if (true == a &&//��a��true b��false�ɬ����a�@
				false == b) {
				System.out.printf("************��%d�^�X************\r\n",n);//�^���ϥΪ�	
				System.out.println("�вĤ@�쪱�a" + allPlayers[0].getName() + "�I�i�]�k");//�^���ϥΪ�	
				g_cmd=ConsoleIn.readLine();//��J���a��
				spell_01();//�I�sspell_01
				Check() ;//�ˬd�ӭt �μ��m�׬O�_�W�L100
			}
			if (true == b &&//��b��true a��false�ɬ����a�G
					false == a) {
				System.out.println("�вĤG�쪱�a" + allPlayers[1].getName() + "�I�i�]�k");//�^���ϥΪ�	
				g_cmd=ConsoleIn.readLine();//��J���a��
				spell_10();//�I�sspell_10
				Check() ;//�ˬd�ӭt �μ��m�׬O�_�W�L100
			}
		}
	}
public static void setPlayer() {//setplayer����k
	String name;//�w�q�W�r
	String group;//�w�q�ǰ|
	String[] AfterSplit;//�N���O���}
	
	for( int i=0; i < 2 ;i ++){
		allPlayers[i] = new Player();//�إ�array ����2�쪱�a
	}
	for (int i = 0; i < 2; i++) {
		System.out.print("�п�J �W�r �ǰ|�G");//�^���ϥΪ�	
		playername = ConsoleIn.readLine();//��J���a��
		AfterSplit = playername.split(Sep);//�N���O���}
		name = AfterSplit[0];//�����W�r
		group =AfterSplit[1];//�����ǰ|
		if (AfterSplit.length == 2 &&//�P�_���O�O�_���T
			Group.InCollege(group)){
				allPlayers[i].setName(name);//�]�w�W�r
				System.out.println("�z�n�I" + allPlayers[i].getName());//�^���ϥΪ�	
				if (group.equals("Griffendor")) {//�էO��Griffendor
					allPlayers[i].setGroup(Griffendor);//�[�JGriffendor
					System.out.println("�z�w�[�J" + Griffendor.getName());//�^���ϥΪ�	
					Griffendor.showData();//��ܼƾ�
				}
				else if (group.equals("Hufflepuff")) {//�էO��Hufflepuff
					allPlayers[i].setGroup(Hufflepuff);//�[�JHufflepuff
					System.out.println("�w�[�J" + Hufflepuff.getName());//�^���ϥΪ�	
					Hufflepuff.showData();//��ܼƾ�
				}
				else if (group.equals("Ravenclaw")) {//�էO��Ravenclaw
					allPlayers[i].setGroup(Ravenclaw);//�[�JRavenclaw
					System.out.println("�w�[�J" + Ravenclaw.getName());//�^���ϥΪ�	
					Ravenclaw.showData();//��ܼƾ�
				}
				else if (group.equals("Slytherin")) {//�էO��Slytherin
					allPlayers[i].setGroup(Slytherin);//�[�JSlytherin
					System.out.println("�w�[�J" + Slytherin.getName());//�^���ϥΪ�	
					Slytherin.showData();//��ܼƾ�
				}
				else if (group.equals("debug")) {//debug�Τ��|�C�J�ϥ�
					allPlayers[i].setGroup(debug);
					System.out.println("�w�[�J" + debug.getName());//�^���ϥΪ�	
					debug.showData();//��ܼƾ�
				}
			}
			else if(group != null) { //��J���~���^��
				System.out.println("�п�J�s�b���ǰ|�I");
				i--;
			}
			else{//��J���~���^��
				System.out.println("���O���~�I");
				i--;
			}
		}
}
public static void spell_10() {
	if (g_cmd.contains("attack")) { //�ϥΧ�����
		String[] AfterSplit;//���}���O
		AfterSplit = g_cmd.split(Sep);//���}���O
		String spelltypeString = AfterSplit[1];//�P�_��J��
		double P;//��������l��
		if (spelltypeString.compareTo("Serpensortia") == 0 &&//�ϥ�Serpensortia
			AfterSplit.length == 2 &&
			true == allPlayers[1].getSerpensortiaIsLearn() && //�w�ǲ�
			allPlayers[1].getEnergy() > 10 ) {//��q����
			allPlayers[1].useEnergy(10);//��q-10
			P = (Math.round(allPlayers[1].getSerpensortiaPractice() * (100 + allPlayers[1].getMagic()) * 20 * 3)/10000.00);//�p��ˮ`
			if (true == allPlayers[0].getImpedimentaIsLearn()) {//�O�_�����m�G
				P -= (Math.round( 3 * 20 * allPlayers[0].getImpedimentaPractice())/100.00);//��׶ˮ`
			}
			if (true == allPlayers[0].getProtegoIsLearn()) {//�O�_�����m�G
				P -= (Math.round(P * 20 * allPlayers[0].getProtegoPractice())/10000.00);//��׶ˮ`
			}
			P = (Math.round(P)/1);//�|�ˤ��J����
			allPlayers[0].useEnergy( P );//��q-P
			System.out.println(allPlayers[0].getName() + "�D�������A��O�ѤU" + allPlayers[0].getEnergy());//�^���ϥΪ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&//�ϥ�Stupefy
				AfterSplit.length == 2 &&
				true == allPlayers[1].getStupefyIsLearn() &&//�w�ǲ�
				allPlayers[1].getEnergy() > 10) {//��q����
				allPlayers[1].useEnergy(10);//��q-10
				P = (Math.round(70 * allPlayers[1].getStupefyPractice() * (100 + allPlayers[1].getMagic() ))/10000.00);//�p��ˮ`
				if (true == allPlayers[0].getImpedimentaIsLearn()) {//�O�_�����m�G
					P -= (Math.round( 1 * 20 * allPlayers[0].getImpedimentaPractice())/100.00);//��׶ˮ`
				}
				if (true == allPlayers[0].getProtegoIsLearn()) {//�O�_�����m�G
					P -= (Math.round(P * 20 * allPlayers[0].getProtegoPractice())/10000.00);//��׶ˮ`
				}
				P = (Math.round(P)/1);//�|�ˤ��J����
				allPlayers[0].useEnergy( P );//��q-P
				System.out.println(allPlayers[0].getName() + "�D�������A��O�ѤU" + allPlayers[0].getEnergy());//�^���ϥΪ�
				b = false;//��A�ϥ��]�k
				a = true;
				Check ();
				Event();//Ĳ�o�H���ƥ�
				n++;//�U�@�^�X
				CheckSpell();//�O���ǲߪ��ޯ�
				ShowData();//��ܼƾ�
				
		}
		else if (allPlayers[1].getEnergy() < 10) {//��q������
			System.out.println("��O����");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&//Stupefy���ǲ�
				false == allPlayers[1].getStupefyIsLearn()) {
			System.out.println("Stupefy �|���ǲ�");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&//Serpensortia���ǲ�
				false == allPlayers[1].getSerpensortiaIsLearn()) {
			System.out.println("Serpensortia �|���ǲ�");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&//���O���~
				spelltypeString.compareTo("Serpensortia")!= 0) {
			System.out.println(spelltypeString + "���s�b�I");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
	}
	else if (g_cmd.contains("learn")) {//���O��learn
		String[] AfterSplit;
		AfterSplit = g_cmd.split(Sep);
		String spelltypeString = AfterSplit[1];//�P�_��J�����O
		if (spelltypeString.compareTo("Serpensortia") == 0 &&//��J��Serpensortia
			AfterSplit.length == 2 &&
			allPlayers[1].getEnergy() >= 10  && //��q������
			false == allPlayers[1].getSerpensortiaIsLearn() && //���ǲ�
			allPlayers[1].getIntelligence() >= 10) {//���O�n�D�ŦX
			allPlayers[1].useEnergy(10);//��q-10
			System.out.println(allPlayers[1].getName() + "�ǲߤF�GSerpensortia");//�^���ϥΪ�
			allPlayers[1].setIntelligence(2);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			allPlayers[1].setSerpensortiaIsLearn();//�]���w�ǲ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
			
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //��q������
				true == allPlayers[1].getSerpensortiaIsLearn() && //�w�ǲ�
				allPlayers[1].getIntelligence() >= 10 && //���O�n�D�ŦX
				allPlayers[1].getSerpensortiaPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "�W�j�F�GSerpensortia");//�^���ϥΪ�
			allPlayers[1].setIntelligence(2);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			allPlayers[1].setSerpensortiaPractice(10);//�W�[���m��
			System.out.println(allPlayers[1].getName() + "Serpensortia���m�פW�ɬ��G" + allPlayers[1].getSerpensortiaPractice() + "%");//�^���ϥΪ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
			
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //��q������
				false == allPlayers[1].getStupefyIsLearn() && //���ǲ�
				allPlayers[1].getIntelligence() >= 20) {//���O�n�D�ŦX
			allPlayers[1].useEnergy(10);//��q-10
			System.out.println(allPlayers[1].getName() + "�ǲߤF�GStupefy");//�^���ϥΪ�
			allPlayers[1].setIntelligence(3);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			allPlayers[1].setStupefyIsLearn();//�]���w�ǲ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
			
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //��q������
				true == allPlayers[1].getStupefyIsLearn() && //�w�ǲ�
				allPlayers[1].getIntelligence() >= 20 &&//���O�n�D�ŦX
				allPlayers[1].getStupefyPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "�W�j�F�GStupefy");//�^���ϥΪ�
			allPlayers[1].setIntelligence(3);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			allPlayers[1].setStupefyPractice(10);//�W�[���m��
			System.out.println(allPlayers[1].getName() + "Stupefy���m�פW�ɬ��G" + allPlayers[1].getStupefyPractice() + "%");//�^���ϥΪ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
		
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //��q������
				false == allPlayers[1].getImpedimentaIsLearn() && //���ǲ�
				allPlayers[1].getIntelligence() >= 15) {//���O�n�D�ŦX
			allPlayers[1].useEnergy(10);//��q-10
			System.out.println(allPlayers[1].getName() + "�ǲߤF�GImpedimenta");//�^���ϥΪ�
			allPlayers[1].setIntelligence(2);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			tempImpedimenta_1 = true;//�N�ǲ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
		
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
		
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //��q������
				true == allPlayers[1].getImpedimentaIsLearn() && //�w�ǲ�
				allPlayers[1].getIntelligence() >= 15 && //���O�n�D�ŦX
				allPlayers[1].getImpedimentaPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "�W�j�F�GImpedimenta");//�^���ϥΪ�
			allPlayers[1].setIntelligence(2);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			allPlayers[1].setImpedimentaPractice(20);//�W�[���m��
			System.out.println(allPlayers[1].getName() + "Impedimenta���m�פW�ɬ��G" + allPlayers[1].getImpedimentaPractice() + "%");//�^���ϥΪ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
			
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //��q������
				false == allPlayers[1].getProtegoIsLearn() && //���ǲ�
				allPlayers[1].getIntelligence() >= 25) {//���O�n�D�ŦX
			allPlayers[1].useEnergy(10);//��q-10
			System.out.println(allPlayers[1].getName() + "�ǲߤF�GProtego");//�^���ϥΪ�
			allPlayers[1].setIntelligence(3);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			tempProtego_1 = true;//�N�ǲ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
			
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //��q������
				true == allPlayers[1].getStupefyIsLearn() && //�w�ǲ�
				allPlayers[1].getIntelligence() >= 25 && //���O�n�D�ŦX
				allPlayers[1].getProtegoPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "�W�j�F�GProtego");//�^���ϥΪ�
			allPlayers[1].setIntelligence(3);//�W�[���O
			System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			allPlayers[1].setProtegoPractice(8);//�W�[���m��
			System.out.println(allPlayers[1].getName() + "Protego���m�פW�ɬ��G" + allPlayers[1].getProtegoPractice() + "%");//�^���ϥΪ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
		
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
			
		}
		else if (allPlayers[1].getEnergy() < 10) {//��q������
			System.out.println("��O����");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&//���O���~�I
				spelltypeString.compareTo("Serpensortia")!= 0 &&
				spelltypeString.compareTo("Protego") != 0 && 
				spelltypeString.compareTo("Impedimenta") != 0) {
			System.out.println(spelltypeString + "���s�b�I");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&//���O�����̧C�ݨD��
				allPlayers[1].getIntelligence() < Stupefy.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "���O�����L�k�ǲ�Stupefy");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&//���O�����̧C�ݨD��
				allPlayers[1].getIntelligence() < Serpensortia.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "���O�����L�k�ǲ�Serpensortia");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&//���O�����̧C�ݨD��
				allPlayers[1].getIntelligence() < Protego.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "���O�����L�k�ǲ�Protego");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&//���O�����̧C�ݨD��
				allPlayers[1].getIntelligence() < Impedimenta.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "���O�����L�k�ǲ�Impedimenta");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if(allPlayers[1].getImpedimentaPractice() >= 100) {//���m�׹F100��
			allPlayers[1].setImpedimentaPractice1(100);//���m�׳]��100
			System.out.println("Impedimenta���m�פw��");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if(allPlayers[1].getSerpensortiaPractice() >= 100) {//���m�׹F100��
			allPlayers[1].setSerpensortiaPractice1(100);//���m�׳]��100
			System.out.println("Serpensortia���m�פw��");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if(allPlayers[1].getStupefyPractice() >= 100) {//���m�׹F100��
			allPlayers[1].setStupefyPractice1(100);//���m�׳]��100
			System.out.println("Stupefy���m�פw��");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
		else if(allPlayers[1].getProtegoPractice() >= 100) {//���m�׹F100��
			allPlayers[1].setProtegoPractice1(100);//���m�׳]��100
			System.out.println("Protego���m�פw��");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
	}
	else if (g_cmd.contains("recover")) {//�^�_
		if (allPlayers[1].getPotion() > 0) {//�٦��Ĥ���
			System.out.println(allPlayers[1].getName() + "�ϥ��Ĥ�");//�^���ϥΪ�
			allPlayers[1].setPotion(1);//�Ĥ�-1
			allPlayers[1].addEnergy(50);//��q+50
			System.out.println(allPlayers[1].getName() + "����O�^�_��G" + allPlayers[1].getEnergy());//�^���ϥΪ�
			b = false;//��A�ϥ��]�k
			a = true;
			Check ();
			Event();//Ĳ�o�H���ƥ�
			n++;//�U�@�^�X
			
			CheckSpell();//�O���ǲߪ��ޯ�
			ShowData();//��ܼƾ�
		}
		else if (allPlayers[1].getPotion() <= 0) {//�S���Ĥ���
			System.out.println("�Ĥ�����");//�^���ϥΪ�
			b = true;//B�~��ϥ��]�k
			a = false;
		}
	}
	else if (g_cmd.compareTo("game over") == 0) {//game over
		if (allPlayers[0].getEnergy() > allPlayers[1].getEnergy()) {//A����q�j��B
			System.out.println("���ߪ��a�G" + allPlayers[0].getName() + "��o�ӧQ�I");//�^���ϥΪ�
		}
		else if (allPlayers[1].getEnergy() > allPlayers[0].getEnergy()) {//B����q�j��A
			System.out.println("���ߪ��a�G" + allPlayers[1].getName() + "��o�ӧQ�I");//�^���ϥΪ�
		}
		else if (allPlayers[1].getEnergy() == allPlayers[0].getEnergy()) {//A����q����B
			System.out.println("���襭��I");//�^���ϥΪ�
		}
		b = true;
		a = false;
		System.exit(0);
		System.out.println("�P�¹C���I");//�C������
		k = false;
	}
}
/***spell_01�Mspell1_01�����ۦP�u�O�����M���u����***/
public static void spell_01() {
	if (g_cmd.contains("attack")) { 
		String[] AfterSplit;
		AfterSplit = g_cmd.split(Sep);
		String spelltypeString = AfterSplit[1];
		double P;
		if (spelltypeString.compareTo("Serpensortia") == 0 &&
			AfterSplit.length == 2 &&
			true == allPlayers[0].getSerpensortiaIsLearn() && 
			allPlayers[0].getEnergy() > 10 ) {
			allPlayers[0].useEnergy(10);
			P = (Math.round(allPlayers[0].getSerpensortiaPractice() * (100 + allPlayers[0].getMagic()) * 20 * 3)/10000.00);
			if (true == allPlayers[1].getImpedimentaIsLearn()) {
				P -= (Math.round( 3 * 20 * allPlayers[1].getImpedimentaPractice())/100.00);
			}
			if (true == allPlayers[1].getProtegoIsLearn()) {
				P -= (Math.round(P * 20 * allPlayers[1].getProtegoPractice())/10000.00);
			}
			P = (Math.round(P)/1);
			allPlayers[1].useEnergy( P );
			System.out.println(allPlayers[1].getName() + "�D�������A��O�ѤU" + allPlayers[1].getEnergy());
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				true == allPlayers[0].getStupefyIsLearn() &&
				allPlayers[0].getEnergy() > 10) {
				allPlayers[0].useEnergy(10);
				P = (Math.round(70 * allPlayers[0].getStupefyPractice() * (100 + allPlayers[0].getMagic()))/10000.00);
				if (true == allPlayers[1].getImpedimentaIsLearn()) {
					P -= (Math.round( 1 * 20 * allPlayers[1].getImpedimentaPractice())/100.00);
				}
				if (true == allPlayers[1].getProtegoIsLearn()) {
					P -= (Math.round(P * 20 * allPlayers[1].getProtegoPractice())/10000.00);
				}
				P = (Math.round(P)/1);
				allPlayers[1].useEnergy( P );
				System.out.println(allPlayers[1].getName() + "�D�������A��O�ѤU" + allPlayers[1].getEnergy());
				a = false;
				b = true;
		}
		else if (allPlayers[0].getEnergy() < 10) {
			System.out.println("��O����");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				false == allPlayers[0].getStupefyIsLearn()) {
			System.out.println("Stupefy �|���ǲ�");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				false == allPlayers[0].getSerpensortiaIsLearn()) {
			System.out.println("Serpensortia �|���ǲ�");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&
				spelltypeString.compareTo("Serpensortia")!= 0) {
			System.out.println(spelltypeString + "���s�b�I");
			a = true;
			b = false;
		}
	}
	else if (g_cmd.contains("learn")) {
		String[] AfterSplit;
		AfterSplit = g_cmd.split(Sep);
		String spelltypeString = AfterSplit[1];
		if (spelltypeString.compareTo("Serpensortia") == 0 &&
			AfterSplit.length == 2 &&
			allPlayers[0].getEnergy() >= 10  && 
			false == allPlayers[0].getSerpensortiaIsLearn() && 
			allPlayers[0].getIntelligence() >= 10) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "�ǲߤF�GSerpensortia");
			allPlayers[0].setIntelligence(2);
			System.out.println(allPlayers[0].getName() + "���O�ܬ��G" + allPlayers[0].getIntelligence());
			allPlayers[0].setSerpensortiaIsLearn();
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getSerpensortiaIsLearn() && 
				allPlayers[0].getIntelligence() >= 10 && 
				allPlayers[0].getSerpensortiaPractice() < 100) {
			System.out.println(allPlayers[0].getName() + "�W�j�F�GSerpensortia");
			allPlayers[0].setIntelligence(2);
			System.out.println(allPlayers[0].getName() + "���O�ܬ��G" + allPlayers[0].getIntelligence());
			allPlayers[0].setSerpensortiaPractice(10);
			System.out.println(allPlayers[0].getName() + "Serpensortia���m�פW�ɬ��G" + allPlayers[0].getSerpensortiaPractice() + "%");
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				false == allPlayers[0].getStupefyIsLearn() && 
				allPlayers[0].getIntelligence() >= 20) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "�ǲߤF�GStupefy");
			allPlayers[0].setIntelligence(3);
			System.out.println(allPlayers[0].getName() + "���O�ܬ��G" + allPlayers[0].getIntelligence());
			allPlayers[0].setStupefyIsLearn();
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getStupefyIsLearn() && 
				allPlayers[0].getIntelligence() >= 20 &&
				allPlayers[0].getStupefyPractice() < 100) {
			System.out.println(allPlayers[0].getName() + "�W�j�F�GStupefy");
			allPlayers[0].setIntelligence(3);
			System.out.println(allPlayers[0].getName() + "���O�ܬ��G" + allPlayers[0].getIntelligence());
			allPlayers[0].setStupefyPractice(10);
			System.out.println(allPlayers[0].getName() + "Stupefy���m�פW�ɬ��G" + allPlayers[0].getStupefyPractice() + "%");
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				false == allPlayers[0].getImpedimentaIsLearn() && 
				allPlayers[0].getIntelligence() >= 15) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "�ǲߤF�GImpedimenta");
			allPlayers[0].setIntelligence(2);
			System.out.println(allPlayers[0].getName() + "���O�ܬ��G" + allPlayers[0].getIntelligence());
			tempImpedimenta_0 = true;//�N�ǲ�
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getImpedimentaIsLearn() && 
				allPlayers[0].getIntelligence() >= 15 && 
				allPlayers[0].getImpedimentaPractice() < 100) {
			System.out.println(allPlayers[0].getName() + "�W�j�F�GImpedimenta");
			addImpedimenta_0 = true;//�N�W�[��
			
			System.out.println(allPlayers[0].getName() + "���O�N�ܬ��G" + allPlayers[0].getIntelligence());
			
			System.out.println(allPlayers[0].getName() + "Impedimenta���m�ױN�W�ɬ��G" + allPlayers[0].getImpedimentaPractice() + "%");
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				false == allPlayers[0].getProtegoIsLearn() && 
				allPlayers[0].getIntelligence() >= 25) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "�ǲߤF�GProtego");
			allPlayers[0].setIntelligence(3);
			System.out.println(allPlayers[0].getName() + "���O�ܬ��G" + allPlayers[0].getIntelligence());
			tempProtego_0 = true;//�N�ǲ�
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getStupefyIsLearn() && 
				allPlayers[0].getIntelligence() >= 25 && 
				allPlayers[0].getProtegoPractice() < 100) {
			System.out.println(allPlayers[0].getName() + "�W�j�F�GProtego");
			addProtego_0 = true;//�N�W�[��
			
			System.out.println(allPlayers[0].getName() + "���O�N�ܬ��G" + allPlayers[0].getIntelligence());
			
			System.out.println(allPlayers[0].getName() + "Protego���m�ױN�W�ɬ��G" + allPlayers[0].getProtegoPractice() + "%");
			a = false;
			b = true;
		}
		else if (allPlayers[0].getEnergy() < 10) {
			System.out.println("��O����");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&
				spelltypeString.compareTo("Serpensortia")!= 0 &&
				spelltypeString.compareTo("Protego") != 0 && 
				spelltypeString.compareTo("Impedimenta") != 0) {
			System.out.println(spelltypeString + "���s�b�I");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				allPlayers[0].getIntelligence() < Stupefy.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "���O�����L�k�ǲ�Stupefy");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				allPlayers[0].getIntelligence() < Serpensortia.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "���O�����L�k�ǲ�Serpensortia");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				allPlayers[0].getIntelligence() < Protego.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "���O�����L�k�ǲ�Protego");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				allPlayers[0].getIntelligence() < Impedimenta.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "���O�����L�k�ǲ�Impedimenta");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getImpedimentaPractice() >= 100) {
			allPlayers[0].setImpedimentaPractice1(100);
			System.out.println("Impedimenta���m�פw��");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getSerpensortiaPractice() >= 100) {
			allPlayers[0].setSerpensortiaPractice1(100);
			System.out.println("Serpensortia���m�פw��");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getStupefyPractice() >= 100) {
			allPlayers[0].setStupefyPractice1(100);
			System.out.println("Stupefy���m�פw��");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getProtegoPractice() >= 100) {
			allPlayers[0].setProtegoPractice1(100);
			System.out.println("Protego���m�פw��");
			a = true;
			b = false;
		}
	}
	else if (g_cmd.contains("recover")) {
		if (allPlayers[0].getPotion() > 0) {
			System.out.println(allPlayers[0].getName() + "�ϥ��Ĥ�");
			allPlayers[0].setPotion(1);
			allPlayers[0].addEnergy(50);
			System.out.println(allPlayers[0].getName() + "����O�^�_��G" + allPlayers[0].getEnergy());
			a = false;
			b = true;
		}
		else if (allPlayers[0].getPotion() <= 0) {
			System.out.println("�Ĥ�����");
			a = true;
			b = false;
		}
	}
	else if (g_cmd.compareTo("game over") == 0) {
		if (allPlayers[0].getEnergy() > allPlayers[1].getEnergy()) {
			System.out.println("���ߪ��a�G" + allPlayers[0].getName() + "��o�ӧQ�I");
		}
		else if (allPlayers[1].getEnergy() > allPlayers[0].getEnergy()) {
			System.out.println("���ߪ��a�G" + allPlayers[1].getName() + "��o�ӧQ�I");
		}
		else if (allPlayers[1].getEnergy() == allPlayers[0].getEnergy()) {
			System.out.println("���襭��I");
		}
		a = true;
		b = false;
		System.exit(0);
		System.out.println("�P�¹C���I");
		k = false;
	}
}
/***spell_01�Mspell1_01�����ۦP�u�O�����M���u����***/


public static void Check () {//�ˬd�U���ƾ�
	for (int i = 0; i < 2; i++) {//�j�M��쪱�a
		if(allPlayers[i].getImpedimentaPractice() >= 100) {//����m�פj�󵥩�100��
			allPlayers[i].setImpedimentaPractice1(100);//�]��100
		}
		if(allPlayers[i].getSerpensortiaPractice() >= 100) {//����m�פj�󵥩�100��
			allPlayers[i].setSerpensortiaPractice1(100);//�]��100
		}
		if(allPlayers[i].getStupefyPractice() >= 100) {//����m�פj�󵥩�100��
			allPlayers[i].setStupefyPractice1(100);//�]��100
		}
		if(allPlayers[i].getProtegoPractice() >= 100) {//����m�פj�󵥩�100��
			allPlayers[i].setProtegoPractice1(100);//�]��100
		}
		if (allPlayers[i].getEnergy() <= 0 ) {//��O�p�󵥩�0��
			System.out.println(allPlayers[i].getName() + "�w���`");//�^���ϥΪ�
			allPlayers[i].setIsDead();
			if (true == allPlayers[0].getIsDead()) {//
				System.out.println("���ߪ��a�G" + allPlayers[1].getName() + "��o�ӧQ�I");//�^���ϥΪ�
			} 
			else if (true == allPlayers[1].getIsDead()) {
				System.out.println("���ߪ��a�G" + allPlayers[0].getName() + "��o�ӧQ�I");//�^���ϥΪ�
			}
			System.exit(0);//���}�C��
			System.out.println("�P�¹C���I");//�^���ϥΪ�
			k = false;
		}
		if (allPlayers[i].getEnergy() > allPlayers[i].getGroupEnergy()) {//��O�W�L�W��
			allPlayers[i].setEnergy(allPlayers[i].getGroupEnergy());
			System.out.println(allPlayers[i].getName() + "��O��}�W���A�^�_��G" + allPlayers[i].getEnergy());
		}
	}
}
public static void Event () {//�H���ƥ�
	ArrayList<String> fileContent = FileIO.readfile("event.txt");//Ūevent.exe����
	for(int i=0; i < fileContent.size(); i++){
		String sepString = "	";//���}���O������
		int round;//�^�X
		String eventype;//�ƥ����
		String[] AfterSplit;//���}���O
		AfterSplit = fileContent.get(i).split(sepString);//���}���O
		String temp = AfterSplit[0];//�O���ĴX�^�X
		round = Integer.parseInt(temp);//�O���ĴX�^�X
		eventype = AfterSplit[1];//��������
		if (round == n) {//�Ӧ^�X��
			System.out.println("************Ĳ�o�S��ƥ�I************");//�^���ϥΪ�
			if (eventype.equals("Hippogrif")) {
				System.out.println("�S�M�N���q§�A����Q�����A���誱�a��O -15");//�^���ϥΪ�
				allPlayers[0].useEnergy(15);//������q
				allPlayers[1].useEnergy(15);//������q
				System.out.println(allPlayers[0].getName() + "��O�ѤU�G" + allPlayers[0].getEnergy());//�^���ϥΪ�
				System.out.println(allPlayers[1].getName() + "��O�ѤU�G" + allPlayers[1].getEnergy());//�^���ϥΪ�
			}
			else if (eventype.equals("VomitBeans")) {
				System.out.println("�Y��æR���f�����f�����f�����A���誱�a���O -5");//�^���ϥΪ�
				allPlayers[0].setIntelligence(-5);//�������O
				allPlayers[1].setIntelligence(-5);//�������O
				System.out.println(allPlayers[0].getName() + "���O�ѤU�G" + allPlayers[0].getIntelligence());//�^���ϥΪ�
				System.out.println(allPlayers[1].getName() + "���O�ѤU�G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			}
			else if (eventype.equals("PumpkinPasty")) {
				System.out.println("�K�O�n���`��A���誱�a��O +25�A���O +2");//�^���ϥΪ�
				allPlayers[0].addEnergy(25);//�W�[��q
				allPlayers[1].addEnergy(25);//�W�[��q
				allPlayers[0].setIntelligence(2);//�W�[���O
				allPlayers[1].setIntelligence(2);//�W�[���O
				System.out.println(allPlayers[0].getName() + "��O�ܬ��G" + allPlayers[0].getEnergy());//�^���ϥΪ�
				System.out.println(allPlayers[1].getName() + "��O�ܬ��G" + allPlayers[1].getEnergy());//�^���ϥΪ�
				System.out.println(allPlayers[0].getName() + "���O�ܬ��G" + allPlayers[0].getIntelligence());//�^���ϥΪ�
				System.out.println(allPlayers[1].getName() + "���O�ܬ��G" + allPlayers[1].getIntelligence());//�^���ϥΪ�
			}
			else if (eventype.equals("DeathEaters")) {
				System.out.println("�����H��ŧ�A��U���O�C�� 16 �B��O�C�� 65 ���H�A�������`");//�^���ϥΪ�
				for (int j = 0; j < allPlayers.length; j++) {
					if(allPlayers[j].getIntelligence() < 16 &&
						allPlayers[j].getEnergy() < 65 && 
						false == allPlayers[j].getIsDead()) {
						System.out.println(allPlayers[j].getName() + "�w���`");//�^���ϥΪ�
						allPlayers[j].setIsDead();//�ŦX����]�����`
					}
				}
			}
		}
	}	
}
public static void ShowData() {
	for (int i = 0; i < allPlayers.length; i++) {
		System.out.println(allPlayers[i].getName() + "	��O�G" + allPlayers[i].getEnergy() + "	���O�G" + allPlayers[i].getIntelligence());//��ܼƾ�
	}
}
public static void CheckSpell() {//�N�Ȯɾǲߪ��A�]���w�g�ǲߪ��A
	if (tempImpedimenta_0) {
		allPlayers[0].setImpedimentaIsLearn();
	}
	if (tempImpedimenta_1) {
		allPlayers[1].setImpedimentaIsLearn();
	}
	if (tempProtego_0) {
		allPlayers[0].setProtegoIsLearn();
	}
	if (tempProtego_1) {
		allPlayers[1].setProtegoIsLearn();
	}
	if (addImpedimenta_0) {
		allPlayers[0].setIntelligence(2);
		allPlayers[0].setImpedimentaPractice(20);
	}
	if (addProtego_0) {
		allPlayers[0].setIntelligence(3);
		allPlayers[0].setProtegoPractice(8);
	}
	tempImpedimenta_0 = false;
	tempImpedimenta_1 = false;
	tempProtego_0 = false;
	tempProtego_1 = false;
	addImpedimenta_0 = false;
	addProtego_0 = false ;
}
}



