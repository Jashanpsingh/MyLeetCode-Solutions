class Solution {
public:
    string defangIPaddr(string address) {
        string res = "";
        int size = address.size();
        
        for(int i = 0; i < size; i++){
            if(address[i] == '.')
                res += "[.]";
            else
                res += address[i];
        }
        
        return res;
    }
};
