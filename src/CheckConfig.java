import java.io.*;

public class CheckConfig{
    private static final String DIR = "C:/CONFIG.SYS";
    public static void check(){
        try{
            File file = new File(DIR);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String l;
            while ((l = br.readLine())!=null){
                System.out.println(l);
            }
        }
        catch(IOException e){
            System.out.println("Failed!");
        }
    }
    public static void main(String[] args){
        CheckConfig.check();
    }
}