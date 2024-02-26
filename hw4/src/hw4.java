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
		System.out.printf("學院：%-15s  體力：%-8.1f  智力：%-8d  魔力：%d%% \r\n",this.name,this.energy,this.intelligence,this.magic);//顯示數據
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
	private Serpensortia Serpensortia = new Serpensortia();//Player的參數
	private Stupefy Stupefy = new Stupefy();//Player的參數
	private Impedimenta Impedimenta = new Impedimenta();//Player的參數
	private Protego Protego = new Protego();//Player的參數
	private int potion = 5;//Player的參數
	private int Intelligence ;//Player的參數
	private double Energy;//Player的參數
	private int SerpensortiaPractice = Serpensortia.getPractice();//Player的參數
	private int StupefyPractice = Stupefy.getPractice();//Player的參數
	private int ImpedimentaPractice = Impedimenta.getPractice();//Player的參數
	private int ProtegoPractice = Protego.getPractice();//Player的參數
	private boolean IsLearnSerpensortia = false;//Player的參數
	private boolean IsLearnStupefy = false;//Player的參數
	private boolean IsLearnImpedimenta = false;//Player的參數
	private boolean IsLearnProtego = false;//Player的參數
	private boolean IsDead = false;//Player的參數
	
	public void setPotion(int iIn) {//使用藥水的方法
		potion -= iIn;//扣掉藥水數量
	}
	void setName(String inName){//設定name
		name = inName;
	}
	void setGroup(Group inGroup){//定義player的學院
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
	public void setIsDead() {//將玩家設為死亡
		IsDead = true;
	}
	public void useEnergy(double inEnergy) {//玩家使用ENERGY
		Energy -= inEnergy;
	}
	public void addEnergy(double inEnergy) {//玩家提升ENERGY
		Energy += inEnergy;
	}
	public void setEnergy(double inEnergy) {
		Energy = inEnergy;
	}
	public void setIntelligence(double inIntelligence) {//玩家增加智力
		Intelligence += inIntelligence;
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
	public int getPotion() {//獲取藥水數量
		return potion;
	}
	public Boolean getIsDead() {//判斷玩家是否死亡
		return IsDead;
	}
	public double getGroupEnergy() {
		return group.getEnergy();
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

public class hw4 {
	public static int n = 1;//定義回合
	public static int n1 = 0;//紀錄當回合隨機事件發生與否
	public static String playername;//玩家名稱
	public static String g_cmd;//輸入的指令
	public static String Sep  = " ";//cmd分開的條件
	public static boolean k = true;//loop的條件
	public static boolean a = true;//判斷是否為玩家的回合
	public static boolean b = false;//判斷是否為玩家的回合
	public static boolean tempImpedimenta_0 = false;//判斷技能學習
	public static boolean tempProtego_0 = false;//判斷技能學習
	public static boolean tempImpedimenta_1 = false;//判斷技能學習
	public static boolean tempProtego_1 = false;//判斷技能學習
	public static boolean addImpedimenta_0 = false;//判斷技能學習
	public static boolean addProtego_0 = false;//判斷技能學習
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
	public static void main(String[] args) {
		System.out.println("歡迎遊玩霍格華茲巫師鬥法大賽！");//歡迎訊息
		setPlayer();//呼叫setplayer
		while (k == true) {//判定隨機事件
			if (true == a &&//當a為true b為false時為玩家一
				false == b) {
				System.out.printf("************第%d回合************\r\n",n);//回應使用者	
				System.out.println("請第一位玩家" + allPlayers[0].getName() + "施展魔法");//回應使用者	
				g_cmd=ConsoleIn.readLine();//輸入的地方
				spell_01();//呼叫spell_01
				Check() ;//檢查勝負 及熟練度是否超過100
			}
			if (true == b &&//當b為true a為false時為玩家二
					false == a) {
				System.out.println("請第二位玩家" + allPlayers[1].getName() + "施展魔法");//回應使用者	
				g_cmd=ConsoleIn.readLine();//輸入的地方
				spell_10();//呼叫spell_10
				Check() ;//檢查勝負 及熟練度是否超過100
			}
		}
	}
public static void setPlayer() {//setplayer的方法
	String name;//定義名字
	String group;//定義學院
	String[] AfterSplit;//將指令分開
	
	for( int i=0; i < 2 ;i ++){
		allPlayers[i] = new Player();//建立array 關於2位玩家
	}
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
public static void spell_10() {
	if (g_cmd.contains("attack")) { //使用攻擊時
		String[] AfterSplit;//分開指令
		AfterSplit = g_cmd.split(Sep);//分開指令
		String spelltypeString = AfterSplit[1];//判斷輸入值
		double P;//攻擊的原始值
		if (spelltypeString.compareTo("Serpensortia") == 0 &&//使用Serpensortia
			AfterSplit.length == 2 &&
			true == allPlayers[1].getSerpensortiaIsLearn() && //已學習
			allPlayers[1].getEnergy() > 10 ) {//能量足夠
			allPlayers[1].useEnergy(10);//能量-10
			P = (Math.round(allPlayers[1].getSerpensortiaPractice() * (100 + allPlayers[1].getMagic()) * 20 * 3)/10000.00);//計算傷害
			if (true == allPlayers[0].getImpedimentaIsLearn()) {//是否有防禦咒
				P -= (Math.round( 3 * 20 * allPlayers[0].getImpedimentaPractice())/100.00);//抵擋傷害
			}
			if (true == allPlayers[0].getProtegoIsLearn()) {//是否有防禦咒
				P -= (Math.round(P * 20 * allPlayers[0].getProtegoPractice())/10000.00);//抵擋傷害
			}
			P = (Math.round(P)/1);//四捨五入到整數
			allPlayers[0].useEnergy( P );//能量-P
			System.out.println(allPlayers[0].getName() + "遭受攻擊，體力剩下" + allPlayers[0].getEnergy());//回應使用者
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&//使用Stupefy
				AfterSplit.length == 2 &&
				true == allPlayers[1].getStupefyIsLearn() &&//已學習
				allPlayers[1].getEnergy() > 10) {//能量足夠
				allPlayers[1].useEnergy(10);//能量-10
				P = (Math.round(70 * allPlayers[1].getStupefyPractice() * (100 + allPlayers[1].getMagic() ))/10000.00);//計算傷害
				if (true == allPlayers[0].getImpedimentaIsLearn()) {//是否有防禦咒
					P -= (Math.round( 1 * 20 * allPlayers[0].getImpedimentaPractice())/100.00);//抵擋傷害
				}
				if (true == allPlayers[0].getProtegoIsLearn()) {//是否有防禦咒
					P -= (Math.round(P * 20 * allPlayers[0].getProtegoPractice())/10000.00);//抵擋傷害
				}
				P = (Math.round(P)/1);//四捨五入到整數
				allPlayers[0].useEnergy( P );//能量-P
				System.out.println(allPlayers[0].getName() + "遭受攻擊，體力剩下" + allPlayers[0].getEnergy());//回應使用者
				b = false;//換A使用魔法
				a = true;
				Check ();
				Event();//觸發隨機事件
				n++;//下一回合
				CheckSpell();//記錄學習的技能
				ShowData();//顯示數據
				
		}
		else if (allPlayers[1].getEnergy() < 10) {//能量不足時
			System.out.println("體力不足");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&//Stupefy未學習
				false == allPlayers[1].getStupefyIsLearn()) {
			System.out.println("Stupefy 尚未學習");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&//Serpensortia未學習
				false == allPlayers[1].getSerpensortiaIsLearn()) {
			System.out.println("Serpensortia 尚未學習");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&//指令錯誤
				spelltypeString.compareTo("Serpensortia")!= 0) {
			System.out.println(spelltypeString + "不存在！");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
	}
	else if (g_cmd.contains("learn")) {//指令為learn
		String[] AfterSplit;
		AfterSplit = g_cmd.split(Sep);
		String spelltypeString = AfterSplit[1];//判斷輸入的指令
		if (spelltypeString.compareTo("Serpensortia") == 0 &&//輸入為Serpensortia
			AfterSplit.length == 2 &&
			allPlayers[1].getEnergy() >= 10  && //能量足夠時
			false == allPlayers[1].getSerpensortiaIsLearn() && //未學習
			allPlayers[1].getIntelligence() >= 10) {//智力要求符合
			allPlayers[1].useEnergy(10);//能量-10
			System.out.println(allPlayers[1].getName() + "學習了：Serpensortia");//回應使用者
			allPlayers[1].setIntelligence(2);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			allPlayers[1].setSerpensortiaIsLearn();//設為已學習
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
			
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //能量足夠時
				true == allPlayers[1].getSerpensortiaIsLearn() && //已學習
				allPlayers[1].getIntelligence() >= 10 && //智力要求符合
				allPlayers[1].getSerpensortiaPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "增強了：Serpensortia");//回應使用者
			allPlayers[1].setIntelligence(2);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			allPlayers[1].setSerpensortiaPractice(10);//增加熟練度
			System.out.println(allPlayers[1].getName() + "Serpensortia熟練度上升為：" + allPlayers[1].getSerpensortiaPractice() + "%");//回應使用者
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
			
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //能量足夠時
				false == allPlayers[1].getStupefyIsLearn() && //未學習
				allPlayers[1].getIntelligence() >= 20) {//智力要求符合
			allPlayers[1].useEnergy(10);//能量-10
			System.out.println(allPlayers[1].getName() + "學習了：Stupefy");//回應使用者
			allPlayers[1].setIntelligence(3);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			allPlayers[1].setStupefyIsLearn();//設為已學習
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
			
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //能量足夠時
				true == allPlayers[1].getStupefyIsLearn() && //已學習
				allPlayers[1].getIntelligence() >= 20 &&//智力要求符合
				allPlayers[1].getStupefyPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "增強了：Stupefy");//回應使用者
			allPlayers[1].setIntelligence(3);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			allPlayers[1].setStupefyPractice(10);//增加熟練度
			System.out.println(allPlayers[1].getName() + "Stupefy熟練度上升為：" + allPlayers[1].getStupefyPractice() + "%");//回應使用者
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
		
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //能量足夠時
				false == allPlayers[1].getImpedimentaIsLearn() && //未學習
				allPlayers[1].getIntelligence() >= 15) {//智力要求符合
			allPlayers[1].useEnergy(10);//能量-10
			System.out.println(allPlayers[1].getName() + "學習了：Impedimenta");//回應使用者
			allPlayers[1].setIntelligence(2);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			tempImpedimenta_1 = true;//將學習
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
		
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
		
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //能量足夠時
				true == allPlayers[1].getImpedimentaIsLearn() && //已學習
				allPlayers[1].getIntelligence() >= 15 && //智力要求符合
				allPlayers[1].getImpedimentaPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "增強了：Impedimenta");//回應使用者
			allPlayers[1].setIntelligence(2);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			allPlayers[1].setImpedimentaPractice(20);//增加熟練度
			System.out.println(allPlayers[1].getName() + "Impedimenta熟練度上升為：" + allPlayers[1].getImpedimentaPractice() + "%");//回應使用者
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
			
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //能量足夠時
				false == allPlayers[1].getProtegoIsLearn() && //未學習
				allPlayers[1].getIntelligence() >= 25) {//智力要求符合
			allPlayers[1].useEnergy(10);//能量-10
			System.out.println(allPlayers[1].getName() + "學習了：Protego");//回應使用者
			allPlayers[1].setIntelligence(3);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			tempProtego_1 = true;//將學習
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
			
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && //能量足夠時
				true == allPlayers[1].getStupefyIsLearn() && //已學習
				allPlayers[1].getIntelligence() >= 25 && //智力要求符合
				allPlayers[1].getProtegoPractice() < 100) {
			System.out.println(allPlayers[1].getName() + "增強了：Protego");//回應使用者
			allPlayers[1].setIntelligence(3);//增加智力
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());//回應使用者
			allPlayers[1].setProtegoPractice(8);//增加熟練度
			System.out.println(allPlayers[1].getName() + "Protego熟練度上升為：" + allPlayers[1].getProtegoPractice() + "%");//回應使用者
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
		
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
			
		}
		else if (allPlayers[1].getEnergy() < 10) {//能量不足時
			System.out.println("體力不足");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&//指令有誤！
				spelltypeString.compareTo("Serpensortia")!= 0 &&
				spelltypeString.compareTo("Protego") != 0 && 
				spelltypeString.compareTo("Impedimenta") != 0) {
			System.out.println(spelltypeString + "不存在！");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&//智力不足最低需求時
				allPlayers[1].getIntelligence() < Stupefy.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Stupefy");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&//智力不足最低需求時
				allPlayers[1].getIntelligence() < Serpensortia.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Serpensortia");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&//智力不足最低需求時
				allPlayers[1].getIntelligence() < Protego.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Protego");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&//智力不足最低需求時
				allPlayers[1].getIntelligence() < Impedimenta.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Impedimenta");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if(allPlayers[1].getImpedimentaPractice() >= 100) {//熟練度達100時
			allPlayers[1].setImpedimentaPractice1(100);//熟練度設為100
			System.out.println("Impedimenta熟練度已滿");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if(allPlayers[1].getSerpensortiaPractice() >= 100) {//熟練度達100時
			allPlayers[1].setSerpensortiaPractice1(100);//熟練度設為100
			System.out.println("Serpensortia熟練度已滿");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if(allPlayers[1].getStupefyPractice() >= 100) {//熟練度達100時
			allPlayers[1].setStupefyPractice1(100);//熟練度設為100
			System.out.println("Stupefy熟練度已滿");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
		else if(allPlayers[1].getProtegoPractice() >= 100) {//熟練度達100時
			allPlayers[1].setProtegoPractice1(100);//熟練度設為100
			System.out.println("Protego熟練度已滿");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
	}
	else if (g_cmd.contains("recover")) {//回復
		if (allPlayers[1].getPotion() > 0) {//還有藥水時
			System.out.println(allPlayers[1].getName() + "使用藥水");//回應使用者
			allPlayers[1].setPotion(1);//藥水-1
			allPlayers[1].addEnergy(50);//能量+50
			System.out.println(allPlayers[1].getName() + "的體力回復到：" + allPlayers[1].getEnergy());//回應使用者
			b = false;//換A使用魔法
			a = true;
			Check ();
			Event();//觸發隨機事件
			n++;//下一回合
			
			CheckSpell();//記錄學習的技能
			ShowData();//顯示數據
		}
		else if (allPlayers[1].getPotion() <= 0) {//沒有藥水時
			System.out.println("藥水不足");//回應使用者
			b = true;//B繼續使用魔法
			a = false;
		}
	}
	else if (g_cmd.compareTo("game over") == 0) {//game over
		if (allPlayers[0].getEnergy() > allPlayers[1].getEnergy()) {//A的能量大於B
			System.out.println("恭喜玩家：" + allPlayers[0].getName() + "獲得勝利！");//回應使用者
		}
		else if (allPlayers[1].getEnergy() > allPlayers[0].getEnergy()) {//B的能量大於A
			System.out.println("恭喜玩家：" + allPlayers[1].getName() + "獲得勝利！");//回應使用者
		}
		else if (allPlayers[1].getEnergy() == allPlayers[0].getEnergy()) {//A的能量等於B
			System.out.println("雙方平手！");//回應使用者
		}
		b = true;
		a = false;
		System.exit(0);
		System.out.println("感謝遊玩！");//遊戲結束
		k = false;
	}
}
/***spell_01和spell1_01完全相同只是攻擊和防守互換***/
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
			System.out.println(allPlayers[1].getName() + "遭受攻擊，體力剩下" + allPlayers[1].getEnergy());
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
				System.out.println(allPlayers[1].getName() + "遭受攻擊，體力剩下" + allPlayers[1].getEnergy());
				a = false;
				b = true;
		}
		else if (allPlayers[0].getEnergy() < 10) {
			System.out.println("體力不足");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				false == allPlayers[0].getStupefyIsLearn()) {
			System.out.println("Stupefy 尚未學習");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				false == allPlayers[0].getSerpensortiaIsLearn()) {
			System.out.println("Serpensortia 尚未學習");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&
				spelltypeString.compareTo("Serpensortia")!= 0) {
			System.out.println(spelltypeString + "不存在！");
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
			System.out.println(allPlayers[0].getName() + "學習了：Serpensortia");
			allPlayers[0].setIntelligence(2);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
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
			System.out.println(allPlayers[0].getName() + "增強了：Serpensortia");
			allPlayers[0].setIntelligence(2);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
			allPlayers[0].setSerpensortiaPractice(10);
			System.out.println(allPlayers[0].getName() + "Serpensortia熟練度上升為：" + allPlayers[0].getSerpensortiaPractice() + "%");
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				false == allPlayers[0].getStupefyIsLearn() && 
				allPlayers[0].getIntelligence() >= 20) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "學習了：Stupefy");
			allPlayers[0].setIntelligence(3);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
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
			System.out.println(allPlayers[0].getName() + "增強了：Stupefy");
			allPlayers[0].setIntelligence(3);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
			allPlayers[0].setStupefyPractice(10);
			System.out.println(allPlayers[0].getName() + "Stupefy熟練度上升為：" + allPlayers[0].getStupefyPractice() + "%");
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				false == allPlayers[0].getImpedimentaIsLearn() && 
				allPlayers[0].getIntelligence() >= 15) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "學習了：Impedimenta");
			allPlayers[0].setIntelligence(2);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
			tempImpedimenta_0 = true;//將學習
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getImpedimentaIsLearn() && 
				allPlayers[0].getIntelligence() >= 15 && 
				allPlayers[0].getImpedimentaPractice() < 100) {
			System.out.println(allPlayers[0].getName() + "增強了：Impedimenta");
			addImpedimenta_0 = true;//將增加值
			
			System.out.println(allPlayers[0].getName() + "智力將變為：" + allPlayers[0].getIntelligence());
			
			System.out.println(allPlayers[0].getName() + "Impedimenta熟練度將上升為：" + allPlayers[0].getImpedimentaPractice() + "%");
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				false == allPlayers[0].getProtegoIsLearn() && 
				allPlayers[0].getIntelligence() >= 25) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "學習了：Protego");
			allPlayers[0].setIntelligence(3);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
			tempProtego_0 = true;//將學習
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getStupefyIsLearn() && 
				allPlayers[0].getIntelligence() >= 25 && 
				allPlayers[0].getProtegoPractice() < 100) {
			System.out.println(allPlayers[0].getName() + "增強了：Protego");
			addProtego_0 = true;//將增加值
			
			System.out.println(allPlayers[0].getName() + "智力將變為：" + allPlayers[0].getIntelligence());
			
			System.out.println(allPlayers[0].getName() + "Protego熟練度將上升為：" + allPlayers[0].getProtegoPractice() + "%");
			a = false;
			b = true;
		}
		else if (allPlayers[0].getEnergy() < 10) {
			System.out.println("體力不足");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&
				spelltypeString.compareTo("Serpensortia")!= 0 &&
				spelltypeString.compareTo("Protego") != 0 && 
				spelltypeString.compareTo("Impedimenta") != 0) {
			System.out.println(spelltypeString + "不存在！");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				allPlayers[0].getIntelligence() < Stupefy.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "智力不足無法學習Stupefy");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				allPlayers[0].getIntelligence() < Serpensortia.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "智力不足無法學習Serpensortia");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				allPlayers[0].getIntelligence() < Protego.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "智力不足無法學習Protego");
			a = true;
			b = false;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				allPlayers[0].getIntelligence() < Impedimenta.getIntRequirement()) {
			System.out.println(allPlayers[0].getName() + "智力不足無法學習Impedimenta");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getImpedimentaPractice() >= 100) {
			allPlayers[0].setImpedimentaPractice1(100);
			System.out.println("Impedimenta熟練度已滿");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getSerpensortiaPractice() >= 100) {
			allPlayers[0].setSerpensortiaPractice1(100);
			System.out.println("Serpensortia熟練度已滿");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getStupefyPractice() >= 100) {
			allPlayers[0].setStupefyPractice1(100);
			System.out.println("Stupefy熟練度已滿");
			a = true;
			b = false;
		}
		else if(allPlayers[0].getProtegoPractice() >= 100) {
			allPlayers[0].setProtegoPractice1(100);
			System.out.println("Protego熟練度已滿");
			a = true;
			b = false;
		}
	}
	else if (g_cmd.contains("recover")) {
		if (allPlayers[0].getPotion() > 0) {
			System.out.println(allPlayers[0].getName() + "使用藥水");
			allPlayers[0].setPotion(1);
			allPlayers[0].addEnergy(50);
			System.out.println(allPlayers[0].getName() + "的體力回復到：" + allPlayers[0].getEnergy());
			a = false;
			b = true;
		}
		else if (allPlayers[0].getPotion() <= 0) {
			System.out.println("藥水不足");
			a = true;
			b = false;
		}
	}
	else if (g_cmd.compareTo("game over") == 0) {
		if (allPlayers[0].getEnergy() > allPlayers[1].getEnergy()) {
			System.out.println("恭喜玩家：" + allPlayers[0].getName() + "獲得勝利！");
		}
		else if (allPlayers[1].getEnergy() > allPlayers[0].getEnergy()) {
			System.out.println("恭喜玩家：" + allPlayers[1].getName() + "獲得勝利！");
		}
		else if (allPlayers[1].getEnergy() == allPlayers[0].getEnergy()) {
			System.out.println("雙方平手！");
		}
		a = true;
		b = false;
		System.exit(0);
		System.out.println("感謝遊玩！");
		k = false;
	}
}
/***spell_01和spell1_01完全相同只是攻擊和防守互換***/


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
			k = false;
		}
		if (allPlayers[i].getEnergy() > allPlayers[i].getGroupEnergy()) {//體力超過上限
			allPlayers[i].setEnergy(allPlayers[i].getGroupEnergy());
			System.out.println(allPlayers[i].getName() + "體力突破上限，回復到：" + allPlayers[i].getEnergy());
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
						false == allPlayers[j].getIsDead()) {
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



