/**
 * Write a description of Part3 here.
 *
 * @author  Mahir
 * @version 29.05.20
 */
public class Part3 {
//Write the method named twoOccurrences that has two String parameters named stringa and stringb
public boolean twoOccurence(String stringa,String stringb) {
    //This method returns true if stringa appears at least twice in stringb, otherwise it returns false.
    int index1=stringb.indexOf(stringa); //first search
    if(index1 !=-1) { //valid
    int index2=stringb.indexOf(stringa,index1+1); //second search
    if(index1!=-1) {
    return true;
}
}
else {
    return false;
}
return false;
}
 //Write the void method named testing that has no parameters
void testing() {
        System.out.println(twoOccurence("by", "A story by Abby Long"));
        System.out.println(twoOccurence("a", "banana"));
        System.out.println(twoOccurence("atg", "ctgtatgta"));

        System.out.println(lastPart("an", "banana"));
        System.out.println(lastPart("zoo", "forest"));
        System.out.println(lastPart("zoo", "farzookeeper"));
    }
    // lastPart that has two String parameters named stringa and stringb.
public String lastPart(String stringa,String stringb) {
  //This method finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa. If stringa does not occur in stringb, then return stringb.
    if(stringb.indexOf(stringa)!=-1) {
        int index = stringb.indexOf(stringa);
        return stringb.substring(index+stringa.length(),stringb.length());
    }
    else {
        return stringb;
    }
  }
}
