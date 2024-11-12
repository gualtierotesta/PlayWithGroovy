class GroovyClass {

    String met () { return "hello from Groovy"}

    static void main(String[] args) {
        GroovyClass gc = new GroovyClass()
        gc.met();
    }

}
