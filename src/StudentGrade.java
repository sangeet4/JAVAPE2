public class StudentGrade {
    public int minG(int n, int grades[]){
        int minGr=grades[0];
        for(int i=0;i<n;i++)
        {
            if(grades[i]<minGr)
            {
                minGr=grades[i];
            }
        }
        return minGr;
    }

    public int maxG(int n, int grades[]){
        int maxGr=grades[0];
        for(int i=0;i<n;i++)
        {
            if(grades[i]>maxGr)
            {
                maxGr=grades[i];
            }
        }
        return maxGr;
    }

    public float avgG(int n,int grades[]){
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+grades[i];
        }
        float avg;
        avg=(float) sum/n;
        return avg;
    }
}
