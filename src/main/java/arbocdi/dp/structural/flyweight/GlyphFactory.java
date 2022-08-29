package arbocdi.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private Map<Character, Glyph> cache = new HashMap<>();

    public Glyph get(Character c) {
        Glyph glyph = cache.get(c);
        if(glyph==null){
            glyph = new Glyph.Symbol(c);
            cache.put(c,glyph);
        }
        return glyph;
    }

    public int gentNumberOfObjects(){
        return cache.size();
    }
}
