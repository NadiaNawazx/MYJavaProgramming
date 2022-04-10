package LiveReview.Week07;

public class Task01 {
    public static void main(String[] args) {

        int rows=5;
        for (int i = 1; i <= rows; i++)
        {
            int num = i;
            for (int k = 1; k <= i; k++)
            {
                System.out.print(num+" ");
                num = num+rows-k;
            }
            System.out.println();
        }
    }
}
/*
Print below pattern using loop

            1
            2 6
            3 7 10
            4 8 11 13
            5 9 12 14 15
 */