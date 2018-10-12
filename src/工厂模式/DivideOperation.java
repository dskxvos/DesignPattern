package 工厂模式;

/**
 * 除以运算逻辑
 */
public class DivideOperation implements Operation{

    @Override
    public Double getResult(Double numberA, Double numberB) {
        return numberA/numberB;
    }
}
