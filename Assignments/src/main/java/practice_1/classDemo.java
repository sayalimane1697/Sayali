package practice_1;

import org.openqa.selenium.WebDriver;

import package_demo.demo_interface;

public  class classDemo extends demo_interface{

	public static WebDriver driver;

	public static void main(String[] args){
		
		classDemo c=new classDemo();
//		c.data();
//		c.data(2);
		c.getData();
		
	}
	
//	public void data() {
//	System.out.println("child class override");
//}

	
	public void getData() {
	 int a[][] = new int[2][3];
	 a[0][0]= 0;
	 a[0][1]= 1;
	 a[0][2]= 2;
	 a[1][0]= 3;
	 a[1][1]= 4;
	 a[1][2]= 5;
	 	System.out.println(a[1][1]);
	 
	 String b [][] = {{"add","substract"},{"multiply","divide"}};
		System.out.println(b[0][1]);
	 
	 
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
		
/* To find min/max no from 3*3 matrix
  6  8  -4
  2  11  6
  9  -1  22				
*/		
//	int n[][]= {{6,8,-4},{2,11,6},{9,-1,22}};
//	int min=n[0][0];
//	int max=n[0][0];
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 3; j++) {
//			if (min > n[i][j]) // to find max no- < and for min no- >
//			{
//				min = n[i][j];
//			}
//
//			if (max < n[i][j]) {
//				max = n[i][j];
//			}
//		}
//	}
//	System.out.println(max);
//	System.out.println(min);
//  }
	
	
/* to find max no from perticular column	
  6   8  4
  2  11  6
  9  -1  3	
*/		
//    int n[][] = { { 6, 8, 4 }, { 2, 11, 6 }, { 9, -1, 3 } };
//    int min = n[0][0];
//    int column=0;
//    for(int i=0;i<3;i++)
//    {
//		for(int j=0;j<3;j++)
//		{
//			if(min > n[i][j])        //to find max no- <  and for min no- >
//			{
//				min=n[i][j];
//				column=j;            //this line is used for finding max no from perticular column (1)
//			}
//		}	
//    }
//	    int max=n[0][column];          //this line is used for finding max no from perticular column (2)
//	    int k=0;
//	    while(k<3) 
//	    {
//	        if(n[k][column]>max)
//	        {
//		        max=n[k][column];
//	        }
//	        k++;
//	    }
//	    System.out.println(max);
//	    System.out.println(min);
//  }
	
}	

