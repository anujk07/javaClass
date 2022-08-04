import java.util.*;
import java.lang.*;
import java.io.*;
class Solution {
  public int addDigits(int num) {
     int a,b=0;
      while(num>0){
          a=num%10;
          b +=a;
          num = num/10;
      }
       return b; 
  }
}