class ComputeVal {
    private double d = 250.0;

    public double value() {
        return d * 2;
    }

    public static void main(String[] args) {
        ComputeVal cv = new ComputeVal();
        double v = cv.value();
        System.out.println(v);
    }
}