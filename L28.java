class L28 {
    
    public int strStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        L28 obj = new L28();
        String haystack = "sadgdkjfgdjsad";
        String needle = "sad";
        int res = obj.strStr(haystack,needle);

        System.out.println(res);
    }
}