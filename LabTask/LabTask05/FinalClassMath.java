final class MathConstants{
    void math()
    {
     final double e = 2.718;
     System.out.println(e);
    }
}

class AdvMath extends MathConstants{
// Cannot inherit from final class Math_Constants because it is final.
}
public class FinalClassMath {
    public static void main(String[] args) {
        AdvMath a = new AdvMath();
        a.math();
    }
}