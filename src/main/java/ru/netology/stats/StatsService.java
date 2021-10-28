package ru.netology.stats;

public class StatsService {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public long sumSales(long[] sales) {
        long summary = 0;
        for (long sale : sales) {
            summary = summary + sale;
        }
        return summary;
    }

    public long avSumSales() {
        StatsService service = new StatsService();
        long avSummary = service.sumSales(purchases) / 12;
        return avSummary;
    }

    public int maxSales(long[] sales) {
        int month = 0;
        int maxMonth = 0;
        // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int month = 0;
        int minMonth = 0;
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
        int belowAvMnth = 0;
        StatsService service = new StatsService();
        long avSummary = service.sumSales(purchases) / 12;
        for (long sale : sales) {
            if (sale < avSummary) {
                belowAvMnth = belowAvMnth + 1;
            }
        }
        return belowAvMnth;
    }

    public long salesAboveAv(long[] sales) {
        int aboveAvMnth = 0;
        StatsService service = new StatsService();
        long avSummary = service.sumSales(purchases) / 12;
        for (long sale : sales) {
            if (sale > avSummary) {
                aboveAvMnth = aboveAvMnth + 1;
            }
        }
        return aboveAvMnth;
    }

/*    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.sumSales(purchases));
        System.out.println(service.avSumSales());
        System.out.println(service.maxSales(purchases));
        System.out.println(service.minSales(purchases));
        System.out.println(service.salesBelowAv(purchases));
        System.out.println(service.salesAboveAv(purchases));
    }*/

}
