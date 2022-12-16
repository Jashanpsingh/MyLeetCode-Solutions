class Solution {
    public String thousandSeparator(int n) {
	if(n == 0) return "0";
	LinkedList<Object> list = new LinkedList<>();
	int count = 0;
	while(n > 0){
		// if we have three number, we add "." in the head
		if(count==3){
			list.addFirst(".");
			count = 0;
		}
		count++;
		list.addFirst(n % 10);
		n /= 10;
	}
	StringBuilder res = new StringBuilder();
	while(!list.isEmpty()){
		res.append(list.removeFirst());
	}
	return res.toString();
}
}
