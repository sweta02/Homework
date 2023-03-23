package hw2;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("This is Residential Property");//Parent class
        ResiProperty res = new ResiProperty();
        res.shelter();
        res.healthy();
        res.privacy();
        res.safety();
        res.roof();
        res.door();
        res.walls();
        res.windows();
        System.out.println("\n");

//        System.out.println("This is Child class Houses ");
//        Houses h =new Houses();
//        h.healthy();
//        h.privacy();
//        h.safety();
//        h.shelter();
//        h.door();
//        h.roof();
//        h.walls();
//        h.windows();
//        System.out.println("\n");

        System.out.println("This is Child Class Houses");//child class for residential property
        Houses hs = new Houses();
        hs.shelter();
        hs.healthy();
        System.out.println("\n");

        System.out.println("This is Parent Class Commercial Property");//2nd parent class
        CommProperty com = new CommProperty();
        com.walls();
        com.roof();
        System.out.println("\n");

        System.out.println("This is Child Class Offices");//2nd child class for commercial property
        Offices of =new Offices();
        of.walls();
        of.door();
        System.out.println("\n");

        System.out.println("This is Parent Class Educational Property");//3rd Parent Class
        EducaProperty ed =new EducaProperty();
        ed.roof();
        System.out.println("\n");

        System.out.println("This is Child Class Schools");//3rd Child Class
        Schools sc = new Schools();
        sc.door();


    }

}
