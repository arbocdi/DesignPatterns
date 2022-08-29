package arbocdi.dp.structural.flyweight;

import java.util.StringJoiner;

public class Client {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();
        Glyph.Row row = new Glyph.Row();
        row
                .addGlyph(factory.get('a'))
                .addGlyph(factory.get('p'))
                .addGlyph(factory.get('p'))
                .addGlyph(factory.get('a'))
                .addGlyph(factory.get('r'))
                .addGlyph(factory.get('e'))
                .addGlyph(factory.get('n'))
                .addGlyph(factory.get('t'));
        StringJoiner sj = new StringJoiner("");
        row.print(sj);
        sj.add(", symbol count = " + sj.length());
        sj.add(", cache size = " + factory.gentNumberOfObjects());
        System.out.println(sj);
    }
}
