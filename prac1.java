//java if else
import java.util.*;
import java.time.LocalDate;

 public class prac1{

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
 System.out.println(result+":"+scc);

/* shows error
boolean test=false;
 if(test== true)
 else 
  System.out.println("the value is false");
*/
 

//TYPE 2
 boolean test=false;
 if(test== true)
  {
  }
 else 
  System.out.println("the value is false");

//TYPE 3
int s=100;
if((s=s+10)>110);

//TYPE 4
/*throws compile error

String name="lion";
int sc=100;
if(name.equals("lion"))
 sc=200;
name="larry";
else
 sc=129;
*/

//TYPE 5
String nam="lion";
if(nam.equals("lion"))
 for(int i=0;i<3;i++)
   System.out.println(i);

//TYPE 6
int score=100;
boolean allow=false;
String name="lion";

if((score ==100) && (name=="lion") &&( score<=100 || allow)){
 System.out.println("hii");
}


//TYPE 7
boolean all=false;
//assign the true first and than evaluate
if(all=true)
 System.out.println("hii all");

int aa=100;
  if(aa>200)
   if(aa<400)
     if(aa>300)
       System.out.println(1);
     else
       System.out.println(2);
   else 
      System.out.println(3);

/*  this will not compile

     long bill=2000;
    int discount=bill>1000?bill-100:bill -200;
    System.out.println(discount);
   */ 
int bill=1000;
int qty=10;
    int discount=(bill>1000)?(qty>11)?10:9:5;
    System.out.println(discount);
 
}
 }

 








