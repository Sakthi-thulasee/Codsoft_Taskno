import java.util.Scanner;
class student
{
		Scanner s=new Scanner(System.in);
		//Variable Declaration
		int n,maxmarks,total,average,mark[];
		double percentage;
		//Function used to Get Input from the users
		void gets()
		{
			System.out.println("Enter tha name of the student:");
			String name=s.nextLine();
			System.out.println("enter the no.of subjects:");
			n=s.nextInt();
			String sub[]=new String[n];
			s.nextLine();
			System.out.println("enter the name of the subjects:");
			for(int i=0;i<n;i++)
			{
			sub[i]=s.nextLine();
			}
			System.out.println("enter maximum marks for each subject:");
			maxmarks=s.nextInt();
			System.out.println("enter the mark for each subject:");
			mark=new int[n];
			for(int i=0;i<n;i++)
			{
			mark[i]=s.nextInt();
			}	
		}
		//Function used to calculate total,average percentage
		void calculate()
		{
			total=0;
			for(int i=0;i<n;i++)
			{
			total+=mark[i];
			}
			average=total/n;
			double maximummarks=(double)maxmarks*n;
			percentage=(total/maximummarks)*100;
			
		}
		//Function used to display Total,Average Percentage,Grade
		void display()
		{
			System.out.println("Total is: " +total);
			System.out.println("Average percentage is: "+percentage);
			if(percentage>=90 && percentage<100)
			{
			System.out.println("You have secured S grade");
			}
			else if(percentage>=80 && percentage<90)
			{
			System.out.println("You have secured A+ grade");
			}
			else if(percentage>=70 && percentage<80)
			{
			System.out.println("You have secured A grade");
			}
			else if(percentage>=60 && percentage<70)
			{
			System.out.println("You have secured B grade");
			}
			else if(percentage>=50 && percentage<60)
			{
			System.out.println("You have secured C grade");
			}
			else
			{
			System.out.println("Failed");
			}
		}
} class StudentGradeCalculation
{
	public static void main(String arg[])
	{
		student ob=new student();
		ob.gets();
		ob.calculate();
		ob.display();
	}
}

		

