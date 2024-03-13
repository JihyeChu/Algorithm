class Solution
{
    public int solution(int n, int a, int b)
    {
        int count = 0;
        int a_around = a;
        int b_around = b;

        while(a_around != b_around){
            a_around = (a_around+1)/2;
            b_around = (b_around+1)/2;
            count++;
        }

        return count;
    }
}