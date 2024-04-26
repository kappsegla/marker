package org.fungover.marker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarkerTest {

    @Test
    void givenAStringWithMarkerThenReturnSeven() {
        String input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";

        int pos = Marker.messageMarker(input);

        assertThat(pos).isEqualTo(7);
    }
    
    
}
