import java.util.Scanner;

public class studentgradecal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("👇👇 Provide The Following Data 👇👇\n  ");

       System.out.print("Provide Your English Marks 👉👉 ");
       int English = sc.nextInt();

       System.out.print("Provide Your Physics Marks 👉👉 ");
       int Physics = sc.nextInt();

       System.out.print("Provide Your Chemistry Marks 👉👉 ");
       int Chemistry = sc.nextInt();

       System.out.print("Provide Your Maths Marks 👉👉 ");
       int Maths = sc.nextInt();

       System.out.print("Provide Your Physical Education Marks 👉👉 ");
       int PhysicalEducation = sc.nextInt();

       int total = English+Physics+Chemistry+Maths+PhysicalEducation;

       System.out.println("\n \n***************************************************************************************************************************************");

       System.out.println("\n \nTotal Marks You Got From 500 Are 👉👉 "+ total+"/500");

       float percentage = (float)(English+Physics+Chemistry+Maths+PhysicalEducation)/5;
       System.out.println("Total Percentage You Got 👉👉 "+percentage);

       if(percentage>=90){
        System.out.println("✨✨ Superb You Got A Grade ✨✨");
       }
       else if(percentage>70 && percentage<89){
        System.out.println("Wow You Got B GRade");
       }
       else if(percentage>50 && percentage<69){
        System.out.println("Good You Got C Grade");
       }
       else if(percentage>34 && percentage<49){
        System.out.println("😥😥 You Got D Grade 😥😥");
       }
       else if(percentage<33){
        System.out.println("😭😭 You Fail 😭😭");
       }
    }
}
