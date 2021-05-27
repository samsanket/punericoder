package general;



public class Che {
    public static void main(String args[]) throws Exception {
    Runtime r = Runtime.getRuntime();
    Process p = null;
    try {
    p = r.exec("notepad");
    p.waitFor();
    } catch (Exception e) {
    System.out.println("Error executing notepad.");
    }
    System.out.println("Notepad returned " + p.exitValue());
    }
    }