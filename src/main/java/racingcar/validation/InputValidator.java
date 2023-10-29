package racingcar.validation;

import racingcar.message.ErrorMessage;
import racingcar.resource.RegularExpression;

public class InputValidator {

    public static void validateRoundInput(String roundInputNumber) {
        StringValidator.stringNullAndBlankCheck(roundInputNumber);
        validateNumber(roundInputNumber);
    }

    public static void validateNumber(String inputNumber) {
        if (!inputNumber.matches(RegularExpression.NUMBER_REGEX.getValue())) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_TRY_TYPE_MESSAGE.getValue());
        }
    }
}