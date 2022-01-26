class Demo{
    int i;
    Demo(int i){
        System.out.println(i);
        this.i = i;
    }
    public static void main(String[] args){
        Demo obj = new Demo(10);
        System.out.println(obj.i);
    }
}