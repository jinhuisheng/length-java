public class Length {
    private final double value;
    private final String unit;
    private final Units currentUnit;

    public Length(double value, String unit) {
        this.value = value;
        this.unit = unit;
        this.currentUnit = Units.valueOf(unit.toUpperCase());
    }

    public Length as(String unit) {
        Length length = this;
        Units targetUnit = Units.valueOf(unit.toUpperCase());
        if (this.unit.equals("f")) {
            if (targetUnit == Units.YARD) {
                length = new Length(this.value / 3, unit);
            } else if (targetUnit == Units.INCH) {
                length = new Length(this.value * 12, unit);
            }
        }

        if (this.unit.equals("yard")) {
            if (targetUnit == Units.INCH) {
                length = new Length(this.value * 36, unit);
            } else if (targetUnit == Units.F){
                length = new Length(this.value * 3, unit);
            }
        }

        if (this.unit.equals("inch")) {
            if (targetUnit == Units.F) {
                length = new Length(this.value / 12, unit);
            } else if (targetUnit == Units.YARD) {
                length = new Length(this.value / 36, unit);
            }
        }

        return length;
    }

    public double getValue() {
        return this.value;
    }

    public String getUnit() {
        return this.unit;
    }
}
