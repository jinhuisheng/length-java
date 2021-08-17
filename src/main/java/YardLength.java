public class YardLength extends Length {
    public YardLength(double value, Unit convertUnit) {
        super(value, convertUnit);
    }

    @Override
    protected double getValue(Unit unit) {
        if (unit == Unit.Inch) {
            return value * 36;
        }
        if (unit == Unit.Foot) {
            return value * 3;
        }
        return value;
    }
}
