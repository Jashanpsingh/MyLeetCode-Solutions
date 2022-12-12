class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

    // area_1 = (C - A) * (D - B);
    // area_2 = (G - E) * (H - F);


    int totalArea = (C - A) * (D - B) + (G - E) * (H - F);
    if((E >= C||G <= A) || (F >= D || H <= B)){              // all "or"
        return totalArea;
    }
    int topRightX = Math.min(C, G);
    int topRightY = Math.min(D, H);
    int bottomLefftX = Math.max(A, E);
    int bottomLefftY = Math.max(B, F);
    
    // overlaped part
    int overlap = (topRightX - bottomLefftX) * (topRightY - bottomLefftY); 
    return totalArea - overlap;
}
}
