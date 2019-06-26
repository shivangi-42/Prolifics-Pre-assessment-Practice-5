//java if else
import java.util.*;
import java.time.LocalDate;

 public class prac5{

   static public void main(String name1[]){

    String[] program={"outer","inner"};
    outer:
    for(String outer:program)
       for(String inner:program){
            if(inner.equals("inner"))
                     break outer;
            System.out.println(inner); }


      String[] prog={"outer","inner"};
    outer:
    for(String outer:prog)
       for(String inner:prog){
            if(inner.equals("inner"))
                     continue outer;
            System.out.println(inner); }





    }
}

 








