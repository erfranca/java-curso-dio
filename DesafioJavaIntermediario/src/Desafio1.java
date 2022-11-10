import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        for (var i = 1; i <= num ; i++)
        {
            var strNum = String.valueOf(i);
            if (strNum.length() == 0     )
            {
                if (i % 2      == 0   )
                {
                    step++;
                }
                continue;
            }
            char[] vs = strNum.toCharArray();
            var sum = 0;
            for (var j = 0; j < vs.length      ; j++)
            {
                sum += (int)Character.getNumericValue(vs[ j   ]);
            }
            if (sum %  2    ==   0    )
            {
                step++;
            }
        }
        System.out.println(  step   );
    }

}
