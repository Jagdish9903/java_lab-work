package PackageA;

public class TestA {
    public static void main(String[] args) {
        System.out.println("Package super class : ");
        PacSupClass supA = new PacSupClass();
        System.out.println("No Modifier : "+supA.a);
        System.out.println("Private is called from within class");
        supA.dispri();           
        System.out.println("Public : "+supA.pub_a);
        System.out.println("Protected : "+supA.pro_a);
        PacSubClass subA = new PacSubClass();
        System.out.println("Package sub class : ");
        System.out.println("Not possible as subclass cannot access supclass private.");
        subA.print_pro();
        subA.print_pub();
        subA.print_nomo();
        System.out.println("Package non-sub class : ");
        PacNClass nsubA = new PacNClass();
    }
}

