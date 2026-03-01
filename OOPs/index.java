 class  Calculator {
    public int add(int a,int b){
        return a+b;}
    public int add(int a, int b, int c){   
    return a+b+c;} 
    public double add(double a, double b){
        return a+b;
    }
}
    public class index{
        public static void main(String[] args){
            Calculator calc = new Calculator();
            System.out.println("sum of two integer :"+calc.add(a:5 ,b:10));
            System.out.println("sum of three integer :"+ calc.add(a:5, b:10,c:12));
            System.out.println("sum of two double :" +calc.add(a:5.0,b:10.0));
        }
    }

 //create a class create a method trice overloaded 
//  1. selling point after discount
// 2. sellint price - 40% 
// 3. selling price , discount, exchange bonus
 
