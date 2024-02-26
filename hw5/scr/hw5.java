import java.io.File;//Ū�ɥ�
import java.io.FileWriter;//�g�ɥ�
import java.io.IOException;//�U��exception
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
		System.out.printf("�ǰ|�G%-15s  ��O�W���G%-8.1f  ���O�G%-8d  �]�O�G%d%% \r\n",this.name,this.energy,this.intelligence,this.magic);//��ܼƾ�
	}
	public void showData1() {//��ܼƾ�
		System.out.println("�z����l�ݩʬ�");//�^���ϥΪ�
		System.out.printf("�ǰ|�G%-15s  ��O�W���G%-8.1f  ���O��l�ȡG%-8d  �]�O��l�ȡG%d%% \r\n",this.name,this.energy,this.intelligence,this.magic);//��ܼƾ�
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
	private Serpensortia Serpensortia = new Serpensortia();//�G�y����
	private Stupefy Stupefy = new Stupefy();//�G�y����
	private Impedimenta Impedimenta = new Impedimenta();//�G�y����
	private Protego Protego = new Protego();//�G�y����
	private Spectumsempra Spectumsempra = new Spectumsempra();//�G�y����
	private Expecto_Patronum Expecto_Patronum = new Expecto_Patronum();//�G�y����
	private int potion = 5;//Player���Ѽ�
	private int Howler = 1;//�H���H�ƶq
	private int Felix_Felicis = 1;//�֨Ӻֳ߼ƶq
	private int Intelligence ;//Player���Ѽ�
	private double Energy;//Player���Ѽ�
	private int SerpensortiaPractice = Serpensortia.getPractice();//Player���Ѽ�
	private int StupefyPractice = Stupefy.getPractice();//Player���Ѽ�
	private int ImpedimentaPractice = Impedimenta.getPractice();//Player���Ѽ�
	private int ProtegoPractice = Protego.getPractice();//Player���Ѽ�
	private int SpectumsempraPractice = Spectumsempra.getPractice();//Player���Ѽ�
	private int Expecto_PatronumPractice = Expecto_Patronum.getPractice();//Player���Ѽ�
	private int bleedround = 1;//�y��^�X(1��0���y�媬�A �@2�^�X �H�U�ҥH���Φ����)
	private int burninground = 2;//�U�N�^�X
	private int damage = 0;//�p����쪺�`�ˮ`
	private int bonus = 1;//�ޯ�ǲߥ[��
	private int bonusround = 2;//�ޯ�ǲߥ[���^�X
	private int flyinground = 1;
	private int jumpinground = 1;
	private boolean IsLearnSerpensortia = false;//�өG�y�O�_�ǲ�
	private boolean IsLearnStupefy = false;//�өG�y�O�_�ǲ�
	private boolean IsLearnImpedimenta = false;//�өG�y�O�_�ǲ�
	private boolean IsLearnProtego = false;//�өG�y�O�_�ǲ�
	private boolean IsDead = false;//Player���Ѽ�
	private boolean IsLearnSpectumsempra = false;//�өG�y�O�_�ǲ�
	private boolean IsLearnExpecto_Patronum = false;//�өG�y�O�_�ǲ�
	private boolean IsLearnWingardium_Leviosa = false;//�өG�y�O�_�ǲ�
	private boolean IsLearnTarantallegra = false;//�өG�y�O�_�ǲ�
	private boolean tempImpedimenta = false;//�Ȯɾǲߪ��G�y�O�s�b��
	private boolean tempProtego = false;//�Ȯɾǲߪ��G�y�O�s�b��
	private boolean tempExpecto_Patronum = false;//�Ȯɾǲߪ��G�y�O�s�b��
	private boolean addImpedimenta = false;//�Ȯɾǲߪ��G�y�O�s�b��
	private boolean addProtego = false;//�Ȯɾǲߪ��G�y�O�s�b��
	private boolean bleeding = false;//�O�_���y�媬�A
	private boolean HowlerCanUse = false;//�O�_�i�ΩH���H
	private boolean burning = false;//�O�_���U�N���A
	private boolean IsUsingFelix_Felicis = false;//�O�_���b�ϥΧޯ�ǲߥ[��
	private boolean Jumping = false;//�O�_�����D���A
	private boolean Flying = false;//�O�_�����檬�A
	
	public void setPotion(int iIn) {//�ϥ��Ĥ�����k
		potion -= iIn;//�����Ĥ��ƶq
	}
	public void setName(String inName){//�]�wname
		name = inName;
	}
	public void setGroup(Group inGroup){//�w�qplayer���ǰ|
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
	public void setSpectumsempraPractice (int iIn) {//����Spectumsempra�����m��
		SpectumsempraPractice += iIn;
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
	public void setSpectumsempraPractice1(int In) {//�]�wSpectumsempra�����m��
		SpectumsempraPractice = In;
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
	public void setSpectumsempraIsLearn() {//�NSpectumsempra�]���H�ǲ�
		IsLearnSpectumsempra = true;
	}
	public void setExpecto_PatronumIsLearn () {//�NExpecto_Patronum�]���H�ǲ�
		IsLearnExpecto_Patronum = true;
	}
	public void setWingardium_LeviosaIsLearn () {//�NWingardium_Leviosa�]���H�ǲ�
		IsLearnWingardium_Leviosa = true;
	}
	public void setTarantallegraIsLearn () {//�NTarantallegra�]���H�ǲ�
		IsLearnTarantallegra = true;
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
	public void setEnergy(double inEnergy) {//�]�wENERGY
		Energy = inEnergy;
	}
	public void setIntelligence(int inIntelligence) {//���a�W�[���O
		Intelligence += inIntelligence;
	}
	public void setIntelligence1(int inIntelligence) {//���a�W�[���O
		Intelligence = inIntelligence;
	}
	public void settempImpedimenta (boolean intempImpedimenta) {//�Y�N�ǲ�intempImpedimenta
		tempImpedimenta = intempImpedimenta;
	}
	public void settempProtego (boolean inProtego) {//�Y�N�ǲ�intempProtego
		tempProtego = inProtego;
	}
	public void settempExpecto_Patronum (boolean In) {//�Y�N�ǲ�intempExpecto_Patronum
		tempExpecto_Patronum = In;
	}
	public void setaddImpedimenta(boolean inaddImpedimenta) {//�Y�N����Impedimenta
		addImpedimenta = inaddImpedimenta;
	}
	public void setaddProtego(boolean inaddProtego) {//�Y�N����Protego
		addProtego = inaddProtego;
	}
	public void setbleeding (boolean In) {//�]�w�y�媬�A
		bleeding = In;
	}
	public void setbleedround(int In) {//�]�w�y��^�X
		bleedround = In;
	}
	public void setburning (boolean In) {//�]�w�U�N���A
		burning = In;
	}
	public void setburninground(int In) {//�]�w�U�N�^�X
		burninground = In;
	}
	public void adddamage(int In) {//�O�����쪺�ˮ`
		damage += In;
	}
	public void setHowlerCanUse () {//�]�w�H���H���i�Ϊ��A
		HowlerCanUse = true;
	}
	public void useHowler() {//�ϥΩH���H
		Howler = 0;
	}
	public void useFelix_Felicis() {//�ϥκ֨Ӻֳ�
		Felix_Felicis = 0;
	}
	public void setbonus (int In) {//�]�w�ޯ�[����
		bonus = In;
	}
	public void setFelix_Felicis (boolean In) {//�]�wFelix_Felicis�ϥΪ��A
		IsUsingFelix_Felicis = In;
	}
	public void usebonus (int In) {//���Ӧ^�X
		bonusround -= In;
	}
	public void setbonusround (int In) {//�]�w�^�X
		bonusround = In;
	}
	public void setPlayerIsJumping(boolean In) {//���D���A
		Jumping = In;
	}
	public void setPlayerIsFlying(boolean In) {//���檬�A
		Flying = In;
	}
	public void setFelix_Felicisnum (int In) {//�]�wFelix_Felicis�ƶq
		Felix_Felicis = In;
	}
	public void setHowlernum (int In) {//�]�wHowler�ƶq
		Howler = In;
	}
	public void setflying (int In) {
		flyinground = In;
	}
	public void setjumping (int In) {
		jumpinground = In;
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
	public int getSpectumsempraPractice() {//���Spectumsempra�����m��
		return SpectumsempraPractice;
	}
	public int getExpecto_PatronumPractice() {//���Expecto_Patronum�����m��
		return Expecto_PatronumPractice;
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
	public boolean getSpectumsempraIsLearn() {//���Spectumsempra�ϧ_�w�g�ǲ�
		return IsLearnSpectumsempra;
	}
	public boolean getExpecto_PatronumIsLearn() {//���Expecto_Patronum�ϧ_�w�g�ǲ�
		return IsLearnExpecto_Patronum;
	}
	public boolean getWingardium_LeviosaIsLearn() {//���Wingardium_Leviosa�ϧ_�w�g�ǲ�
		return IsLearnWingardium_Leviosa;
	}
	public boolean getTarantallegraIsLearn () {//���Tarantallegra�ϧ_�w�g�ǲ�
		return IsLearnTarantallegra;
	}
	public int getPotion() {//����Ĥ��ƶq
		return potion;
	}
	public boolean getIsDead() {//�P�_���a�O�_���`
		return IsDead;
	}
	public double getGroupEnergy() {//���Energy
		return group.getEnergy();
	}
	public boolean gettempImpedimenta () {//���Impedimenta���Ȯɪ��A
		return tempImpedimenta;
	}
	public boolean gettempProtego () {//���Protego���Ȯɪ��A
		return tempProtego;
	}
	public boolean gettempExpecto_Patronum () {//���Expecto_Patronum���Ȯɪ��A
		return tempExpecto_Patronum;
	}
	public boolean getaddImpedimenta () {//���Impedimenta���Ȯɴ��ɪ��A
		return addImpedimenta;
	}
	public boolean getaddProtego () {//���Protego���Ȯɴ��ɪ��A
		return addProtego;
	}
	public boolean getbleeding () {//����y�媬�A
		return bleeding;
	}
	public int getbleedround () {//����y��^�X
		return bleedround;
	}
	public boolean getburning () {//����U�N���A
		return burning;
	}
	public int getburninground () {//����U�N�^�X
		return burninground;
	}
	public int getdamage () {//�������ˮ`��
		return damage;
	}
	public boolean getHowlerCanUse () {//����i��Howler
		return HowlerCanUse;
	}
	public int getHowler() {//���Howler�ƶq
		return Howler;
	}
	public int getbonus () {//����ޯ�[����
		return bonus;
	}
	public int getbonusround () {//����[���^�X
		return bonusround;
	}
	public boolean getFelix_Felicis () {//�O�_���b�ϥ�Felix_Felicis
		return IsUsingFelix_Felicis;
	}
	public int getFelix_Felicisnum () {//���Felix_Felicis�ƶq
		return Felix_Felicis;
	}
	public boolean getPlayerIsJumping() {//����O�_���b���D
		return Jumping;
	}
	public boolean getPlayerIsFlying() {//����O�_���b����
		return Flying;
	}
	public String getgroup () {//����ǰ|�W��
		return group.getName();
	}
	public int getflyinground () {
		return flyinground;
	}
	public int getjumpinground () {
		return jumpinground;
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
class Spectumsempra extends attackSpell {//Spectumsempra�~��attackSpell
	public Spectumsempra() {
		super("Spectumsempra", 35, 30, false);//�s�J�U���Ѽ�
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
class Expecto_Patronum extends defendSpell {
	public Expecto_Patronum () {
		super("Expecto_Patronum ", 35, 100, false);//�s�J�U���Ѽ�
	}
}

class specialSpell {
	private String spellname;//�w�q�W�r
	private int IntRequirement;//�w�q�̧C���O�ݨD
	private int practice;//�w�q���m��
	private boolean isLearn;//�O�_�ǲ�
	
	public specialSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {//defendSpell ��constructor
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
class Wingardium_Leviosa extends specialSpell {//Wingardium_Leviosa�~��specialSpell
	public Wingardium_Leviosa() {
		super("Wingardium_Leviosa", 25, 100, false);//�s�J�U���Ѽ�
	}
}
class Tarantallegra extends specialSpell {//Tarantallegra�~��specialSpell
	public Tarantallegra() {
		super("Tarantallegra", 35, 100, false);//�s�J�U���Ѽ�
	}
}

public class hw5 {
	public static int n = 1;//�w�q�^�X
	public static String playername;//���a�W��
	public static String g_cmd;//��J�����O
	public static String Sep  = " ";//cmd���}������
	public static boolean tempImpedimenta_0 = false;//�P�_�ޯ�ǲ�
	public static boolean tempProtego_0 = false;//�P�_�ޯ�ǲ�
	public static boolean tempImpedimenta_1 = false;//�P�_�ޯ�ǲ�
	public static boolean tempProtego_1 = false;//�P�_�ޯ�ǲ�
	public static boolean addImpedimenta_0 = false;//�P�_�ޯ�ǲ�
	public static boolean addProtego_0 = false;//�P�_�ޯ�ǲ�
	public static boolean nextRound = true;//�P�q�O�_�i�J�U�@�^�X
	public static boolean playerIndex = false;//�P�_���Ӫ��a
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
	public static Spectumsempra Spectumsempra = new Spectumsempra();//�s�W�U��class
	public static Expecto_Patronum Expecto_Patronum = new Expecto_Patronum();//�s�W�U��class
	public static Wingardium_Leviosa Wingardium_Leviosa = new Wingardium_Leviosa();//�s�W�U��class
	public static Tarantallegra Tarantallegra = new Tarantallegra();//�s�W�U��class
	public static void main(String[] args) {
		System.out.println("�w��C���N��د��Ův���k�j�ɡI");//�w��T��
		setPlayer();//�I�ssetplayer
		testspell();//�I�stestspell
	}
public static void setPlayer() {//setplayer����k
	String name;//�w�q�W�r
	String group;//�w�q�ǰ|
	String[] AfterSplit;//�N���O���}
	String sepString = "	";//���}���O������
	
	for( int i=0; i < 2 ;i ++){
		allPlayers[i] = new Player();//�إ�array ����2�쪱�a
	}
	System.out.println("�i�H��ܫإߨ��� �� Ū�����A�ɮ�");//�^���ϥΪ�
	System.out.println("�n�إߨ��� �Ы�1");//�^���ϥΪ�
	System.out.println("�nŪ�����A�ɮ� �п�J2");//�^���ϥΪ�
	int cmd = ConsoleIn.readLineInt();
	if (cmd == 1) {
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
	else if(cmd == 2) {
		try{
			boolean IsPlayer1 = true;//true �����a1 false �����a2
			int player1 = 0;//allPlayers��index
			group = null;//�ǰ|
			name = null;//�W�r
			double energy;//��O
			int intel;//���O
			ArrayList<String> fileContent = FileIO.readfile("status.txt");//Ūstatus.exe����
		for(int j=0; j < fileContent.size(); j++){//Ū��
			if(fileContent.get(j).equals("Player1")) {//�P�_�����a�@
				AfterSplit = fileContent.get(j+1).split(sepString);//Ū���U�@��
				name = AfterSplit[0];//�����W�r
				group =AfterSplit[1];//�����ǰ|
				player1 = 0;//index of allPlayers
				addplayer_spell(player1, name, group);//�s�J�W�r�M�ǰ|
				AfterSplit = fileContent.get(j+2).split(sepString);//Ū���U2��
				energy = Integer.parseInt(AfterSplit[0]);//�s�J�Ѽ�
				intel = Integer.parseInt(AfterSplit[1]);//�s�J�Ѽ�
				addplayer_energy(player1, energy, intel);//�s�J�Ѽ�
				String[] statuStrings =fileContent.get(j+2).split(sepString);//Ū���U2��
				addplayer_status(player1, statuStrings);//�s�J���A
				AfterSplit = fileContent.get(j+3).split(sepString);//Ū����3��
				int Howler  =  Integer.parseInt(AfterSplit[0]);//�s�J�Ѽ�
				int Felix_Felicis = Integer.parseInt(AfterSplit[1]);//�s�J�Ѽ�
				addplayer_item (player1, Howler, Felix_Felicis);//�s�J�Ѽ�
			}
			if(fileContent.get(j).equals("Player2")) {
				IsPlayer1 = false;//���a2
				AfterSplit = fileContent.get(j+1).split(sepString);//Ū���U�@��
				name = AfterSplit[0];//�����W�r
				group =AfterSplit[1];//�����ǰ|
				player1 = 1;//index of allPlayers
				addplayer_spell(player1, name, group);//�s�J�W�r�M�ǰ|
				AfterSplit = fileContent.get(j+2).split(sepString);//Ū���U2��
				energy = Integer.parseInt(AfterSplit[0]);//�s�J�Ѽ�
				intel = Integer.parseInt(AfterSplit[1]);//�s�J�Ѽ�
				addplayer_energy(player1, energy, intel);//�s�J�Ѽ�
				String[] statuStrings =fileContent.get(j+2).split(sepString);
				addplayer_status(player1, statuStrings);//�s�J���A
				AfterSplit = fileContent.get(j+3).split(sepString);//Ū����3��
				int Howler  =  Integer.parseInt(AfterSplit[0]);//�s�J�Ѽ�
				int Felix_Felicis = Integer.parseInt(AfterSplit[1]);//�s�J�Ѽ�
				addplayer_item (player1, Howler, Felix_Felicis);//�s�J�Ѽ�
			}	
			if (fileContent.get(j).contains("learned")) {//�s�J�ޯ�
				int Player1 = 0;//���a��index
				AfterSplit = fileContent.get(j).split(sepString);//���}���O
				if (IsPlayer1 == true) {//���a�@�ɪ�index
					Player1 = 0;
				}
				else if (IsPlayer1 == false) {//���a2�ɪ�index
					Player1 = 1;
				}
				if (AfterSplit[1].equals("Serpensortia")) {//��Ū������ޯ��
					allPlayers[Player1].setSerpensortiaIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);//�^���ϥΪ�
					allPlayers[Player1].setSerpensortiaPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//�s�J���m��
					System.out.println(allPlayers[Player1].getName() + " Serpensortia�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�^���ϥΪ�
				}
				else if (AfterSplit[1].equals("Stupefy") ) {//��Ū������ޯ��
					allPlayers[Player1].setStupefyIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);//�^���ϥΪ�
					allPlayers[Player1].setStupefyPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));
					System.out.println(allPlayers[Player1].getName() + " Stupefy�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�s�J���m��
				}
				else if (AfterSplit[1].equals("Impedimenta") ) {//��Ū������ޯ��
					allPlayers[Player1].setImpedimentaIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);
					allPlayers[Player1].setImpedimentaPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//�^���ϥΪ�
					System.out.println(allPlayers[Player1].getName() + " Impedimenta�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�s�J���m��
				}
				else if (AfterSplit[1].equals("Protego") ) {//��Ū������ޯ��
					allPlayers[Player1].setProtegoIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);
					allPlayers[Player1].setProtegoPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//�^���ϥΪ�
					System.out.println(allPlayers[Player1].getName() + " Protego�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�s�J���m��
				}
				else if (AfterSplit[1].equals("Spectumsempra") ) {//��Ū������ޯ��
					allPlayers[Player1].setSpectumsempraIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);
					allPlayers[Player1].setSpectumsempraPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//�^���ϥΪ�
					System.out.println(allPlayers[Player1].getName() + " Spectumsempra�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�s�J���m��
				}
				else if (AfterSplit[1].equals("Expecto Patronum")) {//��Ū������ޯ��
					allPlayers[Player1].setExpecto_PatronumIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);//�^���ϥΪ�
					System.out.println(allPlayers[Player1].getName() + " Expecto Patronum�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�s�J���m��
				}
				else if (AfterSplit[1].equals("Wingardium Leviosa") ) {//��Ū������ޯ��
					allPlayers[Player1].setWingardium_LeviosaIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);//�^���ϥΪ�
					System.out.println(allPlayers[Player1].getName() + " Wingardium Leviosa�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�s�J���m��
				}
				else if (AfterSplit[1].equals("Tarantallegra") ) {//��Ū������ޯ��
					allPlayers[Player1].setTarantallegraIsLearn();//�O�L���ǲߪ��A
					System.out.println(allPlayers[Player1].getName() + " �w�ǲߡG" + AfterSplit[1]);//�^���ϥΪ�
					System.out.println(allPlayers[Player1].getName() + " Tarantallegra�����m�׬��G" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//�s�J���m��
				}
			}
		}
		}catch (java.lang.IndexOutOfBoundsException e) {
				System.out.println("ah! error happened! arraylist OutOfBounds");//���
		}
	}
}

public static void testspell () {
	int player1 = 0;
	int player2 = 0;
	System.out.println("************��1�^�X************");//�^���ϥΪ�
	while ( true) {
		if (false == playerIndex) {//���a�������k
			player1 = 0;//index
			player2 = 1;//index
			nextRound = false;
			playerIndex = true;//�w�]���t�@��
		}
		else if (true == playerIndex) {//���a�������k
			player1 = 1;//index
			player2 = 0;//index
			nextRound = true;
			playerIndex = false;//�w�]���t�@��
		}
		if ((allPlayers[player1].getPlayerIsJumping() == false)) {
			System.out.println("�Ъ��a�G" + allPlayers[player1].getName() + "�I�i�]�k");//�^���ϥΪ�	
			g_cmd=ConsoleIn.readLine();//��J���a��
		}
		if (g_cmd.contains("attack") &&
			(allPlayers[player1].getPlayerIsFlying() == false) &&
			(allPlayers[player1].getPlayerIsJumping() == false)){ //�ϥΧ�����
			String[] AfterSplit;//���}���O
			AfterSplit = g_cmd.split(Sep);//���}���O
			String spelltypeString = AfterSplit[1];//�P�_��J��
			double P;//��������l��
			if (spelltypeString.compareTo("Serpensortia") == 0 &&//�ϥ�Serpensortia
				AfterSplit.length == 2 &&
				true == allPlayers[player1].getSerpensortiaIsLearn() && //�w�ǲ�
				allPlayers[player1].getEnergy() > 10 ) {//��q����
				allPlayers[player1].useEnergy(10);//��q-10
				P = (Math.round(allPlayers[player1].getSerpensortiaPractice() * (100 + allPlayers[player1].getMagic()) * 20 * 3)/10000.00);//�p��ˮ`
				if (true == allPlayers[player2].getImpedimentaIsLearn() &&
					(allPlayers[player2].getPlayerIsFlying() == false)) {//�O�_�����m�G
					P -= (Math.round( 3 * 20 * allPlayers[player2].getImpedimentaPractice())/100.00);//��׶ˮ`
				}
				if (true == allPlayers[player2].getProtegoIsLearn() &&
					(allPlayers[player2].getPlayerIsFlying() == false)) {//�O�_�����m�G
						P -= (Math.round(P * 20 * allPlayers[player2].getProtegoPractice())/10000.00);//��׶ˮ`
				}
				P = (Math.round(P)/1);//�|�ˤ��J����
				allPlayers[player2].adddamage((int) P);//�ֿn�H���H�һݪ��ˮ`��
				allPlayers[player2].useEnergy( P );//��q-P
				System.out.println(allPlayers[player1].getName() + "�o�ʧ����y���G" + P + "�I�ˮ`�I");//�^���ϥΪ�
				System.out.println(allPlayers[player2].getName() + "�D�������A��O�ѤU" + allPlayers[player2].getEnergy());//�^���ϥΪ�
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&//�ϥ�Stupefy
					AfterSplit.length == 2 &&
					true == allPlayers[player1].getStupefyIsLearn() &&//�w�ǲ�
					allPlayers[player1].getEnergy() > 10) {//��q����
					allPlayers[player1].useEnergy(10);//��q-10
					P = (Math.round(70 * allPlayers[player1].getStupefyPractice() * (100 + allPlayers[player1].getMagic()))/10000.00);//�p��ˮ`
					if (true == allPlayers[player2].getImpedimentaIsLearn()  &&
							(allPlayers[player2].getPlayerIsFlying() == false)) {//�O�_�����m�G
						P -= (Math.round( 1 * 20 * allPlayers[player2].getImpedimentaPractice())/100.00);//��׶ˮ`
					}
					if (true == allPlayers[player2].getProtegoIsLearn()  &&
							(allPlayers[player2].getPlayerIsFlying() == false)) {//�O�_�����m�G
						P -= (Math.round(P * 20 * allPlayers[player2].getProtegoPractice())/10000.00);//��׶ˮ`
					}
					P = (Math.round(P)/1);//�|�ˤ��J����
					allPlayers[player2].adddamage((int) P);//�ֿn�H���H�һݪ��ˮ`��
					allPlayers[player2].useEnergy( P );//��q-P
					System.out.println(allPlayers[player1].getName() + "�o�ʧ����y���G" + P + "�I�ˮ`�I");//�^���ϥΪ�
					System.out.println(allPlayers[player2].getName() + "�D�������A��O�ѤU" + allPlayers[player2].getEnergy());//�^���ϥΪ�
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&
					AfterSplit.length == 2 &&
					true == allPlayers[player1].getSpectumsempraIsLearn() &&
					allPlayers[player1].getEnergy() > 10) {
				allPlayers[player1].useEnergy(10);
				P = (Math.round(100 * allPlayers[player1].getSpectumsempraPractice() * (100 + allPlayers[player1].getMagic()))/10000.00);
				if (true == allPlayers[player2].getImpedimentaIsLearn()  &&
						(allPlayers[player2].getPlayerIsFlying() == false)) {//�O�_�����m�G
					P -= (Math.round( 1 * 20 * allPlayers[player2].getImpedimentaPractice())/100.00);//��׶ˮ`
				}
				if (true == allPlayers[player2].getProtegoIsLearn()  &&
						(allPlayers[player2].getPlayerIsFlying() == false)) {//�O�_�����m�G
					P -= (Math.round(P * 20 * allPlayers[player2].getProtegoPractice())/10000.00);//��׶ˮ`
				}
				P = (Math.round(P)/1);//�|�ˤ��J����
				allPlayers[player2].adddamage((int) P);//�ֿn�H���H�һݪ��ˮ`��
				allPlayers[player2].useEnergy( P );//��q-P
				System.out.println(allPlayers[player1].getName() + "�o�ʧ����y���G" + P + "�I�ˮ`�I");//�^���ϥΪ�
				if (true == allPlayers[player2].getbleeding()) {//���b�y���
					System.out.println(allPlayers[player2].getName() + "���b�y�夣�K�[�y��ĪG");//�^���ϥΪ�
				}
				else if (false == allPlayers[player2].getbleeding()) {//�S���y���
					System.out.println(allPlayers[player2].getName() + "�Q�K�[�y��ĪG");//�^���ϥΪ�
					allPlayers[player2].setbleeding(true);//�y��
				}
				System.out.println(allPlayers[player2].getName() + "�D�������A��O�ѤU" + allPlayers[player2].getEnergy());//�^���ϥΪ�
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&//�ϥ�Wingardium Leviosa
					AfterSplit[2].equals("Leviosa") &&
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() &&//�w�ǲ�
					allPlayers[player1].getEnergy() > 20 && 
					(allPlayers[player2].getPlayerIsFlying() == false)) {//��O������
				System.out.println(allPlayers[player1].getName() + "�@����20��O��" + allPlayers[player2].getName() + "���_��");//�^���ϥΪ�
				System.out.println(allPlayers[player2].getName() + "��L�k�ϥΥ���G�y�I");//�^���ϥΪ�
				allPlayers[player2].setPlayerIsFlying(true);//����
				allPlayers[player1].useEnergy(20);//����20��O'
				}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&//�ϥ�Tarantallegra
					true == allPlayers[player1].getTarantallegraIsLearn() &&//�w�ǲ�
					allPlayers[player1].getEnergy() > 30 &&
					(allPlayers[player2].getPlayerIsJumping() == false) ) {//��O������
				System.out.println(allPlayers[player1].getName() + "�@����30��O��" + allPlayers[player2].getName() + "�}�l�ø�");//�^���ϥΪ�
				System.out.println(allPlayers[player2].getName() + "�L�k��ʤ@�^�X");//�^���ϥΪ�
				allPlayers[player2].setPlayerIsJumping(true);
				allPlayers[player1].useEnergy(30);
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = true;//��@�^�X
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&//�ϥ�Wingardium Leviosa
					AfterSplit[2].equals("Leviosa") &&
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() && //�w�ǲ�
					allPlayers[player1].getEnergy() > 20 && 
					(allPlayers[player2].getPlayerIsFlying() == true)) {
				System.out.println(allPlayers[player2].getName() + "���b���椤�L�k�A���Ϩ䭸��I");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&//�ϥ�Tarantallegra
					true == allPlayers[player1].getTarantallegraIsLearn() &&//�w�ǲ�
					allPlayers[player1].getEnergy() > 30 &&
					(allPlayers[player2].getPlayerIsJumping() == true) ) {//��O������
				System.out.println(allPlayers[player2].getName() + "���b�ø����L�k�A���Ϩ�ø��I");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else if (allPlayers[player1].getEnergy() <= 10) {//��q������
				System.out.println("��O����");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&
					AfterSplit[2].equals("Leviosa") &&
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() &&
					allPlayers[player1].getEnergy() <= 20) {//��q������
				System.out.println("��O����");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&
					true == allPlayers[player1].getTarantallegraIsLearn() &&
					allPlayers[player1].getEnergy() <= 30) {//��q������
				System.out.println("��O����");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&//Stupefy���ǲ�
					false == allPlayers[player1].getStupefyIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "�|���ǲ�Stupefy�I");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Serpensortia") == 0 &&//Serpensortia���ǲ�
					false == allPlayers[player1].getSerpensortiaIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "�|���ǲ�Serpensortia�I");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&//Spectumsempra���ǲ�
					false == allPlayers[player1].getSpectumsempraIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "�|���ǲ�Spectumsempra�I");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&//Wingardium Leviosa���ǲ�
					AfterSplit[2].equals("Leviosa") &&
					false == allPlayers[player1].getWingardium_LeviosaIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "�|���ǲ�Wingardium Leviosa�I");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&//Tarantallegra���ǲ�
					false == allPlayers[player1].getTarantallegraIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "�|���ǲ�Tarantallegra�I");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else if (spelltypeString.compareTo("Stupefy") != 0 &&//���O���~
					spelltypeString.compareTo("Serpensortia")!= 0 &&
					spelltypeString.compareTo("Spectumsempra")!= 0 &&
					spelltypeString.compareTo("Wingardium")!= 0 &&
					spelltypeString.compareTo("Tarantallegra")!= 0 ) {
				System.out.println(spelltypeString + "���s�b�I");//�^���ϥΪ�
				playerIndex = !playerIndex;//�^��ۤv
				nextRound = false;//����@�^�X
			}
			else {
				System.out.println("���O���~");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		else if (g_cmd.contains("learn") &&
				(allPlayers[player1].getPlayerIsFlying() == false) &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {//���O��learn
			String[] AfterSplit;
			AfterSplit = g_cmd.split(Sep);
			String spelltypeString = AfterSplit[1];//�P�_��J�����O
			if (spelltypeString.compareTo("Serpensortia") == 0 &&//��J��Serpensortia
				AfterSplit.length == 2 &&
				allPlayers[player1].getEnergy() > 10  && //��q������
				false == allPlayers[player1].getSerpensortiaIsLearn() && //���ǲ�
				allPlayers[player1].getIntelligence() >= Serpensortia.getIntRequirement()) {//���O�n�D�ŦX
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GSerpensortia");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(2);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setSerpensortiaIsLearn();//�]���w�ǲ�
			}
			else if (spelltypeString.compareTo("Serpensortia") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getSerpensortiaIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= Serpensortia.getIntRequirement() && //���O�n�D�ŦX
					allPlayers[player1].getSerpensortiaPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "�W�j�F�GSerpensortia");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*2);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setSerpensortiaPractice(allPlayers[player1].getbonus()*10);//�W�[���m��
				System.out.println(allPlayers[player1].getName() + "Serpensortia���m�פW�ɬ��G" + allPlayers[player1].getSerpensortiaPractice() + "%");//�^���ϥΪ�
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					false == allPlayers[player1].getStupefyIsLearn() && //���ǲ�
					allPlayers[player1].getIntelligence() >= Stupefy.getIntRequirement()) {//���O�n�D�ŦX
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GStupefy");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(3);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setStupefyIsLearn();//�]���w�ǲ�	
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getStupefyIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= Stupefy.getIntRequirement() &&//���O�n�D�ŦX
					allPlayers[player1].getStupefyPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "�W�j�F�GStupefy");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*3);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setStupefyPractice(allPlayers[player1].getbonus()*10);//�W�[���m��
				System.out.println(allPlayers[player1].getName() + "Stupefy���m�פW�ɬ��G" + allPlayers[player1].getStupefyPractice() + "%");//�^���ϥΪ�	
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					false == allPlayers[player1].getSpectumsempraIsLearn() && //���ǲ�
					allPlayers[player1].getIntelligence() >= Spectumsempra.getIntRequirement()) {//���O�n�D�ŦX
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GSpectumsempra");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(4);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setSpectumsempraIsLearn();//�]���w�ǲ�	
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getSpectumsempraIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= Spectumsempra.getIntRequirement() &&//���O�n�D�ŦX
					allPlayers[player1].getSpectumsempraPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "�W�j�F�GSpectumsempra");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*4);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setSpectumsempraPractice(allPlayers[player1].getbonus()*5);//�W�[���m��
				System.out.println(allPlayers[player1].getName() + "Spectumsempra���m�פW�ɬ��G" + allPlayers[player1].getSpectumsempraPractice() + "%");//�^���ϥΪ�	
			}
			else if (spelltypeString.compareTo("Impedimenta") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					false == allPlayers[player1].getImpedimentaIsLearn() && //���ǲ�
					allPlayers[player1].getIntelligence() >= 15) {//���O�n�D�ŦX
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GImpedimenta");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(2);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].settempImpedimenta(true);//�N�ǲ�
			}
			else if (spelltypeString.compareTo("Impedimenta") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getImpedimentaIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= 15 && //���O�n�D�ŦX
					allPlayers[player1].getImpedimentaPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "�W�j�F�GImpedimenta");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*2);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setImpedimentaPractice(allPlayers[player1].getbonus()*20);//�W�[���m��
				System.out.println(allPlayers[player1].getName() + "Impedimenta���m�פW�ɬ��G" + allPlayers[player1].getImpedimentaPractice() + "%");//�^���ϥΪ�
				allPlayers[player1].setaddImpedimenta(true);
			}
			else if (spelltypeString.compareTo("Protego") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					false == allPlayers[player1].getProtegoIsLearn() && //���ǲ�
					allPlayers[player1].getIntelligence() >= 25) {//���O�n�D�ŦX
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GProtego");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(3);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].settempProtego(true);//�N�ǲ�
			}
			else if (spelltypeString.compareTo("Protego") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getProtegoIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= 25 && //���O�n�D�ŦX
					allPlayers[player1].getProtegoPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "�W�j�F�GProtego");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*3);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setProtegoPractice(allPlayers[player1].getbonus()*8);//�W�[���m��
				System.out.println(allPlayers[player1].getName() + "Protego���m�פW�ɬ��G" + allPlayers[player1].getProtegoPractice() + "%");//�^���ϥΪ�
				allPlayers[player1].setaddProtego(true);
			}
			else if (spelltypeString.compareTo("Expecto") == 0 &&
					AfterSplit[2].compareTo("Patronum") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					false == allPlayers[player1].getExpecto_PatronumIsLearn() && //���ǲ�
					allPlayers[player1].getIntelligence() >= Expecto_Patronum.getIntRequirement()) {//���O�n�D�ŦX
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GExpecto Patronum");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(8);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].settempExpecto_Patronum(true);//�N�ǲ�
			}
			else if (spelltypeString.compareTo("Expecto") == 0 &&
					AfterSplit[2].compareTo("Patronum") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getExpecto_PatronumIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= Expecto_Patronum.getIntRequirement() &&//���O�n�D�ŦX
					allPlayers[player1].getExpecto_PatronumPractice() == 100) {
				System.out.println("Expecto Patronum �u��ǲߤ@��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&
					AfterSplit[2].compareTo("Leviosa") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					false == allPlayers[player1].getWingardium_LeviosaIsLearn() && //���ǲ�
					allPlayers[player1].getIntelligence() >= Wingardium_Leviosa.getIntRequirement()) {
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GWingardium Leviosa ");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(8);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setWingardium_LeviosaIsLearn();
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&
					AfterSplit[2].compareTo("Leviosa") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= Wingardium_Leviosa.getIntRequirement()) {
				System.out.println("Wingardium Leviosa �u��ǲߤ@��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					false == allPlayers[player1].getTarantallegraIsLearn() && //���ǲ�
					allPlayers[player1].getIntelligence() >= Tarantallegra.getIntRequirement()) {
				allPlayers[player1].useEnergy(10);//��q-10
				System.out.println(allPlayers[player1].getName() + "�ǲߤF�GTarantallegra ");//�^���ϥΪ�
				allPlayers[player1].setIntelligence(5);//�W�[���O
				System.out.println(allPlayers[player1].getName() + "���O�ܬ��G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�
				allPlayers[player1].setTarantallegraIsLearn();
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //��q������
					true == allPlayers[player1].getTarantallegraIsLearn() && //�w�ǲ�
					allPlayers[player1].getIntelligence() >= Tarantallegra.getIntRequirement()) {
				System.out.println("Tarantallegra �u��ǲߤ@��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (allPlayers[player1].getEnergy() <= 10) {//��q������
				System.out.println("��O����");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Stupefy") != 0 &&//���O���~�I
					spelltypeString.compareTo("Serpensortia")!= 0 &&
					spelltypeString.compareTo("Protego") != 0 && 
					spelltypeString.compareTo("Impedimenta") != 0 &&
					spelltypeString.compareTo("Expecto") == 0 ) {
				System.out.println(spelltypeString + "���s�b�I");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&//���O�����̧C�ݨD��
					allPlayers[player1].getIntelligence() < Stupefy.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "���O�����L�k�ǲ�Stupefy");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Serpensortia") == 0 &&//���O�����̧C�ݨD��
					allPlayers[player1].getIntelligence() < Serpensortia.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "���O�����L�k�ǲ�Serpensortia");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Protego") == 0 &&//���O�����̧C�ݨD��
					allPlayers[player1].getIntelligence() < Protego.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "���O�����L�k�ǲ�Protego");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Impedimenta") == 0 &&//���O�����̧C�ݨD��
					allPlayers[player1].getIntelligence() < Impedimenta.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "���O�����L�k�ǲ�Impedimenta");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&//���O�����̧C�ݨD��
					allPlayers[player1].getIntelligence() < Spectumsempra.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "���O�����L�k�ǲ�Spectumsempra");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Expecto") == 0 &&//���O�����̧C�ݨD��
					allPlayers[player1].getIntelligence() < Expecto_Patronum.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "���O�����L�k�ǲ�Expecto Patronum");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Impedimenta") == 0 &&
					allPlayers[player1].getImpedimentaPractice() >= 100) {//���m�׹F100��
				allPlayers[player1].setImpedimentaPractice1(100);//���m�׳]��100
				System.out.println("Impedimenta���m�פw��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Serpensortia") == 0 &&
					allPlayers[player1].getSerpensortiaPractice() >= 100) {//���m�׹F100��
				allPlayers[player1].setSerpensortiaPractice1(100);//���m�׳]��100
				System.out.println("Serpensortia���m�פw��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Stupefy") == 0 &&
					allPlayers[player1].getStupefyPractice() >= 100) {//���m�׹F100��
				allPlayers[player1].setStupefyPractice1(100);//���m�׳]��100
				System.out.println("Stupefy���m�פw��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Protego") == 0 &&
					allPlayers[player1].getProtegoPractice() >= 100) {//���m�׹F100��
				allPlayers[player1].setProtegoPractice1(100);//���m�׳]��100
				System.out.println("Protego���m�פw��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Spectumsempra") == 0 &&
					allPlayers[player1].getSpectumsempraPractice() >= 100) {//���m�׹F100��
				allPlayers[player1].setSpectumsempraPractice1(100);//���m�׳]��100
				System.out.println("Spectumsempra���m�פw��");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else {
				System.out.println("���O���~");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		/*else if (g_cmd.contains("learn") &&
				(allPlayers[player1].getPlayerIsFlying() == true)) {
			System.out.println("���椤���i�ϥΩG�y");//�^���ϥΪ�
		}
		else if (g_cmd.contains("attack") &&
				(allPlayers[player1].getPlayerIsFlying() == true)) {
			System.out.println("���椤���i�ϥΩG�y");//�^���ϥΪ�
		}*/
		else if (g_cmd.contains("recover")  &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {//�^�_
			if (allPlayers[player1].getPotion() > 0) {//�٦��Ĥ���
				System.out.println(allPlayers[player1].getName() + "�ϥ��Ĥ�");//�^���ϥΪ�
				allPlayers[player1].setPotion(1);//�Ĥ�-1
				allPlayers[player1].addEnergy(50);//��q+50
				System.out.println(allPlayers[player1].getName() + "����O�^�_��G" + allPlayers[player1].getEnergy());//�^���ϥΪ�
			}
			else if (allPlayers[player1].getPotion() <= 0) {//�S���Ĥ���
				System.out.println("�Ĥ�����");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else {
				System.out.println("���O���~");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		else if (g_cmd.compareTo("game over") == 0  &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {//game over
			if (allPlayers[player1].getEnergy() > allPlayers[player2].getEnergy()) {//A����q�j��B
				System.out.println("���ߪ��a�G" + allPlayers[player1].getName() + "��o�ӧQ�I");//�^���ϥΪ�
			}
			else if (allPlayers[player2].getEnergy() > allPlayers[player1].getEnergy()) {//B����q�j��A
				System.out.println("���ߪ��a�G" + allPlayers[player2].getName() + "��o�ӧQ�I");//�^���ϥΪ�
			}
			else if (allPlayers[player2].getEnergy() == allPlayers[player1].getEnergy()) {//A����q����B
				System.out.println("���襭��I");//�^���ϥΪ�
			}
			System.exit(0);
			System.out.println("�P�¹C���I");//�C������
		}
		else if (g_cmd.contains("use") == true  &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {
			String[] AfterSplit;//���}���O
			AfterSplit = g_cmd.split(Sep);//���}���O
			String Itemtype = AfterSplit[1];//�P�_��J�����O
			if (Itemtype.compareTo("Howler") == 0 &&//�ϥΩH���H
				true == allPlayers[player1].getHowlerCanUse() &&//�i�H�ϥή�
				allPlayers[player1].getHowler() > 0 ) {//���H���H
				System.out.println(allPlayers[player1].getName() + "�w�ϥΤF�H���H�I");//�^���ϥΪ�
				allPlayers[player1].useHowler();//�ϥ�
				System.out.println(allPlayers[player2].getName() + "����U�N�ˮ`����10��O����3�^�X");//�^���ϥΪ�
				allPlayers[player2].setburning(true);//�U�N���
			}
			else if (Itemtype.compareTo("Howler") == 0 &&//��J�����i�ϥ�
					false == allPlayers[player1].getHowlerCanUse()) {
				System.out.println(allPlayers[player1].getName() + "�٤��i�H�ϥΩH���H�I");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (Itemtype.compareTo("Howler") == 0 &&//��J���w�g�ιL
					allPlayers[player1].getHowler() == 0) {
				System.out.println(allPlayers[player1].getName() + "�S���H���H�F�I");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			if (Itemtype.compareTo("Felix") == 0 && //�ϥκ֨Ӻֳ�
				AfterSplit[2].compareTo("Felicis") == 0 &&
				allPlayers[player1].getFelix_Felicisnum() > 0) {//���֨Ӻֳ�
				allPlayers[player1].setbonus(2);//2���[��
				allPlayers[player1].setFelix_Felicis(true);//���b�ϥ�
				allPlayers[player1].useFelix_Felicis();//�֨Ӻֳ�-1
			}
			else if (Itemtype.compareTo("Felix") == 0 &&//��J���ιL�F��
					AfterSplit[2].compareTo("Felicis") == 0 &&
					allPlayers[player1].getFelix_Felicisnum() == 0) {
				System.out.println(allPlayers[player1].getName() + "�S���֨ӺֳߤF�I");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else {
				System.out.println("���O���~");//�^���ϥΪ�
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		else if (allPlayers[player1].getPlayerIsJumping() == true) {
			System.out.println(allPlayers[player1].getName() + "�ø����L�k���");//�^���ϥΪ�
			nextRound = true;
		}
		else {
			System.out.println(allPlayers[player1].getName() + "��J�����O���~�Э��s��J�I");//���O���~
			playerIndex = !playerIndex;
			nextRound = false;
		}
		if (true == nextRound) {
			Event();//Ĳ�o�H���ƥ�
			Check();//�ˬd���a���`�P�_�M�ǲߧޯ઺���m��
			n++;
			System.out.printf("************��%d�^�X************\r\n",n);//�^���ϥΪ�	
			CheckBleedingAndBuring();//�U�N�M�y��
			CheckSpell();//�Ȯɾǲ߫K�w�ǲ�
			CheckItem();//�ˬd���~
			ShowData();//��ܼƾ�
			ouput ();
		}
		Check();//�ˬd���a���`�P�_�M�ǲߧޯ઺���m��
	}
}

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
		if (allPlayers[i].getEnergy() > allPlayers[i].getGroupEnergy()) {//��O�W�L�W��
			allPlayers[i].setEnergy(allPlayers[i].getGroupEnergy());
			System.out.println(allPlayers[i].getName() + "��O��}�W���A�^�_��G" + allPlayers[i].getEnergy());//�^���ϥΪ�
		}
		if (allPlayers[i].getdamage() >= 60 && //����ˮ`>=6��
			allPlayers[i].getHowler() >0) {//���H���H
			allPlayers[i].setHowlerCanUse();//�i�H�ϥ�
			System.out.println(allPlayers[i].getName() + "���H���H(Howler)�i�H�ϥΤF");//�^���ϥΪ�
		}
		if (allPlayers[0].getEnergy() <= 0 &&//���P�ɦ��`��
			allPlayers[1].getEnergy() <= 0 ) {
			System.out.println("����Ҧ��`�A����I");//�^���ϥΪ�
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
						(false == allPlayers[j].getIsDead()) &&
						(false == allPlayers[j].getExpecto_PatronumIsLearn())) {
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
	for (int i = 0; i < allPlayers.length; i++) {
		if (true == allPlayers[i].gettempImpedimenta()) {//�Ȯɾǲ�
			allPlayers[i].setImpedimentaIsLearn();//�w�ǲ�
			allPlayers[i].settempImpedimenta(false);
		}
		if (true == allPlayers[i].gettempProtego()) {
			allPlayers[i].setProtegoIsLearn();
			allPlayers[i].settempProtego(false);
		}
		if (true == allPlayers[i].gettempExpecto_Patronum() ) {
			allPlayers[i].setExpecto_PatronumIsLearn();
			allPlayers[i].settempExpecto_Patronum(false);
		}
		if (true == allPlayers[i].getaddImpedimenta()) {
			allPlayers[i].setIntelligence(2);
			allPlayers[i].setImpedimentaPractice(20);
			allPlayers[i].setaddImpedimenta(false);
		}
		if(true == allPlayers[i].getaddImpedimenta()) {
			allPlayers[i].setIntelligence(3);
			allPlayers[i].setProtegoPractice(8);
			allPlayers[i].setaddProtego(false);
		}
	} 
}
public static void CheckBleedingAndBuring() {
	for (int i = 0; i < allPlayers.length; i++) {
		if (true == allPlayers[i].getbleeding() &&//���b�y��
			allPlayers[i].getbleedround() > 0) {//��2�^�X
			System.out.println(allPlayers[i].getName() + "���b�y�妩����O" + 10 + "�I");//�^���ϥΪ�
			System.out.println(allPlayers[i].getName() + "���y��^�X�ٳѡG1");//�^���ϥΪ�
			allPlayers[i].useEnergy(10);//��O-10
			allPlayers[i].setbleedround(0);//��1�^
			allPlayers[i].adddamage(10);//�ֿn�H���H�һݪ��ˮ`��
		}
		if (true == allPlayers[i].getbleeding() &&//���b�y��
				allPlayers[i].getbleedround() == 0) {//��1�^�X
				System.out.println(allPlayers[i].getName() + "���b�y�妩����O" + 10 + "�I");//�^���ϥΪ�
				System.out.println(allPlayers[i].getName() + "���y��N����");//�^���ϥΪ�
				allPlayers[i].useEnergy(10);//��O-10
				allPlayers[i].setbleedround(1);//�٭�w�]��
				allPlayers[i].setbleeding(false);//���y��F
				allPlayers[i].adddamage(10);//�ֿn�H���H�һݪ��ˮ`��
		}
		if (true == allPlayers[i].getburning() && //���b�U�N
			allPlayers[i].getburninground() == 2) {//��3�^�X
			System.out.println(allPlayers[i].getName() + "���b�U�N������O" + 10 + "�I");//�^���ϥΪ�
			System.out.println(allPlayers[i].getName() + "���U�N�^�X�ٳѡG2");//�^���ϥΪ�
			allPlayers[i].useEnergy(10);//��O-10
			allPlayers[i].adddamage(10);//�ֿn�H���H�һݪ��ˮ`��
			allPlayers[i].setburninground(1);
		}
		if (true == allPlayers[i].getburning() && //���b�U�N
				allPlayers[i].getburninground() == 1 ) {//��2�^�X
				System.out.println(allPlayers[i].getName() + "���b�U�N������O" + 10 + "�I");//�^���ϥΪ�
				System.out.println(allPlayers[i].getName() + "���U�N�^�X�ٳѡG1");//�^���ϥΪ�
				allPlayers[i].useEnergy(10);//��O-10
				allPlayers[i].adddamage(10);//�ֿn�H���H�һݪ��ˮ`��
				allPlayers[i].setburninground(0);
		}
		if (true == allPlayers[i].getburning() && //���b�U�N
				allPlayers[i].getburninground() == 0 ) {//��1�^�X
				System.out.println(allPlayers[i].getName() + "���b�U�N������O" + 10 + "�I");//�^���ϥΪ�
				System.out.println(allPlayers[i].getName() + "���U�N�N����");//�^���ϥΪ�
				allPlayers[i].useEnergy(10);//��O-10
				allPlayers[i].adddamage(10);//�ֿn�H���H�һݪ��ˮ`��
				allPlayers[i].setburninground(2);//�٭�w�]��
				allPlayers[i].setburning(false);//���U�N�F
		}
		if ((true == allPlayers[i].getPlayerIsFlying()) &&
			(allPlayers[i].getflyinground() == 1)) {
			allPlayers[i].setflying(0);
			System.out.println(allPlayers[i].getName() + "���b����L�k�ϥΧ����ξǲߡA���i�ϥΡGuse recover game over");
		}
		else if ((true == allPlayers[i].getPlayerIsFlying()) &&
			(allPlayers[i].getflyinground() == 0)) {
			System.out.println(allPlayers[i].getName() + "���b����L�k�ϥΧ����ξǲߡA���i�ϥΡGuse recover game over");
			allPlayers[i].setflying(1);
			allPlayers[i].setPlayerIsFlying(false);
		}
		if(true == allPlayers[i].getPlayerIsJumping() && 
				(allPlayers[i].getjumpinground() == 1)) {
			System.out.println(allPlayers[i].getName() + "���b�ø��L�k���");
			allPlayers[i].setjumping(0);
		}
		else if(true == allPlayers[i].getPlayerIsJumping() &&
				(allPlayers[i].getjumpinground() == 0)) {
			System.out.println(allPlayers[i].getName() + "���b�ø��L�k���");
			allPlayers[i].setjumping(1);
			allPlayers[i].setPlayerIsJumping(false);
		}
	}
}
public static void CheckItem() {
	for (int i = 0; i < allPlayers.length; i++) {
		if (true == allPlayers[i].getFelix_Felicis() &&//�ϥκ֨Ӻֳ�
			allPlayers[i].getbonusround() > 0) {//�Ѥj��1�^
			allPlayers[i].usebonus(1);//���Ӥ@�^�X
		}
		else if (true == allPlayers[i].getFelix_Felicis() &&//�ϥκ֨Ӻֳ�
				allPlayers[i].getbonusround() == 0) {//��1�^
				allPlayers[i].setFelix_Felicis(false);//�������A
				allPlayers[i].setbonus(1);//�٭�[��
			}
	}
}
public static void addplayer_spell (int player1, String name, String group) {
	if (Group.InCollege(group)){
		allPlayers[player1].setName(name);//�]�w�W�r
		System.out.println("�z�n�I" + allPlayers[player1].getName());//�^���ϥΪ�	
		if (group.equals("Griffendor")) {//�էO��Griffendor
			allPlayers[player1].setGroup(Griffendor);//�[�JGriffendor
			System.out.println("�z�w�[�J" + Griffendor.getName());//�^���ϥΪ�	
			Griffendor.showData1();//��ܼƾ�
		}
		else if (group.equals("Hufflepuff")) {//�էO��Hufflepuff
			allPlayers[player1].setGroup(Hufflepuff);//�[�JHufflepuff
			System.out.println("�w�[�J" + Hufflepuff.getName());//�^���ϥΪ�	
			Hufflepuff.showData1();//��ܼƾ�
		}
		else if (group.equals("Ravenclaw")) {//�էO��Ravenclaw
			allPlayers[player1].setGroup(Ravenclaw);//�[�JRavenclaw
			System.out.println("�w�[�J" + Ravenclaw.getName());//�^���ϥΪ�	
			Ravenclaw.showData1();//��ܼƾ�
		}
		else if (group.equals("Slytherin")) {//�էO��Slytherin
			allPlayers[player1].setGroup(Slytherin);//�[�JSlytherin
			System.out.println("�w�[�J" + Slytherin.getName());//�^���ϥΪ�	
			Slytherin.showData1();//��ܼƾ�
		}
		/*else if (group.equals("debug")) {//debug�Τ��|�C�J�ϥ�
			allPlayers[player1].setGroup(debug);
			System.out.println("�w�[�J" + debug.getName());//�^���ϥΪ�	
			debug.showData1();//��ܼƾ�
		}*/
		else if(group != null) { //��J���~���^��
		System.out.println("�п�J�s�b���ǰ|�I");
		}
	}
	
}
public static void addplayer_energy (int player1, double energy, int intel) {//�s�JŪ�쪺�Ѽ�
	allPlayers[player1].setEnergy(energy);//�s�JŪ�쪺�Ѽ�
	System.out.println(allPlayers[player1].getName() + "����O���G" + allPlayers[player1].getEnergy());//�^���ϥΪ�	
	allPlayers[player1].setIntelligence1(intel);//�s�JŪ�쪺�Ѽ�
	System.out.println(allPlayers[player1].getName() + "�����O���G" + allPlayers[player1].getIntelligence());//�^���ϥΪ�	
	System.out.println(allPlayers[player1].getName() + "���]�k�ѽᬰ�G" + allPlayers[player1].getMagic() + "%");//�^���ϥΪ�	
}
public static void addplayer_status(int player1, String[] status) {
	try {
		for (int i = 0; i < status.length; i++) {
			if(status[i].compareTo("bleeding") == 0) {//�y��
				allPlayers[player1].setbleeding(true);
				System.out.println(allPlayers[player1].getName() + "���b�y��A�ٳѤU�G" + Integer.parseInt(status[i+1]) + " �^�X");//�^���ϥΪ�	
				allPlayers[player1].setbleedround(Integer.parseInt(status[i+1]) - 1 );//�s�JŪ�쪺�Ѽ�
			}
			else if (status[i].compareTo("burning") == 0) {//�U�N
				allPlayers[player1].setburning(true);
				System.out.println(allPlayers[player1].getName() + "���b�U�N�A�ٳѤU�G" + Integer.parseInt(status[i+1]) + " �^�X");//�^���ϥΪ�	
				allPlayers[player1].setburninground(Integer.parseInt(status[i+1]) - 1 );//�s�JŪ�쪺�Ѽ�
			}
			else if (status[i].compareTo("learning-buff") == 0) {//�[��
				allPlayers[player1].setFelix_Felicis(true);
				System.out.println(allPlayers[player1].getName() + "���b�ϥκ֨Ӻֳ߹D��A�ٳѤU�G" + Integer.parseInt(status[i+1]) + " �^�X");//�^���ϥΪ�	
				allPlayers[player1].setbonusround(Integer.parseInt(status[i+1]) - 1 );//�s�JŪ�쪺�Ѽ�
			}
			else if (status[i].compareTo("flying") == 0) {//����
				if ( player1 == 0) {
					System.out.println(allPlayers[player1].getName() + "���b�}�B���L�k��ʡI");//�^���ϥΪ�
					allPlayers[player1].setPlayerIsFlying(true);
					allPlayers[player1].setflying(Integer.parseInt(status[i+1]) - 1);
					System.out.println("�ѥt�@�쪱�a�}�l�^�X");//�^���ϥΪ�	
				}
				if (player1 == 1) {
					System.out.println(allPlayers[player1].getName() + "���b�}�B���L�k��ʡI");//�^���ϥΪ�	
					allPlayers[player1].setPlayerIsFlying(true);
					allPlayers[player1].setflying(Integer.parseInt(status[i+1]) - 1);
					System.out.println("�ѥt�@�쪱�a�}�l�^�X");//�^���ϥΪ�	
				}
			}
			else if (status[i].compareTo("jumping") == 0) {//���D
				if ( player1 == 0) {
					System.out.println(allPlayers[player1].getName() + "���b�ø��L�k��ʡI");//�^���ϥΪ�	
					System.out.println("�ѥt�@�쪱�a�}�l�^�X");//�^���ϥΪ�	
					allPlayers[player1].setPlayerIsJumping(true);
					allPlayers[player1].setjumping(Integer.parseInt(status[i+1]) - 1);
				}
				if (player1 == 1) {
					System.out.println(allPlayers[player1].getName() + "���b�ø��L�k��ʡI");//�^���ϥΪ�	
					System.out.println("�ѥt�@�쪱�a�}�l�^�X");//�^���ϥΪ�	
					allPlayers[player1].setPlayerIsJumping(true);
					allPlayers[player1].setjumping(Integer.parseInt(status[i+1]) - 1);
				}
			}
		}
	} catch (java.lang.IndexOutOfBoundsException e) {//���
System.out.println();
	}
}
public static void addplayer_item (int player1, int Howler, int Felix_Felicis) {//�s�J�D��
	System.out.println(allPlayers[player1].getName() + "�֦�" + Howler + "�өH���H");//�^���ϥΪ�	
	System.out.println(allPlayers[player1].getName() + "�֦�" + Felix_Felicis + "�Ӻ֨Ӻֳ�");//�^���ϥΪ�	
	allPlayers[player1].setFelix_Felicisnum(Felix_Felicis);//�]�w�ƶq
	allPlayers[player1].setHowlernum(Howler);//�]�w�ƶq
}
public static void ouput () {//��X�ɮ�
	String tab = "	";
	try {
	      FileWriter myWriter = new FileWriter("status.txt");//�g�J��m
	      for (int i = 0; i < allPlayers.length; i++) {//Ū�����a
	    	  myWriter.write("Player" + (i+1) + "\r\n");//Player1 or player2
		      myWriter.write(allPlayers[i].getName() + tab + allPlayers[i].getgroup() + "\r\n");//name + �ǰ|
		      myWriter.write((int)allPlayers[i].getEnergy() + tab + allPlayers[i].getIntelligence() + tab + allPlayers[i].getMagic());//��O ���O �]�k�ѽ�
		      if (allPlayers[i].getPlayerIsFlying() == true) {//���Ӫ��A�N�g�J
		    	  myWriter.write(tab + "flying" + tab + "1");
		      }
		      if (allPlayers[i].getPlayerIsJumping() == true) {//���Ӫ��A�N�g�J
		    	  myWriter.write(tab + "jumping" + tab + "1");
		      }
		      if (allPlayers[i].getbleeding() == true) {//���Ӫ��A�N�g�J
		    	  myWriter.write(tab + "bleeding" + tab + (allPlayers[i].getbleedround() + 1));
		      }
		      if (allPlayers[i].getburning() == true) {//���Ӫ��A�N�g�J
		    	  myWriter.write(tab + "burning" + tab + (allPlayers[i].getburninground() + 1));
		      }
		      if (allPlayers[i].getFelix_Felicis() == true) {//���Ӫ��A�N�g�J
		    	  myWriter.write(tab + " learning-buff" + tab + (allPlayers[i].getbonusround() + 1));
		      }
		      myWriter.write("\r\n");//����
		      myWriter.write(allPlayers[i].getHowler() + tab + allPlayers[i].getFelix_Felicisnum() + "\r\n");//�g�J�D��ƶq
		      if (true == allPlayers[i].getSerpensortiaIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Serpensortia" + tab + allPlayers[i].getSerpensortiaPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getStupefyIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Stupefy" + tab + allPlayers[i].getStupefyPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getImpedimentaIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Impedimenta" + tab + allPlayers[i].getImpedimentaPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getProtegoIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Protego" + tab + allPlayers[i].getProtegoPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getSpectumsempraIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Spectumsempra" + tab + allPlayers[i].getSpectumsempraPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getExpecto_PatronumIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Expecto Patronum" + tab + allPlayers[i].getExpecto_PatronumPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getWingardium_LeviosaIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Wingardium Leviosa" + tab + 100 + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getTarantallegraIsLearn()) {//���ӧޯ�N�g�J
		    	  myWriter.write("learned" + tab + "Tarantallegra" + tab + 100 + "%" + "\r\n");
		      }
		}
	      myWriter.close();//close
	    } catch (IOException e) {//���
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
}
}



