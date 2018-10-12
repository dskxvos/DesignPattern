package 工厂模式;

/**
 * 乘法运算逻辑
 */
public class MultiplyOperation implements Operation{

    @Override
    public Double getResult(Double numberA, Double numberB) {
        return numberA*numberB;
    }
}
