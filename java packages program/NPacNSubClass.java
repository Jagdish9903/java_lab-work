package PackageB;

public class NPacNSubClass {
    public NPacNSubClass(){
    PackageA.PacSupClass obj = new PackageA.PacSupClass();
    // System.out.println(obj.a);                 Not accessed as no modifier cannot be accessed outside of the package.
    // //System.out.println(obj.pri_a);           Private cannot be accesed outside of class itself
    System.out.println(obj.pub_a);
    // System.out.println(obj.pro_a);             Cannot access protected variable as not subclass
    }
}
