
public class IsAnagram {
    public static void main(String[] args) {

        String str1="silent";
        String str2="liiten";
        System.out.println(isAnagram(str1,str2));

       }
       public static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        int matchLength=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    matchLength++;
                    break;
                }
            }
        }
        if(matchLength==s1.length())
            return true;

        return false;
       }
}
