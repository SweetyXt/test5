
import java.util.Scanner;
//编写程序：剔除一个字符串中的全部非数字字符，然后逆序输出数字。
//        例如：如果输入“A1BC2y3ou3”中的非数字字符全部剔除，
//        得到字符串“1233”，然后输出“3321”。如果输入的字符串中不含数字，
//        则输出“无数字”。
public class ques1 {
    public static void main(String[] args) {
        String inx;
        Scanner reader=new Scanner(System.in);
        inx=reader.next();
        String newinx="";
        for(int i=0;i<inx.length();i++){
            if((int )'0'<=(int)inx.charAt(i)&&(int)'9'>=(int)inx.charAt(i))
                newinx+=inx.charAt(i);}
        System.out.println(newinx);
    }
}

