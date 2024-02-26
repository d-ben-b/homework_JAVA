class student {
	String name;//定義name
	String attend;//定義 attend
	int week;//定義 week
	int check;//定義 check
	
	void Setstudent(String inName, String inAttend, int inWeek, int inCheck){//定義 student 數據 
			this.name = inName; //定義inName為回傳值
			this.attend = inAttend;//定義inAttend為回傳值
			this.week = inWeek;//定義inWeek為回傳值
			this.check = inCheck;//定義inCheck為回傳值
	}
	String getName(){
		return this.name;//getname為取得name
	}
	String getattendance(){
		return this.attend;//getattend為取得attend
	}
	int getcheck(){
		return this.check;//getchedck為取得check
	}
	int getweek(){
		return this.week;//getweek為取得week
	}
	void setName(String inName){
		this.name = inName;//name回傳給this name
	}
	void setWeek(int inWeek){
		this.week = inWeek;//回傳week到this week
	}
	void setAttend(String inAttend){
		this.attend = inAttend;//attend回傳給this attend
	}
	void setCheck(int inCheck){
		this.check = inCheck;//回傳check到thischeck
	}

	public void showTitle(){
		System.out.println("名字          " + "周次" + "   出席" + "  登記/刪除" ); //建立標題
	}
	public void showData(){
		System.out.printf("%-15.15s %d    %-6.6s %d \r\n",this.name,this.week,this.attend ,this.check);//建立輸入值
		
	}
}

public class hw2 {
	static int Nowweek = 8; //最大週數預設為8
	public static int nMaxStudent = 1000;//設定最大的 學生個數*最大週數至少需要80個
	public static int nStudentIndex = 0  ; //每一個資料的編號 預設0
	public static String Sep = " " ; //用來分割指令
	public static student AllStudent[] = new student[nMaxStudent] ;//建立array 關於全部的學生
	
	public static void main(String[] args) {//main
		System.out.println("歡迎你好");
		boolean k = true; //do while 所需的參數 
		String inData = "" ; //定義 inData
		int i ; //定義 i
		int  nIndex ;  //定義 index
		nStudentIndex = 0  ;//每一個資料的編號 從0開始
		for(i=0; i < nMaxStudent ;i ++){
			AllStudent[i] = new student();//建立array 關於全部的學生
			AllStudent[i].setCheck(0) ;//預設每一筆資料皆為刪除的狀態
		}
		ShowMsg1();//系統提示
		String cmd ;//定義cmd
		do{//do loop
			cmd = ConsoleIn.readLine();// cmd 為輸入的指令
			if (cmd.contains("edit")) 
			{//cmd 包含edit
				EditStudent(cmd);//執行EditStudent()
				
			}else
			if (cmd.contains("show all"))
				{//cmd 包含show all
				ShowAllStudent();//執行ShowAllStudent()
			}else
			if (cmd.contains("--help")) 
			{//cmd 包含--help
				ShowMsg1();//執行ShowMsg1()
			}else 
			if (cmd.contains("exit")) //cmd 包含exit
			{
				System.out.println("感謝您的使用！");//回應使用者
				k = false ;;//停止loop
				System.exit(0);//終止程式
			}else
			if (cmd.contains("add new week"))
			{//cmd 包含add new week
				addNewWeek();//執行addNewWeek()	
			}else
			if (cmd.contains("show weeks")) 
			{//cmd 包含show weeks
				showWeek();//執行showWeek()
			}else
			if (cmd.contains("del last week")) 
			{//cmd 包含del last week
				delweek();//執行delweek()
			}else
			if (cmd.contains("search") && cmd.contains("rate"))
			{//cmd 包含search和 rate
				searchRate(cmd);//執行searchRate()
			}else
			if (cmd.contains("search")) 
			{//cmd 包含search
				searchPeople(cmd);//searchPeople()
			}
			System.out.println("是否需再次輸入指令 1為是 0為否");
			int l = ConsoleIn.readLineInt();
			if (l == 1) 
			{//輸入1時
				k = true;
			}else 
			if(l == 0) 
			{//輸入0時
				System.out.println("感謝您的使用！");//回應使用者
				k = false ;;//停止loop
				System.exit(0);//終止程式
			}
			
			
		}while( k == true );//do while loop
		
	}
	public static void ShowMsg1()//定義ShowMsg1()
	{
			System.out.println("edit 人 week -p/-a/-l/-e 1/0 ");//指令教學
			System.out.println("  這個指令是登記某一個人某一禮拜的出缺席狀況。");//指令教學
			System.out.println("  週數的登記為 1 到 10。");//指令教學
			System.out.println("  -p：出席\r\n"
							+  "  -a：缺席\r\n"
							+  "  -l：遲到\r\n"
							+  "  -e：早退\r\n"
							+  " 1/0: 1代表登記，0代表刪除。\r\n");//指令教學
			
			System.out.println("search week 人\r\n"+
							   "  查詢人在該週的出席情況顯示情況。\r\n");//指令教學
			
			System.out.println("--help\r\n"
							+  "  列出所有指令集，並說明各個指令的功能。\r\n");//指令教學
			
			System.out.println("search 人 -p/-a/-l/-e rate\r\n"
					          +"  列出指定對象的總出席率總缺席率/總遲到率/總早退率。\r\n");//指令教學
			
			System.out.println("show all\r\n"
					         + "  顯示所有學生在所有週次的出缺席記錄。\r\n");//指令教學
			
			System.out.println("add new week\r\n"
					          +"  新增一週的紀錄。\r\n");//指令教學	
			System.out.println("del last week\r\n"
							+  "  刪除最後一週的紀錄，包含未登記的週次。\r\n");//指令教學 
			System.out.println("show weeks\r\n"
							+  "  顯示目前的紀錄週次，包含尚未登記的週次，也就是目前可以登記的週次的最大上限值\r\n");//指令教學
			System.out.println("exit\r\n"
							+  "  退出系統，結束指令輸入");//指令教學
			System.out.println("\r\n請輸入相關指令 : \r\n");//提示使用者輸入指令
     
    }
	public static void EditStudent(String sIn)//定義EditStudent(String sIn)  sIn為所需的變數
	{
		String[] AfterSplit ;//定義AfterSplit
		String name ;//定義name
		int week=0 ;//定義week
		String attendance ;//定義attendance
		int check=0 ;//定義check
		String temp ;//定義temp
		int x = 0 ;//定義x
		int y = 0 ;//定義y
		// edit , name , weak , attendance , Add/delete 
		AfterSplit = sIn.split(Sep) ;//將sIn分開
		if (AfterSplit.length == 5)//檢查edit的指令是否正確
		{
			name = AfterSplit[1];//index 1 為name
			temp = AfterSplit[2];//index 2 為temp
			week=Integer.parseInt(temp);//temp轉為week
			attendance = AfterSplit[3];//index 3 為name
			temp = AfterSplit[4];//index 4 為temp
			check=Integer.parseInt(temp);//temp轉為check
			for (int i = 0; i < nStudentIndex; i++) 
			{//for loop
				if ((name.compareTo(AllStudent[i].getName())==0) && 
				(week==AllStudent[i].getweek()) && 
				(AllStudent[i].getcheck()== check )&&
				(check == 1)) //排除重複登記
				{
					System.out.println("請勿重複登記!");//回應使用者
					x = 1;//x=1時不可登記
				}else if((name.compareTo(AllStudent[i].getName())==0) && 
				(week==AllStudent[i].getweek()) && 
				(attendance.compareTo(AllStudent[i].getattendance())==0 ) && 
				(check == 0))//刪除目標
				{
					x = 2;//x=2時不可登記
					AllStudent[i].setCheck(0);
				}else
				{
					x = 0;
				}
			}
			if ((attendance.compareTo("-p")==0 ) || 
			(attendance.compareTo("-a")==0 ) ||
			(attendance.compareTo("-l")==0) ||
			(attendance.compareTo("-e")==0)) //排除出缺席有誤
			{
				y = 0;
			}else 
			{
				y = 1;//y=1時不可登記
			}
			
			if (y == 1 ) 
			{
				System.out.println("出缺席有誤!");//回應使用者
			} 	
			if ( (true == AddStudentName(8,name)) && 
			(Nowweek >= week) &&
			(x == 0) && 
			(y == 0))//滿足全部條件才可登記 名子總數<8 登記週數<最大週數 非重複登記 非出缺席有誤
			{
				AllStudent[nStudentIndex].setName(name);//登記name
				AllStudent[nStudentIndex].setWeek(week);//登記week
				AllStudent[nStudentIndex].setAttend(attendance);//登記attendance
				AllStudent[nStudentIndex].setCheck(check);//登記 or 刪除
				System.out.println("名子          " + "周次" + "   出席" + "  登記/刪除" );//回應標題
				AllStudent[nStudentIndex].showData();//執行showData
				nStudentIndex += 1 ;//編號變下一號
			}
			else if(x == 2)
			{
				System.out.println("已刪除!");
			}
			else
			{
				System.out.println("太多名字或週數登記太後面!");//回應使用者
			}
		}else
			{
			System.out.println("edit 指令錯誤 ");//指令錯誤時的回應
			System.out.println("edit 人 week -p/-a/-l/-e 1/0 ");//指令錯誤時的回應
			System.out.println("  這個指令是登記某一個人某一禮拜的出缺席狀況。");//指令錯誤時的回應
			System.out.println("  週數的登記為 1 到 10。");//指令錯誤時的回應
			System.out.println("  -p：出席\r\n"
							+  "  -a：缺席\r\n"
							+  "  -l：遲到\r\n"
							+  "  -e：早退\r\n"
							+  " 1/0: 1代表登記，0代表刪除。\r\n");//指令錯誤時的回應
			}
    }
	
	public static void ShowAllStudent()//定義ShowAllStudent()
	{
		int i ;//定義i
		boolean nTitle ; //定義 nTitle
		nTitle = false ;//預設false 
		AllStudent[0].showTitle();//執行showtitle
		for(i=0; i < nStudentIndex ; i++)
		{
			if ( AllStudent[i].getcheck() == 1 )//每一筆皆為登記狀態
			{
				AllStudent[i].showData();//執行showData
			
			}
		}
	}
	
	public static boolean AddStudentName(int nMaxName,String inName)//定義AddStudentName
	{
		int i,j,nNameListIndex ,nNewName;//定義各參數為int
		String sNameList[] = new String[100] ; //將NameList設為最大100個
		String sNowName ; //定義sNowName
		nNameListIndex = 0 ; //nNameListIndex預設為0
		// get all name into list 
		for(i=0; i < nStudentIndex ; i++)
		{
			if ( AllStudent[i].getcheck() == 1 )//如果都是成登記狀態
			{
				sNowName = AllStudent[i].getName() ;//nowname為該筆資料的name
				if( nNameListIndex == 0 )//namelist為空的狀態
				{
					sNameList[nNameListIndex]= sNowName ;//編入NowName到AllStudent[i]
					nNameListIndex += 1 ; //nameList 到下一筆
				}else//namelist不為空的狀態
				{
					nNewName = 0 ; 
					for(j=0;j<nNameListIndex;j++)//判斷每一筆namelist
					{
						if( sNowName == sNameList[j] )//sNowName為namelist其中的一筆(舊的)
						{
							nNewName = 0 ; //不加入namelist
							break ; 
						}else
						{
							nNewName = 1 ; //加入namelist
						}
					}
					if( nNewName == 1 )
					{
							sNameList[nNameListIndex]= sNowName ;//編入NowName到AllStudent[i]
							nNameListIndex += 1 ;// nameList 到下一筆
					}
				}
			}
		}
		
		nNewName = 0 ;  //nNameListIndex預設為0
		for(i=0; i < nNameListIndex ; i++)
		{//判斷每一筆namelist
			if ( inName.compareTo(sNameList[i]) == 0 )
			{//輸入值和namelist相同
				return true ;//判斷為舊數據
			}else
			{
				nNewName = 1 ; //判斷為新數據
			}
		}
		if( nNewName == 1 )
		{//新數據
			if(( nNameListIndex+1) > nMaxName )
			{//新數據是否超過最大上限
				return false ;//超過最大學生數不可加入edit
			}
		}
		return true ;
	}
	public static void addNewWeek()
	{//定義addNewWeek(maxWeek為週數上限)
			if(Nowweek<10) 
			{//如果每一筆都是合理的數據
					Nowweek += 1;//週數上限+1(全域)
					System.out.print("最大週數提升為" + Nowweek + "\r\n");//回應使用者
			}else
				{
					System.out.println("已達週數上限 10");//其他狀況
				}		
	}
	public static void showWeek() {//定義showWeek
		System.out.print("最大週數為" + Nowweek + "\r\n");//回應使用者
	}
	public static void delweek() 
	{//定義delweek
		for (int i = 0; i < nStudentIndex; i++) 
		{
			if(AllStudent[i].getweek() == Nowweek ) {//將每一筆的week為最後一周的刪除
				AllStudent[i].setCheck(0);//刪除
			}
		}if (Nowweek > 0){
			Nowweek -= 1;//最大週數-1
			System.out.print("最大週數變為" + Nowweek + "\r\n");//回應使用者
		}
		else if ( Nowweek == 1 || Nowweek < 1) {//避免負週數
			System.out.print("週數已達下限!");//回應使用者
		}
		
	}
	public static void searchPeople(String sIn) 
	{//定義searchPeople
		String[] AfterSplit ; //將指令分開
		int week ;//定義變數
		String name;//定義變數
		String temp;//定義變數
		int x = 0;//定義變數
		String attendance = null ;
		AfterSplit = sIn.split(Sep);//用Sep分開指令
		if(AfterSplit.length == 3) 
		{//指令長度正確
			temp = AfterSplit[1];//temp 為index = 1的資料
			week = Integer.parseInt(temp);//temp轉為week
			name = AfterSplit[2];//name 為index = 2的資料
			for (int i = 0; i < nStudentIndex; i++) {
				if(name.compareTo(AllStudent[i].getName()) == 0  && week == AllStudent[i].getweek() && AllStudent[i].getcheck() == 1) 
				{//找到一模一樣的數據
					attendance = AllStudent[i].getattendance();//獲取attendance
					x = 1;
					break;
				}else
				if(name.compareTo(AllStudent[i].getName()) == 0 && week != AllStudent[i].getweek())
				{//有此人但沒登記
					x = 2;
				}else 
				if(name.compareTo(AllStudent[i].getName()) != 0)
				{
					x = 3;
					break;
				}
			}
			if( x == 1 )
			{
				
				System.out.println(name + "在該周的出席狀況為" + attendance);//回應使用者
			}else
			if( x == 2 )
			{
				System.out.printf("此人在第%d周沒有登記\r\n",week);//回應使用者	
			}else
			if( x == 3 )
			{
				System.out.println("查無此人!");//查無此資料，回應使用者
			}
		}else {//指令錯誤時的回應
				ShowMsg1();
				}	
	}
	public static void searchRate(String sIn) 
	{//定義 searchRate
		String[] AfterSplit ;//定義AfterSplit將指令分開
		String name;//定義變數
		String attendance;//定義變數
		AfterSplit = sIn.split(Sep);//將指令分開
		int times = 0 , totaltimes = 0;//定義變數 times 為分子 totaltimes為分母
		String a = null;//a 為回應的選項 預設為null
		if(AfterSplit.length == 4) 
		{//指令長度正確
			name = AfterSplit[1];//name 為index = 1的資料
			attendance = AfterSplit[2];//attendance 為index = 2的資料
			for (int i = 0; i < nStudentIndex; i++) 
			{
				if(name.compareTo(AllStudent[i].getName()) == 0 && attendance.compareTo(AllStudent[i].getattendance())==0 && AllStudent[i].getcheck() == 1) 
				{
					times ++;//判斷資料是否都是要的，並計算分子總數
				}else if(name.compareTo(AllStudent[i].getName()) != 0)
				{
					System.out.println("查無此人!");//查無此人的回應
				}else 
				{
					continue;
				}
			
			}			
			for (int i = 0; i <nStudentIndex; i++) 
			{
			if (name.compareTo(AllStudent[i].getName()) == 0 && AllStudent[i].getcheck() == 1) 
				{
				totaltimes++;//以名子出現次數作為分母
				}
			}
		if(totaltimes != 0) 
		{//去掉分母為0的狀況
			int Rate = 100*times/totaltimes;//相除並以100倍的形式儲存
			if (attendance.compareTo("-p") == 0) 
			{
				a = "出席率\r\n";//當指令為-p   a = 出席率
			}else if (attendance.compareTo("-a") == 0) 
			{
				a = "缺席率\r\n";//當指令為-a   a = 缺席率
			}else if (attendance.compareTo("-l") == 0) 
			{
				a = "遲到率\r\n";//當指令為-l   a = 遲到率
			}else if (attendance.compareTo("-e") == 0) 
			{
				a = "早退率\r\n";//當指令為-e   a = 早退率
			}else 
			{//非 -p -a -l -e 的狀況
				System.out.println("search 指令錯誤 ");
			}
			System.out.printf(name + "的總%s為%d%%" + "\r\n",a,Rate);//回應使用者
		}else if (totaltimes == 0) 
		{
			System.out.println("查無此人! 無法計算\r\n");//分母為0時的回應
		}
		}else 
		{
			ShowMsg1();
		}

	}
}

