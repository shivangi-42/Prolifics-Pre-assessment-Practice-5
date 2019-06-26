//java if else
import java.util.*;
import java.time.LocalDate;

 public class prac2{

   static public void main(String name1[]){
//TYPE 1
    String result="1"; 
  int scc=10;
   if((scc=scc+10)==100)
    result="a";
   else if((scc=scc+29)==50)
    result="b";
   else if((scc=scc+200)==10)
    result="c";
   else
     result="f";

//score will be keep on adding result in 249 
 System.out.println(result);

   int marks=20;
   switch(marks){
    case 1:
        System.out.println("hi");
        break;
   case 2:
        System.out.println("hello");
        break;
   default:
        System.out.println("default");
        break;
     }


   int mark=2;
   switch(mark){
   case 1:
        System.out.println("hi");
        break;
   case 2:
        System.out.println("hello");
        
   case 20:
        System.out.println("hiii");
        
case 22:
        System.out.println("hiii");
        break;
   default:
        System.out.println("default");
        
     }
    int a=10,b=20,c=30;

/* shows error
   switch(a){
    case b+c:
      System.out.println(b+c);
        break;

   case 10*7:
      System.out.println(a+b+c);
        break;
   }
*/

switch(a){
    

   case 10*7:
      System.out.println(a+b+c);
        break;
   }


/* we can't use this it will show error
 byte mybyte=10;
switch(mybyte){

  case 1.2:
 System.out.println(23);
 break;
}
  
*/
int bbb=50;
char re='a';
switch(bbb){
    
   case 100: re='b';
   case 50: re='c';
   case 10: re='d';
    break;
   default: re='f';
   }

System.out.println(re);

int daycount=31;

switch(daycount){
 case 28:
  System.out.println("dec");
case 29:
   System.out.println("feb");
   break;
case 30:
   System.out.println("apr");
   break;
case 31:
   System.out.println("jan");
   break;


}

//
}
 }

 








