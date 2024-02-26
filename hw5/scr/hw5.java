import java.io.File;//讀檔用
import java.io.FileWriter;//寫檔用
import java.io.IOException;//各種exception
import java.util.ArrayList;//使用ARRAYLIST

class Group {//建立學院的parent class
	private String name;//學院的參數
	private double energy;//學院的參數
	private int intelligence;//學院的參數
	private int magic;//學院的參數
	
	public Group (String inName, int inEnergy, int inIntelligence, int inMagic) {//建立學院的method
		this.name = inName;//回傳參數
		this.energy = inEnergy;//回傳參數
		this.intelligence = inIntelligence;//回傳參數
		this.magic = inMagic;//回傳參數
	}
	public String getName() {//獲取name的方法
		return name;//獲取name
	}
	public double getEnergy() {//獲取energy的方法
		return energy;//獲取energy
	}
	public int getIntelligence() {//獲取Intelligence的方法
		return intelligence;//獲取Intelligence
	}
	public int getMagic() {//獲取魔力的方法
		return magic;//獲取魔力
	}
	public void useEnergy(double inEnergy) {//消耗能量的方法
		energy -= inEnergy; //消耗能量
	}
	public void showData() {//顯示數據
		System.out.println("您的屬性為");//回應使用者
		System.out.printf("學院：%-15s  體力上限：%-8.1f  智力：%-8d  魔力：%d%% \r\n",this.name,this.energy,this.intelligence,this.magic);//顯示數據
	}
	public void showData1() {//顯示數據
		System.out.println("您的初始屬性為");//回應使用者
		System.out.printf("學院：%-15s  體力上限：%-8.1f  智力初始值：%-8d  魔力初始值：%d%% \r\n",this.name,this.energy,this.intelligence,this.magic);//顯示數據
	}
	 public static boolean InCollege(String Name) {//判斷輸入是否正確
		  if ( Name.compareTo("Griffendor") == 0){//判斷輸入是否正確
		   return true ;//回傳true
		  }else 
		  if ( Name.compareTo("Hufflepuff") == 0){//判斷輸入是否正確   
		   return true ;//回傳true
		  }else 
		  if ( Name.compareTo("Ravenclaw") == 0){//判斷輸入是否正確   
		   return true ;//回傳true
		  }else 
		  if ( Name.compareTo("Slytherin") == 0){//判斷輸入是否正確   
		   return true ; //回傳true
		  }
		 /*else if ( Name.compareTo("debug") == 0){//判斷輸入是否正確   
			  return true ; //回傳true
		  }*/
		  //debug用不列入使用範圍
		  return false ;//回傳false
		  }
}
class Griffendor extends Group {//Griffendor繼承Group
	public Griffendor() {
		super("Griffendor", 150, 12, 30);//建立學院的method
	}
}
class Hufflepuff extends Group {//Hufflepuff繼承Group
	public Hufflepuff() {
		super("Hufflepuff", 120, 12, 35);//建立學院的method
	}
}
class Ravenclaw extends Group {//Ravenclaw繼承Group
	public Ravenclaw() {
		super("Ravenclaw", 100, 15, 30);//建立學院的method
	}
}
class Slytherin extends Group {//Slytherin繼承Group
	public Slytherin() {
		super("Slytherin", 100, 10, 40);//建立學院的method
	}
}
class debug extends Group {//debug用
	public debug() {
		super("debug", 99999, 99999, 99999);
	}
}
class Player {//定義Player的class
	private String name;//Player的參數
	private Group group;//Player的參數
	private Serpensortia Serpensortia = new Serpensortia();//咒語物件
	private Stupefy Stupefy = new Stupefy();//咒語物件
	private Impedimenta Impedimenta = new Impedimenta();//咒語物件
	private Protego Protego = new Protego();//咒語物件
	private Spectumsempra Spectumsempra = new Spectumsempra();//咒語物件
	private Expecto_Patronum Expecto_Patronum = new Expecto_Patronum();//咒語物件
	private int potion = 5;//Player的參數
	private int Howler = 1;//咆哮信數量
	private int Felix_Felicis = 1;//福來福喜數量
	private int Intelligence ;//Player的參數
	private double Energy;//Player的參數
	private int SerpensortiaPractice = Serpensortia.getPractice();//Player的參數
	private int StupefyPractice = Stupefy.getPractice();//Player的參數
	private int ImpedimentaPractice = Impedimenta.getPractice();//Player的參數
	private int ProtegoPractice = Protego.getPractice();//Player的參數
	private int SpectumsempraPractice = Spectumsempra.getPractice();//Player的參數
	private int Expecto_PatronumPractice = Expecto_Patronum.getPractice();//Player的參數
	private int bleedround = 1;//流血回合(1或0為流血狀態 共2回合 以下皆以此形式表示)
	private int burninground = 2;//燃燒回合
	private int damage = 0;//計算受到的總傷害
	private int bonus = 1;//技能學習加成
	private int bonusround = 2;//技能學習加成回合
	private int flyinground = 1;
	private int jumpinground = 1;
	private boolean IsLearnSerpensortia = false;//該咒語是否學習
	private boolean IsLearnStupefy = false;//該咒語是否學習
	private boolean IsLearnImpedimenta = false;//該咒語是否學習
	private boolean IsLearnProtego = false;//該咒語是否學習
	private boolean IsDead = false;//Player的參數
	private boolean IsLearnSpectumsempra = false;//該咒語是否學習
	private boolean IsLearnExpecto_Patronum = false;//該咒語是否學習
	private boolean IsLearnWingardium_Leviosa = false;//該咒語是否學習
	private boolean IsLearnTarantallegra = false;//該咒語是否學習
	private boolean tempImpedimenta = false;//暫時學習的咒語保存在此
	private boolean tempProtego = false;//暫時學習的咒語保存在此
	private boolean tempExpecto_Patronum = false;//暫時學習的咒語保存在此
	private boolean addImpedimenta = false;//暫時學習的咒語保存在此
	private boolean addProtego = false;//暫時學習的咒語保存在此
	private boolean bleeding = false;//是否為流血狀態
	private boolean HowlerCanUse = false;//是否可用咆哮信
	private boolean burning = false;//是否為燃燒狀態
	private boolean IsUsingFelix_Felicis = false;//是否正在使用技能學習加成
	private boolean Jumping = false;//是否為跳躍狀態
	private boolean Flying = false;//是否為飛行狀態
	
	public void setPotion(int iIn) {//使用藥水的方法
		potion -= iIn;//扣掉藥水數量
	}
	public void setName(String inName){//設定name
		name = inName;
	}
	public void setGroup(Group inGroup){//定義player的學院
		this.group = inGroup;//輸入的group 為對應的group
		Energy = group.getEnergy();//獲取對應group中的能力
		Intelligence = group.getIntelligence();//獲取對應group中的能力
	}
	public void setSerpensortiaPractice(int iIn) {//提升Serpensortia的熟練度
		SerpensortiaPractice += iIn;
	}
	public void setStupefyPractice(int iIn) {//提升Stupefy的熟練度
		StupefyPractice += iIn;
	}
	public void setImpedimentaPractice(int iIn) {//提升Impedimenta的熟練度
		ImpedimentaPractice += iIn;
	}
	public void setProtegoPractice(int iIn) {//提升Protego的熟練度
		ProtegoPractice += iIn;
	}
	public void setSpectumsempraPractice (int iIn) {//提升Spectumsempra的熟練度
		SpectumsempraPractice += iIn;
	}
	public void setSerpensortiaPractice1(int iIn) {//設定Serpensortia的熟練度
		SerpensortiaPractice = iIn;
	}
	public void setStupefyPractice1(int iIn) {//設定Stupefy的熟練度
		StupefyPractice = iIn;
	}
	public void setImpedimentaPractice1(int iIn) {//設定Impedimenta的熟練度
		ImpedimentaPractice = iIn;
	}
	public void setProtegoPractice1(int iIn) {//設定Protego的熟練度
		ProtegoPractice = iIn;
	}
	public void setSpectumsempraPractice1(int In) {//設定Spectumsempra的熟練度
		SpectumsempraPractice = In;
	}
	public void setStupefyIsLearn() {//將Stupefy設為以學習
		IsLearnStupefy = true ;
	}
	public void setImpedimentaIsLearn() {//將Impedimenta設為以學習
		IsLearnImpedimenta = true ;
	}
	public void setProtegoIsLearn() {//將Protego設為以學習
		IsLearnProtego = true ;
	}
	public void setSerpensortiaIsLearn() {//將Serpensortia設為以學習
		IsLearnSerpensortia = true ;
	}
	public void setSpectumsempraIsLearn() {//將Spectumsempra設為以學習
		IsLearnSpectumsempra = true;
	}
	public void setExpecto_PatronumIsLearn () {//將Expecto_Patronum設為以學習
		IsLearnExpecto_Patronum = true;
	}
	public void setWingardium_LeviosaIsLearn () {//將Wingardium_Leviosa設為以學習
		IsLearnWingardium_Leviosa = true;
	}
	public void setTarantallegraIsLearn () {//將Tarantallegra設為以學習
		IsLearnTarantallegra = true;
	}
	public void setIsDead() {//將玩家設為死亡
		IsDead = true;
	}
	public void useEnergy(double inEnergy) {//玩家使用ENERGY
		Energy -= inEnergy;
	}
	public void addEnergy(double inEnergy) {//玩家提升ENERGY
		Energy += inEnergy;
	}
	public void setEnergy(double inEnergy) {//設定ENERGY
		Energy = inEnergy;
	}
	public void setIntelligence(int inIntelligence) {//玩家增加智力
		Intelligence += inIntelligence;
	}
	public void setIntelligence1(int inIntelligence) {//玩家增加智力
		Intelligence = inIntelligence;
	}
	public void settempImpedimenta (boolean intempImpedimenta) {//即將學習intempImpedimenta
		tempImpedimenta = intempImpedimenta;
	}
	public void settempProtego (boolean inProtego) {//即將學習intempProtego
		tempProtego = inProtego;
	}
	public void settempExpecto_Patronum (boolean In) {//即將學習intempExpecto_Patronum
		tempExpecto_Patronum = In;
	}
	public void setaddImpedimenta(boolean inaddImpedimenta) {//即將提升Impedimenta
		addImpedimenta = inaddImpedimenta;
	}
	public void setaddProtego(boolean inaddProtego) {//即將提升Protego
		addProtego = inaddProtego;
	}
	public void setbleeding (boolean In) {//設定流血狀態
		bleeding = In;
	}
	public void setbleedround(int In) {//設定流血回合
		bleedround = In;
	}
	public void setburning (boolean In) {//設定燃燒狀態
		burning = In;
	}
	public void setburninground(int In) {//設定燃燒回合
		burninground = In;
	}
	public void adddamage(int In) {//記錄受到的傷害
		damage += In;
	}
	public void setHowlerCanUse () {//設定咆哮信為可用狀態
		HowlerCanUse = true;
	}
	public void useHowler() {//使用咆哮信
		Howler = 0;
	}
	public void useFelix_Felicis() {//使用福來福喜
		Felix_Felicis = 0;
	}
	public void setbonus (int In) {//設定技能加成值
		bonus = In;
	}
	public void setFelix_Felicis (boolean In) {//設定Felix_Felicis使用狀態
		IsUsingFelix_Felicis = In;
	}
	public void usebonus (int In) {//消耗回合
		bonusround -= In;
	}
	public void setbonusround (int In) {//設定回合
		bonusround = In;
	}
	public void setPlayerIsJumping(boolean In) {//跳躍狀態
		Jumping = In;
	}
	public void setPlayerIsFlying(boolean In) {//飛行狀態
		Flying = In;
	}
	public void setFelix_Felicisnum (int In) {//設定Felix_Felicis數量
		Felix_Felicis = In;
	}
	public void setHowlernum (int In) {//設定Howler數量
		Howler = In;
	}
	public void setflying (int In) {
		flyinground = In;
	}
	public void setjumping (int In) {
		jumpinground = In;
	}
	public String getName() {//獲取name
		return name;
	}
	public double getEnergy() {//獲取energy
		return Energy;
	}
	public int getMagic() {//獲取魔力
		return group.getMagic();
	}
	public int getIntelligence() {//獲取Intelligence
		return Intelligence;
	}
	public int getSerpensortiaPractice () {//獲取Serpensortia的熟練度
		return SerpensortiaPractice;
	}
	public int getStupefyPractice () {//獲取Stupefy的熟練度
		return StupefyPractice;
	}
	public int getImpedimentaPractice () {//獲取mpedimenta的熟練度
		return ImpedimentaPractice;
	}
	public int getProtegoPractice () {//獲取Protego的熟練度
		return ProtegoPractice;
	}
	public int getSpectumsempraPractice() {//獲取Spectumsempra的熟練度
		return SpectumsempraPractice;
	}
	public int getExpecto_PatronumPractice() {//獲取Expecto_Patronum的熟練度
		return Expecto_PatronumPractice;
	}
	public boolean getSerpensortiaIsLearn() {//獲取Serpensortia使否已經學習
		return IsLearnSerpensortia;
	}
	public boolean getStupefyIsLearn() {//獲取Stupefy使否已經學習
		return IsLearnStupefy;
	}
	public boolean getImpedimentaIsLearn() {//獲取Impedimenta使否已經學習
		return IsLearnImpedimenta;
	}
	public boolean getProtegoIsLearn() {//獲取Protego使否已經學習
		return IsLearnProtego;
	}
	public boolean getSpectumsempraIsLearn() {//獲取Spectumsempra使否已經學習
		return IsLearnSpectumsempra;
	}
	public boolean getExpecto_PatronumIsLearn() {//獲取Expecto_Patronum使否已經學習
		return IsLearnExpecto_Patronum;
	}
	public boolean getWingardium_LeviosaIsLearn() {//獲取Wingardium_Leviosa使否已經學習
		return IsLearnWingardium_Leviosa;
	}
	public boolean getTarantallegraIsLearn () {//獲取Tarantallegra使否已經學習
		return IsLearnTarantallegra;
	}
	public int getPotion() {//獲取藥水數量
		return potion;
	}
	public boolean getIsDead() {//判斷玩家是否死亡
		return IsDead;
	}
	public double getGroupEnergy() {//獲取Energy
		return group.getEnergy();
	}
	public boolean gettempImpedimenta () {//獲取Impedimenta的暫時狀態
		return tempImpedimenta;
	}
	public boolean gettempProtego () {//獲取Protego的暫時狀態
		return tempProtego;
	}
	public boolean gettempExpecto_Patronum () {//獲取Expecto_Patronum的暫時狀態
		return tempExpecto_Patronum;
	}
	public boolean getaddImpedimenta () {//獲取Impedimenta的暫時提升狀態
		return addImpedimenta;
	}
	public boolean getaddProtego () {//獲取Protego的暫時提升狀態
		return addProtego;
	}
	public boolean getbleeding () {//獲取流血狀態
		return bleeding;
	}
	public int getbleedround () {//獲取流血回合
		return bleedround;
	}
	public boolean getburning () {//獲取燃燒狀態
		return burning;
	}
	public int getburninground () {//獲取燃燒回合
		return burninground;
	}
	public int getdamage () {//獲取受到傷害值
		return damage;
	}
	public boolean getHowlerCanUse () {//獲取可用Howler
		return HowlerCanUse;
	}
	public int getHowler() {//獲取Howler數量
		return Howler;
	}
	public int getbonus () {//獲取技能加成值
		return bonus;
	}
	public int getbonusround () {//獲取加成回合
		return bonusround;
	}
	public boolean getFelix_Felicis () {//是否正在使用Felix_Felicis
		return IsUsingFelix_Felicis;
	}
	public int getFelix_Felicisnum () {//獲取Felix_Felicis數量
		return Felix_Felicis;
	}
	public boolean getPlayerIsJumping() {//獲取是否正在跳躍
		return Jumping;
	}
	public boolean getPlayerIsFlying() {//獲取是否正在飛行
		return Flying;
	}
	public String getgroup () {//獲取學院名稱
		return group.getName();
	}
	public int getflyinground () {
		return flyinground;
	}
	public int getjumpinground () {
		return jumpinground;
	}
}

class attackSpell {//定義attackSpell的class
	private String spellname;//定義名字
	private int IntRequirement;//定義最低智力需求
	private int practice;//定義熟練度
	private boolean isLearn;//是否學習
	
	public attackSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {//attackSpell 的constructor
		this.spellname = inName;//編入各項參數
		this.IntRequirement = inIntRequirement;//編入各項參數
		this.practice = inPractice;//編入各項參數
		this.isLearn = inIsLearn;//編入各項參數
	}
	public int getPractice() {//獲取熟練度
		return practice;
	}
	public boolean getIsLearn() {//獲取是否學習
		return isLearn;
	}
	public String getSpellName() {//獲取名字
		return spellname;
	}
	public int getIntRequirement() {//獲取最低需求
		return IntRequirement;
	}
}
class Serpensortia extends attackSpell {//Serpensortia繼承attackSpell
	public Serpensortia() {
		super("Serpensortia", 10, 70, false);//編入各項參數
	}
}
class Stupefy  extends attackSpell {//Stupefy繼承attackSpell
	public Stupefy() {
		super("Stupefy", 20, 40, false);//編入各項參數
	}
}
class Spectumsempra extends attackSpell {//Spectumsempra繼承attackSpell
	public Spectumsempra() {
		super("Spectumsempra", 35, 30, false);//編入各項參數
	}
}

class defendSpell {//定義 defendSpell 的class
	private String spellname;//定義名字
	private int IntRequirement;//定義最低智力需求
	private int practice;//定義熟練度
	private boolean isLearn;//是否學習
	
	public defendSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {//defendSpell 的constructor
		this.spellname = inName;//編入各項參數
		this.IntRequirement = inIntRequirement;//編入各項參數
		this.practice = inPractice;//編入各項參數
		this.isLearn = inIsLearn;//編入各項參數
	}
	public int getPractice () {//獲取熟練度
		return practice;
	}
	public boolean getIsLearn() {//獲取是否學習
		return isLearn;
	}
	public String getSpellName() {//獲取名字
		return spellname;
	}
	public int getIntRequirement() {//獲取最低需求
		return IntRequirement;
	}
}
class Impedimenta extends defendSpell {//Impedimenta繼承defendSpell
	public Impedimenta () {
		super("Impedimenta", 15, 60, false);//編入各項參數
	}
}
class Protego extends defendSpell {//Protego繼承defendSpell
	public Protego  () {
		super("Protego ", 25, 30, false);//編入各項參數
	}
}
class Expecto_Patronum extends defendSpell {
	public Expecto_Patronum () {
		super("Expecto_Patronum ", 35, 100, false);//編入各項參數
	}
}

class specialSpell {
	private String spellname;//定義名字
	private int IntRequirement;//定義最低智力需求
	private int practice;//定義熟練度
	private boolean isLearn;//是否學習
	
	public specialSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {//defendSpell 的constructor
		this.spellname = inName;//編入各項參數
		this.IntRequirement = inIntRequirement;//編入各項參數
		this.practice = inPractice;//編入各項參數
		this.isLearn = inIsLearn;//編入各項參數
	}
	public int getPractice () {//獲取熟練度
		return practice;
	}
	public boolean getIsLearn() {//獲取是否學習
		return isLearn;
	}
	public String getSpellName() {//獲取名字
		return spellname;
	}
	public int getIntRequirement() {//獲取最低需求
		return IntRequirement;
	}
}
class Wingardium_Leviosa extends specialSpell {//Wingardium_Leviosa繼承specialSpell
	public Wingardium_Leviosa() {
		super("Wingardium_Leviosa", 25, 100, false);//編入各項參數
	}
}
class Tarantallegra extends specialSpell {//Tarantallegra繼承specialSpell
	public Tarantallegra() {
		super("Tarantallegra", 35, 100, false);//編入各項參數
	}
}

public class hw5 {
	public static int n = 1;//定義回合
	public static String playername;//玩家名稱
	public static String g_cmd;//輸入的指令
	public static String Sep  = " ";//cmd分開的條件
	public static boolean tempImpedimenta_0 = false;//判斷技能學習
	public static boolean tempProtego_0 = false;//判斷技能學習
	public static boolean tempImpedimenta_1 = false;//判斷技能學習
	public static boolean tempProtego_1 = false;//判斷技能學習
	public static boolean addImpedimenta_0 = false;//判斷技能學習
	public static boolean addProtego_0 = false;//判斷技能學習
	public static boolean nextRound = true;//判段是否進入下一回合
	public static boolean playerIndex = false;//判斷哪個玩家
	public static Player allPlayers[] = new Player[2];//關於玩家的array
	public static Griffendor Griffendor = new Griffendor();//新增各個class
	public static Hufflepuff Hufflepuff = new Hufflepuff();//新增各個class
	public static Ravenclaw Ravenclaw = new Ravenclaw();//新增各個class
	public static Slytherin Slytherin = new Slytherin();//新增各個class
	public static debug debug = new debug();//debug用
	public static Serpensortia Serpensortia = new Serpensortia();//新增各個class
	public static Stupefy Stupefy = new Stupefy();//新增各個class
	public static Impedimenta Impedimenta = new Impedimenta();//新增各個class
	public static Protego Protego = new Protego();//新增各個class
	public static Spectumsempra Spectumsempra = new Spectumsempra();//新增各個class
	public static Expecto_Patronum Expecto_Patronum = new Expecto_Patronum();//新增各個class
	public static Wingardium_Leviosa Wingardium_Leviosa = new Wingardium_Leviosa();//新增各個class
	public static Tarantallegra Tarantallegra = new Tarantallegra();//新增各個class
	public static void main(String[] args) {
		System.out.println("歡迎遊玩霍格華茲巫師鬥法大賽！");//歡迎訊息
		setPlayer();//呼叫setplayer
		testspell();//呼叫testspell
	}
public static void setPlayer() {//setplayer的方法
	String name;//定義名字
	String group;//定義學院
	String[] AfterSplit;//將指令分開
	String sepString = "	";//分開指令的條件
	
	for( int i=0; i < 2 ;i ++){
		allPlayers[i] = new Player();//建立array 關於2位玩家
	}
	System.out.println("可以選擇建立角色 或 讀取狀態檔案");//回應使用者
	System.out.println("要建立角色 請按1");//回應使用者
	System.out.println("要讀取狀態檔案 請輸入2");//回應使用者
	int cmd = ConsoleIn.readLineInt();
	if (cmd == 1) {
		for (int i = 0; i < 2; i++) {
			System.out.print("請輸入 名字 學院：");//回應使用者	
			playername = ConsoleIn.readLine();//輸入的地方
			AfterSplit = playername.split(Sep);//將指令分開
			name = AfterSplit[0];//紀錄名字
			group =AfterSplit[1];//紀錄學院
			if (AfterSplit.length == 2 &&//判斷指令是否正確
				Group.InCollege(group)){
					allPlayers[i].setName(name);//設定名字
					System.out.println("您好！" + allPlayers[i].getName());//回應使用者	
					if (group.equals("Griffendor")) {//組別為Griffendor
						allPlayers[i].setGroup(Griffendor);//加入Griffendor
						System.out.println("您已加入" + Griffendor.getName());//回應使用者	
						Griffendor.showData();//顯示數據
					}
					else if (group.equals("Hufflepuff")) {//組別為Hufflepuff
						allPlayers[i].setGroup(Hufflepuff);//加入Hufflepuff
						System.out.println("已加入" + Hufflepuff.getName());//回應使用者	
						Hufflepuff.showData();//顯示數據
					}
					else if (group.equals("Ravenclaw")) {//組別為Ravenclaw
						allPlayers[i].setGroup(Ravenclaw);//加入Ravenclaw
						System.out.println("已加入" + Ravenclaw.getName());//回應使用者	
						Ravenclaw.showData();//顯示數據
					}
					else if (group.equals("Slytherin")) {//組別為Slytherin
						allPlayers[i].setGroup(Slytherin);//加入Slytherin
						System.out.println("已加入" + Slytherin.getName());//回應使用者	
						Slytherin.showData();//顯示數據
					}
					else if (group.equals("debug")) {//debug用不會列入使用
						allPlayers[i].setGroup(debug);
						System.out.println("已加入" + debug.getName());//回應使用者	
						debug.showData();//顯示數據
					}
				}
				else if(group != null) { //輸入錯誤的回應
					System.out.println("請輸入存在的學院！");
					i--;
				}
				else{//輸入錯誤的回應
					System.out.println("指令有誤！");
					i--;
				}
			}
	}
	else if(cmd == 2) {
		try{
			boolean IsPlayer1 = true;//true 為玩家1 false 為玩家2
			int player1 = 0;//allPlayers的index
			group = null;//學院
			name = null;//名字
			double energy;//體力
			int intel;//智力
			ArrayList<String> fileContent = FileIO.readfile("status.txt");//讀status.exe的檔
		for(int j=0; j < fileContent.size(); j++){//讀檔
			if(fileContent.get(j).equals("Player1")) {//判斷為玩家一
				AfterSplit = fileContent.get(j+1).split(sepString);//讀取下一行
				name = AfterSplit[0];//紀錄名字
				group =AfterSplit[1];//紀錄學院
				player1 = 0;//index of allPlayers
				addplayer_spell(player1, name, group);//編入名字和學院
				AfterSplit = fileContent.get(j+2).split(sepString);//讀取下2行
				energy = Integer.parseInt(AfterSplit[0]);//編入參數
				intel = Integer.parseInt(AfterSplit[1]);//編入參數
				addplayer_energy(player1, energy, intel);//編入參數
				String[] statuStrings =fileContent.get(j+2).split(sepString);//讀取下2行
				addplayer_status(player1, statuStrings);//編入狀態
				AfterSplit = fileContent.get(j+3).split(sepString);//讀取第3行
				int Howler  =  Integer.parseInt(AfterSplit[0]);//編入參數
				int Felix_Felicis = Integer.parseInt(AfterSplit[1]);//編入參數
				addplayer_item (player1, Howler, Felix_Felicis);//編入參數
			}
			if(fileContent.get(j).equals("Player2")) {
				IsPlayer1 = false;//玩家2
				AfterSplit = fileContent.get(j+1).split(sepString);//讀取下一行
				name = AfterSplit[0];//紀錄名字
				group =AfterSplit[1];//紀錄學院
				player1 = 1;//index of allPlayers
				addplayer_spell(player1, name, group);//編入名字和學院
				AfterSplit = fileContent.get(j+2).split(sepString);//讀取下2行
				energy = Integer.parseInt(AfterSplit[0]);//編入參數
				intel = Integer.parseInt(AfterSplit[1]);//編入參數
				addplayer_energy(player1, energy, intel);//編入參數
				String[] statuStrings =fileContent.get(j+2).split(sepString);
				addplayer_status(player1, statuStrings);//編入狀態
				AfterSplit = fileContent.get(j+3).split(sepString);//讀取第3行
				int Howler  =  Integer.parseInt(AfterSplit[0]);//編入參數
				int Felix_Felicis = Integer.parseInt(AfterSplit[1]);//編入參數
				addplayer_item (player1, Howler, Felix_Felicis);//編入參數
			}	
			if (fileContent.get(j).contains("learned")) {//編入技能
				int Player1 = 0;//玩家的index
				AfterSplit = fileContent.get(j).split(sepString);//分開指令
				if (IsPlayer1 == true) {//玩家一時的index
					Player1 = 0;
				}
				else if (IsPlayer1 == false) {//玩家2時的index
					Player1 = 1;
				}
				if (AfterSplit[1].equals("Serpensortia")) {//當讀到對應技能時
					allPlayers[Player1].setSerpensortiaIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);//回應使用者
					allPlayers[Player1].setSerpensortiaPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//編入熟練度
					System.out.println(allPlayers[Player1].getName() + " Serpensortia的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//回應使用者
				}
				else if (AfterSplit[1].equals("Stupefy") ) {//當讀到對應技能時
					allPlayers[Player1].setStupefyIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);//回應使用者
					allPlayers[Player1].setStupefyPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));
					System.out.println(allPlayers[Player1].getName() + " Stupefy的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//編入熟練度
				}
				else if (AfterSplit[1].equals("Impedimenta") ) {//當讀到對應技能時
					allPlayers[Player1].setImpedimentaIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);
					allPlayers[Player1].setImpedimentaPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//回應使用者
					System.out.println(allPlayers[Player1].getName() + " Impedimenta的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//編入熟練度
				}
				else if (AfterSplit[1].equals("Protego") ) {//當讀到對應技能時
					allPlayers[Player1].setProtegoIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);
					allPlayers[Player1].setProtegoPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//回應使用者
					System.out.println(allPlayers[Player1].getName() + " Protego的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//編入熟練度
				}
				else if (AfterSplit[1].equals("Spectumsempra") ) {//當讀到對應技能時
					allPlayers[Player1].setSpectumsempraIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);
					allPlayers[Player1].setSpectumsempraPractice1(Integer.parseInt(AfterSplit[2].replaceAll("%", "")));//回應使用者
					System.out.println(allPlayers[Player1].getName() + " Spectumsempra的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//編入熟練度
				}
				else if (AfterSplit[1].equals("Expecto Patronum")) {//當讀到對應技能時
					allPlayers[Player1].setExpecto_PatronumIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);//回應使用者
					System.out.println(allPlayers[Player1].getName() + " Expecto Patronum的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//編入熟練度
				}
				else if (AfterSplit[1].equals("Wingardium Leviosa") ) {//當讀到對應技能時
					allPlayers[Player1].setWingardium_LeviosaIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);//回應使用者
					System.out.println(allPlayers[Player1].getName() + " Wingardium Leviosa的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//編入熟練度
				}
				else if (AfterSplit[1].equals("Tarantallegra") ) {//當讀到對應技能時
					allPlayers[Player1].setTarantallegraIsLearn();//令他為學習狀態
					System.out.println(allPlayers[Player1].getName() + " 已學習：" + AfterSplit[1]);//回應使用者
					System.out.println(allPlayers[Player1].getName() + " Tarantallegra的熟練度為：" +  Integer.parseInt(AfterSplit[2].replaceAll("%", "")) + "%");//編入熟練度
				}
			}
		}
		}catch (java.lang.IndexOutOfBoundsException e) {
				System.out.println("ah! error happened! arraylist OutOfBounds");//抓錯
		}
	}
}

public static void testspell () {
	int player1 = 0;
	int player2 = 0;
	System.out.println("************第1回合************");//回應使用者
	while ( true) {
		if (false == playerIndex) {//玩家交替的方法
			player1 = 0;//index
			player2 = 1;//index
			nextRound = false;
			playerIndex = true;//預設換另一位
		}
		else if (true == playerIndex) {//玩家交替的方法
			player1 = 1;//index
			player2 = 0;//index
			nextRound = true;
			playerIndex = false;//預設換另一位
		}
		if ((allPlayers[player1].getPlayerIsJumping() == false)) {
			System.out.println("請玩家：" + allPlayers[player1].getName() + "施展魔法");//回應使用者	
			g_cmd=ConsoleIn.readLine();//輸入的地方
		}
		if (g_cmd.contains("attack") &&
			(allPlayers[player1].getPlayerIsFlying() == false) &&
			(allPlayers[player1].getPlayerIsJumping() == false)){ //使用攻擊時
			String[] AfterSplit;//分開指令
			AfterSplit = g_cmd.split(Sep);//分開指令
			String spelltypeString = AfterSplit[1];//判斷輸入值
			double P;//攻擊的原始值
			if (spelltypeString.compareTo("Serpensortia") == 0 &&//使用Serpensortia
				AfterSplit.length == 2 &&
				true == allPlayers[player1].getSerpensortiaIsLearn() && //已學習
				allPlayers[player1].getEnergy() > 10 ) {//能量足夠
				allPlayers[player1].useEnergy(10);//能量-10
				P = (Math.round(allPlayers[player1].getSerpensortiaPractice() * (100 + allPlayers[player1].getMagic()) * 20 * 3)/10000.00);//計算傷害
				if (true == allPlayers[player2].getImpedimentaIsLearn() &&
					(allPlayers[player2].getPlayerIsFlying() == false)) {//是否有防禦咒
					P -= (Math.round( 3 * 20 * allPlayers[player2].getImpedimentaPractice())/100.00);//抵擋傷害
				}
				if (true == allPlayers[player2].getProtegoIsLearn() &&
					(allPlayers[player2].getPlayerIsFlying() == false)) {//是否有防禦咒
						P -= (Math.round(P * 20 * allPlayers[player2].getProtegoPractice())/10000.00);//抵擋傷害
				}
				P = (Math.round(P)/1);//四捨五入到整數
				allPlayers[player2].adddamage((int) P);//累積咆哮信所需的傷害值
				allPlayers[player2].useEnergy( P );//能量-P
				System.out.println(allPlayers[player1].getName() + "發動攻擊造成：" + P + "點傷害！");//回應使用者
				System.out.println(allPlayers[player2].getName() + "遭受攻擊，體力剩下" + allPlayers[player2].getEnergy());//回應使用者
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&//使用Stupefy
					AfterSplit.length == 2 &&
					true == allPlayers[player1].getStupefyIsLearn() &&//已學習
					allPlayers[player1].getEnergy() > 10) {//能量足夠
					allPlayers[player1].useEnergy(10);//能量-10
					P = (Math.round(70 * allPlayers[player1].getStupefyPractice() * (100 + allPlayers[player1].getMagic()))/10000.00);//計算傷害
					if (true == allPlayers[player2].getImpedimentaIsLearn()  &&
							(allPlayers[player2].getPlayerIsFlying() == false)) {//是否有防禦咒
						P -= (Math.round( 1 * 20 * allPlayers[player2].getImpedimentaPractice())/100.00);//抵擋傷害
					}
					if (true == allPlayers[player2].getProtegoIsLearn()  &&
							(allPlayers[player2].getPlayerIsFlying() == false)) {//是否有防禦咒
						P -= (Math.round(P * 20 * allPlayers[player2].getProtegoPractice())/10000.00);//抵擋傷害
					}
					P = (Math.round(P)/1);//四捨五入到整數
					allPlayers[player2].adddamage((int) P);//累積咆哮信所需的傷害值
					allPlayers[player2].useEnergy( P );//能量-P
					System.out.println(allPlayers[player1].getName() + "發動攻擊造成：" + P + "點傷害！");//回應使用者
					System.out.println(allPlayers[player2].getName() + "遭受攻擊，體力剩下" + allPlayers[player2].getEnergy());//回應使用者
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&
					AfterSplit.length == 2 &&
					true == allPlayers[player1].getSpectumsempraIsLearn() &&
					allPlayers[player1].getEnergy() > 10) {
				allPlayers[player1].useEnergy(10);
				P = (Math.round(100 * allPlayers[player1].getSpectumsempraPractice() * (100 + allPlayers[player1].getMagic()))/10000.00);
				if (true == allPlayers[player2].getImpedimentaIsLearn()  &&
						(allPlayers[player2].getPlayerIsFlying() == false)) {//是否有防禦咒
					P -= (Math.round( 1 * 20 * allPlayers[player2].getImpedimentaPractice())/100.00);//抵擋傷害
				}
				if (true == allPlayers[player2].getProtegoIsLearn()  &&
						(allPlayers[player2].getPlayerIsFlying() == false)) {//是否有防禦咒
					P -= (Math.round(P * 20 * allPlayers[player2].getProtegoPractice())/10000.00);//抵擋傷害
				}
				P = (Math.round(P)/1);//四捨五入到整數
				allPlayers[player2].adddamage((int) P);//累積咆哮信所需的傷害值
				allPlayers[player2].useEnergy( P );//能量-P
				System.out.println(allPlayers[player1].getName() + "發動攻擊造成：" + P + "點傷害！");//回應使用者
				if (true == allPlayers[player2].getbleeding()) {//正在流血時
					System.out.println(allPlayers[player2].getName() + "正在流血不添加流血效果");//回應使用者
				}
				else if (false == allPlayers[player2].getbleeding()) {//沒有流血時
					System.out.println(allPlayers[player2].getName() + "被添加流血效果");//回應使用者
					allPlayers[player2].setbleeding(true);//流血
				}
				System.out.println(allPlayers[player2].getName() + "遭受攻擊，體力剩下" + allPlayers[player2].getEnergy());//回應使用者
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&//使用Wingardium Leviosa
					AfterSplit[2].equals("Leviosa") &&
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() &&//已學習
					allPlayers[player1].getEnergy() > 20 && 
					(allPlayers[player2].getPlayerIsFlying() == false)) {//體力足夠時
				System.out.println(allPlayers[player1].getName() + "共消耗20體力讓" + allPlayers[player2].getName() + "飛起來");//回應使用者
				System.out.println(allPlayers[player2].getName() + "方無法使用任何咒語！");//回應使用者
				allPlayers[player2].setPlayerIsFlying(true);//飛行
				allPlayers[player1].useEnergy(20);//消耗20體力'
				}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&//使用Tarantallegra
					true == allPlayers[player1].getTarantallegraIsLearn() &&//已學習
					allPlayers[player1].getEnergy() > 30 &&
					(allPlayers[player2].getPlayerIsJumping() == false) ) {//體力足夠時
				System.out.println(allPlayers[player1].getName() + "共消耗30體力讓" + allPlayers[player2].getName() + "開始亂跳");//回應使用者
				System.out.println(allPlayers[player2].getName() + "無法行動一回合");//回應使用者
				allPlayers[player2].setPlayerIsJumping(true);
				allPlayers[player1].useEnergy(30);
				playerIndex = !playerIndex;//回到自己
				nextRound = true;//算一回合
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&//使用Wingardium Leviosa
					AfterSplit[2].equals("Leviosa") &&
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() && //已學習
					allPlayers[player1].getEnergy() > 20 && 
					(allPlayers[player2].getPlayerIsFlying() == true)) {
				System.out.println(allPlayers[player2].getName() + "正在飛行中無法再次使其飛行！");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&//使用Tarantallegra
					true == allPlayers[player1].getTarantallegraIsLearn() &&//已學習
					allPlayers[player1].getEnergy() > 30 &&
					(allPlayers[player2].getPlayerIsJumping() == true) ) {//體力足夠時
				System.out.println(allPlayers[player2].getName() + "正在亂跳中無法再次使其亂跳！");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else if (allPlayers[player1].getEnergy() <= 10) {//能量不足時
				System.out.println("體力不足");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&
					AfterSplit[2].equals("Leviosa") &&
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() &&
					allPlayers[player1].getEnergy() <= 20) {//能量不足時
				System.out.println("體力不足");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&
					true == allPlayers[player1].getTarantallegraIsLearn() &&
					allPlayers[player1].getEnergy() <= 30) {//能量不足時
				System.out.println("體力不足");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&//Stupefy未學習
					false == allPlayers[player1].getStupefyIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "尚未學習Stupefy！");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Serpensortia") == 0 &&//Serpensortia未學習
					false == allPlayers[player1].getSerpensortiaIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "尚未學習Serpensortia！");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&//Spectumsempra未學習
					false == allPlayers[player1].getSpectumsempraIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "尚未學習Spectumsempra！");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&//Wingardium Leviosa未學習
					AfterSplit[2].equals("Leviosa") &&
					false == allPlayers[player1].getWingardium_LeviosaIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "尚未學習Wingardium Leviosa！");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&//Tarantallegra未學習
					false == allPlayers[player1].getTarantallegraIsLearn()) {
				System.out.println(allPlayers[player1].getName() + "尚未學習Tarantallegra！");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else if (spelltypeString.compareTo("Stupefy") != 0 &&//指令錯誤
					spelltypeString.compareTo("Serpensortia")!= 0 &&
					spelltypeString.compareTo("Spectumsempra")!= 0 &&
					spelltypeString.compareTo("Wingardium")!= 0 &&
					spelltypeString.compareTo("Tarantallegra")!= 0 ) {
				System.out.println(spelltypeString + "不存在！");//回應使用者
				playerIndex = !playerIndex;//回到自己
				nextRound = false;//不算一回合
			}
			else {
				System.out.println("指令有誤");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		else if (g_cmd.contains("learn") &&
				(allPlayers[player1].getPlayerIsFlying() == false) &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {//指令為learn
			String[] AfterSplit;
			AfterSplit = g_cmd.split(Sep);
			String spelltypeString = AfterSplit[1];//判斷輸入的指令
			if (spelltypeString.compareTo("Serpensortia") == 0 &&//輸入為Serpensortia
				AfterSplit.length == 2 &&
				allPlayers[player1].getEnergy() > 10  && //能量足夠時
				false == allPlayers[player1].getSerpensortiaIsLearn() && //未學習
				allPlayers[player1].getIntelligence() >= Serpensortia.getIntRequirement()) {//智力要求符合
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Serpensortia");//回應使用者
				allPlayers[player1].setIntelligence(2);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setSerpensortiaIsLearn();//設為已學習
			}
			else if (spelltypeString.compareTo("Serpensortia") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getSerpensortiaIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= Serpensortia.getIntRequirement() && //智力要求符合
					allPlayers[player1].getSerpensortiaPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "增強了：Serpensortia");//回應使用者
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*2);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setSerpensortiaPractice(allPlayers[player1].getbonus()*10);//增加熟練度
				System.out.println(allPlayers[player1].getName() + "Serpensortia熟練度上升為：" + allPlayers[player1].getSerpensortiaPractice() + "%");//回應使用者
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					false == allPlayers[player1].getStupefyIsLearn() && //未學習
					allPlayers[player1].getIntelligence() >= Stupefy.getIntRequirement()) {//智力要求符合
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Stupefy");//回應使用者
				allPlayers[player1].setIntelligence(3);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setStupefyIsLearn();//設為已學習	
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getStupefyIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= Stupefy.getIntRequirement() &&//智力要求符合
					allPlayers[player1].getStupefyPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "增強了：Stupefy");//回應使用者
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*3);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setStupefyPractice(allPlayers[player1].getbonus()*10);//增加熟練度
				System.out.println(allPlayers[player1].getName() + "Stupefy熟練度上升為：" + allPlayers[player1].getStupefyPractice() + "%");//回應使用者	
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					false == allPlayers[player1].getSpectumsempraIsLearn() && //未學習
					allPlayers[player1].getIntelligence() >= Spectumsempra.getIntRequirement()) {//智力要求符合
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Spectumsempra");//回應使用者
				allPlayers[player1].setIntelligence(4);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setSpectumsempraIsLearn();//設為已學習	
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getSpectumsempraIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= Spectumsempra.getIntRequirement() &&//智力要求符合
					allPlayers[player1].getSpectumsempraPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "增強了：Spectumsempra");//回應使用者
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*4);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setSpectumsempraPractice(allPlayers[player1].getbonus()*5);//增加熟練度
				System.out.println(allPlayers[player1].getName() + "Spectumsempra熟練度上升為：" + allPlayers[player1].getSpectumsempraPractice() + "%");//回應使用者	
			}
			else if (spelltypeString.compareTo("Impedimenta") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					false == allPlayers[player1].getImpedimentaIsLearn() && //未學習
					allPlayers[player1].getIntelligence() >= 15) {//智力要求符合
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Impedimenta");//回應使用者
				allPlayers[player1].setIntelligence(2);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].settempImpedimenta(true);//將學習
			}
			else if (spelltypeString.compareTo("Impedimenta") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getImpedimentaIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= 15 && //智力要求符合
					allPlayers[player1].getImpedimentaPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "增強了：Impedimenta");//回應使用者
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*2);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setImpedimentaPractice(allPlayers[player1].getbonus()*20);//增加熟練度
				System.out.println(allPlayers[player1].getName() + "Impedimenta熟練度上升為：" + allPlayers[player1].getImpedimentaPractice() + "%");//回應使用者
				allPlayers[player1].setaddImpedimenta(true);
			}
			else if (spelltypeString.compareTo("Protego") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					false == allPlayers[player1].getProtegoIsLearn() && //未學習
					allPlayers[player1].getIntelligence() >= 25) {//智力要求符合
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Protego");//回應使用者
				allPlayers[player1].setIntelligence(3);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].settempProtego(true);//將學習
			}
			else if (spelltypeString.compareTo("Protego") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getProtegoIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= 25 && //智力要求符合
					allPlayers[player1].getProtegoPractice() < 100) {
				System.out.println(allPlayers[player1].getName() + "增強了：Protego");//回應使用者
				allPlayers[player1].setIntelligence(allPlayers[player1].getbonus()*3);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setProtegoPractice(allPlayers[player1].getbonus()*8);//增加熟練度
				System.out.println(allPlayers[player1].getName() + "Protego熟練度上升為：" + allPlayers[player1].getProtegoPractice() + "%");//回應使用者
				allPlayers[player1].setaddProtego(true);
			}
			else if (spelltypeString.compareTo("Expecto") == 0 &&
					AfterSplit[2].compareTo("Patronum") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					false == allPlayers[player1].getExpecto_PatronumIsLearn() && //未學習
					allPlayers[player1].getIntelligence() >= Expecto_Patronum.getIntRequirement()) {//智力要求符合
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Expecto Patronum");//回應使用者
				allPlayers[player1].setIntelligence(8);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].settempExpecto_Patronum(true);//將學習
			}
			else if (spelltypeString.compareTo("Expecto") == 0 &&
					AfterSplit[2].compareTo("Patronum") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getExpecto_PatronumIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= Expecto_Patronum.getIntRequirement() &&//智力要求符合
					allPlayers[player1].getExpecto_PatronumPractice() == 100) {
				System.out.println("Expecto Patronum 只能學習一次");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&
					AfterSplit[2].compareTo("Leviosa") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					false == allPlayers[player1].getWingardium_LeviosaIsLearn() && //未學習
					allPlayers[player1].getIntelligence() >= Wingardium_Leviosa.getIntRequirement()) {
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Wingardium Leviosa ");//回應使用者
				allPlayers[player1].setIntelligence(8);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setWingardium_LeviosaIsLearn();
			}
			else if (spelltypeString.compareTo("Wingardium") == 0 &&
					AfterSplit[2].compareTo("Leviosa") == 0 &&
					AfterSplit.length == 3 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getWingardium_LeviosaIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= Wingardium_Leviosa.getIntRequirement()) {
				System.out.println("Wingardium Leviosa 只能學習一次");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					false == allPlayers[player1].getTarantallegraIsLearn() && //未學習
					allPlayers[player1].getIntelligence() >= Tarantallegra.getIntRequirement()) {
				allPlayers[player1].useEnergy(10);//能量-10
				System.out.println(allPlayers[player1].getName() + "學習了：Tarantallegra ");//回應使用者
				allPlayers[player1].setIntelligence(5);//增加智力
				System.out.println(allPlayers[player1].getName() + "智力變為：" + allPlayers[player1].getIntelligence());//回應使用者
				allPlayers[player1].setTarantallegraIsLearn();
			}
			else if (spelltypeString.compareTo("Tarantallegra") == 0 &&
					AfterSplit.length == 2 &&
					allPlayers[player1].getEnergy() > 10  && //能量足夠時
					true == allPlayers[player1].getTarantallegraIsLearn() && //已學習
					allPlayers[player1].getIntelligence() >= Tarantallegra.getIntRequirement()) {
				System.out.println("Tarantallegra 只能學習一次");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (allPlayers[player1].getEnergy() <= 10) {//能量不足時
				System.out.println("體力不足");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Stupefy") != 0 &&//指令有誤！
					spelltypeString.compareTo("Serpensortia")!= 0 &&
					spelltypeString.compareTo("Protego") != 0 && 
					spelltypeString.compareTo("Impedimenta") != 0 &&
					spelltypeString.compareTo("Expecto") == 0 ) {
				System.out.println(spelltypeString + "不存在！");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Stupefy") == 0 &&//智力不足最低需求時
					allPlayers[player1].getIntelligence() < Stupefy.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "智力不足無法學習Stupefy");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Serpensortia") == 0 &&//智力不足最低需求時
					allPlayers[player1].getIntelligence() < Serpensortia.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "智力不足無法學習Serpensortia");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Protego") == 0 &&//智力不足最低需求時
					allPlayers[player1].getIntelligence() < Protego.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "智力不足無法學習Protego");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Impedimenta") == 0 &&//智力不足最低需求時
					allPlayers[player1].getIntelligence() < Impedimenta.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "智力不足無法學習Impedimenta");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Spectumsempra") == 0 &&//智力不足最低需求時
					allPlayers[player1].getIntelligence() < Spectumsempra.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "智力不足無法學習Spectumsempra");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (spelltypeString.compareTo("Expecto") == 0 &&//智力不足最低需求時
					allPlayers[player1].getIntelligence() < Expecto_Patronum.getIntRequirement()) {
				System.out.println(allPlayers[player1].getName() + "智力不足無法學習Expecto Patronum");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Impedimenta") == 0 &&
					allPlayers[player1].getImpedimentaPractice() >= 100) {//熟練度達100時
				allPlayers[player1].setImpedimentaPractice1(100);//熟練度設為100
				System.out.println("Impedimenta熟練度已滿");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Serpensortia") == 0 &&
					allPlayers[player1].getSerpensortiaPractice() >= 100) {//熟練度達100時
				allPlayers[player1].setSerpensortiaPractice1(100);//熟練度設為100
				System.out.println("Serpensortia熟練度已滿");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Stupefy") == 0 &&
					allPlayers[player1].getStupefyPractice() >= 100) {//熟練度達100時
				allPlayers[player1].setStupefyPractice1(100);//熟練度設為100
				System.out.println("Stupefy熟練度已滿");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Protego") == 0 &&
					allPlayers[player1].getProtegoPractice() >= 100) {//熟練度達100時
				allPlayers[player1].setProtegoPractice1(100);//熟練度設為100
				System.out.println("Protego熟練度已滿");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if(spelltypeString.compareTo("Spectumsempra") == 0 &&
					allPlayers[player1].getSpectumsempraPractice() >= 100) {//熟練度達100時
				allPlayers[player1].setSpectumsempraPractice1(100);//熟練度設為100
				System.out.println("Spectumsempra熟練度已滿");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else {
				System.out.println("指令有誤");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		/*else if (g_cmd.contains("learn") &&
				(allPlayers[player1].getPlayerIsFlying() == true)) {
			System.out.println("飛行中不可使用咒語");//回應使用者
		}
		else if (g_cmd.contains("attack") &&
				(allPlayers[player1].getPlayerIsFlying() == true)) {
			System.out.println("飛行中不可使用咒語");//回應使用者
		}*/
		else if (g_cmd.contains("recover")  &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {//回復
			if (allPlayers[player1].getPotion() > 0) {//還有藥水時
				System.out.println(allPlayers[player1].getName() + "使用藥水");//回應使用者
				allPlayers[player1].setPotion(1);//藥水-1
				allPlayers[player1].addEnergy(50);//能量+50
				System.out.println(allPlayers[player1].getName() + "的體力回復到：" + allPlayers[player1].getEnergy());//回應使用者
			}
			else if (allPlayers[player1].getPotion() <= 0) {//沒有藥水時
				System.out.println("藥水不足");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else {
				System.out.println("指令有誤");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		else if (g_cmd.compareTo("game over") == 0  &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {//game over
			if (allPlayers[player1].getEnergy() > allPlayers[player2].getEnergy()) {//A的能量大於B
				System.out.println("恭喜玩家：" + allPlayers[player1].getName() + "獲得勝利！");//回應使用者
			}
			else if (allPlayers[player2].getEnergy() > allPlayers[player1].getEnergy()) {//B的能量大於A
				System.out.println("恭喜玩家：" + allPlayers[player2].getName() + "獲得勝利！");//回應使用者
			}
			else if (allPlayers[player2].getEnergy() == allPlayers[player1].getEnergy()) {//A的能量等於B
				System.out.println("雙方平手！");//回應使用者
			}
			System.exit(0);
			System.out.println("感謝遊玩！");//遊戲結束
		}
		else if (g_cmd.contains("use") == true  &&
				(allPlayers[player1].getPlayerIsJumping() == false)) {
			String[] AfterSplit;//分開指令
			AfterSplit = g_cmd.split(Sep);//分開指令
			String Itemtype = AfterSplit[1];//判斷輸入的指令
			if (Itemtype.compareTo("Howler") == 0 &&//使用咆哮信
				true == allPlayers[player1].getHowlerCanUse() &&//可以使用時
				allPlayers[player1].getHowler() > 0 ) {//有咆哮信
				System.out.println(allPlayers[player1].getName() + "已使用了咆哮信！");//回應使用者
				allPlayers[player1].useHowler();//使用
				System.out.println(allPlayers[player2].getName() + "受到燃燒傷害扣除10體力持續3回合");//回應使用者
				allPlayers[player2].setburning(true);//燃燒對手
			}
			else if (Itemtype.compareTo("Howler") == 0 &&//輸入但不可使用
					false == allPlayers[player1].getHowlerCanUse()) {
				System.out.println(allPlayers[player1].getName() + "還不可以使用咆哮信！");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else if (Itemtype.compareTo("Howler") == 0 &&//輸入但已經用過
					allPlayers[player1].getHowler() == 0) {
				System.out.println(allPlayers[player1].getName() + "沒有咆哮信了！");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			if (Itemtype.compareTo("Felix") == 0 && //使用福來福喜
				AfterSplit[2].compareTo("Felicis") == 0 &&
				allPlayers[player1].getFelix_Felicisnum() > 0) {//有福來福喜
				allPlayers[player1].setbonus(2);//2倍加成
				allPlayers[player1].setFelix_Felicis(true);//正在使用
				allPlayers[player1].useFelix_Felicis();//福來福喜-1
			}
			else if (Itemtype.compareTo("Felix") == 0 &&//輸入但用過了˙
					AfterSplit[2].compareTo("Felicis") == 0 &&
					allPlayers[player1].getFelix_Felicisnum() == 0) {
				System.out.println(allPlayers[player1].getName() + "沒有福來福喜了！");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
			else {
				System.out.println("指令有誤");//回應使用者
				playerIndex = !playerIndex;
				nextRound = false;
			}
		}
		else if (allPlayers[player1].getPlayerIsJumping() == true) {
			System.out.println(allPlayers[player1].getName() + "亂跳中無法行動");//回應使用者
			nextRound = true;
		}
		else {
			System.out.println(allPlayers[player1].getName() + "輸入的指令有誤請重新輸入！");//指令有誤
			playerIndex = !playerIndex;
			nextRound = false;
		}
		if (true == nextRound) {
			Event();//觸發隨機事件
			Check();//檢查玩家死亡與否和學習技能的熟練度
			n++;
			System.out.printf("************第%d回合************\r\n",n);//回應使用者	
			CheckBleedingAndBuring();//燃燒和流血
			CheckSpell();//暫時學習便已學習
			CheckItem();//檢查物品
			ShowData();//顯示數據
			ouput ();
		}
		Check();//檢查玩家死亡與否和學習技能的熟練度
	}
}

public static void Check () {//檢查各項數據
	for (int i = 0; i < 2; i++) {//搜尋兩位玩家
		if(allPlayers[i].getImpedimentaPractice() >= 100) {//其熟練度大於等於100時
			allPlayers[i].setImpedimentaPractice1(100);//設為100
		}
		if(allPlayers[i].getSerpensortiaPractice() >= 100) {//其熟練度大於等於100時
			allPlayers[i].setSerpensortiaPractice1(100);//設為100
		}
		if(allPlayers[i].getStupefyPractice() >= 100) {//其熟練度大於等於100時
			allPlayers[i].setStupefyPractice1(100);//設為100
		}
		if(allPlayers[i].getProtegoPractice() >= 100) {//其熟練度大於等於100時
			allPlayers[i].setProtegoPractice1(100);//設為100
		}
		if (allPlayers[i].getEnergy() > allPlayers[i].getGroupEnergy()) {//體力超過上限
			allPlayers[i].setEnergy(allPlayers[i].getGroupEnergy());
			System.out.println(allPlayers[i].getName() + "體力突破上限，回復到：" + allPlayers[i].getEnergy());//回應使用者
		}
		if (allPlayers[i].getdamage() >= 60 && //受到傷害>=6時
			allPlayers[i].getHowler() >0) {//有咆哮信
			allPlayers[i].setHowlerCanUse();//可以使用
			System.out.println(allPlayers[i].getName() + "的咆哮信(Howler)可以使用了");//回應使用者
		}
		if (allPlayers[0].getEnergy() <= 0 &&//都同時死亡時
			allPlayers[1].getEnergy() <= 0 ) {
			System.out.println("雙方皆死亡，平手！");//回應使用者
		}
		if (allPlayers[i].getEnergy() <= 0 ) {//體力小於等於0時
			System.out.println(allPlayers[i].getName() + "已死亡");//回應使用者
			allPlayers[i].setIsDead();
			if (true == allPlayers[0].getIsDead()) {//
				System.out.println("恭喜玩家：" + allPlayers[1].getName() + "獲得勝利！");//回應使用者
			} 
			else if (true == allPlayers[1].getIsDead()) {
				System.out.println("恭喜玩家：" + allPlayers[0].getName() + "獲得勝利！");//回應使用者
			}
			System.exit(0);//離開遊戲
			System.out.println("感謝遊玩！");//回應使用者
		}
	}
}
public static void Event () {//隨機事件
	ArrayList<String> fileContent = FileIO.readfile("event.txt");//讀event.exe的檔
	for(int i=0; i < fileContent.size(); i++){
		String sepString = "	";//分開指令的條件
		int round;//回合
		String eventype;//事件種類
		String[] AfterSplit;//分開指令
		AfterSplit = fileContent.get(i).split(sepString);//分開指令
		String temp = AfterSplit[0];//記錄第幾回合
		round = Integer.parseInt(temp);//記錄第幾回合
		eventype = AfterSplit[1];//紀錄種類
		if (round == n) {//該回合時
			System.out.println("************觸發特殊事件！************");//回應使用者
			if (eventype.equals("Hippogrif")) {
				System.out.println("沒和鷹馬敬禮，雙方被攻擊，雙方玩家體力 -15");//回應使用者
				allPlayers[0].useEnergy(15);//扣除能量
				allPlayers[1].useEnergy(15);//扣除能量
				System.out.println(allPlayers[0].getName() + "體力剩下：" + allPlayers[0].getEnergy());//回應使用者
				System.out.println(allPlayers[1].getName() + "體力剩下：" + allPlayers[1].getEnergy());//回應使用者
			}
			else if (eventype.equals("VomitBeans")) {
				System.out.println("吃到嘔吐物口味的柏蒂全口味豆，雙方玩家智力 -5");//回應使用者
				allPlayers[0].setIntelligence(-5);//扣除智力
				allPlayers[1].setIntelligence(-5);//扣除智力
				System.out.println(allPlayers[0].getName() + "智力剩下：" + allPlayers[0].getIntelligence());//回應使用者
				System.out.println(allPlayers[1].getName() + "智力剩下：" + allPlayers[1].getIntelligence());//回應使用者
			}
			else if (eventype.equals("PumpkinPasty")) {
				System.out.println("免費南瓜餡餅，雙方玩家體力 +25，智力 +2");//回應使用者
				allPlayers[0].addEnergy(25);//增加能量
				allPlayers[1].addEnergy(25);//增加能量
				allPlayers[0].setIntelligence(2);//增加智力
				allPlayers[1].setIntelligence(2);//增加智力
				System.out.println(allPlayers[0].getName() + "體力變為：" + allPlayers[0].getEnergy());//回應使用者
				System.out.println(allPlayers[1].getName() + "體力變為：" + allPlayers[1].getEnergy());//回應使用者
				System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());//回應使用者
				System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			}
			else if (eventype.equals("DeathEaters")) {
				System.out.println("食死人來襲，當下智力低於 16 且體力低於 65 的人，直接死亡");//回應使用者
				for (int j = 0; j < allPlayers.length; j++) {
					if(allPlayers[j].getIntelligence() < 16 &&
						allPlayers[j].getEnergy() < 65 && 
						(false == allPlayers[j].getIsDead()) &&
						(false == allPlayers[j].getExpecto_PatronumIsLearn())) {
						System.out.println(allPlayers[j].getName() + "已死亡");//回應使用者
						allPlayers[j].setIsDead();//符合條件設為死亡
					}
				}
			}
		}
	}	
}
public static void ShowData() {
	for (int i = 0; i < allPlayers.length; i++) {
		System.out.println(allPlayers[i].getName() + "	體力：" + allPlayers[i].getEnergy() + "	智力：" + allPlayers[i].getIntelligence());//顯示數據
	}
}
public static void CheckSpell() {//將暫時學習狀態設為已經學習狀態
	for (int i = 0; i < allPlayers.length; i++) {
		if (true == allPlayers[i].gettempImpedimenta()) {//暫時學習
			allPlayers[i].setImpedimentaIsLearn();//已學習
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
		if (true == allPlayers[i].getbleeding() &&//正在流血
			allPlayers[i].getbleedround() > 0) {//剩2回合
			System.out.println(allPlayers[i].getName() + "正在流血扣除體力" + 10 + "點");//回應使用者
			System.out.println(allPlayers[i].getName() + "的流血回合還剩：1");//回應使用者
			allPlayers[i].useEnergy(10);//體力-10
			allPlayers[i].setbleedround(0);//剩1回
			allPlayers[i].adddamage(10);//累積咆哮信所需的傷害值
		}
		if (true == allPlayers[i].getbleeding() &&//正在流血
				allPlayers[i].getbleedround() == 0) {//剩1回合
				System.out.println(allPlayers[i].getName() + "正在流血扣除體力" + 10 + "點");//回應使用者
				System.out.println(allPlayers[i].getName() + "的流血將結束");//回應使用者
				allPlayers[i].useEnergy(10);//體力-10
				allPlayers[i].setbleedround(1);//還原預設值
				allPlayers[i].setbleeding(false);//不流血了
				allPlayers[i].adddamage(10);//累積咆哮信所需的傷害值
		}
		if (true == allPlayers[i].getburning() && //正在燃燒
			allPlayers[i].getburninground() == 2) {//剩3回合
			System.out.println(allPlayers[i].getName() + "正在燃燒扣除體力" + 10 + "點");//回應使用者
			System.out.println(allPlayers[i].getName() + "的燃燒回合還剩：2");//回應使用者
			allPlayers[i].useEnergy(10);//體力-10
			allPlayers[i].adddamage(10);//累積咆哮信所需的傷害值
			allPlayers[i].setburninground(1);
		}
		if (true == allPlayers[i].getburning() && //正在燃燒
				allPlayers[i].getburninground() == 1 ) {//剩2回合
				System.out.println(allPlayers[i].getName() + "正在燃燒扣除體力" + 10 + "點");//回應使用者
				System.out.println(allPlayers[i].getName() + "的燃燒回合還剩：1");//回應使用者
				allPlayers[i].useEnergy(10);//體力-10
				allPlayers[i].adddamage(10);//累積咆哮信所需的傷害值
				allPlayers[i].setburninground(0);
		}
		if (true == allPlayers[i].getburning() && //正在燃燒
				allPlayers[i].getburninground() == 0 ) {//剩1回合
				System.out.println(allPlayers[i].getName() + "正在燃燒扣除體力" + 10 + "點");//回應使用者
				System.out.println(allPlayers[i].getName() + "的燃燒將結束");//回應使用者
				allPlayers[i].useEnergy(10);//體力-10
				allPlayers[i].adddamage(10);//累積咆哮信所需的傷害值
				allPlayers[i].setburninground(2);//還原預設值
				allPlayers[i].setburning(false);//不燃燒了
		}
		if ((true == allPlayers[i].getPlayerIsFlying()) &&
			(allPlayers[i].getflyinground() == 1)) {
			allPlayers[i].setflying(0);
			System.out.println(allPlayers[i].getName() + "正在飛行無法使用攻擊或學習，但可使用：use recover game over");
		}
		else if ((true == allPlayers[i].getPlayerIsFlying()) &&
			(allPlayers[i].getflyinground() == 0)) {
			System.out.println(allPlayers[i].getName() + "正在飛行無法使用攻擊或學習，但可使用：use recover game over");
			allPlayers[i].setflying(1);
			allPlayers[i].setPlayerIsFlying(false);
		}
		if(true == allPlayers[i].getPlayerIsJumping() && 
				(allPlayers[i].getjumpinground() == 1)) {
			System.out.println(allPlayers[i].getName() + "正在亂跳無法行動");
			allPlayers[i].setjumping(0);
		}
		else if(true == allPlayers[i].getPlayerIsJumping() &&
				(allPlayers[i].getjumpinground() == 0)) {
			System.out.println(allPlayers[i].getName() + "正在亂跳無法行動");
			allPlayers[i].setjumping(1);
			allPlayers[i].setPlayerIsJumping(false);
		}
	}
}
public static void CheckItem() {
	for (int i = 0; i < allPlayers.length; i++) {
		if (true == allPlayers[i].getFelix_Felicis() &&//使用福來福喜
			allPlayers[i].getbonusround() > 0) {//剩大於1回
			allPlayers[i].usebonus(1);//消耗一回合
		}
		else if (true == allPlayers[i].getFelix_Felicis() &&//使用福來福喜
				allPlayers[i].getbonusround() == 0) {//剩1回
				allPlayers[i].setFelix_Felicis(false);//消除狀態
				allPlayers[i].setbonus(1);//還原加成
			}
	}
}
public static void addplayer_spell (int player1, String name, String group) {
	if (Group.InCollege(group)){
		allPlayers[player1].setName(name);//設定名字
		System.out.println("您好！" + allPlayers[player1].getName());//回應使用者	
		if (group.equals("Griffendor")) {//組別為Griffendor
			allPlayers[player1].setGroup(Griffendor);//加入Griffendor
			System.out.println("您已加入" + Griffendor.getName());//回應使用者	
			Griffendor.showData1();//顯示數據
		}
		else if (group.equals("Hufflepuff")) {//組別為Hufflepuff
			allPlayers[player1].setGroup(Hufflepuff);//加入Hufflepuff
			System.out.println("已加入" + Hufflepuff.getName());//回應使用者	
			Hufflepuff.showData1();//顯示數據
		}
		else if (group.equals("Ravenclaw")) {//組別為Ravenclaw
			allPlayers[player1].setGroup(Ravenclaw);//加入Ravenclaw
			System.out.println("已加入" + Ravenclaw.getName());//回應使用者	
			Ravenclaw.showData1();//顯示數據
		}
		else if (group.equals("Slytherin")) {//組別為Slytherin
			allPlayers[player1].setGroup(Slytherin);//加入Slytherin
			System.out.println("已加入" + Slytherin.getName());//回應使用者	
			Slytherin.showData1();//顯示數據
		}
		/*else if (group.equals("debug")) {//debug用不會列入使用
			allPlayers[player1].setGroup(debug);
			System.out.println("已加入" + debug.getName());//回應使用者	
			debug.showData1();//顯示數據
		}*/
		else if(group != null) { //輸入錯誤的回應
		System.out.println("請輸入存在的學院！");
		}
	}
	
}
public static void addplayer_energy (int player1, double energy, int intel) {//編入讀到的參數
	allPlayers[player1].setEnergy(energy);//編入讀到的參數
	System.out.println(allPlayers[player1].getName() + "的體力為：" + allPlayers[player1].getEnergy());//回應使用者	
	allPlayers[player1].setIntelligence1(intel);//編入讀到的參數
	System.out.println(allPlayers[player1].getName() + "的智力為：" + allPlayers[player1].getIntelligence());//回應使用者	
	System.out.println(allPlayers[player1].getName() + "的魔法天賦為：" + allPlayers[player1].getMagic() + "%");//回應使用者	
}
public static void addplayer_status(int player1, String[] status) {
	try {
		for (int i = 0; i < status.length; i++) {
			if(status[i].compareTo("bleeding") == 0) {//流血
				allPlayers[player1].setbleeding(true);
				System.out.println(allPlayers[player1].getName() + "正在流血，還剩下：" + Integer.parseInt(status[i+1]) + " 回合");//回應使用者	
				allPlayers[player1].setbleedround(Integer.parseInt(status[i+1]) - 1 );//編入讀到的參數
			}
			else if (status[i].compareTo("burning") == 0) {//燃燒
				allPlayers[player1].setburning(true);
				System.out.println(allPlayers[player1].getName() + "正在燃燒，還剩下：" + Integer.parseInt(status[i+1]) + " 回合");//回應使用者	
				allPlayers[player1].setburninground(Integer.parseInt(status[i+1]) - 1 );//編入讀到的參數
			}
			else if (status[i].compareTo("learning-buff") == 0) {//加成
				allPlayers[player1].setFelix_Felicis(true);
				System.out.println(allPlayers[player1].getName() + "正在使用福來福喜道具，還剩下：" + Integer.parseInt(status[i+1]) + " 回合");//回應使用者	
				allPlayers[player1].setbonusround(Integer.parseInt(status[i+1]) - 1 );//編入讀到的參數
			}
			else if (status[i].compareTo("flying") == 0) {//飛行
				if ( player1 == 0) {
					System.out.println(allPlayers[player1].getName() + "正在漂浮中無法行動！");//回應使用者
					allPlayers[player1].setPlayerIsFlying(true);
					allPlayers[player1].setflying(Integer.parseInt(status[i+1]) - 1);
					System.out.println("由另一位玩家開始回合");//回應使用者	
				}
				if (player1 == 1) {
					System.out.println(allPlayers[player1].getName() + "正在漂浮中無法行動！");//回應使用者	
					allPlayers[player1].setPlayerIsFlying(true);
					allPlayers[player1].setflying(Integer.parseInt(status[i+1]) - 1);
					System.out.println("由另一位玩家開始回合");//回應使用者	
				}
			}
			else if (status[i].compareTo("jumping") == 0) {//跳躍
				if ( player1 == 0) {
					System.out.println(allPlayers[player1].getName() + "正在亂跳無法行動！");//回應使用者	
					System.out.println("由另一位玩家開始回合");//回應使用者	
					allPlayers[player1].setPlayerIsJumping(true);
					allPlayers[player1].setjumping(Integer.parseInt(status[i+1]) - 1);
				}
				if (player1 == 1) {
					System.out.println(allPlayers[player1].getName() + "正在亂跳無法行動！");//回應使用者	
					System.out.println("由另一位玩家開始回合");//回應使用者	
					allPlayers[player1].setPlayerIsJumping(true);
					allPlayers[player1].setjumping(Integer.parseInt(status[i+1]) - 1);
				}
			}
		}
	} catch (java.lang.IndexOutOfBoundsException e) {//抓錯
System.out.println();
	}
}
public static void addplayer_item (int player1, int Howler, int Felix_Felicis) {//編入道具
	System.out.println(allPlayers[player1].getName() + "擁有" + Howler + "個咆哮信");//回應使用者	
	System.out.println(allPlayers[player1].getName() + "擁有" + Felix_Felicis + "個福來福喜");//回應使用者	
	allPlayers[player1].setFelix_Felicisnum(Felix_Felicis);//設定數量
	allPlayers[player1].setHowlernum(Howler);//設定數量
}
public static void ouput () {//輸出檔案
	String tab = "	";
	try {
	      FileWriter myWriter = new FileWriter("status.txt");//寫入位置
	      for (int i = 0; i < allPlayers.length; i++) {//讀取玩家
	    	  myWriter.write("Player" + (i+1) + "\r\n");//Player1 or player2
		      myWriter.write(allPlayers[i].getName() + tab + allPlayers[i].getgroup() + "\r\n");//name + 學院
		      myWriter.write((int)allPlayers[i].getEnergy() + tab + allPlayers[i].getIntelligence() + tab + allPlayers[i].getMagic());//體力 智力 魔法天賦
		      if (allPlayers[i].getPlayerIsFlying() == true) {//有該狀態就寫入
		    	  myWriter.write(tab + "flying" + tab + "1");
		      }
		      if (allPlayers[i].getPlayerIsJumping() == true) {//有該狀態就寫入
		    	  myWriter.write(tab + "jumping" + tab + "1");
		      }
		      if (allPlayers[i].getbleeding() == true) {//有該狀態就寫入
		    	  myWriter.write(tab + "bleeding" + tab + (allPlayers[i].getbleedround() + 1));
		      }
		      if (allPlayers[i].getburning() == true) {//有該狀態就寫入
		    	  myWriter.write(tab + "burning" + tab + (allPlayers[i].getburninground() + 1));
		      }
		      if (allPlayers[i].getFelix_Felicis() == true) {//有該狀態就寫入
		    	  myWriter.write(tab + " learning-buff" + tab + (allPlayers[i].getbonusround() + 1));
		      }
		      myWriter.write("\r\n");//換行
		      myWriter.write(allPlayers[i].getHowler() + tab + allPlayers[i].getFelix_Felicisnum() + "\r\n");//寫入道具數量
		      if (true == allPlayers[i].getSerpensortiaIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Serpensortia" + tab + allPlayers[i].getSerpensortiaPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getStupefyIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Stupefy" + tab + allPlayers[i].getStupefyPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getImpedimentaIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Impedimenta" + tab + allPlayers[i].getImpedimentaPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getProtegoIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Protego" + tab + allPlayers[i].getProtegoPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getSpectumsempraIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Spectumsempra" + tab + allPlayers[i].getSpectumsempraPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getExpecto_PatronumIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Expecto Patronum" + tab + allPlayers[i].getExpecto_PatronumPractice() + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getWingardium_LeviosaIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Wingardium Leviosa" + tab + 100 + "%" + "\r\n");
		      }
		      if (true == allPlayers[i].getTarantallegraIsLearn()) {//有該技能就寫入
		    	  myWriter.write("learned" + tab + "Tarantallegra" + tab + 100 + "%" + "\r\n");
		      }
		}
	      myWriter.close();//close
	    } catch (IOException e) {//抓錯
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
}
}



