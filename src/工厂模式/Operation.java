package 工厂模式;

/**
 * @说明   运算类接口
 * @备注  实际上从逻辑中可以就把加减乘除写在一个类，通过判断语句来进行不同的运算逻辑 但是当运算逻辑有太多分支的时候这段代码就会过长 其维护性和
 *      扩展性都会非常的低，所以这个时候可以把每个分支拆分出来，通过工厂模式创建不同运算类来执行  现实用例：支付宝支付，微信支付，银联支付等
 *      多支付方式的时候，就可以使用此设计模式。
 */
public interface Operation {

    /**
     * 得到运算结果的接口
     * @param numberA
     * @param numberB
     * @return
     */
    Double getResult(Double numberA,Double numberB);

}
