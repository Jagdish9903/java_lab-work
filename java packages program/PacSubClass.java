package PackageA;

public class PacSubClass extends PackageA.PacSupClass {
    void print_nomo(){
        System.out.println(a);
    }
    // void print_pri(){                       Not possible as subclass cannot access supclass private.
    //     System.out.println(pri_a);
    // }
    void print_pro(){
        System.out.println(pro_a);
    }
    void print_pub(){
        System.out.println(pub_a);
    }
}
