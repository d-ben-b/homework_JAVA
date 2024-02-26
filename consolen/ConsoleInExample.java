public class ConsoleInExample{
	public static void main(String[] args){
		System.out.print("Please input name of student1:");
		String stu1 = ConsoleIn.readLine();
		System.out.print("Please input Math points of student1:");
		Double stu1_Math = ConsoleIn.readLineDouble();
		System.out.print("Please input Eng points of student1:");
		Double stu1_Eng = ConsoleIn.readLineDouble();
		System.out.print("Please input CS points of student1:");
		Double stu1_CS = ConsoleIn.readLineDouble();
		System.out.print("Please input Music points of student1:");
		Double stu1_Music = ConsoleIn.readLineDouble();

		System.out.println("\n\n\tMath\tEng\tCS\tMusic");
		System.out.println(stu1 + "\t"+stu1_Math+"\t"+stu1_Eng+"\t"+stu1_CS+"\t"+stu1_Music);
	}
}