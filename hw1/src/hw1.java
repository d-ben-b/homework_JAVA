import java.util.Scanner;

public class hw1 {public static void main(String[] args) {
		
		Boolean k=true;//定義k判斷是否重新計算
		int money = 5000 ;//5倍券本金
		do{System.out.println("您好，歡迎!");    		//開頭的描述 do為loop開頭
		System.out.println("請輸入相對應的領取方式："); //開頭的描述 
		System.out.println("1 郵局領券");				//開頭的描述		
		System.out.println("2 超商領券");				//開頭的描述				
		System.out.println("3 EE Pay");					//開頭的描述			
		System.out.println("4 成大銀行信用卡");			//開頭的描述			
		System.out.println("5 電機支付");				//開頭的描述
		System.out.println("6 使用說明");				//開頭的描述
		Scanner scanner = new Scanner(System.in);		//建立給使用者輸入數字的地方
		int num1;										//定義num1
		num1 = scanner.nextInt();						//num1 為輸入值(及領取方式)
		try {											//try - finally 使程式不會因為第一個問題輸入錯而卡住(例如輸入9會直接到finally)
		if (num1 == 1) {								//如果num1為1是郵局領券
			System.out.println("您選擇郵局領券");		//文字回應
			System.out.println("郵局領券最終金額為"+ money+"元");}  //回應最終金額
		
		else if (num1 == 2) {							//如果num1為2是超商領券
			System.out.println("您選擇超商領券");		//文字回應
			int finalmoney7_11 = money + 200;			//定義finalmoney7_11為5000+加送的200
			System.out.println("超商領券優惠加碼200元");//文字回應
			System.out.println("您最終金額為"+finalmoney7_11+"元");}    //回應最終金額
		
		else if (num1 == 3) {							//如果num1為3是EE Pay
			System.out.println("您選擇EE Pay");  	 	//文字回應
			System.out.println("是否為新用戶？");   	//提問是否新用戶
			System.out.println("是請按1 否請按0"); 		//給予選項
			Scanner scanner1 = new Scanner(System.in); 	//建立給使用者輸入數字的地方
			int num2;    //定義num2
			num2 = scanner1.nextInt();    //num2為輸入值(是or否)
			if (num2 == 1) {    //num2=1 即是新用戶
				System.out.println("您是新用戶。");//文字回應
				System.out.println("請輸入您為第幾位用戶綁定。");//提問為第幾位用戶
				Scanner scanner2 = new Scanner(System.in); //建立給使用者輸入數字的地方
				int num3;   //定義num3
				num3 = scanner2.nextInt();   //num3 為輸入值(第幾位)
				if(num3 <= 30000 ) {System.out.println("您為新用戶優惠加碼300元且為前 30000 人綁定優惠加碼100元並最終金額再多 10%！"); //num3<=30000 的文字回應
					int finalmoney1_1 = (int) ((money + 100 + 300 )*1.1) ; System.out.println("您最終金額為"+finalmoney1_1+"元");}   //回應最終金額
				else if(num3 >30000 ) {System.out.println("您非前30000人綁定，但為新用戶優惠加碼300元並最終金額再多 10%！");//num3>30000 的文字回應
					int finalmoney1_0 = (int) ((money + 300 )*1.1) ; System.out.println("您最終金額為"+finalmoney1_0+"元");}}   //回應最終金額
				else if(num2==0) {     //num2=1 即非新用戶
				System.out.println("您不是新用戶");//文字回應
				System.out.println("請輸入您為第幾位用戶綁定。");//提問是否新用戶
				Scanner scanner2 = new Scanner(System.in); //建立給使用者輸入數字的地方
				int num3;//定義num3
				num3 = scanner2.nextInt();//num3 為輸入值(第幾位)
				if(num3 <= 30000) {System.out.println("您為前 30000 人綁定優惠加碼100元並最終金額再多 10%！");//num3<=30000 的文字回應
					int finalmoney0_1 = (int) ((money + 100 )*1.1) ; System.out.println("您最終金額為"+finalmoney0_1+"元");}//回應最終金額
				else if(num3 > 30000) {System.out.println("您非前30000人綁定，但EE Pay 優惠加碼最終金額再多 10%！");//num3>30000 的文字回應
					int finalmoney0_0 = (int) ((money  )*1.1) ; System.out.println("您最終金額為"+finalmoney0_0+"元");}}}//回應最終金額
						
			else if (num1 == 4) {//如果num1為4是成大銀行信用卡
				System.out.println("您選擇成大銀行信用卡");//文字回應
				System.out.println("請輸入您為第幾位用戶綁定。");//提問為第幾位用戶
				Scanner scanner3 = new Scanner(System.in); //建立給使用者輸入數字的地方
				int num4;//定義num4
				num4 = scanner3.nextInt();//num4 為輸入值(第幾位)
				if(num4 <= 1000 ) {//前 1000 人
				System.out.println("您為前 1000 人綁定。");//num4<=1000 的文字回應
				System.out.println("是否具成大學生身分？"); //提問是否具成大學生身分？
				System.out.println("是請按1 否請按0");//給予選項
				Scanner scanner4 = new Scanner(System.in); //建立給使用者輸入數字的地方
				int num5;//定義num5
				num5 = scanner4.nextInt();//num5為輸入值(是or否)
				if(num5 == 1) {System.out.println("您為前 1000 人綁定優惠加碼5000元且具成大學生身分優惠加碼最終金額多 10%！");//前 1000 人+具成大學生身分的文字回應
					int cfinalmoney1_1 = (int) ((money + 5000 )*1.1) ; System.out.println("您最終金額為"+cfinalmoney1_1+"元");}//回應最終金額
				else if(num5 == 0) {System.out.println("您為前 1000 人綁定優惠加碼5000元！");//前 1000 人的文字回應
					int cfinalmoney1_0 = (int) ((money + 5000 )) ; System.out.println("您最終金額為"+cfinalmoney1_0+"元");}}//回應最終金額
			else if(num4 > 1000 ) {//非前 1000 人
				System.out.println("您非前 1000 人綁定。");//num4>1000 的文字回應
				System.out.println("是否具成大學生身分？");//提問是否具成大學生身分？
				System.out.println("是請按1 否請按0");//給予選項
				Scanner scanner4 = new Scanner(System.in); //建立給使用者輸入數字的地方
				int num5;//定義num5
				num5 = scanner4.nextInt();//num5為輸入值(是or否)
				if(num5 == 1) {System.out.println("您具成大學生身分優惠加碼最終金額多 10%！");//具成大學生身分的文字回應
					int cfinalmoney0_1 = (int) ((money  )*1.1) ; System.out.println("您最終金額為"+cfinalmoney0_1+"元");}//回應最終金額
				else if(num5 == 0) {System.out.println("恭喜您領取五倍券5000元！");//都不是的文字回應
					int cfinalmoney1_0 = (int) (money ) ; System.out.println("您最終金額為"+cfinalmoney1_0+"元");}}}//回應最終金額
		
			else if (num1 == 5) {//如果num1為5是電機支付
				System.out.println("您選擇電機支付");//文字回應
				System.out.println("是否為新用戶？");//提問是否為新用戶
				System.out.println("是請按1 否請按0");//給予選項
				Scanner scanner5 = new Scanner(System.in);//建立給使用者輸入數字的地方
				int num6;//定義num6
				num6 = scanner5.nextInt();//num6 為輸入值(第幾位)
				if(num6 == 1) {//為新用戶時
				System.out.println("您為新用戶。");//文字回應
				System.out.println("是否具成大學生身分？");//提問是否具成大學生身分
				System.out.println("是請按1 否請按0");//給予選項
				Scanner scanner6 = new Scanner(System.in);//建立給使用者輸入數字的地方
				int num7; //定義num7
				num7 = scanner6.nextInt();//num7為輸入值(是or否)
				if(num7 == 1) {System.out.println("您為新用戶優惠加碼+8700元且具成大學生身分優惠加碼最終金額多 2%！");//新用戶+具成大學生身分的文字回應
					int dfinalmoney1_1 = (int) ((money+8700  )*1.02) ; System.out.println("您最終金額為"+dfinalmoney1_1+"元");}//回應最終金額
				else if(num7 == 0){System.out.println("您為新用戶優惠加碼+8700元！");//新用戶的文字回應
					int dfinalmoney1_0 = (int) ((money+8700  )) ; System.out.println("您最終金額為"+dfinalmoney1_0+"元");}}//回應最終金額
		
				else if(num6 == 0) {//非新用戶時
				System.out.println("您非新用戶。");//文字回應
				System.out.println("是否具成大學生身分？");//提問是否具成大學生身分
				System.out.println("是請按1 否請按0");//給予選項
				Scanner scanner6 = new Scanner(System.in);//建立給使用者輸入數字的地方
				int num7; //定義num7
				num7 = scanner6.nextInt();//num7為輸入值(是or否)
				if(num7 == 1) {System.out.println("您具成大學生身分優惠加碼最終金額多 2%！");//具成大學生身分的文字回應
					int dfinalmoney0_1 = (int) ((money)*1.02) ; System.out.println("您最終金額為"+dfinalmoney0_1+"元");}//回應最終金額
				else if(num7 == 0) {System.out.println("恭喜您領取五倍券5000元！");//都不是的文字回應
					int dfinalmoney0_0 = (int) (money) ; System.out.println("您最終金額為"+dfinalmoney0_0+"元");}}}//回應最終金額
			else if (num1 == 6) {//如果num1為6是使用說明
				System.out.println("使用說明：您將會看到六個選項，分別編號1~6 依據您所選擇的領取方式輸入對應的編號，直接在鍵盤上輸入不需移動滑鼠點選");//使用說明
				System.out.println("如果輸入的是1~2即可結算總經額，如果是3~5則依據題目的問題回答是/否(是的代號為1 否的代號為0)");//使用說明
				System.out.println("若看到  請輸入您為第幾位用戶。 請照實輸入您為第個幾用戶綁定，回答完後即可結算總經額。");}//使用說明
				
			}finally {//try後最後一步到finally
					System.out.println("您是否需重新開始一次新的計算？");//提問是否需重新開始一次新的計算
					System.out.println("是請按1 否請按0");}//給予選項
					Scanner scanner7 = new Scanner(System.in);//建立給使用者輸入數字的地方
					int num8;//定義num8
					num8 = scanner7.nextInt();//num8為輸入值(是or否)
					if(num8 == 1) {k=true;}//回答是令k=true
					else if(num8 == 0) {k=false;System.out.println("感謝您的使用！");}//回答否令k=false 並終止程式 回應感謝您的使用
					;}while(k == true);}}//k=true時重來回到do
					
			
		
		
    	 				
			  	
	 



