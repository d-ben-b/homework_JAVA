import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Group {
	private String name;
	private double energy;
	private int intelligence;
	private int magic;
	
	public Group (String inName, int inEnergy, int inIntelligence, int inMagic) {
		this.name = inName;
		this.energy = inEnergy;
		this.intelligence = inIntelligence;
		this.magic = inMagic;
	}
	public String getName() {
		return name;
	}
	public double getEnergy() {
		return energy;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getMagic() {
		return magic;
	}
	public void useEnergy(double inEnergy) {
		energy -= inEnergy; 
	}
	public void showData() {
		System.out.println("您的屬性為");
		System.out.printf("學院：%-15s  體力：%-8.1f  智力：%-8d  魔力：%d%% \r\n",this.name,this.energy,this.intelligence,this.magic);
	}
	 public boolean InCollege(String Name) {
		  if ( Name.compareTo("Griffendor") == 0){
		   return true ;
		  }else 
		  if ( Name.compareTo("Hufflepuff") == 0){   
		   return true ;
		  }else 
		  if ( Name.compareTo("Ravenclaw") == 0){   
		   return true ;
		  }else 
		  if ( Name.compareTo("Slytherin") == 0){   
		   return true ; 
		  }
		  return false ;
		 }
}
class Griffendor extends Group {
	public Griffendor() {
		super("Griffendor", 150, 12, 30);
	}
}
class Hufflepuff extends Group {
	public Hufflepuff() {
		super("Hufflepuff", 120, 12, 35);
	}
}
class Ravenclaw extends Group {
	public Ravenclaw() {
		super("Ravenclaw", 100, 15, 30);
	}
}
class Slytherin extends Group {
	public Slytherin() {
		super("Slytherin", 100, 10, 40);
	}
}
class Player {
	private String name;
	private Group group;
	private Serpensortia Serpensortia = new Serpensortia();
	private Stupefy Stupefy = new Stupefy();
	private Impedimenta Impedimenta = new Impedimenta();
	private Protego Protego = new Protego();
	private int potion = 5;
	private int Intelligence ;
	private double Energy;
	private int SerpensortiaPractice = Serpensortia.getPractice();
	private int StupefyPractice = Stupefy.getPractice();
	private int ImpedimentaPractice = Impedimenta.getPractice();
	private int ProtegoPractice = Protego.getPractice();
	private boolean IsLearnSerpensortia = false;
	private boolean IsLearnStupefy = false;
	private boolean IsLearnImpedimenta = false;
	private boolean IsLearnProtego = false;
	private boolean IsDead = false;
	
	public void setPotion(int iIn) {
		potion -= iIn;
	}
	void setName(String inName){
		name = inName;
	}
	void setGroup(Group inGroup){
		this.group = inGroup;
		Energy = group.getEnergy();
		Intelligence = group.getIntelligence();
	}
	public void setSerpensortiaPractice(int iIn) {
		SerpensortiaPractice += iIn;
	}
	public void setStupefyPractice(int iIn) {
		StupefyPractice += iIn;
	}
	public void setImpedimentaPractice(int iIn) {
		ImpedimentaPractice += iIn;
	}
	public void setProtegoPractice(int iIn) {
		ProtegoPractice += iIn;
	}
	public void setSerpensortiaPractice1(int iIn) {
		SerpensortiaPractice = iIn;
	}
	public void setStupefyPractice1(int iIn) {
		StupefyPractice = iIn;
	}
	public void setImpedimentaPractice1(int iIn) {
		ImpedimentaPractice = iIn;
	}
	public void setProtegoPractice1(int iIn) {
		ProtegoPractice = iIn;
	}
	public void setStupefyIsLearn() {
		IsLearnStupefy = true ;
	}
	public void setImpedimentaIsLearn() {
		IsLearnImpedimenta = true ;
	}
	public void setProtegoIsLearn() {
		IsLearnProtego = true ;
	}
	public void setSerpensortiaIsLearn() {
		IsLearnSerpensortia = true ;
	}
	public void setIsDead() {
		IsDead = true;
	}
	public void useEnergy(double inEnergy) {
		Energy -= inEnergy;
	}
	public void addEnergy(double inEnergy) {
		Energy += inEnergy;
	}
	public void setIntelligence(double inIntelligence) {
		Intelligence += inIntelligence;
	}
	public String getName() {
		return name;
	}
	public double getEnergy() {
		return Energy;
	}
	public int getMagic() {
		return group.getMagic();
	}
	public int getIntelligence() {
		return Intelligence;
	}
	public int getSerpensortiaPractice () {
		return SerpensortiaPractice;
	}
	public int getStupefyPractice () {
		return StupefyPractice;
	}
	public int getImpedimentaPractice () {
		return ImpedimentaPractice;
	}
	public int getProtegoPractice () {
		return ProtegoPractice;
	}
	public boolean getSerpensortiaIsLearn() {
		return IsLearnSerpensortia;
	}
	public boolean getStupefyIsLearn() {
		return IsLearnStupefy;
	}
	public boolean getImpedimentaIsLearn() {
		return IsLearnImpedimenta;
	}
	public boolean getProtegoIsLearn() {
		return IsLearnProtego;
	}
	public int getPotion() {
		return potion;
	}
	public Boolean getIsDead() {
		return IsDead;
	}
}
class attackSpell {
	private String spellname;
	private int IntRequirement;
	private int practice;
	private boolean isLearn;
	
	public attackSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {
		this.spellname = inName;
		this.IntRequirement = inIntRequirement;
		this.practice = inPractice;
		this.isLearn = inIsLearn;
	}
	public int getPractice() {
		return practice;
	}
	public boolean getIsLearn() {
		return isLearn;
	}
	public String getSpellName() {
		return spellname;
	}
	public int getIntRequirement() {
		return IntRequirement;
	}
}
class Serpensortia extends attackSpell {
	public Serpensortia() {
		super("Serpensortia", 10, 70, false);
	}
}
class Stupefy  extends attackSpell {
	public Stupefy() {
		super("Stupefy", 20, 40, false);
	}
}

class defendSpell {
	private String spellname;
	private int IntRequirement;
	private int practice;
	private boolean isLearn;
	
	public defendSpell (String inName, int inIntRequirement, int inPractice, boolean inIsLearn) {
		this.spellname = inName;
		this.IntRequirement = inIntRequirement;
		this.practice = inPractice;
		this.isLearn = inIsLearn;
	}
	public int getPractice () {
		return practice;
	}
	public boolean getIsLearn() {
		return isLearn;
	}
	public String getSpellName() {
		return spellname;
	}
	public int getIntRequirement() {
		return IntRequirement;
	}
}
class Impedimenta extends defendSpell {
	public Impedimenta () {
		super("Impedimenta", 15, 60, false);
	}
}
class Protego  extends defendSpell {
	public Protego  () {
		super("Protego ", 25, 30, false);
	}
}

public class hw4 {
	public static int n = 1;
	public static int n1 = 0;
	public static String playername;
	public static String g_cmd;
	public static String Sep  = " ";
	public static boolean k = true;
	public static boolean a = true;
	public static boolean b = false;
	public static Player allPlayers[] = new Player[2];
	public static Griffendor Griffendor = new Griffendor();
	public static Hufflepuff Hufflepuff = new Hufflepuff();
	public static Ravenclaw Ravenclaw = new Ravenclaw();
	public static Slytherin Slytherin = new Slytherin();
	public static Serpensortia Serpensortia = new Serpensortia();
	public static Stupefy Stupefy = new Stupefy();
	public static Impedimenta Impedimenta = new Impedimenta();
	public static Protego Protego = new Protego();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("歡迎遊玩霍格華茲巫師鬥法大賽");
		setPlayer();
		while (k == true) {
			if (true == a &&
				false == b) {
				System.out.printf("************第%d回合************\r\n",n);	
				System.out.println("請第一位玩家" + allPlayers[0].getName() + "施展魔法");
				g_cmd=ConsoleIn.readLine();
				spell_01();
			}
			if (true == b &&
					false == a) {
				System.out.println("請第二位玩家" + allPlayers[1].getName() + "施展魔法");
				g_cmd=ConsoleIn.readLine();
				spell_10();
			}
			Check() ;
			if (n > n1) {
				Event();
				n1++;
			}
		}
	}
public static void setPlayer() {
	String name;
	String group;
	String[] AfterSplit;
	
	for( int i=0; i < 2 ;i ++){
		allPlayers[i] = new Player();//建立array 關於2位玩家
	}
	for (int i = 0; i < 2; i++) {
		System.out.print("請輸入 名字 學院：");
		playername = ConsoleIn.readLine();
		AfterSplit = playername.split(Sep);
		name = AfterSplit[0];
		group =AfterSplit[1];
		if (AfterSplit.length == 2 &&
			(group.equals("Griffendor") ||
			group.equals("Hufflepuff") ||
			group.equals("Ravenclaw") ||
			group.equals("Slytherin"))){
				allPlayers[i].setName(name);
				System.out.println("您好！" + allPlayers[i].getName());
				if (group.equals("Griffendor")) {
					allPlayers[i].setGroup(Griffendor);
					System.out.println("您已加入" + Griffendor.getName());
					Griffendor.showData();
				}
				else if (group.equals("Hufflepuff")) {
					allPlayers[i].setGroup(Hufflepuff);
					System.out.println("已加入" + Hufflepuff.getName());
					Hufflepuff.showData();
				}
				else if (group.equals("Ravenclaw")) {
					allPlayers[i].setGroup(Ravenclaw);
					System.out.println("已加入" + Ravenclaw.getName());
					Ravenclaw.showData();
				}
				else if (group.equals("Slytherin")) {
					allPlayers[i].setGroup(Slytherin);
					System.out.println("已加入" + Slytherin.getName());
					Slytherin.showData();
				}
			}
			else if(group != null) { 
				System.out.println("請輸入存在的學院！");
				i--;
			}
			else{
				System.out.println("指令有誤！");
				i--;
			}
		}
}
public static void spell_10() {
	if (g_cmd.contains("attack")) { 
		String[] AfterSplit;
		AfterSplit = g_cmd.split(Sep);
		String spelltypeString = AfterSplit[1];
		double P;
		if (spelltypeString.compareTo("Serpensortia") == 0 &&
			AfterSplit.length == 2 &&
			true == allPlayers[1].getSerpensortiaIsLearn() && 
			allPlayers[1].getEnergy() > 10 ) {
			allPlayers[1].useEnergy(10);
			P = (Math.round(allPlayers[1].getSerpensortiaPractice() * (100 + allPlayers[1].getMagic()) * 20 * 3)/10000);
			if (true == allPlayers[0].getImpedimentaIsLearn()) {
				P -= (Math.round( 3 * 20 * allPlayers[0].getImpedimentaPractice())/100);
			}
			if (true == allPlayers[0].getProtegoIsLearn()) {
				P -= (Math.round(P * 20 * allPlayers[0].getProtegoPractice())/10000);
			}
			allPlayers[0].useEnergy( P );
			System.out.println(allPlayers[0].getName() + "遭受攻擊，體力剩下" + allPlayers[0].getEnergy());
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				true == allPlayers[1].getStupefyIsLearn() &&
				allPlayers[1].getEnergy() > 10) {
				allPlayers[1].useEnergy(10);
				P = (Math.round(70 * allPlayers[1].getStupefyPractice() * (100 + allPlayers[1].getMagic()))/10000);
				if (true == allPlayers[0].getImpedimentaIsLearn()) {
					P -= (Math.round( 1 * 20 * allPlayers[0].getImpedimentaPractice())/100);
				}
				if (true == allPlayers[0].getProtegoIsLearn()) {
					P -= (Math.round(P * 20 * allPlayers[0].getProtegoPractice())/10000);
				}
				allPlayers[1].useEnergy( P );
				System.out.println(allPlayers[0].getName() + "遭受攻擊，體力剩下" + allPlayers[0].getEnergy());
				b = false;
				a = true;
				n++;
		}
		else if (allPlayers[1].getEnergy() < 10) {
			System.out.println("體力不足");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				false == allPlayers[1].getStupefyIsLearn()) {
			System.out.println("Stupefy 尚未學習");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				false == allPlayers[1].getSerpensortiaIsLearn()) {
			System.out.println("Serpensortia 尚未學習");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&
				spelltypeString.compareTo("Serpensortia")!= 0) {
			System.out.println(spelltypeString + "不存在！");
			b = true;
			a = false;
		}
	}
	else if (g_cmd.contains("learn")) {
		String[] AfterSplit;
		AfterSplit = g_cmd.split(Sep);
		String spelltypeString = AfterSplit[1];
		if (spelltypeString.compareTo("Serpensortia") == 0 &&
			AfterSplit.length == 2 &&
			allPlayers[1].getEnergy() >= 10  && 
			false == allPlayers[1].getSerpensortiaIsLearn() && 
			allPlayers[1].getIntelligence() >= 10) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "學習了：Serpensortia");
			allPlayers[1].setIntelligence(2);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setSerpensortiaIsLearn();
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && 
				true == allPlayers[1].getSerpensortiaIsLearn() && 
				allPlayers[1].getIntelligence() >= 10 && 
				allPlayers[1].getSerpensortiaPractice() < 100) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "增強了：Serpensortia");
			allPlayers[1].setIntelligence(2);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setSerpensortiaPractice(10);
			System.out.println(allPlayers[1].getName() + "Serpensortia熟練度上升為：" + allPlayers[1].getSerpensortiaPractice() + "%");
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && 
				false == allPlayers[1].getStupefyIsLearn() && 
				allPlayers[1].getIntelligence() >= 20) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "學習了：Stupefy");
			allPlayers[1].setIntelligence(3);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setStupefyIsLearn();
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && 
				true == allPlayers[1].getStupefyIsLearn() && 
				allPlayers[1].getIntelligence() >= 20 &&
				allPlayers[1].getStupefyPractice() < 100) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "增強了：Stupefy");
			allPlayers[1].setIntelligence(3);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setStupefyPractice(10);
			System.out.println(allPlayers[1].getName() + "Stupefy熟練度上升為：" + allPlayers[1].getStupefyPractice() + "%");
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && 
				false == allPlayers[1].getImpedimentaIsLearn() && 
				allPlayers[1].getIntelligence() >= 15) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "學習了：Impedimenta");
			allPlayers[1].setIntelligence(2);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setImpedimentaIsLearn();
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && 
				true == allPlayers[1].getImpedimentaIsLearn() && 
				allPlayers[1].getIntelligence() >= 15 && 
				allPlayers[1].getImpedimentaPractice() < 100) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "增強了：Impedimenta");
			allPlayers[1].setIntelligence(2);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setImpedimentaPractice(20);
			System.out.println(allPlayers[1].getName() + "Impedimenta熟練度上升為：" + allPlayers[1].getImpedimentaPractice() + "%");
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && 
				false == allPlayers[1].getProtegoIsLearn() && 
				allPlayers[1].getIntelligence() >= 25) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "學習了：Protego");
			allPlayers[1].setIntelligence(3);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setProtegoIsLearn();
			b = false;
			a = true;
			n++;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[1].getEnergy() >= 10  && 
				true == allPlayers[1].getStupefyIsLearn() && 
				allPlayers[1].getIntelligence() >= 25 && 
				allPlayers[1].getProtegoPractice() < 100) {
			allPlayers[1].useEnergy(10);
			System.out.println(allPlayers[1].getName() + "增強了：Protego");
			allPlayers[1].setIntelligence(3);
			System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			allPlayers[1].setProtegoPractice(8);
			System.out.println(allPlayers[1].getName() + "Protego熟練度上升為：" + allPlayers[1].getProtegoPractice() + "%");
			b = false;
			a = true;
			n++;
		}
		else if (allPlayers[1].getEnergy() < 10) {
			System.out.println("體力不足");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") != 0 &&
				spelltypeString.compareTo("Serpensortia")!= 0 &&
				spelltypeString.compareTo("Protego") != 0 && 
				spelltypeString.compareTo("Impedimenta") != 0) {
			System.out.println(spelltypeString + "不存在！");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Stupefy") == 0 &&
				allPlayers[1].getIntelligence() < Stupefy.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Stupefy");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Serpensortia") == 0 &&
				allPlayers[1].getIntelligence() < Serpensortia.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Serpensortia");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				allPlayers[1].getIntelligence() < Protego.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Protego");
			b = true;
			a = false;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				allPlayers[1].getIntelligence() < Impedimenta.getIntRequirement()) {
			System.out.println(allPlayers[1].getName() + "智力不足無法學習Impedimenta");
			b = true;
			a = false;
		}
		else if(allPlayers[1].getImpedimentaPractice() >= 100) {
			allPlayers[1].setImpedimentaPractice1(100);
			System.out.println("Impedimenta熟練度已滿");
			b = true;
			a = false;
		}
		else if(allPlayers[1].getSerpensortiaPractice() >= 100) {
			allPlayers[1].setSerpensortiaPractice1(100);
			System.out.println("Serpensortia熟練度已滿");
			b = true;
			a = false;
		}
		else if(allPlayers[1].getStupefyPractice() >= 100) {
			allPlayers[1].setStupefyPractice1(100);
			System.out.println("Stupefy熟練度已滿");
			b = true;
			a = false;
		}
		else if(allPlayers[1].getProtegoPractice() >= 100) {
			allPlayers[1].setProtegoPractice1(100);
			System.out.println("Protego熟練度已滿");
			b = true;
			a = false;
		}
	}
	else if (g_cmd.contains("recover")) {
		if (allPlayers[1].getPotion() > 0) {
			System.out.println(allPlayers[1].getName() + "使用藥水");
			allPlayers[1].setPotion(1);
			allPlayers[1].addEnergy(50);
			System.out.println(allPlayers[1].getName() + "的體力回復到：" + allPlayers[1].getEnergy());
			b = false;
			a = true;
			n++;
		}
		else if (allPlayers[1].getPotion() <= 0) {
			System.out.println("藥水不足");
			b = true;
			a = false;
		}
	}
	else if (g_cmd.compareTo("game over") == 0) {
		System.exit(0);
		System.out.println("感謝遊玩！");
		k = false;
	}
}
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
			P = (Math.round(allPlayers[0].getSerpensortiaPractice() * (100 + allPlayers[0].getMagic()) * 20 * 3)/10000);
			if (true == allPlayers[1].getImpedimentaIsLearn()) {
				P -= (Math.round( 3 * 20 * allPlayers[1].getImpedimentaPractice())/100);
			}
			if (true == allPlayers[1].getProtegoIsLearn()) {
				P -= (Math.round(P * 20 * allPlayers[1].getProtegoPractice())/10000);
			}
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
				P = (Math.round(70 * allPlayers[0].getStupefyPractice() * (100 + allPlayers[0].getMagic()))/10000);
				if (true == allPlayers[1].getImpedimentaIsLearn()) {
					P -= (Math.round( 1 * 20 * allPlayers[1].getImpedimentaPractice())/100);
				}
				if (true == allPlayers[1].getProtegoIsLearn()) {
					P -= (Math.round(P * 20 * allPlayers[1].getProtegoPractice())/10000);
				}
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
			allPlayers[0].useEnergy(10);
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
			allPlayers[0].useEnergy(10);
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
			allPlayers[0].setImpedimentaIsLearn();
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Impedimenta") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getImpedimentaIsLearn() && 
				allPlayers[0].getIntelligence() >= 15 && 
				allPlayers[0].getImpedimentaPractice() < 100) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "增強了：Impedimenta");
			allPlayers[0].setIntelligence(2);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
			allPlayers[0].setImpedimentaPractice(20);
			System.out.println(allPlayers[0].getName() + "Impedimenta熟練度上升為：" + allPlayers[0].getImpedimentaPractice() + "%");
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
			allPlayers[0].setProtegoIsLearn();
			a = false;
			b = true;
		}
		else if (spelltypeString.compareTo("Protego") == 0 &&
				AfterSplit.length == 2 &&
				allPlayers[0].getEnergy() >= 10  && 
				true == allPlayers[0].getStupefyIsLearn() && 
				allPlayers[0].getIntelligence() >= 25 && 
				allPlayers[0].getProtegoPractice() < 100) {
			allPlayers[0].useEnergy(10);
			System.out.println(allPlayers[0].getName() + "增強了：Protego");
			allPlayers[0].setIntelligence(3);
			System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
			allPlayers[0].setProtegoPractice(8);
			System.out.println(allPlayers[0].getName() + "Protego熟練度上升為：" + allPlayers[0].getProtegoPractice() + "%");
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
		System.exit(0);
		System.out.println("感謝遊玩！");
		k = false;
	}
}
public static void Check () {
	for (int i = 0; i < allPlayers.length; i++) {
		if(allPlayers[i].getImpedimentaPractice() >= 100) {
			allPlayers[i].setImpedimentaPractice1(100);
			System.out.println("Impedimenta熟練度已滿");
		}
		else if(allPlayers[i].getSerpensortiaPractice() >= 100) {
			allPlayers[i].setSerpensortiaPractice1(100);
			System.out.println("Serpensortia熟練度已滿");
		}
		else if(allPlayers[i].getStupefyPractice() >= 100) {
			allPlayers[i].setStupefyPractice1(100);
			System.out.println("Stupefy熟練度已滿");
		}
		else if(allPlayers[i].getProtegoPractice() >= 100) {
			allPlayers[i].setProtegoPractice1(100);
			System.out.println("Protego熟練度已滿");
		}
		else if (allPlayers[i].getEnergy() <= 0 ) {
			System.out.println(allPlayers[i].getName() + "已死亡");
			if (true == allPlayers[0].getIsDead()) {
				System.out.println("恭喜玩家：" + allPlayers[1].getName() + "獲得勝利！");
			} 
			else if (true == allPlayers[1].getIsDead()) {
				System.out.println("恭喜玩家：" + allPlayers[0].getName() + "獲得勝利！");
			}
			System.exit(0);
			System.out.println("感謝遊玩！");
			k = false;
		}
	}
}
public static void Event () {
	ArrayList<String> fileContent = FileIO.readfile("event.txt");
	for(int i=0; i < fileContent.size(); i++){
		String sepString = "	";
		int round;
		String eventype;
		String[] AfterSplit;
		AfterSplit = fileContent.get(i).split(sepString);
		String temp = AfterSplit[0];
		round = Integer.parseInt(temp);
		eventype = AfterSplit[1];
		if (round == n) {
			if (eventype.equals("Hippogrif")) {
				System.out.println("沒和鷹馬敬禮，雙方被攻擊，雙方玩家體力 -15");
				allPlayers[0].useEnergy(15);
				allPlayers[1].useEnergy(15);
				System.out.println(allPlayers[0].getName() + "體力剩下：" + allPlayers[0].getEnergy());
				System.out.println(allPlayers[1].getName() + "體力剩下：" + allPlayers[1].getEnergy());
			}
			else if (eventype.equals("VomitBeans")) {
				System.out.println("吃到嘔吐物口味的柏蒂全口味豆，雙方玩家智力 -5");
				allPlayers[0].setIntelligence(-5);
				allPlayers[1].setIntelligence(-5);
				System.out.println(allPlayers[0].getName() + "智力剩下：" + allPlayers[0].getIntelligence());
				System.out.println(allPlayers[1].getName() + "智力剩下：" + allPlayers[1].getIntelligence());
			}
			else if (eventype.equals("PumpkinPasty")) {
				System.out.println("免費南瓜餡餅，雙方玩家體力 +25，智力 +2");
				allPlayers[0].addEnergy(25);
				allPlayers[1].addEnergy(25);
				allPlayers[0].setIntelligence(2);
				allPlayers[1].setIntelligence(2);
				System.out.println(allPlayers[0].getName() + "體力變為：" + allPlayers[0].getEnergy());
				System.out.println(allPlayers[1].getName() + "體力變為：" + allPlayers[1].getEnergy());
				System.out.println(allPlayers[0].getName() + "智力變為：" + allPlayers[0].getIntelligence());
				System.out.println(allPlayers[1].getName() + "智力變為：" + allPlayers[1].getIntelligence());
			}
			else if (eventype.equals("DeathEaters")) {
				System.out.println("食死人來襲，當下智力低於 16 且體力低於 65 的人，直接死亡");
				for (int j = 0; j < allPlayers.length; j++) {
					if(allPlayers[j].getIntelligence() < 16 &&
						allPlayers[j].getEnergy() < 65 && 
						false == allPlayers[j].getIsDead()) {
						System.out.println(allPlayers[j].getName() + "已死亡");
						allPlayers[j].setIsDead();
					}
				}
			}
		}
	}	
}

}



