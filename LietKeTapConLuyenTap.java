import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LietKeTapConLuyenTap {
    static ArrayList<String> list;
    static int a[];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            list=new ArrayList<>();
            int len=sc.nextInt();
            a=new int[len+1];
            String s=sc.next();
            quaylui(1,s,len);
            Collections.sort(list);
            for(String tmp:list){
                System.out.print(tmp+" ");
            }
            System.out.println();
        }
    }

    private static void quaylui(int i, String s, int len) {
        for(int j=0;j<=1;j++){
            a[i]=j;
            if(i==len) xuly(s,len);
            else quaylui(i+1,s,len);
        }
    }

    private static void xuly(String s,int len) {
        String tmp="";
        for(int i=1;i<=len;i++){
            if(a[i]==1)
                tmp+=s.charAt(i-1);
        }
        list.add(tmp);
    }
}
