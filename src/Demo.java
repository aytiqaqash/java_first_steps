//Öyrənməsinə öyrənmisən amma bir az yanlış-yaman)
//        (Əldə etmək deyil,istifadə etmək)
//        1.super-parent (ana sinifin) sinfin cari obyektinə referansdır (necə ki, this sinfin cari obyektinə referansdır)
//        2. super() ana sinfin onstructorunu işə salır

public class Demo {
    public static void main(String args[]) {
        B theB1=new B(1);
        theB1.showP();
        theB1.showPv1();//theB super-siz ana sinidfin metodlarını istifadə edə bilir
        System.out.println("-------------");
        B theB2=new B();
        theB2.showP();
        theB2.showPv1();
        System.out.println("-------------");
        C theC = new C(1);
        theC.showP();
        theC.showPv1();
    }
}
class A {
    public int P=0; // P təyin olundu
    public boolean b=false; // b təyin olundu
    public A(int P){
        this.P=P;
        b=false;
    }
    public void showPv1(){
        System.out.println("Class inside A P="+String.valueOf(this.P));
    }
}
class B extends A{
    public int P=1;
    public B(int P){
        super(P);
        this.P=P+1;
        System.out.println(P);
        b=true;//
    }
    public B(){
        super(10);
    }
    public void showP(){
        System.out.println("Class B showP method P="+String.valueOf(this.P));
        System.out.println("Parent class P="+String.valueOf(super.P));
        System.out.println("Class b="+String.valueOf(this.b));
        System.out.println("Parent class b="+String.valueOf(super.b));// B sinfinin konstruktorunda təin olunan dəyərdir
    }
}
class C extends A {


    public C(int P) {
        super(P);
    }

    public void showP(){
        System.out.println("Class B showP method P="+String.valueOf(this.P));
        System.out.println("Parent class P="+String.valueOf(super.P));
        System.out.println("Class b="+String.valueOf(this.b));
        System.out.println("Parent class b="+String.valueOf(super.b));// B sinfinin konstruktorunda təin olunan dəyərdir
    }
}