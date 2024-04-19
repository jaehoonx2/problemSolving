class Solution {
    public String solution(String s, int n) {
		char[] askii = s.toCharArray();
		
		for(int i = 0; i < askii.length; i++){
            char ch = askii[i];
            int tmp;
            
			if(askii[i] != ' ' && askii[i] >= 'a' && askii[i] <= 'z'){
				if((int) ch + n > (int) 'z')
					tmp = (int)'a' + (int)ch + n - (int)'z' - 1;
				else 
                    tmp = (int) ch + n;
                
                askii[i] = (char) tmp;
			} else if(askii[i] != ' ' && askii[i] >= 'A' && askii[i] <= 'Z'){
				if((int) ch + n > (int) 'Z')
					tmp = (int)'A' + (int)ch + n - (int)'Z' - 1;
				else 
                    tmp = (int) ch + n;
                
                askii[i] = (char) tmp;
			}
		}
		
		return new String(askii);
    }
}