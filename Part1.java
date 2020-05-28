/**
 * Write a description of Part1 here.
 * 
 * @author (Mahir) 
 * @version (27/5/20)
 */

public class Part1 {
public String findSimpleGene(String dna) {
    //Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty String.
    int start = dna.indexOf("ATG");
    if (start == -1) {
        return "";
    }

//Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, return the empty String.
    int stop = dna.indexOf("TAA",start+3);
    if(stop == -1) {
        return "";
    }
//If the length of the subString between the “ATG” and “TAA” is a multiple of 3, then return the subString that starts with that “ATG” and ends with that “TAA”.
int inbetween=(stop - start);
if (inbetween%3==0) {
    String result=dna.substring(start,stop+3);
    return result;
}
else {
    return "";
}
}
public void testSimpleGene () {
     /* DNA with no “ATG”, DNA with no “TAA”, DNA with no “ATG” or “TAA”, DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene), and DNA with ATG, TAA and the substring between them is not a multiple of 3 */
     String dna="ABAACABBAATTAA";
     System.out.println("DNA STRAND IS " + dna);
     String gene= findSimpleGene(dna);
     System.out.println("Gene is "   + gene);
     dna="ATGAACABBAABS";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna);
     System.out.println("Gene is "   + gene);
     dna="ABCBACCBA";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna);
     System.out.println("Gene is "   + gene);
     dna="ATGABCBACCBACABBTAA";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna);
     System.out.println("Gene is "   + gene);
     dna="ATGABBDCATAA";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna);
     System.out.println("Gene is "   + gene);
    }
}
