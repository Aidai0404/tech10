import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b= sc.nextLine();
        System.out.println(method(b));
    }
    static String method(String soz){
        String soz1=soz.toUpperCase();
        soz1.trim();
        if (soz1.contains("a")){
            return soz1.substring(soz1.indexOf("a"));
        }else {
            return "JOK";
        }

    }
}