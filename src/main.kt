
fun main(){
    student(listOf("jane","lucy","wanda","esther","lona","hapiness","virgy","mary","caro","nadine"))

    var result= height(listOf(35,20,26,60,58))
    println(result)

    var namex=Person("jane",18,98,43)

    var namey=Person("wanda",24,120,80)

    var namez=Person("june",28,109,54)

    var named= listOf(namex,namey,namez)
    println(named.sortedByDescending {z->z.age  })

    var namese=Person("Ali",19,120,75)
    var namesf=Person("Amina",34,110,64)
    var namesg= listOf(namese,namesf)
    println(namesg.plus(named))

    var register1=Car("MKV",67)
    var register2=Car("KDA",31)
    var register3=Car("KDE",96)
    var register= listOf(1,2,3)
    println(register)
}

fun student(student:List<String>):List<String>{
    student.forEachIndexed { index, s ->
        if((index%2)==0){
            println(s)
        }
    }
    return student
}

fun height(meters:List<Int>):String{
    var average= meters.average()
    var add = meters.sum()
    var product="$average,$add"


    return product

}

data class Person(var name:String,var age:Int,var height:Int,var weight:Int)

data class Car(var register:String,var mileage:Int)

fun car(text:List<Car>):Int{
    var loop=0
    text.forEach { x->x.mileage
        loop+=x.mileage
    }
    var total=loop/text.count()


    return total
}

