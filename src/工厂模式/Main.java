package 工厂模式;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************************************");
        System.out.println("请输入第1个数:");
        Double numberA = sc.nextDouble();
        System.out.println("请输入运算符号: +  -  *  /");
        String operationMode = sc.next();
        System.out.println("请输入第2个数:");
        Double numberB = sc.nextDouble();
        try {
            Operation operation = OperationFactory.creatOperation(operationMode);
            System.out.println("运算结果为:"+operation.getResult(numberA,numberB));
            System.out.println("**********************************************************");
        }catch (OperationModeErroException e){
            //此异常展示只是为了测试异常效果 正常运行逻辑中不需要printStackTrace
            e.printStackTrace();
            System.out.println("请输入正确的运算符号！");
            System.out.println("**********************************************************");
        }finally {
            System.exit(0);
        }



    }
}
