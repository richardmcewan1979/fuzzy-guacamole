//example
//check name file and name class detail
//check compile via intellij idea and terminal 
// scan about for semi-colon customs

Import java.io._

//class name and constructor 
class Person(val name: String, val age: Int){

//fields
var name : String = name;
var age : Int = age;

def futureAge(val year : Int){
    //equivalent to this.age?????

//concat like that?
Println("You will be " + \
        (year-2021+41) + \
         " in = " + year)
     }
}

Object Example{
 def main(args: Array[String]){

// create instance
val mcewan = new Person("Rich", 41);

//method
mcewan.futureAge(2050);
   }
}
