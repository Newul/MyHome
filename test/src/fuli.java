#include<stdio.h>
        #include<math.h>

        void add(){
        double sum,p,a;
        int n,s;
        printf("选择复利计算或单利计算1/2：");
        scanf("%d",&s);
        printf("输入本金：");
        scanf("%lf",&a);
        printf("输入年利率：");
        scanf("%lf",&p);
        printf("输入年限：");
        scanf("%d",&n);
//用if判断语句决定用哪种计算
        if(s==1){
        sum=a*(pow(1+p,n));
        }
        else
        sum=a*n*p+a;
        printf("总利润为：%lf\n",sum);
        getch();

        }

        void benjin(){
        double sum,p,a;
        int n;
        printf("输入总利润：");
        scanf("%lf",&sum);
        printf("输入年利率：");
        scanf("%lf",&p);
        printf("输入年限：");
        scanf("%d",&n);
        a=sum/pow(1+p,n);
        printf("本金为%lf",a);
        getch();
        }

        void time(){
        double sum,p,a,n;

        printf("输入本金：");
        scanf("%lf",&a);
        printf("输入年利率：");
        scanf("%lf",&p);
        printf("输入总利润：");
        scanf("%lf",&sum);
        n=log(sum/a)/log(1+p);
        printf("存款期限为:%lf",n);
        getch();
        }

        void lilv(){
        double sum,p,a,n;
        printf("输入本金：");
        scanf("%lf",&a);
        printf("输入年限：");
        scanf("%lf",&n);
        printf("输入总利润：");
        scanf("%lf",&sum);
        p=pow(sum/a,1/n)-1;
        printf("年利率为:%lf",p);
        getch();
        }

        void main(){
        int m;
        while(1){
        printf("\n\n\n");
/*主菜单*/
        printf("\n ***********************************************\n");
        printf(" | 1. 总利润计算                                 |\n");
        printf(" |-----------------------------------------------|\n");
        printf(" | 2. 本金计算                                   |\n");
        printf(" |-----------------------------------------------|\n");
        printf(" | 3. 存款期限计算                               |\n");
        printf(" |-----------------------------------------------|\n");
        printf(" | 4. 年利率                                     |\n");
        printf(" |-----------------------------------------------|\n");
        printf(" | 5. 退出                                       |\n");
        printf(" |-----------------------------------------------|\n");
        printf("请选择：");
        scanf("%d",&m);
        switch (m){
        case 1:{add();break;}
        case 2:{benjin(); break;}
        case 3:{time(); break;}
        case 4:{lilv(); break;}
        case 5:exit(0);break;
        }
        }

        }