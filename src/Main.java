import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Test> tests=new HashSet<>(15);
        for (int i = 0; i < 15 ; i++) {
            tests.add(new Test());
                    }
        for (Test test: tests) {
            System.out.println(test.getTest());
        }
    }
}