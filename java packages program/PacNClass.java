package PackageA;

public class PacNClass {
    public PacNClass(){
    PacSupClass o = new PacSupClass();
    System.out.println("No Modifier : "+o.a);
    System.out.println("Private cannot be accesed outside of class itself");           
    System.out.println("Public : "+o.pub_a);
    System.out.println("Protected : "+o.pro_a);
}
}
