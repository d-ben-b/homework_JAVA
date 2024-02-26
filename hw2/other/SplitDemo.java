public class SplitDemo{
   public static void main(String args[]){
		//宣告String
		String mustSplitString = "A B C D E F G H";
		
		//將String依「空格」分解，並存入宣告的Array中
		String[] AfterSplit = mustSplitString.split(" ");
		
		//印出存有分解後的String的Array內容
		for (int i = 0; i < AfterSplit.length; i++){
			System.out.println(AfterSplit[i]);
		}
    }
}
