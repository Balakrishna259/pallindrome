package counter;

import java.util.Scanner;

public class WordCount {
   
	public static void main(String[] args) {
		System.out.println("Enter the sentence");
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			System.out.println(a);s
			WordCount wc = new WordCount();
			wc.count(a);
			Integer in =  sc.nextInt();
		    System.out.println(Integer.toBinaryString(in));
		
		

	}

	public void count(String s) {
		//String s = "sage vissam sage vissam sage";
		
		String[] array = s.split(" ");
		//int count = 0;
		
		for(int i=0;i<array.length;i++) {
			int count1 = 0;
			for (int y=i;y<array.length;y++) {
			if(array[i].equals(array[y])) {
				//count++;	
				count1++;
				
//				array[i] = "";
//				System.out.println("is equal");
			}
//			}
			}
//			}
			System.out.println(array[i]+count1);
		}
		//System.out.println(count);
	}
}
