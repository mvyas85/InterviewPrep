package removeComments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	Input : 

		“// int a is here 
		int  a = 1;

		int b = 2 ; // int b here “


		Output : 

		int a = 1; 

		int b = 2; 

		====
		
		
		BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
		
		String line = br.readLine();
		
		while(line != null){
			
		}
 */
public class RemoveComment {
	static String eol = System.lineSeparator();
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
			
			String line = br.readLine() ;	
			while(line !=null){
				sb.append(line);
				sb.append(System.lineSeparator());
				
				line = br.readLine() ;		
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		System.out.println(sb.toString());
		System.out.println("Output file::\n"+removeComments(sb.toString()));
		
		
//		String str="// int a is here "+eol
//				+ "int  a = 1;"+eol
//				+ "int b = 2 ; // int b here ";
//		
//		
//		System.out.println("Output file::\n"+removeComments(str));
	}

		public static String removeComments(String str){
			String eol = System.lineSeparator();
			StringBuilder newStr= new StringBuilder("");
			String[] strs = str.split(eol);
			
			for(int i=0;i<strs.length;i++)
			{
				if(strs[i].indexOf("//") == -1){
					newStr.append(strs[i]);
				}else{
					int index = strs[i].indexOf("//");
					newStr.append( strs[i].substring(0,index));
				}
				newStr.append(eol);
			}	
			return newStr.toString();
		}
}
