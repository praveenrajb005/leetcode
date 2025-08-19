class Solution {
    int c=0;
    public void rec(int n){
        if(n==0){
            return;
        }
        if(n%2==0){
            n/=2;
            c++;
        }
        else{
            n-=1;
            c++;
        }
        rec(n);
    }
    public int numberOfSteps(int num) {
        rec(num);
        return c;
    }
}