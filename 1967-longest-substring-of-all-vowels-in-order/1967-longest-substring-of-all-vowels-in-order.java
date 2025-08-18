class Solution {
    public int longestBeautifulSubstring(String word) {
        char[] ch=word.toCharArray();
        HashSet<Character> set=new HashSet<>();
        int max=0;
        set.add(ch[0]);
        int ind=0;
        for(int i=1;i<ch.length;i++){
            if(ch[i]>=ch[i-1]){
                set.add(ch[i]);
            }
            else{
                if(set.size()==5){
                    max=Math.max(max,i-ind);
                    ind=i;
                    set.clear();
                }
                else{
                    ind=i;
                    set.clear();
                    if(ch[i]<ch[i-1])
                    set.add(ch[i]);
                }
            }
        }
        if(set.size()==5)
        max=Math.max(max,ch.length-ind);
        return max;
    }
}