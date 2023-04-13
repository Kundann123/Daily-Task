fun main(){
    loop1@ for (i in 1..3){
        for (j in 1..3){
            if(i==2){
                break@loop1
            }
            println("$i $j")
        }
    }
}