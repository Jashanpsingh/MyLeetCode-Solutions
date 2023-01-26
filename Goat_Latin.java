public static String toGoatLatin(String S) {
    	String[] st = S.trim().split("\\s");
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<st.length; i++) {
    		int counter = 0;
    		if(st[i].startsWith("a") || st[i].startsWith("e") 
    				|| st[i].startsWith("i") 
    				|| st[i].startsWith("u")
    				|| st[i].startsWith("o")
    				|| st[i].startsWith("A") 
    				|| st[i].startsWith("E") 
    				|| st[i].startsWith("I") 
    				|| st[i].startsWith("O")
    				|| st[i].startsWith("U")) {
    			sb.append(st[i]);
    		} else {
    			char[] ch = st[i].toCharArray();
    			for(int j=1;j<ch.length; j++) {
    				sb.append(ch[j]);
    			}
    			sb.append(ch[0]);
    		}
    		sb.append("ma");
    		while(counter <= i) {
				sb.append('a');
				counter++;
			}
    		
    		if(i < st.length-1) {
    			sb.append(" ");
    		}
    			
    	}
		return sb.toString();
        
    }
