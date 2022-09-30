public class Main {
    public static void main(String[] args) {
            //задание 1
        int i = 1;
        byte b = 1;
        short s = 1;
        long l = 1;
        double d = 1;
        float f = 1;

        System.out.println("Значение переменной с типом int равно " + i);
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("Значение переменной с типом short равно " + s);
        System.out.println("Значение переменной с типом long равно " + l);
        System.out.println("Значение переменной с типом double равно " + d);
        System.out.println("Значение переменной с типом float равно " + f);

            //задание 2
        float f2 = 27.12f;
        long l2 = 987678965549l;
        float f3 = 2.786f;
        boolean bool = false;
        short s2 = 569;
        short s3 = -159;
        int i2 = 27897;
        byte b2 = 67;

            //задание 3
        var studentsLP = 23;
        var studentsAS = 27;
        var studentsEA = 30;
        var allStudents = studentsEA + studentsLP + studentsAS;

        var paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / allStudents + " листов бумаги");

            //задание 4
        int productivityInAMinute = 16 / 2;
        float productivityIn20Min = 20 / (float)productivityInAMinute;
        System.out.println("За 20 минут работы машины произвела бутылок "
                + productivityIn20Min + " штук");
        float productivityIn24Hours = 24*60 / productivityInAMinute;
        System.out.println("За 24 часа работы машины произвела бутылок "
                + (int)productivityIn24Hours + " штук");
        float productivityIn3Days = 24*60*3 / productivityInAMinute;
        System.out.println("За 3 дня работы машины произвела бутылок "
                + (int)productivityIn3Days + " штук");
        float productivityInAMonth = 24*60*30 / productivityInAMinute;
        System.out.println("За месяц работы машины произвела бутылок "
                + (int)productivityInAMonth + " штук");

            //задание 5
        int jars = 120;
        int classes = 120 / 6;
        int whiteJars = classes * 2;
        int brownJars = classes * 4;
        System.out.println("В школе, где " + classes + " классов, нужно "
                + whiteJars + " банок белой краски и " + brownJars + " банок коричневой краски");

            //задание 6
        float commonWeight = 5*80
                + 200*21/20
                + 2*100
                + 4*70;
        commonWeight = commonWeight/1000;

        System.out.println(commonWeight);

            //задание 7
        int r250days = 7000/250;
        int r500days = 7000/500;
        int midDays = (r250days+r500days)/2;
        System.out.println(r250days + " " + r500days + " " + midDays);

            //задание 8
        int mashaBefore = 67760;
        int denisBefore = 83690;
        int cristinaBefore = 76230;

        int mashaAfter = (int)(mashaBefore * 1.1);
        int denisAfter = (int)(denisBefore * 1.1);
        int cristinaAfter = (int)(cristinaBefore * 1.1);

        int mashaDif = mashaAfter - mashaBefore;
        int denisDif = denisAfter - denisBefore;
        int cristinaDif = cristinaAfter - cristinaBefore;

        System.out.println("Маша теперь получает " + mashaAfter + " рублей. " +
                "Годовой доход вырос на " + mashaDif + " рублей");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. " +
                "Годовой доход вырос на " + denisDif + " рублей");
        System.out.println("Кристина теперь получает " + cristinaAfter + " рублей. " +
                "Годовой доход вырос на " + cristinaDif + " рублей");















    }


}