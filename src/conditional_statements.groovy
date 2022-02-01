def num1 = 10
if (num1 == 10)
    println("num is 10: " + num1)
else
    println("num is not 10: " + num1)

// switch-case

def x = 20
def result = ""

switch (x) {
    case 0:
        result = "x is 0"
        break
    case {x>10}:
        result = "x is positive"
        break
    default:
        result = "number not exist in cases"
}
println result




def num = 'A'
switch(num){
    case 0:
        println "num is zero"
        break
    case {num>0}:
        println "num is positive"
        break
    case {num<0}:
        println "num is negative"
        break
    default:
        println "invalid input"
}

def num3 = 'abc'

switch(num3){

    case 0:

        println "num is zero"

        break

    case {num3>0}:

        println "num is positive"

        break

    case {num3<0}:

        println "num is negative"

        break

    default:

        println "invalid input"

}