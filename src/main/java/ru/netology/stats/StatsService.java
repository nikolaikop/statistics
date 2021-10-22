package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long summary = 0;
        for (long sale : sales) {
            summary = summary + sale;
        }
        return summary;
    }

    public long avSumSales(long[] sales) {
        long avsummary = 0;
        for (long sale : sales) {
            avsummary = avsummary + sale;
        }
        return avsummary / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long salesBelowAv(long[] sales) {
        long summary = 0;
        int belowAvMnth = 0;
        for (long sale : sales) {
            summary = summary + sale;
        }
        long avsummary = summary / 12;
        for (long sale : sales) {
            if (sale < avsummary) {
                belowAvMnth = belowAvMnth + 1;
            }
        }
        return belowAvMnth;
    }

    public long salesAboveAv(long[] sales) {
        long summary = 0;
        int aboveAvMnth = 0;
        for (long sale : sales) {
            summary = summary + sale;
        }
        long avsummary = summary / 12;
        for (long sale : sales) {
            if (sale > avsummary) {
                aboveAvMnth = aboveAvMnth + 1;
            }
        }
        return aboveAvMnth;
    }

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.sumSales(purchases));
        System.out.println(service.avSumSales(purchases));
        System.out.println(service.maxSales(purchases));
        System.out.println(service.minSales(purchases));
        System.out.println(service.salesBelowAv(purchases));
        System.out.println(service.salesAboveAv(purchases));
    }

}
