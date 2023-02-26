class Solution {
public:
    bool isNumber(string s) {
    int n = s.length();
    int i = 0;
    bool isNumeric = false;
    bool hasE = false;
    bool hasDecimal = false;
    bool hasSign = false;
    
    // Skip leading spaces
    while (i < n && s[i] == ' ') {
        i++;
    }
    
    // Check for sign
    if (i < n && (s[i] == '+' || s[i] == '-')) {
        hasSign = true;
        i++;
    }
    
    // Check for numeric part before decimal or exponent
    while (i < n && isdigit(s[i])) {
        isNumeric = true;
        i++;
    }
    
    // Check for decimal point and numeric part after decimal
    if (i < n && s[i] == '.') {
        hasDecimal = true;
        i++;
        while (i < n && isdigit(s[i])) {
            isNumeric = true;
            i++;
        }
    }
    
    // Check for exponent and numeric part after exponent
    if (isNumeric && i < n && (s[i] == 'e' || s[i] == 'E')) {
        hasE = true;
        hasSign = false;
        isNumeric = false;
        i++;
        if (i < n && (s[i] == '+' || s[i] == '-')) {
            hasSign = true;
            i++;
        }
        while (i < n && isdigit(s[i])) {
            isNumeric = true;
            i++;
        }
    }
    
    // Skip trailing spaces
    while (i < n && s[i] == ' ') {
        i++;
    }
    
    // The string is a valid number if all characters have been processed and there is at least one numeric character
    return isNumeric && i == n;
}

int main() {
    string s = "53.5e93";
    if (isNumber(s)) {
        cout << "The string is a valid number." << endl;
    } else {
        cout << "The string is not a valid number." << endl;
    }
    return 0;
}
};
