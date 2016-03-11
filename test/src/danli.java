import java.util.Scanner;

/**
 * Created by Administrator on 2016/3/11.
 */
public class danli {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in );
        double F,p=0,i,n;int select=1,select2=0;
        System .out.printf("是否需要计算本金(0~1选择)");
        select2=scanner.nextInt() ;
        if(select2==1)
        { p= calutenp();
            System .out.print(p);
            select=0;
        }

        System .out.println("输入初始金额");
        p=scanner.nextDouble() ;
        System .out.printf("输入投资年限");
        n=scanner.nextDouble() ;
        System .out.printf("输入利率");
        i=scanner.nextDouble() ;
        System .out.printf("是否需要计算单利:(0为是)");
        select=scanner.nextInt() ;

        if(select==0)
            F=p*1+i*2;
        else
            F=p*Math .pow(1+i,n);
        System .out.print(F);


    }

    public static double calutenp(){
        double F,n,i,f;
        Scanner scanner =new Scanner (System.in );

        for(int j=0;j<8;j++)
        {
            System .out.println("    ");
        }
        System .out.printf("输入预期金额");
        F=scanner.nextDouble();
        System .out.printf("输入年限");
        n=scanner.nextDouble() ;
        System .out.printf("输入利率");
        i=scanner.nextDouble() ;
        f=F/(Math .pow(1+i,n));
        return f;





    }
}
