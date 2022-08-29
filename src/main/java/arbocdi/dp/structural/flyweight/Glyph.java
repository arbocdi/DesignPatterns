package arbocdi.dp.structural.flyweight;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Графический знак
 */
public interface Glyph {

    void print(StringJoiner sj);

    class Symbol implements Glyph{
        private int color = 5;
        private int size = 12;
        private char aChar;

        public Symbol(char aChar) {
            this.aChar = aChar;
        }

        public void print(StringJoiner sj){
            sj.add(String.valueOf(aChar));
        }
    }
    class Row implements Glyph{

        private List<Glyph> glyphs = new LinkedList<>();

        @Override
        public void print(StringJoiner sj) {
            glyphs.forEach(glyph -> glyph.print(sj));
        }

        public Row addGlyph(Glyph glyph){
            glyphs.add(glyph);
            return this;
        }
    }
}
