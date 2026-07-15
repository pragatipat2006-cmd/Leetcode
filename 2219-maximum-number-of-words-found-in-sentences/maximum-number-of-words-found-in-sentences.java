class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord = 0;
        int word;
        for(String s : sentences){
            word = 1;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                    word++;
            }
            if(maxWord<word)
                maxWord = word;
        }
        return maxWord;
    }
}