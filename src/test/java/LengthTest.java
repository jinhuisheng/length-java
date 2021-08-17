import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should_1_inch_equals_1_inch() {
        Length result = Length.createLength(1, Unit.Inch).as(Unit.Inch);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(Unit.Inch));
    }

    @Test
    public void should_2_feet_equals_2_feet() {
        Length result = Length.createLength(2, Unit.Foot).as(Unit.Foot);

        assertThat(result.getValue(), is(2.0));
        assertThat(result.getUnit(), is(Unit.Foot));
    }

    @Test
    public void should_3_yards_equals_3_yards() {
        Length result = Length.createLength(3, Unit.Yard).as(Unit.Yard);

        assertThat(result.getValue(), is(3.0));
        assertThat(result.getUnit(), is(Unit.Yard));
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        Length result = Length.createLength(1, Unit.Foot).as(Unit.Inch);

        assertThat(result.getValue(), is(12.0));
        assertThat(result.getUnit(), is(Unit.Inch));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        Length result = Length.createLength(1, Unit.Yard).as(Unit.Foot);

        assertThat(result.getValue(), is(3.0));
        assertThat(result.getUnit(), is(Unit.Foot));
    }

    @Test
    public void should_1_yard_equals_36_inches() {
        Length result = Length.createLength(1, Unit.Yard).as(Unit.Inch);

        assertThat(result.getValue(), is(36.0));
        assertThat(result.getUnit(), is(Unit.Inch));
    }

    @Test
    public void should_2_yards_equals_72_inches() {
        Length result = Length.createLength(2, Unit.Yard).as(Unit.Inch);

        assertThat(result.getValue(), is(72.0));
        assertThat(result.getUnit(), is(Unit.Inch));
    }

    @Test
    public void should_12_inches_equals_1_foot() {
        Length result = Length.createLength(12, Unit.Inch).as(Unit.Foot);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(Unit.Foot));
    }

    @Test
    public void should_3_foot_equals_1_yard() {
        Length result = Length.createLength(3, Unit.Foot).as(Unit.Yard);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(Unit.Yard));
    }

    @Test
    public void should_36_inches_equals_1_yard() {
        Length result = Length.createLength(36, Unit.Inch).as(Unit.Yard);

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(Unit.Yard));
    }

    @Test
    public void should_18_inches_equals_half_yard() {
        Length result = Length.createLength(18, Unit.Inch).as(Unit.Yard);

        assertThat(result.getValue(), is(0.5));
        assertThat(result.getUnit(), is(Unit.Yard));
    }
}
