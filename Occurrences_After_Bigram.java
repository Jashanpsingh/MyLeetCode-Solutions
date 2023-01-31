class Solution {
	public String[] findOcurrences(String text, String first, String second) {


		String[] temp = text.split(" ");

		List<String> ans = new ArrayList<>();

		for(int i = 2 ; i < temp.length ; i++){

			if(temp[i-2].equals(first)  && temp[i-1].equals(second)){

				ans.add(temp[i]);
			}
		}

		return ans.toArray(new String[0]);
	}
}
