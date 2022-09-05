object ceasar extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val Encrypt=(c:Char,key:Int,alphabet:String)=> alphabet((alphabet.indexOf(c.toUpper)+key)%alphabet.size)
    val Decrypt=(c:Char,key:Int,alphabet:String)=> alphabet(Math.abs(26+alphabet.indexOf(c.toUpper)-key%alphabet.size)%alphabet.size)

    val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,alphabet:String)=>
        s.map(algo(_,key,alphabet))

    val ct=cipher(Encrypt,"godzilla",22,alphabet)
    println(ct);

    val pt=cipher(Decrypt,ct,22,alphabet)
    println(pt);
}