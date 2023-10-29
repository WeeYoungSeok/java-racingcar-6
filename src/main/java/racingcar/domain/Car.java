package racingcar.domain;

import racingcar.message.OutputMessage;
import racingcar.resource.CarGameValue;
import racingcar.util.LetterUtil;
import racingcar.util.RandomUtil;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move() {
        if (moveCheck()) {
            this.position += CarGameValue.POWER.getValue();
        }
    }

    public String result() {
        return this.name + " : " + LetterUtil.sameLetterPaste(OutputMessage.RACE.getValue(), this.position);
    }

    public boolean isWinner(int winnerPosition) {
        return this.position == winnerPosition;
    }

    private boolean moveCheck() {
        int randomNumber = RandomUtil.getRandomNumberRange(
                CarGameValue.CAR_MOVE_MIN_NUMBER.getValue(),
                CarGameValue.CAR_MOVE_MAX_NUMBER.getValue()
        );
        return randomNumber >= CarGameValue.CAR_MOVE_MORE_THAN_NUMBER.getValue();
    }
}
