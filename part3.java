

public class part3 {
  // This method returns true if stringa appears at least twice in stringb, otherwise it returns false. 
  public String twoOccurrences (String a, String b){
    int startIndex =0;
    int endIndex =0;
    //get ength of string a
    int length = a.length();
    String result = "";
    //get the first occurance of a in b
    startIndex = b.indexOf(a);
    //if a exists in b 
    if(startIndex != -1){
       //get the seconf occurance of a after the first one
       endIndex= b.indexOf(a, startIndex + length);
     //if a exists twice in b
     if (endIndex != -1){
       result = "true";
     }
     else {
        result = "false";
     }
    }
    return result;
  }
  //This method finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa.
  public String lastPart (String a, String b){
    int startIndex = 0;
    String result = "";
    int lengthA = a.length();
    int lengthB = b.length();
    startIndex= b.indexOf(a);
    if(startIndex != -1){
      result= b.substring(startIndex+lengthA, lengthB);
    }
    else {
       result = b;
    }
    return result;
  }
  //method to test the previous two
  public void testing(){
    String a = "by";    
    String b = "A story by Abby Long";
    System.out.println(" string a IS " + a);
    System.out.println(" string b IS " + b);
    String result = lastPart (a,b);
    System.out.println("result IS " + result);
    a = "zoo"; 
    b = "forest";
    System.out.println(" string a IS " + a);
    System.out.println(" string b IS " + b);
    result = lastPart (a,b);
    System.out.println("result IS " + result); 
    a = "an";
    b = "banana"; 
    System.out.println(" string a IS " + a);
    System.out.println(" string b IS " + b);
    result = lastPart (a,b);
    System.out.println("result IS " + result); 
  }
  public static void main(String[] args){
    part3 pr = new part3();
    pr.testing();
  }
}
