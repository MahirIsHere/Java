/**
 * Write a description of Part1 here.
 *
 * @author (Mahir)
 * @version (27/5/20)
 */

public class Part2 {
    //have three parameters, one for the DNA string, one for the start codon and one for the stop codon.
public String findSimpleGene(String dna,String startCodon,String stopCodon) {
    //Finds the index position of the start codon “ATG”. If there is no “ATG”, return the empty String.
    // Modify the findSimpleGene method to work with DNA strings that are either all uppercase letters or all lowercase letters.
    if( Character.isUpperCase(dna.charAt(0))) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        } else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
    int start = dna.indexOf(startCodon);
    if (start == -1) {
        return "";
    }

//Finds the index position of the first stop codon “TAA” appearing after the “ATG” that was found. If there is no such “TAA”, return the empty String.
    int stop = dna.indexOf(stopCodon,start+3);
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
    void testSimpleGene() {
     /* DNA with no “ATG”, DNA with no “TAA”, DNA with no “ATG” or “TAA”, DNA with ATG, TAA and the substring between them is a multiple of 3 (a gene), and DNA with ATG, TAA and the substring between them is not a multiple of 3 */
     String dna="CCATCAATAACATGA";
     System.out.println("DNA STRAND IS " + dna);
     String gene=findSimpleGene(dna,"ATG", "TAA");
     System.out.println("Gene is "   + gene);
     dna="CCAATGCAGCGATAC";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna,"ATG", "TAA");
     System.out.println("Gene is "   + gene);
     dna="CTAATCCGGATCCGA";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna,"ATG", "TAA");
     System.out.println("Gene is "   + gene);
     dna="ccagcatgccagtcagctaacag";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna,"ATG", "TAA");
     System.out.println("Gene is "   + gene);
     dna="CCAGCATGCCAGTAGCTAACAG";
     System.out.println("DNA STRAND IS " + dna);
     gene= findSimpleGene(dna,"ATG", "TAA");
     System.out.println("Gene is "   + gene);
    }
}
