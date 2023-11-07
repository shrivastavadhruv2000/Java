
public class BoxingUnboxing {
    public static void main(String[] args){
        int j=10;
        Integer i1= new Integer(j);//boxing,Wrapping
        String str="123";
        Integer inte=j;//autoboxing
        int a=i1.intValue();//unboxing
        int b= inte;//autounboxing
        System.out.println(b);
        int num=Integer.parseInt(str);
        System.out.println(num);


    }

}
