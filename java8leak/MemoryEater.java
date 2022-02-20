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
      byte b[] = new byte[1048576];
      v.add(b);
      Runtime rt = Runtime.getRuntime();
      System.out.println("free memory: " + rt.freeMemory() + ", total memory: " +rt.totalMemory() + ", max memory: " + rt.maxMemory());
      Thread.sleep(sleepPeriod);
    }
  }
}