import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp= new boolean[s.length()+1];
        dp[0]=true;
        Set<String> wordSet= new HashSet<>(wordDict);
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && wordSet.contains(s.substring(j,i))){
                    dp[i]= true;
                    break;
                }
            }
        }
        return dp[s.length()];
        
    }
}
