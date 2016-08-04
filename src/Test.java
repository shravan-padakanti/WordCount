import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		/*String str = "This is my, first mr program";
		//1. StringTokenizer
		//2. split()
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken()+",1");
		}*/
		/*
		 * This, [1,1,1,1] 
		 * is
		 * my
		 * mr
		 * program
		 */
		int [] values = {1,1,1,1,1};
		//for (int i =0; i<values.length;i++)
		int sum = 0;
		for(int val: values){
			sum = sum + val;
		}
		System.out.println(sum);
	}
	/*
	 * 1. Create the jar
	 * 2. Copy the jar into Ubuntu (NOT INTO HDFS)
	 * 3. Select the input file to process
	 * 4. Copy the input file into HDFS
	 * 5. Run the jar
	 * $ hadoop jar <jarName>.jar <driverClassName> <hdfsInputFilePath> <hdfsOutputDirPath>
	 */

}
