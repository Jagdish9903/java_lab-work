package PackageB;
import PackageA.PacSupClass;
public class NPacSubClass extends PacSupClass{
    // void print_nomo(){                     Not accessed as no modifier cannot be accessed outside of the package.
    //     System.out.println(a);
    // }
    // void print_pri(){                       Not possible as subclass cannot access supclass private.
    //     System.out.println(pri_a);
    // }
    void print_pro(){
        System.out.println("Protected var : "+pro_a);
    }
    void print_pub(){
        System.out.println("Public var : "+pub_a);
    }
}
