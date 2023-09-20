package PackageB;

public class TestB {
    public static void main(String[] args) {
        NPacSubClass subA = new NPacSubClass();
        System.out.println("Non Package sub class : ");
        System.out.println("Not accessed as no modifier cannot be accessed outside of the package.");
        System.out.println("Not possible as subclass cannot access supclass private.");
        subA.print_pro();
        subA.print_pub();
        System.out.println("Non Package non-sub class : ");
        NPacNSubClass nsubA = new NPacNSubClass();
    }
}
