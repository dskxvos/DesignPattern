package 工厂模式;

/**
 * 运算工厂
 */
public class OperationFactory {

    public static final String OPERATIONMODE_ADD = "+";

    public static final String OPERATIONMODE_MULTIPLY = "*";

    public static final String OPERATIONMODE_SUBTRACT = "-";

    public static final String OPERATIONMODE_DIVIDE = "/";


    public static Operation creatOperation(String operationMode) throws OperationModeErroException{

        if (operationMode.equals(OPERATIONMODE_ADD)){
            return new AddOperation();
        }else if (operationMode.equals(OPERATIONMODE_MULTIPLY)){
            return new MultiplyOperation();
        }else if (operationMode.equals(OPERATIONMODE_SUBTRACT)){
            return new SubtractOperation();
        }else if (operationMode.equals(OPERATIONMODE_DIVIDE)){
            return new DivideOperation();
        }else {
            throw new OperationModeErroException("The operation mode you entered is incorrect. Please check the operation mode constant and input it again.");
        }

    }
}
