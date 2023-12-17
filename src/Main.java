class Main{
    public static void main(String[] args){
        testPrime();
        testCheckConfig();
        testStudent();
    }
    public static void testPrime(){
        Prime.writePrime();
    }
    public static void testCheckConfig(){
        CheckConfig.check();
    }
    public static void testStudent(){
        Student.input();
        Student.output();
    }
}