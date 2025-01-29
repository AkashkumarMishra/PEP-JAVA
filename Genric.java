class GenricClass<T>{
    T data1;
    T data2;
    void setdata(T data1,T data2){
        this.data1=data1;
        this.data2=data2;
    }
    T getFirst(){
        return data1;
    }
    T getSecond(){
        return data2;
    }
    public class Genric{
        public static void main(String[]args){
            GenricClass <String> obj1=new GenricClass<>();
            obj1.setdata("Akash","Mishra");
            System.out.println(obj1.getFirst());
            System.out.println(obj1.getSecond());
            GenricClass<Integer>obj2=new GenricClass<>();
            obj2.setdata(5,7);
            System.out.println(obj2.getFirst());
            System.out.println(obj2.getSecond());
        }
    }
}