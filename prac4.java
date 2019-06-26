//java if else
import java.util.*;
import java.time.LocalDate;

 public class prac4{

   static public void main(String name1[]){

    for(int j=10;j<15;j++){
      System.out.println(j);
    }


    ArrayList<String> exam=new ArrayList<String>();

    exam.add("java");
    exam.add("oracle");

    ArrayList<String> level=new ArrayList<String>();
    
    level.add("basic");
     level.add("advance");


    ArrayList<ArrayList<String>> le=new ArrayList<ArrayList<String>>();
    le.add(exam);
    le.add(level);
    for(ArrayList<String> aa :le)
      for(String element :aa)
        {
           System.out.println(element);
        }


//do while

  /*This will keep on executing as the condition is alwa
 satisfied

 boolean exit=false;
    do{
 
   
  
     }while(exit==false);
*/


   boolean exit=false;
    do{
 
   
  
     }while(exit==true);


  int num=7;
  boolean divisible7=true;


   /* This will execute infinite times
   do{
     System.out.println("this number"+num);
     if(num%7==0)
      divisible7=false;

    }while(divisible7==false);
  */

/*
 do{



}while();
 */  


//TYPE BREAK
    String[] program={"paul","shreya"};
    for( String name: program)
    {
      if(name.equals("shreya"))
      break;
     System.out.println(name);
    }
//TYPE CONTINUE
   String[] prog={"paul","shreya","GIRL"};
    for( String name: prog)
    {
      if(name.equals("shreya"))
      continue;
     System.out.println("hii"+name);
    }

    }
}

 








