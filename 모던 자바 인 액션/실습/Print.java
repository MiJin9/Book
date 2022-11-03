import java.util.ArrayList;
import java.util.List;

public class Print {

    public static void main(String... args) {
        // Apple 전체 목록 만들기
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("green", 120));
        list.add(new Apple("red", 155));
        list.add(new Apple("green", 160));

        // 원하는 필터를 거친 Apple들을 목록에 담기
        List<Apple> redAndHeavyApples = filterApples(list, new AppleRedAndHeavyPredicate());
        for (Apple a : redAndHeavyApples) {
            System.out.println(a);
        }
    }

    // 기준에 해당하는 Apple들만 result 리스트에 담기
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
