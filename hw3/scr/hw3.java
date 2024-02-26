import java.util.ArrayList;//使用ARRAYLIST

class fish1 {//孔雀魚的class
	private static String name = "孔雀魚";//魚的name
	private static double weight = 7.0;//魚的初始重量
	private static double weight_limit = 15;//魚的最大體重
	private static int temperature = 15;//魚能適應的最低溫度
	private static String isAlive = "存活";//存活狀態
	static String getName(){//取得名字
		return name; 
	 }
	static double getWeight(){//取得初始重量
		  return weight; 
		 }
	static double getWeightLimit(){//取得體重上限
		 return weight_limit; 
	}
	static int getTemperature(){//取得適應溫度
		return temperature; 
	}
	static String getAlive(){//取得狀態
		return isAlive; 
	}
	public static void showData(){//顯示各項數據
		System.out.printf("%-17.15s %-9.1f %7.1f  %10s   %6s\r\n",name,weight,weight_limit,temperature,isAlive);//回應使用者
	}
}
class fish2 {//斑馬魚的class
	private static String name = "斑馬魚";//魚的name
	private static double weight = 5.0;//魚的初始重量
	private static double weight_limit = 10;//魚的最大體重
	private static int temperature = 10;//魚能適應的最低溫度
	private static String isAlive = "存活";//存活狀態
	static String getName(){//取得名字
		return name; 
	 }
	static double getWeight(){//取得初始重量
		  return weight; 
		 }
	static double getWeightLimit(){//取得體重上限
		 return weight_limit; 
	}
	static int getTemperature(){//取得適應溫度
		return temperature; 
	}
	static String getAlive(){//取得狀態
		return isAlive; 
	}
	public static void showData(){//顯示各項數據
		System.out.printf("%-17.15s %-9.1f %7.1f  %10s   %6s\r\n",name,weight,weight_limit,temperature,isAlive);
	}
}
class shrimp1 {//金背米蝦的class
	private static String name = "金背米蝦";//魚的name
	private static double weight = 1.0;//魚的初始重量
	private static double weight_limit = 10;//魚的最大體重
	private static String isAlive = "存活";//存活狀態
	static String getName(){//取得名字
		return name; 
	 }
	static double getWeight(){//取得初始重量
		  return weight; 
		 }
	static double getWeightLimit(){//取得體重上限
		 return weight_limit; 
	}
	static String getAlive(){//取得狀態
		return isAlive; 
	}
	public static void showData(){//顯示各項數據
		System.out.printf("%-17.15s %-8.1f %7.1f    %6s\r\n",name,weight,weight_limit,isAlive);
	}
}
class shrimp2 {//火焰蝦的class
	private static String name = "火焰蝦";//魚的name
	private static double weight = 1.5;//魚的初始重量
	private static double weight_limit = 12;//魚的最大體重
	private static String isAlive = "存活";//存活狀態
	static String getName(){//取得名字
		return name; 
	 }
	static double getWeight(){//取得初始重量
		  return weight; 
		 }
	static double getWeightLimit(){//取得體重上限
		 return weight_limit; 
	}
	static String getAlive(){//取得狀態
		return isAlive; 
	}
	public static void showData(){//顯示各項數據
		System.out.printf("%-19.15s %-8.1f %6.1f    %6s\r\n",name,weight,weight_limit,isAlive);
	}
}
class CommandList {//指令集
	private static String addString = "add";//指令統一儲存方便日後修改
	private static String coldString = "cold";//指令統一儲存方便日後修改
	private static String feedString = "feed";//指令統一儲存方便日後修改
	private static String showString = "show";//指令統一儲存方便日後修改
	private static String nextString = "next";//指令統一儲存方便日後修改
	private static String exitString = "exit";//指令統一儲存方便日後修改
	private static String helpString = "--help";//指令統一儲存方便日後修改
	static String getadd () {//回傳add指令
		return addString;
	}
	static String getcold () {//回傳cold指令
		return coldString;
	}
	static String getfeed () {//回傳feed指令
		return feedString;
	}
	static String getshow () {//回傳show指令
		return showString;
	}
	static String getnext () {//回傳next指令
		return nextString;
	}
	static String getexit () {//回傳exit指令
		return exitString;
	}
	static String gethelp () {//回傳help指令
		return helpString;
	}
}

public class hw3 {//hw3
	public static String Sep  = " ";//分開指令用的
	public static ArrayList<String> allfishname = new ArrayList<String>();//有關名字的ARRAYLIST
	public static ArrayList<String> allfishalivelist = new ArrayList<String>();//有關存活狀態的ARRAYLIST
	public static ArrayList<Double> allfishweight = new ArrayList<Double>();//有關體重的ARRAYLIST
	public static ArrayList<Integer> allfishgrow = new ArrayList<Integer>();//有關脫殼的ARRAYLIST
	public static ArrayList<Integer> allfishgrown = new ArrayList<Integer>();//有關是否為正在脫殼的ARRAYLIST
	public static ArrayList<Integer> isFeed = new ArrayList<Integer>();//有關是否已餵食的ARRAYLIST
	public static int noralTemperature = 25 ; //室溫
	public static int Day = 1;//天數
	public static String cmd;//指令輸入的代號
	public static String food;//儲存玩家輸入的foodtype
	public static String cold;//儲存玩家是否輸入cold
 	public static void main(String[] args) {//主程式
		System.out.println("歡迎遊玩，請輸入指令");//歡迎
		System.out.println("今天是第" + Day + "天");//顯示天數
		showmsg();//顯示指令集
		boolean k = true;//do while loop 的判斷條件
		do {//loop start
			System.out.print("請輸入指令：");
			cmd = ConsoleIn.readLine();//輸入值為cmd
			if (cmd.contains(CommandList.getadd())) {//指令為add fish
				addnewfish(cmd);//執行addnewfish
			}else if (cmd.contains(CommandList.getfeed())) {//指令為 feed
				System.out.println("已餵食飼料");//回應使用者
				food = cmd;//紀錄cmd(非當下執行)
				isFeed (food);//給isFeed判斷
			}else if (cmd.compareTo(CommandList.getcold()) == 0) {//指令為 cold
				System.out.println("寒流即將來襲");//回應使用者
				cold = cmd;//紀錄cmd(非當下執行)
				isCold(cold);//給isCold判斷
			}else if (cmd.compareTo(CommandList.getshow()) == 0) {//指令為 show
				showAll();//執行showall
			}else if (cmd.compareTo(CommandList.getnext()) == 0) {//指令為 next
				nextDay ();//執行nextDay
			}else if (cmd.compareTo(CommandList.getexit()) == 0) {//指令為 exit
				System.out.println("感謝遊玩！");//回應使用者
				k = false ;//loop stop
				System.exit(0);//exit
			}else if (cmd.contains(CommandList.gethelp())) {//指令為 help
				showmsg();//顯示指令集
			}else {
				System.out.println("指令有誤！");//回應使用者
				showmsg();//顯示指令集
			}
		} while (k == true);//loop
	}
	public static void showmsg() {//顯示指令集
		System.out.println("養殖新的魚/蝦： add  【魚/蝦編號】 【數目】  Ex.add S2 3 多養三隻火焰蝦。");//指令介紹
		System.out.println("投飼料       ： feed 【飼料類型】            Ex.feed 2   餵食高級飼料。");//指令介紹
		System.out.println("寒流         ： cold                         Ex.cold     當天為寒流，水溫降至 12 度。");//指令介紹
		System.out.println("顯示當前狀態 ： show                         Ex.show     顯示當前水族箱中所有生物的狀態。");//指令介紹
		System.out.println("結束當天     ： next                         Ex.next     結束當天，進入下一天。");//指令介紹
		System.out.println("結束程式     ： exit                         Ex.exit     結束程式。");//指令介紹
		System.out.println("指令提示     ： --help                       Ex.--help   獲取指令提示。");//指令介紹
		System.out.println("魚/蝦編號    ： F1 孔雀魚 、 F2 斑馬魚、S1金背米蝦、S2火焰蝦");//指令介紹
		System.out.println("飼料類型     ： 1 超級飼料、2 高級飼料、3 一般飼料");//指令介紹
	}
	public static void addnewfish (String sIn) {//addnewfish的指令
		String[] AfterSplit;//AfterSplit為要分掉的指令
		AfterSplit = sIn.split(Sep,3);//分3份 用 Sep 作為分割條件
		String temp;//temp 為num的中繼站
		int num;//為要養幾條
		temp = AfterSplit[2];//temp 為num的中繼站
		num = Integer.parseInt(temp);//定義num的值
		if (AfterSplit.length == 3) {//指令的長度正確
			if (AfterSplit[1].compareTo("F1") == 0) {//為fish1
				System.out.printf("%-15.15s %-5s   %-5s    %-5s   %-5s\r\n","魚類名稱","初始體重","體重上限","適合溫度","存亡");//title
				for (int i = 0; i < num; i++) {//養幾條就執行幾次
					allfishname.add(fish1.getName());//加入name到ARRAYLIST中
					allfishalivelist.add(fish1.getAlive());//加入狀態到ARRAYLIST中
					allfishweight.add(fish1.getWeight());//加入體重到ARRAYLIST中
					allfishgrow.add(0);//魚不會脫殼，但讓第I筆為同一條魚的資料所以仍然加入
					allfishgrown.add(0);//魚不會脫殼，但讓第I筆為同一條魚的資料所以仍然加入
					isFeed.add(0);//飢餓天數 初始值0
					fish1.showData();//執行showdata
				}
			}else if (AfterSplit[1].compareTo("F2") == 0) {//為fish2
				System.out.printf("%-15.15s %-5s   %-5s    %-5s   %-5s\r\n","魚類名稱","初始體重","體重上限","適合溫度","存亡");//title
				for (int i = 0; i < num; i++) {//養幾條就執行幾次
					allfishname.add(fish2.getName());//加入name到ARRAYLIST中
					allfishalivelist.add("存活");//加入狀態到ARRAYLIST中
					allfishweight.add(fish2.getWeight());//加入體重到ARRAYLIST中
					allfishgrow.add(0);//魚不會脫殼，但讓第I筆為同一條魚的資料所以仍然加入
					allfishgrown.add(0);//魚不會脫殼，但讓第I筆為同一條魚的資料所以仍然加入
					isFeed.add(0);//飢餓天數 初始值0
					fish2.showData();//執行showdata
				}
			}else if (AfterSplit[1].compareTo("S1") == 0) {
				System.out.printf("%-15.15s %-5s   %-5s     %-5s\r\n","魚類名稱","初始體重","體重上限","存亡");//title
				for (int i = 0; i < num; i++) {//養幾條就執行幾次
					allfishname.add(shrimp1.getName());//加入name到ARRAYLIST中
					allfishalivelist.add(shrimp1.getAlive());//加入狀態到ARRAYLIST中
					allfishweight.add(shrimp1.getWeight());//加入體重到ARRAYLIST中
					allfishgrow.add(0);//脫殼的相關計數
					allfishgrown.add(0);//脫殼的相關計數
					isFeed.add(0);//飢餓天數 初始值0
					shrimp1.showData();//執行showdata
				}
			}else if (AfterSplit[1].compareTo("S2") == 0) {
				System.out.printf("%-15.15s %-5s   %-5s     %-5s\r\n","魚類名稱","初始體重","體重上限","存亡");//title
				for (int i = 0; i < num; i++) {//養幾條就執行幾次
					allfishname.add(shrimp2.getName());//加入name到ARRAYLIST中
					allfishalivelist.add(shrimp2.getAlive());//加入狀態到ARRAYLIST中
					allfishweight.add(shrimp2.getWeight());//加入體重到ARRAYLIST中
					allfishgrow.add(0);//脫殼的相關計數
					allfishgrown.add(0);//脫殼的相關計數
					isFeed.add(0);//飢餓天數 初始值0
					shrimp2.showData();//執行showdata
				}
			}else {
				System.out.println("指令有誤");//指令有誤的回應
				showmsg();//指令集
			}
		}else {
			System.out.println("指令有誤");//指令有誤的回應
			showmsg();//指令集
		}
	}
	public static void showAll() {//指令showall
		System.out.printf("%-15.15s %s     %s\r\n","魚類名稱","存亡","體重");//title
		for (int i = 0; i < allfishname.size(); i++) {//搜尋全部的魚
			System.out.printf("%-15.15s %-6.6s %-6.2f \r\n",allfishname.get(i) , allfishalivelist.get(i) , allfishweight.get(i));//從ARRAYLIST得到資料
		}
	}
	public static void cold() {//指令cold
		noralTemperature = 12;//設定室溫為12度
		System.out.println("寒流來襲！溫度降為" + noralTemperature +"度!");//回應使用者
		for (int i = 0; i < allfishname.size(); i++) {//搜尋全部的魚
			if (fish1.getTemperature() < noralTemperature &&//無法忍受此溫度時
				allfishname.get(i).compareTo(fish1.getName()) == 0 &&//判斷名稱
				true == isCold(cold)) {//之前輸入過cold
				allfishalivelist.set(i, "已死亡");//狀態改為死亡
				System.out.println("孔雀魚已死亡");//回應使用者
			}else if (fish2.getTemperature() < noralTemperature &&//無法忍受此溫度時
					allfishname.get(i).compareTo(fish2.getName()) == 0 &&//判斷名稱
					true == isCold(cold)) {//之前輸入過cold
				allfishalivelist.set(i, "已死亡");//狀態改為死亡
				System.out.println("斑馬魚已死亡");//回應使用者
			}
		}
		cold = null;//刪除之前的紀錄
		noralTemperature = 25;//回到室溫
	}
	public static void feed(String sIn) {//執行feed 指令
		String[] AfterSplit;//AfterSplit為要分掉的指令
		AfterSplit = sIn.split(Sep,2);//分2份 用 Sep 作為分割條件
		String temp;//temp 為foodtype的中繼站
		int foodtype;//定義foodtype
		temp = AfterSplit[1];//temp 為foodtype的中繼站
		foodtype = Integer.parseInt(temp);//assign foodtype的值
		if (true == isFeed(sIn)) {//之前輸入過feed
			if (AfterSplit.length == 2) {//指令長度正確
				for (int i = 0; i < allfishname.size(); i++) {//搜尋全部的魚
					isFeed.set(i, 0);//0表示不是飢餓
				}
				for (int i = 0; i < allfishname.size(); i++) {//搜尋全部的魚
					if (foodtype == 1 &&//餵食1號飼料
							allfishalivelist.get(i).compareTo("存活") == 0) {//存活的魚
						if (allfishname.get(i).compareTo(fish1.getName()) == 0) {//依據名稱得到不同的成長係數
							allfishweight.set(i,allfishweight.get(i) + (2*0.4));//體重增加
						}else if (allfishname.get(i).compareTo(fish2.getName()) == 0) {//依據名稱得到不同的成長係數
							allfishweight.set(i,allfishweight.get(i) + (2*0.3));//體重增加
						}else if (allfishname.get(i).compareTo(shrimp1.getName()) == 0 &&//依據名稱得到不同的成長係數
								allfishgrow.get(i) == 0) {//非脫殼中
							allfishweight.set(i,allfishweight.get(i) + (2*0.1));//體重增加
						}else if (allfishname.get(i).compareTo(shrimp2.getName()) == 0 &&//依據名稱得到不同的成長係數
								allfishgrow.get(i) == 0) {//非脫殼中
							allfishweight.set(i,allfishweight.get(i) + (2*0.2));//體重增加
						}
					}else if (foodtype == 2 && //餵食2號飼料
							allfishalivelist.get(i).compareTo("存活") == 0) {//存活的魚
						if (allfishname.get(i).compareTo(fish1.getName()) == 0) {//依據名稱得到不同的成長係數
							allfishweight.set(i,allfishweight.get(i) + (1.5*0.4));//體重增加
						}else if (allfishname.get(i).compareTo(fish2.getName()) == 0) {//依據名稱得到不同的成長係數
						allfishweight.set(i,allfishweight.get(i) + (1.5*0.3));//體重增加
						}else if (allfishname.get(i).compareTo(shrimp1.getName()) == 0 &&//依據名稱得到不同的成長係數
								allfishgrow.get(i) == 0) {
							allfishweight.set(i,allfishweight.get(i) + (1.5*0.1));//體重增加
						}else if (allfishname.get(i).compareTo(shrimp2.getName()) == 0 &&//依據名稱得到不同的成長係數
								allfishgrow.get(i) == 0) {
							allfishweight.set(i,allfishweight.get(i) + (1.5*0.2));//體重增加
						}
					}else if (foodtype == 3 && //餵食3號飼料
							allfishalivelist.get(i).compareTo("存活") == 0) {//存活的魚
						if (allfishname.get(i).compareTo(fish1.getName()) == 0 &&//依據名稱得到不同的成長係數
							allfishweight.get(i) < fish1.getWeightLimit()) {//體重小於上限
							allfishweight.set(i,allfishweight.get(i) + (1*0.4));//體重增加
						}else if (allfishname.get(i).compareTo(fish2.getName()) == 0 &&//依據名稱得到不同的成長係數
							allfishweight.get(i) < fish2.getWeightLimit()) {//體重小於上限
							allfishweight.set(i,allfishweight.get(i) + (1*0.3));//體重增加
						}else if (allfishname.get(i).compareTo(shrimp1.getName()) == 0 &&//依據名稱得到不同的成長係數
								allfishweight.get(i) < shrimp1.getWeightLimit() &&//體重小於上限
								allfishgrow.get(i) == 0) {//非脫殼中
								allfishweight.set(i,allfishweight.get(i) + (1*0.1));//體重增加
						}else if (allfishname.get(i).compareTo(shrimp2.getName()) == 0 &&//依據名稱得到不同的成長係數
								allfishweight.get(i) < shrimp2.getWeightLimit() &&//體重小於上限
								allfishgrow.get(i) == 0) {//非脫殼中
								allfishweight.set(i,allfishweight.get(i) + (1*0.2));//體重增加
						}
					}
					for (int j = 0; j < allfishname.size(); j++) {//搜尋全部的魚
						if(allfishweight.get(j) >= 3 &&//體重大於3的蝦子
							allfishname.get(j).compareTo(shrimp1.getName()) == 0 &&//判斷其為蝦子1號
							allfishgrow.get(j) == 0 && //非脫殼狀態
							allfishgrown.get(j) == 0) {//還沒脫過殼
							allfishweight.set(j, 3.0);//固定體重
							allfishgrow.set(j,1);//脫殼第一天
						}
						else if(allfishweight.get(j) >= 3 &&//體重大於3的蝦子
							allfishname.get(j).compareTo(shrimp2.getName()) == 0 &&//判斷其為蝦子2號
							allfishgrow.get(j) == 0 &&//非脫殼狀態
							allfishgrown.get(j) == 0) {//還沒脫過殼
							allfishweight.set(j, 3.0);//固定體重
							allfishgrow.set(j,1);//脫殼第一天
						}
					}
					for (int j = 0; j < allfishname.size(); j++) {//搜尋全部的魚
						if(allfishweight.get(j) >= 6 &&//體重大於6的蝦子
							allfishname.get(j).compareTo(shrimp1.getName()) == 0 &&//判斷其為蝦子1號
							allfishgrow.get(j) == 0 &&//非脫殼狀態
							allfishgrown.get(j) == 1) {//脫過一次殼
							allfishweight.set(j, 6.0);//固定體重
							allfishgrow.set(j,1);//脫殼第一天
						}
						else if(allfishweight.get(j) >= 6 &&//體重大於6的蝦子
							allfishname.get(j).compareTo(shrimp2.getName()) == 0 &&//判斷其為蝦子2號
							allfishgrow.get(j) == 0 &&//非脫殼狀態
							allfishgrown.get(j) == 1) {//脫過一次殼
							allfishweight.set(j, 6.0);//固定體重
							allfishgrow.set(j,1);//脫殼第一天
						}
					}
					for (int j = 0; j < allfishname.size(); j++) {//搜尋全部的魚
						if(allfishweight.get(j) >= 9 &&//體重大於9的蝦子
							allfishname.get(j).compareTo(shrimp1.getName()) == 0 &&//判斷其為蝦子1號
							allfishgrow.get(j) == 0 &&//非脫殼狀態
							allfishgrown.get(j) == 2) {//脫過二次殼
							allfishweight.set(j, 9.0);//固定體重
							allfishgrow.set(j,1);//脫殼第一天
						}
						else if(allfishweight.get(j) >= 9 &&//體重大於9的蝦子
							allfishname.get(j).compareTo(shrimp2.getName()) == 0 &&//判斷其為蝦子2號
							allfishgrow.get(j) == 0 &&//非脫殼狀態
							allfishgrown.get(j) == 2) {//脫過二次殼
							allfishweight.set(j, 9.0);//固定體重
							allfishgrow.set(j,1);//脫殼第一天
						}
					}
				
					
				}
				for (int j = 0; j < allfishname.size(); j++) {//搜尋全部的魚
					if (allfishweight.get(j) > fish1.getWeightLimit() &&//體重大於上限時
							allfishname.get(j).compareTo(fish1.getName()) == 0) {//判斷名字
						allfishweight.set(j, fish1.getWeightLimit());//體重定為上限值
					}else if (allfishweight.get(j) > fish2.getWeightLimit() &&//體重大於上限時
							allfishname.get(j).compareTo(fish2.getName()) == 0) {//判斷名字
						allfishweight.set(j, fish2.getWeightLimit());//體重定為上限值
					}else if (allfishweight.get(j) > shrimp1.getWeightLimit() &&//體重大於上限時
							allfishname.get(j).compareTo(shrimp1.getName()) == 0) {//判斷名字
						allfishweight.set(j, shrimp1.getWeightLimit());//體重定為上限值
					}else if (allfishweight.get(j) > shrimp2.getWeightLimit()  &&//體重大於上限時
							allfishname.get(j).compareTo(shrimp2.getName()) == 0) {//判斷名字
						allfishweight.set(j, shrimp2.getWeightLimit());//體重定為上限值
					}
				}
			}else {
				System.out.println("指令有誤");//指令有誤的回應
				showmsg();//指令集
			}
		}
		food = null;//還原food
	}
	public static boolean isFeed (String sIn) {//執行isFeed指令
		String[] AfterSplit;//AfterSplit為要分掉的指令
		if (food == null) {//如果沒有輸入值時
			return false;//回傳false
		}
		AfterSplit = sIn.split(Sep,2);//分2份 用 Sep 作為分割條件
		if (AfterSplit.length == 2) {//指令長度正確
			if (sIn.contains("feed")) {//含有feed的指令時
				return true;//回傳true
			}
		}else {
			System.out.println("指令有誤");//指令有誤的回應
			showmsg();//指令集
			return false;//回傳false
		}
		return true;//預設值
	}
	public static boolean isCold (String sIn) {//執行isCold指令
		if (cold == null) {//如果沒有輸入值時
			return false;//回傳false
		}
		if (sIn.compareTo("cold") == 0) {//含有cold的指令時

			return true;//回傳true
		}else {
			return false;//回傳false
		}
	}
	public static void nextDay () {//執行next 的指令
		Day ++;//天數+1
		System.out.println("今天是第" + Day + "天");//回應使用者
		if (isCold(cold)) {//當有輸入過cold時
			cold();//執行cold
		}
		if (true == isFeed(food)) {//當有輸入過feed時
			if (allfishname.size() > 0) {//有魚時
				System.out.println("魚成長了！");//回應使用者
			}
			else if (allfishname.size() == 0) {//沒魚時
				System.out.println("飼料浪費了！");//回應使用者
			}
			feed(food);//執行feed
		}else {
			for (int i = 0; i < allfishname.size(); i++) {//當沒有輸入過feed時
				isFeed.set(i, isFeed.get(i) + 1);//飢餓天數+1
				if (isFeed.get(i) >= 3) {//超過三天時
					allfishalivelist.set(i, "已死亡");//設定狀態為死亡
					System.out.println(allfishname.get(i) + "已餓死");//回應使用者
				}
			}
		}
		for (int j = 0; j < allfishname.size(); j++) {//搜尋全部的魚
			if (allfishgrow.get(j) == 1 ) {//脫殼第1天時
				allfishgrow.set(j, allfishgrow.get(j)+1);//天數+1
			}else if (allfishgrow.get(j) == 2 ) {//脫殼第2天時
				allfishgrow.set(j, allfishgrow.get(j)+1);//天數+1
			}else if (allfishgrow.get(j) == 3) {//脫殼第3天時
				allfishgrow.set(j, allfishgrow.get(j)+1);//天數+1
			}else if (allfishgrow.get(j) == 4 && //沒有第四天所以可以繼續成長
					allfishgrown.get(j) == 0) {//沒脫過殼
				allfishgrow.set(j, 0);//脫殼天數回歸起始值
				allfishgrown.set(j, 1);//設定為脫過1次殼
			}else if (allfishgrow.get(j) == 4 && //沒有第四天所以可以繼續成長
					allfishgrown.get(j) == 1) {//脫過1次殼
				allfishgrow.set(j, 0);//脫殼天數回歸起始值
				allfishgrown.set(j, 2);//設定為脫過2次殼
			}else if (allfishgrow.get(j) == 4 && //沒有第四天所以可以繼續成長
					allfishgrown.get(j) == 2) {//脫過2次殼
				allfishgrow.set(j, 0);//脫殼天數回歸起始值
				allfishgrown.set(j, 3);//設定為脫過3次殼
			}
		}
	}
}
