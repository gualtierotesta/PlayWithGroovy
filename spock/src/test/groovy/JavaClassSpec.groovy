import spock.lang.Specification

class JavaClassSpec extends Specification {

    def 'test Java class'() {
        given:
        def sut = new JavaClass()
        when:
        def result = sut.met()
        then:
        assert result == 'hello from Java'
    }
}
