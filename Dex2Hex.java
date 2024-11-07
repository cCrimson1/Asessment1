import java.util.Scanner;

class Dec2Hex
{
public static int Arg1;
    public static void main(String args[])    {
        Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

	//test for jenkins

System.out.println("Hello World");

//test for sonarqube again

System.out.println("SonarQube is working");

//another test for sonarqube

System.out.println("SonarQube working");

//another test again

System.out.println("SonarQube working");

//another test

System.out.println("SonarQube working");


//another test 


System.out.println("SonarQube working");


//another test, last for the day

System.out.println("SonarQube working"); 


//new test new day 

System.out.println("SonarQube working");

//no print test

//another no test

//another test

//another test

//another test

//another test

//another test


//another test


   }



}





