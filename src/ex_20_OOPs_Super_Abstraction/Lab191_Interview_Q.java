package ex_20_OOPs_Super_Abstraction;

public class Lab191_Interview_Q {
}

interface I11{} //Valid Syntax
interface I12{} //Valid Syntax
class A1{} //Valid Syntax
class B1{} //Valid Syntax
//class Test1 extends A1,B1{} //Multiple Inheritance is not allowed
class Test2 extends A1{}

class Test3 implements I11{} //valid
class Test4 implements I11,I12{} //multiple inheritance is allowed
class Test5 extends A1 implements I11,I12{} //valid

//class Test6 implements I11 extends A1{}  // 1st implement and extend is not allowed
//interface I3 extends A1{} //extend with interface is not allowed