package mixed

import groovy.transform.Immutable
import groovy.transform.builder.Builder

@Immutable
@Builder
class ImmutableBean {
    String s
    Integer i
    Collection c
}
