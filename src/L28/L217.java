package src.L28;

class L217 {
    
    public int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        L217 obj = new L217();
        String haystack = "sadgdkjfgdjsad";
        String needle = "sad";
        int res = obj.strStr(haystack,needle);

        System.out.println(res);
    }
}