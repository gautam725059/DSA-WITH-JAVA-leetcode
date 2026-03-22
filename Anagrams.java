public class Anagrams {
    public boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        int [] charCount = new int[26];
        for (int i =0;i<s.length();i++)
        {
            charCount[s.charAt(i)-'a']++;
            charCount[t.charAt(i)-'a']--;
        }
        for(int count :charCount)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
        Anagrams obj = new Anagrams();

        System.out.println(obj.isAnagram("listen", "silent")); // true
        System.out.println(obj.isAnagram("hello", "world"));   // false
    }
}
