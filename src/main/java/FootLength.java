public class FootLength extends Length {
    public FootLength(double val, Unit convertUnit) {
        super(val, convertUnit);
    }

    @Override
    protected double getValue(Unit unit) {
        if (unit == Unit.Yard) {
            return value / 3;
        }
        if (unit == Unit.Inch) {
            return value * 12;
        }
        return value;
    }
}
