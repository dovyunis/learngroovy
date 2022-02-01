class myfirstgroovyprogram {

    static void main(args)
    {
        //test
        println('hello')
        def my_name = "dov"
        println 'my name is: ' + my_name
        println "my name is: ${my_name}"

        def (String a, int b, Double c) =  [30,40,50]
        println a
        println b
        println c
    }
}
