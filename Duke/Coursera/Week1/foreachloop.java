import edu.duke.FileResource;

public class  Petname {
  public void runPetname () {
    FileResource f;
    f=new FileResource ("petname.txt");
    for(String line : f.lines()) {
      System.out.println(line);
    }
  }
}
public static void main(String[] args) {
  Petname pn = new Petname();
  pn.runPetname();
}
}
