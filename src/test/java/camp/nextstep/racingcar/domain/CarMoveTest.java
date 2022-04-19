package camp.nextstep.racingcar.domain;

import org.junit.jupiter.api.Test;

public class CarMoveTest {

    @Test
    public void 자동차_전진_테스트() {
        Car car = new Car();
        car.moveForward();
    }
}
