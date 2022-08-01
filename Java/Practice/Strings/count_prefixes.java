package Practice.Strings;

public class count_prefixes {
    public static void main(String[] args) {
        String str = "abc";
        String[] s = {"a","b","c","ab","bc","abc"};

        int count = 0;
        for(int i=0 ; i<s.length ; i++){
            String substr = str.substring(0 , s[i].length());
            if(substr.equals(s[i])){
                count++;
            }
        }

        System.out.println("The count is : " + count);
    }
}
