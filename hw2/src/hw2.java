class student {
	String name;//�w�qname
	String attend;//�w�q attend
	int week;//�w�q week
	int check;//�w�q check
	
	void Setstudent(String inName, String inAttend, int inWeek, int inCheck){//�w�q student �ƾ� 
			this.name = inName; //�w�qinName���^�ǭ�
			this.attend = inAttend;//�w�qinAttend���^�ǭ�
			this.week = inWeek;//�w�qinWeek���^�ǭ�
			this.check = inCheck;//�w�qinCheck���^�ǭ�
	}
	String getName(){
		return this.name;//getname�����oname
	}
	String getattendance(){
		return this.attend;//getattend�����oattend
	}
	int getcheck(){
		return this.check;//getchedck�����ocheck
	}
	int getweek(){
		return this.week;//getweek�����oweek
	}
	void setName(String inName){
		this.name = inName;//name�^�ǵ�this name
	}
	void setWeek(int inWeek){
		this.week = inWeek;//�^��week��this week
	}
	void setAttend(String inAttend){
		this.attend = inAttend;//attend�^�ǵ�this attend
	}
	void setCheck(int inCheck){
		this.check = inCheck;//�^��check��thischeck
	}

	public void showTitle(){
		System.out.println("�W�r          " + "�P��" + "   �X�u" + "  �n�O/�R��" ); //�إ߼��D
	}
	public void showData(){
		System.out.printf("%-15.15s %d    %-6.6s %d \r\n",this.name,this.week,this.attend ,this.check);//�إ߿�J��
		
	}
}

public class hw2 {
	static int Nowweek = 8; //�̤j�g�ƹw�]��8
	public static int nMaxStudent = 1000;//�]�w�̤j�� �ǥͭӼ�*�̤j�g�Ʀܤֻݭn80��
	public static int nStudentIndex = 0  ; //�C�@�Ӹ�ƪ��s�� �w�]0
	public static String Sep = " " ; //�ΨӤ��Ϋ��O
	public static student AllStudent[] = new student[nMaxStudent] ;//�إ�array ����������ǥ�
	
	public static void main(String[] args) {//main
		System.out.println("�w��A�n");
		boolean k = true; //do while �һݪ��Ѽ� 
		String inData = "" ; //�w�q inData
		int i ; //�w�q i
		int  nIndex ;  //�w�q index
		nStudentIndex = 0  ;//�C�@�Ӹ�ƪ��s�� �q0�}�l
		for(i=0; i < nMaxStudent ;i ++){
			AllStudent[i] = new student();//�إ�array ����������ǥ�
			AllStudent[i].setCheck(0) ;//�w�]�C�@����ƬҬ��R�������A
		}
		ShowMsg1();//�t�δ���
		String cmd ;//�w�qcmd
		do{//do loop
			cmd = ConsoleIn.readLine();// cmd ����J�����O
			if (cmd.contains("edit")) 
			{//cmd �]�tedit
				EditStudent(cmd);//����EditStudent()
				
			}else
			if (cmd.contains("show all"))
				{//cmd �]�tshow all
				ShowAllStudent();//����ShowAllStudent()
			}else
			if (cmd.contains("--help")) 
			{//cmd �]�t--help
				ShowMsg1();//����ShowMsg1()
			}else 
			if (cmd.contains("exit")) //cmd �]�texit
			{
				System.out.println("�P�±z���ϥΡI");//�^���ϥΪ�
				k = false ;;//����loop
				System.exit(0);//�פ�{��
			}else
			if (cmd.contains("add new week"))
			{//cmd �]�tadd new week
				addNewWeek();//����addNewWeek()	
			}else
			if (cmd.contains("show weeks")) 
			{//cmd �]�tshow weeks
				showWeek();//����showWeek()
			}else
			if (cmd.contains("del last week")) 
			{//cmd �]�tdel last week
				delweek();//����delweek()
			}else
			if (cmd.contains("search") && cmd.contains("rate"))
			{//cmd �]�tsearch�M rate
				searchRate(cmd);//����searchRate()
			}else
			if (cmd.contains("search")) 
			{//cmd �]�tsearch
				searchPeople(cmd);//searchPeople()
			}
			System.out.println("�O�_�ݦA����J���O 1���O 0���_");
			int l = ConsoleIn.readLineInt();
			if (l == 1) 
			{//��J1��
				k = true;
			}else 
			if(l == 0) 
			{//��J0��
				System.out.println("�P�±z���ϥΡI");//�^���ϥΪ�
				k = false ;;//����loop
				System.exit(0);//�פ�{��
			}
			
			
		}while( k == true );//do while loop
		
	}
	public static void ShowMsg1()//�w�qShowMsg1()
	{
			System.out.println("edit �H week -p/-a/-l/-e 1/0 ");//���O�о�
			System.out.println("  �o�ӫ��O�O�n�O�Y�@�ӤH�Y�@§�����X�ʮu���p�C");//���O�о�
			System.out.println("  �g�ƪ��n�O�� 1 �� 10�C");//���O�о�
			System.out.println("  -p�G�X�u\r\n"
							+  "  -a�G�ʮu\r\n"
							+  "  -l�G���\r\n"
							+  "  -e�G���h\r\n"
							+  " 1/0: 1�N��n�O�A0�N��R���C\r\n");//���O�о�
			
			System.out.println("search week �H\r\n"+
							   "  �d�ߤH�b�Ӷg���X�u���p��ܱ��p�C\r\n");//���O�о�
			
			System.out.println("--help\r\n"
							+  "  �C�X�Ҧ����O���A�û����U�ӫ��O���\��C\r\n");//���O�о�
			
			System.out.println("search �H -p/-a/-l/-e rate\r\n"
					          +"  �C�X���w��H���`�X�u�v�`�ʮu�v/�`���v/�`���h�v�C\r\n");//���O�о�
			
			System.out.println("show all\r\n"
					         + "  ��ܩҦ��ǥͦb�Ҧ��g�����X�ʮu�O���C\r\n");//���O�о�
			
			System.out.println("add new week\r\n"
					          +"  �s�W�@�g�������C\r\n");//���O�о�	
			System.out.println("del last week\r\n"
							+  "  �R���̫�@�g�������A�]�t���n�O���g���C\r\n");//���O�о� 
			System.out.println("show weeks\r\n"
							+  "  ��ܥثe�������g���A�]�t�|���n�O���g���A�]�N�O�ثe�i�H�n�O���g�����̤j�W����\r\n");//���O�о�
			System.out.println("exit\r\n"
							+  "  �h�X�t�ΡA�������O��J");//���O�о�
			System.out.println("\r\n�п�J�������O : \r\n");//���ܨϥΪ̿�J���O
     
    }
	public static void EditStudent(String sIn)//�w�qEditStudent(String sIn)  sIn���һݪ��ܼ�
	{
		String[] AfterSplit ;//�w�qAfterSplit
		String name ;//�w�qname
		int week=0 ;//�w�qweek
		String attendance ;//�w�qattendance
		int check=0 ;//�w�qcheck
		String temp ;//�w�qtemp
		int x = 0 ;//�w�qx
		int y = 0 ;//�w�qy
		// edit , name , weak , attendance , Add/delete 
		AfterSplit = sIn.split(Sep) ;//�NsIn���}
		if (AfterSplit.length == 5)//�ˬdedit�����O�O�_���T
		{
			name = AfterSplit[1];//index 1 ��name
			temp = AfterSplit[2];//index 2 ��temp
			week=Integer.parseInt(temp);//temp�ରweek
			attendance = AfterSplit[3];//index 3 ��name
			temp = AfterSplit[4];//index 4 ��temp
			check=Integer.parseInt(temp);//temp�ରcheck
			for (int i = 0; i < nStudentIndex; i++) 
			{//for loop
				if ((name.compareTo(AllStudent[i].getName())==0) && 
				(week==AllStudent[i].getweek()) && 
				(AllStudent[i].getcheck()== check )&&
				(check == 1)) //�ư����Ƶn�O
				{
					System.out.println("�Фŭ��Ƶn�O!");//�^���ϥΪ�
					x = 1;//x=1�ɤ��i�n�O
				}else if((name.compareTo(AllStudent[i].getName())==0) && 
				(week==AllStudent[i].getweek()) && 
				(attendance.compareTo(AllStudent[i].getattendance())==0 ) && 
				(check == 0))//�R���ؼ�
				{
					x = 2;//x=2�ɤ��i�n�O
					AllStudent[i].setCheck(0);
				}else
				{
					x = 0;
				}
			}
			if ((attendance.compareTo("-p")==0 ) || 
			(attendance.compareTo("-a")==0 ) ||
			(attendance.compareTo("-l")==0) ||
			(attendance.compareTo("-e")==0)) //�ư��X�ʮu���~
			{
				y = 0;
			}else 
			{
				y = 1;//y=1�ɤ��i�n�O
			}
			
			if (y == 1 ) 
			{
				System.out.println("�X�ʮu���~!");//�^���ϥΪ�
			} 	
			if ( (true == AddStudentName(8,name)) && 
			(Nowweek >= week) &&
			(x == 0) && 
			(y == 0))//������������~�i�n�O �W�l�`��<8 �n�O�g��<�̤j�g�� �D���Ƶn�O �D�X�ʮu���~
			{
				AllStudent[nStudentIndex].setName(name);//�n�Oname
				AllStudent[nStudentIndex].setWeek(week);//�n�Oweek
				AllStudent[nStudentIndex].setAttend(attendance);//�n�Oattendance
				AllStudent[nStudentIndex].setCheck(check);//�n�O or �R��
				System.out.println("�W�l          " + "�P��" + "   �X�u" + "  �n�O/�R��" );//�^�����D
				AllStudent[nStudentIndex].showData();//����showData
				nStudentIndex += 1 ;//�s���ܤU�@��
			}
			else if(x == 2)
			{
				System.out.println("�w�R��!");
			}
			else
			{
				System.out.println("�Ӧh�W�r�ζg�Ƶn�O�ӫ᭱!");//�^���ϥΪ�
			}
		}else
			{
			System.out.println("edit ���O���~ ");//���O���~�ɪ��^��
			System.out.println("edit �H week -p/-a/-l/-e 1/0 ");//���O���~�ɪ��^��
			System.out.println("  �o�ӫ��O�O�n�O�Y�@�ӤH�Y�@§�����X�ʮu���p�C");//���O���~�ɪ��^��
			System.out.println("  �g�ƪ��n�O�� 1 �� 10�C");//���O���~�ɪ��^��
			System.out.println("  -p�G�X�u\r\n"
							+  "  -a�G�ʮu\r\n"
							+  "  -l�G���\r\n"
							+  "  -e�G���h\r\n"
							+  " 1/0: 1�N��n�O�A0�N��R���C\r\n");//���O���~�ɪ��^��
			}
    }
	
	public static void ShowAllStudent()//�w�qShowAllStudent()
	{
		int i ;//�w�qi
		boolean nTitle ; //�w�q nTitle
		nTitle = false ;//�w�]false 
		AllStudent[0].showTitle();//����showtitle
		for(i=0; i < nStudentIndex ; i++)
		{
			if ( AllStudent[i].getcheck() == 1 )//�C�@���Ҭ��n�O���A
			{
				AllStudent[i].showData();//����showData
			
			}
		}
	}
	
	public static boolean AddStudentName(int nMaxName,String inName)//�w�qAddStudentName
	{
		int i,j,nNameListIndex ,nNewName;//�w�q�U�ѼƬ�int
		String sNameList[] = new String[100] ; //�NNameList�]���̤j100��
		String sNowName ; //�w�qsNowName
		nNameListIndex = 0 ; //nNameListIndex�w�]��0
		// get all name into list 
		for(i=0; i < nStudentIndex ; i++)
		{
			if ( AllStudent[i].getcheck() == 1 )//�p�G���O���n�O���A
			{
				sNowName = AllStudent[i].getName() ;//nowname���ӵ���ƪ�name
				if( nNameListIndex == 0 )//namelist���Ū����A
				{
					sNameList[nNameListIndex]= sNowName ;//�s�JNowName��AllStudent[i]
					nNameListIndex += 1 ; //nameList ��U�@��
				}else//namelist�����Ū����A
				{
					nNewName = 0 ; 
					for(j=0;j<nNameListIndex;j++)//�P�_�C�@��namelist
					{
						if( sNowName == sNameList[j] )//sNowName��namelist�䤤���@��(�ª�)
						{
							nNewName = 0 ; //���[�Jnamelist
							break ; 
						}else
						{
							nNewName = 1 ; //�[�Jnamelist
						}
					}
					if( nNewName == 1 )
					{
							sNameList[nNameListIndex]= sNowName ;//�s�JNowName��AllStudent[i]
							nNameListIndex += 1 ;// nameList ��U�@��
					}
				}
			}
		}
		
		nNewName = 0 ;  //nNameListIndex�w�]��0
		for(i=0; i < nNameListIndex ; i++)
		{//�P�_�C�@��namelist
			if ( inName.compareTo(sNameList[i]) == 0 )
			{//��J�ȩMnamelist�ۦP
				return true ;//�P�_���¼ƾ�
			}else
			{
				nNewName = 1 ; //�P�_���s�ƾ�
			}
		}
		if( nNewName == 1 )
		{//�s�ƾ�
			if(( nNameListIndex+1) > nMaxName )
			{//�s�ƾڬO�_�W�L�̤j�W��
				return false ;//�W�L�̤j�ǥͼƤ��i�[�Jedit
			}
		}
		return true ;
	}
	public static void addNewWeek()
	{//�w�qaddNewWeek(maxWeek���g�ƤW��)
			if(Nowweek<10) 
			{//�p�G�C�@�����O�X�z���ƾ�
					Nowweek += 1;//�g�ƤW��+1(����)
					System.out.print("�̤j�g�ƴ��ɬ�" + Nowweek + "\r\n");//�^���ϥΪ�
			}else
				{
					System.out.println("�w�F�g�ƤW�� 10");//��L���p
				}		
	}
	public static void showWeek() {//�w�qshowWeek
		System.out.print("�̤j�g�Ƭ�" + Nowweek + "\r\n");//�^���ϥΪ�
	}
	public static void delweek() 
	{//�w�qdelweek
		for (int i = 0; i < nStudentIndex; i++) 
		{
			if(AllStudent[i].getweek() == Nowweek ) {//�N�C�@����week���̫�@�P���R��
				AllStudent[i].setCheck(0);//�R��
			}
		}if (Nowweek > 0){
			Nowweek -= 1;//�̤j�g��-1
			System.out.print("�̤j�g���ܬ�" + Nowweek + "\r\n");//�^���ϥΪ�
		}
		else if ( Nowweek == 1 || Nowweek < 1) {//�קK�t�g��
			System.out.print("�g�Ƥw�F�U��!");//�^���ϥΪ�
		}
		
	}
	public static void searchPeople(String sIn) 
	{//�w�qsearchPeople
		String[] AfterSplit ; //�N���O���}
		int week ;//�w�q�ܼ�
		String name;//�w�q�ܼ�
		String temp;//�w�q�ܼ�
		int x = 0;//�w�q�ܼ�
		String attendance = null ;
		AfterSplit = sIn.split(Sep);//��Sep���}���O
		if(AfterSplit.length == 3) 
		{//���O���ץ��T
			temp = AfterSplit[1];//temp ��index = 1�����
			week = Integer.parseInt(temp);//temp�ରweek
			name = AfterSplit[2];//name ��index = 2�����
			for (int i = 0; i < nStudentIndex; i++) {
				if(name.compareTo(AllStudent[i].getName()) == 0  && week == AllStudent[i].getweek() && AllStudent[i].getcheck() == 1) 
				{//���@�Ҥ@�˪��ƾ�
					attendance = AllStudent[i].getattendance();//���attendance
					x = 1;
					break;
				}else
				if(name.compareTo(AllStudent[i].getName()) == 0 && week != AllStudent[i].getweek())
				{//�����H���S�n�O
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
				
				System.out.println(name + "�b�өP���X�u���p��" + attendance);//�^���ϥΪ�
			}else
			if( x == 2 )
			{
				System.out.printf("���H�b��%d�P�S���n�O\r\n",week);//�^���ϥΪ�	
			}else
			if( x == 3 )
			{
				System.out.println("�d�L���H!");//�d�L����ơA�^���ϥΪ�
			}
		}else {//���O���~�ɪ��^��
				ShowMsg1();
				}	
	}
	public static void searchRate(String sIn) 
	{//�w�q searchRate
		String[] AfterSplit ;//�w�qAfterSplit�N���O���}
		String name;//�w�q�ܼ�
		String attendance;//�w�q�ܼ�
		AfterSplit = sIn.split(Sep);//�N���O���}
		int times = 0 , totaltimes = 0;//�w�q�ܼ� times �����l totaltimes������
		String a = null;//a ���^�����ﶵ �w�]��null
		if(AfterSplit.length == 4) 
		{//���O���ץ��T
			name = AfterSplit[1];//name ��index = 1�����
			attendance = AfterSplit[2];//attendance ��index = 2�����
			for (int i = 0; i < nStudentIndex; i++) 
			{
				if(name.compareTo(AllStudent[i].getName()) == 0 && attendance.compareTo(AllStudent[i].getattendance())==0 && AllStudent[i].getcheck() == 1) 
				{
					times ++;//�P�_��ƬO�_���O�n���A�íp����l�`��
				}else if(name.compareTo(AllStudent[i].getName()) != 0)
				{
					System.out.println("�d�L���H!");//�d�L���H���^��
				}else 
				{
					continue;
				}
			
			}			
			for (int i = 0; i <nStudentIndex; i++) 
			{
			if (name.compareTo(AllStudent[i].getName()) == 0 && AllStudent[i].getcheck() == 1) 
				{
				totaltimes++;//�H�W�l�X�{���Ƨ@������
				}
			}
		if(totaltimes != 0) 
		{//�h��������0�����p
			int Rate = 100*times/totaltimes;//�۰��åH100�����Φ��x�s
			if (attendance.compareTo("-p") == 0) 
			{
				a = "�X�u�v\r\n";//����O��-p   a = �X�u�v
			}else if (attendance.compareTo("-a") == 0) 
			{
				a = "�ʮu�v\r\n";//����O��-a   a = �ʮu�v
			}else if (attendance.compareTo("-l") == 0) 
			{
				a = "���v\r\n";//����O��-l   a = ���v
			}else if (attendance.compareTo("-e") == 0) 
			{
				a = "���h�v\r\n";//����O��-e   a = ���h�v
			}else 
			{//�D -p -a -l -e �����p
				System.out.println("search ���O���~ ");
			}
			System.out.printf(name + "���`%s��%d%%" + "\r\n",a,Rate);//�^���ϥΪ�
		}else if (totaltimes == 0) 
		{
			System.out.println("�d�L���H! �L�k�p��\r\n");//������0�ɪ��^��
		}
		}else 
		{
			ShowMsg1();
		}

	}
}

