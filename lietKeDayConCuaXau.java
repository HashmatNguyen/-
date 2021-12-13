import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lietKeDayConCuaXau {
    static int b[],n;
    static String s;
    static ArrayList<String> list;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            b=new int[20];
            list=new ArrayList<>();
            n=sc.nextInt();
            s=sc.next();
            quaylui(1);
            Collections.sort(list);
            for(String a:list) System.out.print(a+" ");
            System.out.println();
        }
    }

    private static void quaylui(int i) {
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }

    private static void xuly() {
        String result="";
        for(int k=1;k<=n;k++)
            if(b[k]==1) result+=s.charAt(k-1);
        list.add(result);
    }
}
