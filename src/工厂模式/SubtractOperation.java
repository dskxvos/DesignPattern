package 工厂模式;

/**
 * 减法运算逻辑
 */
public class SubtractOperation implements Operation{

    @Override
    public Double getResult(Double numberA, Double numberB) {
        return numberA-numberB;
    }
}
