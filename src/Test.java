import java.util.Objects;

public class Test {
    private final int a;
    private final int b;

    public Test() {
        this.a = (int) (Math.random()*8+2);
        this.b = (int) (Math.random()*8+2);
    }

    public String getTest() {
        return String.format("%d * %d",a,b);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return a == test.a && b == test.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
