package es.juanc.bootstrap

import spock.lang.Specification

class GreeterShould extends Specification {

    void 'greet with a hello message to the name it receives' () {
        when:
        Greeter greeter = new Greeter();

        then:
        greeter.greet('Jhon') == 'Hello Jhon!!'
    }
}
