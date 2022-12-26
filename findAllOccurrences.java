
public class findAllOccurrences {
  // This method returns an integer indicating how many times stringa appears in stringb.
  //each occurrence of stringa must not overlap with another occurrence of it. 
  public int howMany(String a, String b){
    int count=0;
    int firstIndex =0;
    while(true){
      //get the first occurance of string a in b
      firstIndex=b.indexOf(a);
      //increment the count for string a occurances in b.
      count=count+1;
      //if ypu got to the end of string b stop.
      if(b.isEmpty()){
        break;
      }
      //else update firstindex to get the next occurance.
      firstIndex= b.indexOf(a,firstIndex)+ a.length();
    }
    return count;
  } 
  //method to test g=howmany by calling it with different strings.
  public void testHowMany(){
    String a ="GAA";
    String b= "ATGAACGAATTGAATC";
    int result = howMany(a,b);
    System.out.println(a);
    System.out.println(b);
    System.out.println(result);
    a ="AA";
    b= "ATAAAA";
    result = howMany(a,b);
    System.out.println(a);
    System.out.println(b);
    System.out.println(result);
  }    
  public static void main(String[] args){
    findAllOccurrences pr= new findAllOccurrences();
    pr.testHowMany();

  }        
}
