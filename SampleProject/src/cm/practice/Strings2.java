package cm.practice;

public class Strings2 {
	private static String StringSplit(String str){
		StringBuffer finstr=new StringBuffer();
		String []strsplit=str.split(" ");
		int i=0;
		for(String w:strsplit)
		{
			finstr = finstr.append(w).append(i+1).append(" ");
			i++;
		}
		str=finstr.toString();
		return str;
	}
	
	public static void main(String[] args) {
		String str="this is nice";
		System.out.println(StringSplit(str));
	}

}
