package week05;

import java.util.Arrays;

public class StringUtils {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i= s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1= "Baku";
        String s2="Bku";
        System.out.println(reverse(s1));
        System.out.println(exploded(s1));
        System.out.println(sorting(s1));
        System.out.println(Anagram(s1, s2));
        System.out.println(swap(s1));
        
    }

public static String exploded (String x){
    StringBuilder st = new StringBuilder();
    for(int i=0; i<=x.length();i++ ){
        for(int j=0;j<i;j++){
            st.append(x.charAt(j));
        }
    } 
    return st.toString();

}
public static String sorting(String str){
    char [] sortedArray = str.toCharArray();
    Arrays.sort(sortedArray);
    return new String(sortedArray);
    }
public static boolean Anagram (String s1, String s2){
    String n_s1 = sorting(s1);
    String n_s2= sorting(s2);
    return n_s1.equals(n_s2);

}
public static String swap(String sentence){
    StringBuilder sb = new StringBuilder();
    String[] s_array= sentence.split(" ");
    for(int i=0;i<s_array.length;i++){
        char[] c_array= s_array[i].toCharArray();
        char temp = c_array[0];
        c_array[0] = c_array[c_array.length-1];
        c_array[c_array.length-1]= temp;
        sb.append(c_array);
        sb.append(" ");
    }
    return sb.toString();
}

}



