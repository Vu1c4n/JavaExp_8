import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Prime{
    private static final int UPPER_BOUND = 200;
    private static final int LOWER_BOUND = 2;
    public static List<Integer> getPrime(){
        System.out.println("Prime less than: " + UPPER_BOUND);
        List<Integer> ls = new ArrayList<>();
        for(int i = LOWER_BOUND; i< UPPER_BOUND; i+=1){
            boolean flag = true;
            for (int j = 2;j<i;j+=1){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) {ls.add(i);}
        }
        return ls;
    }
    public static void writePrime(){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("./files/PRIME.DAT"));
            for(int i : getPrime()){
                out.write(i+"\t");
            }
            out.close();
            System.out.println("Write Succeed!");
        }
        catch(IOException e){
            System.out.println("Failed!");
        }
    }
    public static void main(String[] args){
        Prime.writePrime();
    }
}