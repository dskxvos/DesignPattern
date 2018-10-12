package 工厂模式;

/**
 * 加法运算逻辑
 */
public class AddOperation implements Operation{

    @Override
    public Double getResult(Double numberA, Double numberB) {
        return numberA+numberB;
    }

}
