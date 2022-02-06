import spock.lang.Specification

class GroovyClassSpec extends Specification {

    def 'test Groovy class'() {
        given:
        def sut = new GroovyClass()
        when:
        def result = sut.met()
        then:
        assert result == 'hello from Groovy'
    }
}
