class AccessPoint{
    public int x1;
    static int y1;
    void calculates(int a, int b){
        x1+=a;
        y1+=b;
    }
}
class JavaApplications6{
    public static void main(String[] args){
        AccessPoint obj1= new AccessPoint();
        AccessPoint obj2= new AccessPoint();
        obj1.x1=0;
        obj1.y1=0;
        obj1.calculates(1,2);
        obj2.x1=0;
        obj2.calculates(2,3);
        System.out.println(obj1.x1+" "+obj2.y1);
    }
}