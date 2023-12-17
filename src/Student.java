import java.util.Scanner;
import java.io.*;

public class Student{
    private final int id;
    private final String name;
    private final double[] score;
    private final double sum;
    private static final String DIR = "./files/STUDENT.DAT";

    Student(int id,String n,double[] s){
        this.id = id;
        this.name = n;
        this.score = s;
        this.sum = Student.calSum(s);
    }
    private static double calSum(double[] s){
        double rtn = 0;
        for(double i: s){
            rtn += i;
        }
        return rtn;
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5]; 
        for(int index = 1;index < 6;index += 1){
            System.out.println("Enter Student Info(Index:" + index + ")");
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter name:");
            String name = sc.next();
            double[] score = new double[3];
            for(int j = 0;j<3;j+=1){
                System.out.println("Enter score(" + (j+1) + "):");
                score[j] = sc.nextInt();
            }
            Student temp = new Student(id,name,score);
            students[index-1] = temp;
        }
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(DIR));
            for(Student i : students){
                out.write(i+"\n");
            }
            out.close();
            System.out.println("Write Succeed!");
        }
        catch(IOException e){
            System.out.println("Failed!");
        }
    }
    public static void output(){
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

    @Override
    public String toString(){
        return (
            "name:" + this.name + '\t' +
            "id:" + this.id + '\t' + 
            "score_1:" + this.score[0] + '\t' + 
            "score_2:" + this.score[1] + '\t' + 
            "score_3:" + this.score[2] + '\t' + 
            "score_sum:" + this.sum + '\n'
        );
    }
    public static void main(String[] args){
        // Student.input();
        Student.output();
    }
}