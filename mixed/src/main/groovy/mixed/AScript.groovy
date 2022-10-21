package mixed

import groovy.transform.Canonical
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.builder.Builder

/* SCRIPT */

@ToString(ignoreNulls = true, includeNames = true)
@Builder
class Example {

    String s
    Integer i

}

def e = Example.builder().s('ciao').build()
println "e = ${e}"

def im = new ImmutableBean(i:42)
println "im = ${im}"

@Immutable
class Building {

    String name
    int floors
    boolean officeSpace

}
//def officeSpace = new Building('Initech office', 1, true)
//assert officeSpace.toString() == 'Building(Initech office, 1, true)'
def theOffice = new Building('Wernham Hogg Paper Company')
assert theOffice.floors == 0
assert theOffice.officeSpace
