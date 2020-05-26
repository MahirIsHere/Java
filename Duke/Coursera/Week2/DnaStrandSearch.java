//snippet

/*
ATG starts,TAA ends and everything in better and including is a gene";
*/

int Startpos =dna.indexof("ATG");
if (Startpos=-1)//no ATG
{
  return "";
}
int Endpos=dna.indexof("TAA",Startpos+3);
if (Endpos=-1)// no TAA
{
  return "";
}
string result=dna.substring(Startpos,Endpos+3);
return result;
