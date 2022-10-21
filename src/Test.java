import java.util.Objects;

public class Test {
    private final String example;
    private final String example1;

    public Test() {
        int a = (int) (Math.random()*8+2);
        int b = (int) (Math.random()*8+2);
        this.example=String.format("%d * %d",a,b);
        this.example1=String.format("%d * %d",b,a);
    }

    public String getTest() {
        return example;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null||getClass()!=o.getClass()) return false;
        Test test = (Test) o;
        return (example.equals(test.example)||example.equals(test.example1));
    }

    @Override
    public int hashCode() {
        return example.hashCode()+example1.hashCode();
    }
}
