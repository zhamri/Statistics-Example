package my.zhamri.statistics;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class SimpleDescriptive {
    public static void main(String[] args) {
        double[] values = new double[]{11, 1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10};
        DescriptiveStatistics ds = new DescriptiveStatistics();
        for (double v : values) {
            ds.addValue(v);
        }

        double mean = ds.getMean();
        double median = ds.getPercentile(50);
        double stdDev = ds.getStandardDeviation();
        double min = ds.getMin();
        double max = ds.getMax();
        double sum = ds.getSum();

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("StdDev: " + stdDev);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
    }
}
