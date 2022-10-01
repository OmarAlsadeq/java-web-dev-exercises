package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest () {
        assertEquals(10, 10, 0.01);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void constructorSetsGasTankLevel() {

        assertEquals(18.0, car.getGasTankLevel());
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void gasTankLevelAfter100Miles() {
        car.drive(100);
        assertEquals(15.5, car.getGasTankLevel());
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
