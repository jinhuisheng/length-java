public abstract class Length {
    protected final double value;
    protected final Unit unit;

    protected Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length createLength(double value, Unit unit) {
        if (unit == Unit.Foot) {
            return new FootLength(value, unit);
        }
        if (unit == Unit.Yard) {
            return new YardLength(value, unit);
        }
        if (unit == Unit.Inch) {
            return new InchLength(value, unit);
        }
        throw new RuntimeException("undefined unit");
    }

    public Length as(Unit unit) {
        double value = getValue(unit);
        return createLength(value, unit);
    }

    protected abstract double getValue(Unit unit);

    public double getValue() {
        return this.value;
    }

    public Unit getUnit() {
        return unit;
    }
}
