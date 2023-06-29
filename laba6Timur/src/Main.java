import ex3.Employee;
import ex3.Report;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //exers1();
        //exers2();
        //exers3();
        //exers4();
        exers5();
    }

    static void exers1()
    {
        String str1 = "я сделал лабу по Java";
        String str2 = "я сделал лабу по Jav a";
        System.out.println("Содержит ли строка str1 подстроку Java: " + str1.contains("Java"));
        System.out.println("Содержит ли строка str2 подстроку Java: " + str2.contains("Java"));
    }

    static  void exers2()
    {
        String str1 = "Синева";
        String str2 = "Папаша";
        System.out.println("Средние 2 буквы первой строки: "+seredina(str1)+"\n" +
                "Средние 2 буквы второй строки: "+seredina(str2)+"\n");
    }
    public static String seredina(String str)
    {
        return str.substring(str.length()/2-1, str.length()/2+1);
    }

    static  void exers3()
    {
        Employee employee1 = new Employee("LLLL",12.3);
        Employee employee2 = new Employee("MMMM",13.3);
        Employee employee3 = new Employee("KKKK",14.3);
        Employee employee4 = new Employee("NNNN",1115.3898007);

        Report report = new Report(employee1, employee2, employee3, employee4);
        report.showReports();
    }

    static  void exers4()
    {
        String str = "ааа ббб ёёё ззз ййй ААА БББ ЁЁЁ ЗЗЗ ЙЙЙ";
        String regex = "[а-я]+|[А-Я]+|ё+|Ё+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        System.out.println("Начальная строка: "+str + "\n");

        System.out.println("Все вхождения: " );
        while (matcher.find()) {
            if(matcher.group() != null)
                System.out.println("Найдено значение: " + matcher.group());
        }
    }

    static void exers5()
    {
        String str = "Если есть хвосты\n" +
                "по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String s1 = str.replaceAll("[^1-9]"," ");
        int c=0;
        while(c<s1.length()) {
            s1 = s1.replaceAll("  "," ");
            c++;
        }
        s1=s1.trim();
        System.out.println(s1);
        String[] arr=s1.split(" ");
        int count = 0;
        for(String i : arr)
        {
            if(isPalindrome(i)) System.out.println("Палиндром в данной строке: "+i);
            count++;
        }
        if(count==0) System.out.println("Палиндромов в данной строке нет.");
    }

    public static boolean isPalindrome(String str)
    {
        if(str.length()==0 || str.length()==1) return true;
        if(str.charAt(0)==str.charAt(str.length()-1)) return isPalindrome(str.substring(1,str.length()-1));
        return false;
    }
}