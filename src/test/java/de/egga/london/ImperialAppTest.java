package de.egga.london;

import de.egga.common.Character;
import de.egga.common.Planet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static de.egga.common.CharacterFactory.luke;
import static de.egga.common.PlanetFactory.planetWith;
import static java.util.Arrays.asList;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ImperialAppTest {

    Character luke = luke();

    @Mock
    JediService jediService;
    @Mock
    SpeciesService speciesService;

    @InjectMocks
    ImperialApp app = new ImperialApp();

    
    @Test
    public void it_should_ask_jedi_service() {
        Planet planet = planetWith(luke);
        app.searchForLuke(planet);
        verify(jediService).filterJedi(planet.getCitizens());
    }

    @Test
    public void it_should_ask_species_service() {
        Planet planet = planetWith(luke);
        List<Character> jedi = prepareJediService();
        app.searchForLuke(planet);
        verify(speciesService).filterHumans(jedi);
    }


    private List<Character> prepareJediService() {
        List<Character> jedi = asList(luke);
        when(jediService.filterJedi(anyList())).thenReturn(jedi);
        return jedi;
    }
}
