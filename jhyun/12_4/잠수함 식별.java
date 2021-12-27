import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().trim();
    String reg = "(100+1+|01)+";
    System.out.println(str.matches(reg) ? "SUBMARINE" : "NOISE");
  }
}