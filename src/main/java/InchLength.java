public class InchLength extends Length {
    public InchLength(double value, Unit convertUnit) {
        super(value, convertUnit);
    }

    @Override
    protected double getValue(Unit unit) {
        if (unit == Unit.Foot) {
            return value / 12;
        }
        if (unit == Unit.Yard) {
            return value / 36;
        }
        return value;
    }
}
