import java.util.Vector;

public class MemoryEater
{
  public static void main(String[] args) throws InterruptedException
  {
    int sleepPeriod=Integer.parseInt(System.getenv("SLEEP_PERIOD"));
    System.out.println("Sleep period is: " + sleepPeriod);
    System.out.println("JAVA_OPTS: " + System.getenv("JAVA_OPTS"));

    Vector v = new Vector();
    while (true)
    {
      int size = 1048576;
      Runtime rt = Runtime.getRuntime();
      if(rt.freeMemory()<size) {
        size = (int)rt.freeMemory()/2;
      }

      byte b[] = new byte[size];
      v.add(b);
      
      System.out.println("free memory: " + rt.freeMemory() + ", total memory: " +rt.totalMemory() + ", max memory: " + rt.maxMemory());
      Thread.sleep(sleepPeriod);
    }
  }
}