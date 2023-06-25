import java.util.*;
public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer>m=new HashMap<>();
        int n=s.length(), ans=-1;
        for(int i=0; i<n; i++){
            char c=s.charAt(i);
            m.put(c, m.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<n; i++){
            if(m.get(s.charAt(i))==1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
