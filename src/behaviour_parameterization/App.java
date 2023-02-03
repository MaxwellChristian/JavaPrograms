package behaviour_parameterization;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static List<Apple> genApples()
    {
        List<Apple> rs = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            rs.add(new Apple(Math.random()+0.1,Apple.Color.randomColor()));
        }
        return rs;
    }

    public static List<Apple> filterGreen(List<Apple> apples)
    {
        List<Apple> rs = new ArrayList<>();
        for(Apple a: apples)
        {
            if(Apple.Color.Green.equals(a.getColor())) rs.add(a);
        }
        return rs;
    }

    public static List<Apple> filterByColor(List<Apple> apples, Apple.Color color)
    {
        List<Apple> rs = new ArrayList<>();
        for(Apple a: apples)
        {
            if(color.equals(a.getColor())) rs.add(a);
        }
        return rs;
    }

    public static List<Apple> filterByWeight(List<Apple> apples, double weight)
    {
        List<Apple> rs = new ArrayList<>();
        for(Apple a: apples)
        {
            if(a.getWeight()>=weight) rs.add(a);
        }
        return rs;
    }

    public enum AppleFilterChoice{Weight, Color, All};
    public static List<Apple> filterByWeightAndOrColor(List<Apple> apples,
                                                       double weight,
                                                       Apple.Color clr,
                                                       AppleFilterChoice choice)
    {
        List<Apple> rs = new ArrayList<>();
        for(Apple a: apples)
        {
            switch (choice) {
                case Weight: if (a.getWeight() >= weight) rs.add(a); break;
                case Color: if (a.getColor().equals(clr)) rs.add(a); break;
                case All: if (a.getWeight() >= weight && a.getWeight() >= weight) rs.add(a); break;
            }
        }
        return rs;
    }



    public static List<Apple> filterApples(List<Apple> apples, ApplePredict predict)
    {
        List<Apple> rs = new ArrayList<>();
        for(Apple a: apples)
        {
            if(predict.test(a)==true) rs.add(a);
        }
        return rs;
    }

    public static <T> List<T> filterList(List<T> list, Predict<T> predict)
    {
        List<T> rs = new ArrayList<>();
        for(T a: list)
        {
            if(predict.test(a)==true) rs.add(a);
        }
        return rs;
    }

    static class ApplePredictByWeight implements ApplePredict{
        private double weight;
        public ApplePredictByWeight(double weight){this.weight=weight;}
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight()>=weight;
        }
    }


    public static void printApples(List<Apple> apples)
    {
        for(Apple a : apples) System.out.println(a);
        System.out.println("--------------------------------------");
    }

    public static void printApples(List<Apple> apples,AppleFormatter formatter)
    {
        for(Apple a : apples) System.out.println(formatter.accept(a));
        System.out.println("--------------------------------------");
    }



    public static void main(String[] args) {
        List<Apple> apples = genApples();
//        List<Apple> greenApples = filterGreen(apples);
//        List<Apple> greenApples = filterByColor(apples, Apple.Color.Green);
//        for(Apple a : greenApples) System.out.println(a);
//        System.out.println("--------------------------------------");
//        List<Apple> redApples = filterByColor(apples, Apple.Color.Red);
//        for(Apple a : redApples) System.out.println(a);
//        System.out.println("--------------------------------------");
//        List<Apple> bigApples = filterByWeight(apples, 0.5);
//        for(Apple a : bigApples) System.out.println(a);
//        System.out.println("--------------------------------------");
//          List<Apple> redApples = filterApples(apples,
//                  new ApplePredictByColor(Apple.Color.Red));
//          printApples(redApples);
//
//        List<Apple> greenApples = filterApples(apples,
//                new ApplePredictByColor(Apple.Color.Green));
//        printApples(greenApples);
//
//        List<Apple> bigApple = filterApples(apples,new ApplePredictByWeight(0.5));
//        printApples(bigApple);

//        List<Apple> redApples = filterApples(apples, new ApplePredict() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals(Apple.Color.Red);
//            }
//        });

//        List<Apple> redApples = filterApples(apples,
//                (Apple a)->a.getColor().equals(Apple.Color.Red));

        List<Apple> redApples = filterList(apples,
                (Apple a)->{
                    return a.getColor().equals(Apple.Color.Red);
                });


        printApples(apples,new AppleFormatter1());

//        List<Apple> BigApples = filterApples(apples, new ApplePredict() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getWeight()>=0.5;
//            }
//        });
        List<Apple> BigApples = filterApples(apples,(Apple a)->a.getWeight()>=0.5);
        printApples(BigApples,new AppleFormatter1());


//        List<Apple> BigRedApples = filterApples(apples, new ApplePredict() {
//            @Override
//            public boolean test(Apple apple) {
//                return apple.getColor().equals(Apple.Color.Red) && apple.getWeight()>=0.5;
//            }
//        });
//        List<Apple> BigRedApples = filterApples(apples,
//                (Apple a)->a.getWeight()>=0.5 && a.getColor().equals(Apple.Color.Red));
        List<Apple> BigRedApples = filterApples(apples,
                a->a.getWeight()>=0.5 && a.getColor().equals(Apple.Color.Red));
        printApples(BigApples, new AppleFormatter() {
            @Override
            public String accept(Apple apple) {
                return apple.toString();
            }
        });


        // style 1: using a new comparator class
        class AppleComparator implements Comparator<Apple>{
            @Override
            public int compare(Apple o1, Apple o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        }
        apples.sort(new AppleComparator());

        // style 2: using anonymous comparator
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        });

        // style 3: using lambda
        apples.sort((Apple o1, Apple o2)->(int) (o1.getWeight() - o2.getWeight()));

        printApples(apples);

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<100;i++)list.add((int)(Math.random()*1000.0));
        List<Integer> even = filterList(list,
                (Integer n)->n.intValue()%2==0);
        List<Integer> ord = filterList(list,
                (Integer n)->n.intValue()%2==1);
        even.sort((Integer i1,Integer i2)->i1.intValue()-i2.intValue());
        System.out.println(even);


    }

    static class ApplePredictByColorAndWeight implements ApplePredict
    {
        private Apple.Color color;
        private double weight;
        public ApplePredictByColorAndWeight(Apple.Color color,double weight)
        {
            this.weight=weight;
            this.color=color;
        }
        @Override
        public boolean test(Apple apple) {
            return (apple.getWeight()>=weight && apple.getColor().equals(color));
        }
    }

    static class AppleFormatter1 implements AppleFormatter{

        @Override
        public String accept(Apple apple) {
            StringBuilder sb = new StringBuilder();
            if(apple.getWeight()>=0.5) sb.append("BIG ");
            if(apple.getColor().equals(Apple.Color.Red)) sb.append("RED ");
            sb.append(apple);
            return sb.toString();
        }
    }
}