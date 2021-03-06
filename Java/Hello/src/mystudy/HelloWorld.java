package mystudy;


import java.util.Scanner;

//
// java 基本 语法   数据类型  输入输出等等
//

/**
 * @author mitu-x
 */
public class HelloWorld {
    public static void main(String[] args) {


        /*        编程第一步，Hello World！           */
        System.out.println("Hello World!");

        /* *************************************** */
        /*                                         */
        /*                 数据类型                 */
        /*                                         */
        /* *************************************** */
//      整型
        int i2 = -2147483648;
        int i3 = 2_000_000_000;
        // 加下划线更容易识别
        int i4 = 0xff0000;
        // 十六进制表示的16711680
        int i5 = 0b1000000000;
        // 二进制表示的512
        long l = 9000000000000000000L;
        // long型的结尾需要加L

//        浮点型
        float f1 = 1.09f;
        //浮点型以f结尾
        double f2 = 1.20202;
        //无要求，精度更高

//        字符型
        char ch1 = 'A';
        char ch2 = '中';
        //字符型用单引号''
        
//        字符串型
        String str1 = "Hello World!";
        //字符串型  用双引号""

//        常量
        final double PI = 3.14;
        //定义变量时  加上final 就成了常量

//        var 关键字
        StringBuilder sbr1 = new StringBuilder();
        // 用以省略变量类型 上下等效
        var sbr2 = new StringBuilder();


//        加法 +
//        减法 -
//        乘法 *
//        整除 /
//        求余 %





        /* *************************************** */
        /*               移位运算                    */
        /*                                         */
        /* *************************************** */
/*
            1.左移  <<
                int n = 7;       // 00000000 00000000 00000000 00000111 = 7
                int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
                int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
                int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
                int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
            2.右移 >>
                int n1 = 7;       // 00000000 00000000 00000000 00000111 = 7
                int a1 = n >> 1;  // 00000000 00000000 00000000 00000011 = 3
                int b1 = n >> 2;  // 00000000 00000000 00000000 00000001 = 1
                int c1 = n >> 3;  // 00000000 00000000 00000000 00000000 = 0
            3.负数 右移 >>
                int n2 = -536870912;
                int a2 = n >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
                int b2 = n >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
                int c2 = n >> 28; // 11111111 11111111 11111111 11111110 = -2
                int d2 = n >> 29; // 11111111 11111111 11111111 11111111 = -1
            4.无符号右移
                int n3 = -536870912;
                int a3 = n >>> 1;  // 01110000 00000000 00000000 00000000 = 1879048192
                int b3 = n >>> 2;  // 00111000 00000000 00000000 00000000 = 939524096
                int c3 = n >>> 29; // 00000000 00000000 00000000 00000111 = 7
                int d3 = n >>> 31; // 00000000 00000000 00000000 00000001 = 1
*/





        /* *************************************** */
        /*                                         */
        /*                  位运算                  */
        /*                                         */
        /* *************************************** */
/*
         +位运算是按位进行与、或、非和异或的运算。
              1.与运算的规则是，必须两个数同时为1，结果才为1：
                n = 0 & 0; // 0
                n = 0 & 1; // 0
                n = 1 & 0; // 0
                n = 1 & 1; // 1
              2.或运算的规则是，只要任意一个为1，结果就为1：
                n = 0 | 0; // 0
                n = 0 | 1; // 1
                n = 1 | 0; // 1
                n = 1 | 1; // 1
              3.非运算的规则是，0和1互换：
                n = ~0; // 1
                n = ~1; // 0
              4.异或运算的规则是，如果两个数不同，结果为1，否则为0：
                n = 0 ^ 0; // 0
                n = 0 ^ 1; // 1
                n = 1 ^ 0; // 1
                n = 1 ^ 1; // 0
*/




        /* *************************************** */
        /*                                         */
        /*                  输出                    */
        /*                                         */
        /* *************************************** */
        /*

        1.println() 输出并换行
        2.print() 输出不换行
        3.printf() 格式化输出，%d %s %x等等，同C语言的输出函数

        */




        /* *************************************** */
        /*                                         */
        /*                  输入                    */
        /*                                         */
        /* *************************************** */
        //创建一个scanner输入类
        Scanner scanner = new Scanner(System.in);
        //提示输入name
        System.out.println("Please input your name :");
        //获取一行输入内容 and make it String
        String YourName = scanner.nextLine();
        //提示输入age
        System.out.println("Please input your age :");
        //获取一行输入内容 and  make it Int
        int YourAge = scanner.nextInt();
        // 格式化输出
        System.out.printf("Hi, %s, you are %d !\n", YourName, YourAge);


        /* *************************************** */
        /*                                         */
        /*                条件判断if                */
        /*                                         */
        /* *************************************** */
        // 当判断字符串时，不能用" == ",要使用equals()函数 


        /* *************************************** */
        /*                                         */
        /*                判断switch                */
        /*                                         */
        /* *************************************** */
        //break,default 必须有
        //新语法   ->   并且可以使用yield来
//        String fruit = "orange";
//                int opt = switch (fruit) {
//                    case "apple" -> 1;
//                    case "pear", "mango" -> 2;
//                    default -> {
//                        int code = fruit.hashCode();
//                        yield code; // switch语句返回值
//                    }
//                };
    }
}
