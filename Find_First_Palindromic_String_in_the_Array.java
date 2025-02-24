class Solution {
    public String firstPalindrome(String[] words) {
        int flag=0;
        String str="";
        String strrev="";
        String palstr = "";
        for (int j = 0; j< words.length; j++) {
             str = words[j];
            for(int i=0;i<str.length();i++){
                strrev = str.charAt(i)+ strrev;
    
            }
            if(str.equals(strrev)){
                palstr = str;
                flag=1;
                break;
                
                
                
            }else{
                str ="";
                strrev="";
            }
            
        }
        if(flag==1){
         return palstr ;

        }
        else {
            return "";
            }
        
    }
}