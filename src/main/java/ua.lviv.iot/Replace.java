package ua.lviv.iot;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

   public static void main(String[] args) {
        Replace r = new Replace();
       System.out.println(r.replacedText());
    }




    public StringBuilder replacedText(){
        System.out.println("please print your text :");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        return replacePhoneNumber(text);
        //System.out.println(replacePhoneNumber(text));
    }

    public  StringBuilder replacePhoneNumber(String text){

        StringBuilder sb = new StringBuilder(text);

        Pattern p = Pattern.compile("\\d{7}|(\\d{3}-\\d{2}-\\d{2})|(\\d{2})-(\\d{2})-(\\d{2})-(\\d{1})");
        Matcher m = p.matcher(sb);

        while(m.find()){
            int start = m.start();
            int end = m.end();

            String s1 = sb.substring(start,end);
            String reverse = new StringBuilder(s1).reverse().toString();
            sb.replace(start,end,reverse);
        }

        return sb;
    }


}

