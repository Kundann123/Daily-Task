
fun main(){
    val arr= arrayOf(10,20,30,40,50)
    val arr1= arrayOf(99,88,77,55,"KL","Ar","RS")
    val arr2= arrayOf<String>("Avi","Abhi","Rohit")
    for(i in arr) {
        print(i)
        print(" ")
    }
    println()
    for (j in arr1) {
        print(j)
        print(" ")
    }
    println()
    for (k in arr2) {
        print(k)
        print(" ")
    }
    println()

    print("set values in arr: ")
    arr.set(0,100)
    arr[1]=90
    for (i in arr){
        print(i)
        print(" ")
    }
    println()
    print("get values from arr1: ")
    print(arr1.get(0))
    print(" ")
    print(arr1[5])
    println()

}
