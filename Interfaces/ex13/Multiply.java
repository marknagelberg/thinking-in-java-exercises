interface Top {
    void topMethod();
}

interface InheritingFromTop1 extends Top {
    void inheritingFromTop1Method();
}

interface InheritingFromTop2 extends Top {
    void inheritingFromTop2Method();
}

public class Multiply implements InheritingFromTop1, InheritingFromTop2 {
    public void topMethod() {
        System.out.println("Top Method");
    }
    public void inheritingFromTop1Method() {
        System.out.println("Top 1 Method");
    }
    public void inheritingFromTop2Method() {
        System.out.println("Top 2 Method");
    }
}
