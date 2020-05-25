import edu.duke.*;
public class HelloWorld () {
  public void runHello(){
    FileResource res = new FileResource ("hello.txt");
    for (String line : res.lines()) {
      System.out.println(line);
    }
  }
}
